package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private Holding control;

	//Constructor


	public Main(){
		init();
	
	}

			public static void main(String[] args) {
				Main program = new Main();
				program.menu();

	}

	public void menu(){

		Scanner entrada = new Scanner(System.in);


		



			System.out. println("-------------------------------------------------------------------------------------------------");

			System.out. println(".                   BIENVENIDO AL HOLDING EMPRESARIAL DE LA UNIVERSIDAD ICESI");

			System.out. println("-------------------------------------------------------------------------------------------------");

			System.out.println(" ");




		Scanner sn = new Scanner(System.in);

		boolean salir = false;

		int companyType;
		int divisionType1;
		int divisionType2;


		int opcion;

		while (salir == false){

			System.out.println(" ");

			System.out.println("MENU");

			System.out.println("1. Registrar una nueva empresa.");

			System.out.println("2. Imprimir listado de toda la informacion ingresada.");

			System.out.println("3. Salir del menu");



			System.out.println(" ");

			System.out.println("Selecciona la opcion que deseas realizar:");

			opcion = sn.nextInt();


				switch(opcion){

					case 1:

						System.out.println("Nuestro Holding empresarial reune dos tipos de compañias, por favor seleccione uno:");

						System.out.println("1. Empresa de servicio.");
						System.out.println("2. Empresa de fabricacion.");
						int companyType = sn.nextInt();

						if(companyType == 1){

							System.out.println("Nuestra divicion de empresa de servicio tiene dos enfoques, selecciones uno:");

							System.out.println("1. Empresa de servicio de educacion.");
							System.out.println("2. Empresa de servicio de tecnologia.");
							int divisionType1 = sn.nextInt();

							if(divisionType1 == 1){

								System.out.println("Por favor ingrese los datos de la nueva compañia:");

								System.out.print("Digite el nombre de la compañia: ");
								name = entrada.nextLine();

								System.out.print("Digite el numero de Nit de la compañia: ");
								nitNumber = sn.nextInt();

								System.out.print("Digite la direccion de la compañia:");
								address = entrada.nextLine();

								System.out.print("Digite el numero telefonico: ");
								phoneNumber = sn.nextInt();

								System.out.print("Digite el numero de empleados que hay en la compañia: ");
								employeeNumber = sn.nextInt();

								System.out.print("Digite el valor en activos de ls compañia: ");
								assetsValue = sn.nextInt();

								System.out.print("Digite la fecha de constitucion de la compañia: ");
								constitutionDate = entrada.nextLine();

								System.out.println("Digite el tipo de organizacion: ");

								System.out.println("a. " + Company.AGRICULTURA_CAZA_SILVICULTURA_Y_PEZCA);
								System.out.println("b. " + Company.EXPLOTACION_DE_MINAS_Y_CANTERAS);
								System.out.println("c. " + Company.INDUSTRIA_MANUFACTURERA);
								System.out.println("d. " + Company.ELECTRICIDAD_GAS_Y_VAPOR);
								System.out.println("e. " + Company.CONSTRUCCION);
								System.out.println("f. " + Company.COMERCION_AL_POR_MAYOR_Y_AL_POR_MENOR);
								System.out.println("g. " + Company.TRANSPORTE_ALMACENAMIENTO_Y_COMUNICACIONES);
								System.out.println("h. " + Company.CIEROS_SEGUROS_INMUEBLES_SERV_A_COMPANIAS);
								System.out.println("i. " + Company.COMUNALES_SOCIALES);
								organizationType = entrada.nextLine();

								System.out.print("Digite el nombre del representante legal: ");
								legalRepresentativeName = entrada.nextLine();

								System.out.print("Digite el numero de registro ante el Ministerio de Educacion Nacional: ");
								registryNumberMEN = sn.nextInt();

								System.out.print("Digite los años de acreditacion de alta calidad que tiene la institucion: ");
								yearsOfAcreditation = sn.nextInt();

								System.out.print("Digite la posicion nacional en la que se encuentra la institucion segun el tipo de institucion (Saber 11º para instituciones Bachiller o Saber Pro para instituciones Universitarias): ");
								nationalPosition = sn.nextInt();

								System.out.print("Digite el nombre del rector: ");
								rectorName = entrada.nextLine();

								System.out.println("Digite el sector educativo en el que se encuentra la institucion: ");

								System.out.println("1. " + EmpresasDeEducacion.BACHILLERATO);
								System.out.println("2. " + EmpresasDeEducacion.UNIVERSIDAD);
								educationSector = sn.nextInt();

								System.out.print("Digite el numero de estudiantes que pertenecen a los estratos 1 y 2: ");
								numberStudentsStratum1y2 = sn.nextInt();

								System.out.print("Digite la cantidad total de estudiantes que hay en la institucion: ");
								totalNumberStudents = sn.nextInt();

							} else if(divisionType2 == 2){

								System.out.println("Por favor ingrese los datos de la nueva compañia:");

								System.out.print("Digite el nombre de la compañia: ");
								name = entrada.nextLine();

								System.out.print("Digite el numero de Nit de la compañia: ");
								nitNumber = sn.nextInt();

								System.out.print("Digite la direccion de la compañia:");
								address = entrada.nextLine();

								System.out.print("Digite el numero telefonico: ");
								phoneNumber = sn.nextInt();

								System.out.print("Digite el numero de empleados que hay en la compañia: ");
								employeeNumber = sn.nextInt();

								System.out.print("Digite el valor en activos de ls compañia: ");
								assetsValue = sn.nextInt();

								System.out.print("Digite la fecha de constitucion de la compañia: ");
								constitutionDate = entrada.nextLine();

								System.out.println("Digite el tipo de organizacion: ");

								System.out.println("a. " + Company.AGRICULTURA_CAZA_SILVICULTURA_Y_PEZCA);
								System.out.println("b. " + Company.EXPLOTACION_DE_MINAS_Y_CANTERAS);
								System.out.println("c. " + Company.INDUSTRIA_MANUFACTURERA);
								System.out.println("d. " + Company.ELECTRICIDAD_GAS_Y_VAPOR);
								System.out.println("e. " + Company.CONSTRUCCION);
								System.out.println("f. " + Company.COMERCION_AL_POR_MAYOR_Y_AL_POR_MENOR);
								System.out.println("g. " + Company.TRANSPORTE_ALMACENAMIENTO_Y_COMUNICACIONES);
								System.out.println("h. " + Company.CIEROS_SEGUROS_INMUEBLES_SERV_A_COMPANIAS);
								System.out.println("i. " + Company.COMUNALES_SOCIALES);
								organizationType = entrada.nextLine();

								System.out.print("Digite el nombre del representante legal: ");
								legalRepresentativeName = entrada.nextLine();

								System.out.print("Digite el tipo de setvicio que va a brindar la empresa:");
							}

						} else if(companyType == 2){

							System.out.println("Nuestra divicion de empresas de fabricacion requiere que no haga saber si el producto que fabrica es un medicamento, un alimento o otro:");

							System.out.println("1. Medicamento.");
							System.out.println("2. Alimento.");
							System.out.println("3. Otro.");
							int divisionType2 = sn.nextInt();

							if(divisionType2 == 1){

								System.out.println("Por favor ingrese los datos de la nueva compañia:");

								System.out.print("Digite el nombre de la compañia: ");
								name = entrada.nextLine();

								System.out.print("Digite el numero de Nit de la compañia: ");
								nitNumber = sn.nextInt();

								System.out.print("Digite la direccion de la compañia:");
								address = entrada.nextLine();

								System.out.print("Digite el numero telefonico: ");
								phoneNumber = sn.nextInt();

								System.out.print("Digite el numero de empleados que hay en la compañia: ");
								employeeNumber = sn.nextInt();

								System.out.print("Digite el valor en activos de ls compañia: ");
								assetsValue = sn.nextInt();

								System.out.print("Digite la fecha de constitucion de la compañia: ");
								constitutionDate = entrada.nextLine();

								System.out.println("Digite el tipo de organizacion: ");

								System.out.println("a. " + Company.AGRICULTURA_CAZA_SILVICULTURA_Y_PEZCA);
								System.out.println("b. " + Company.EXPLOTACION_DE_MINAS_Y_CANTERAS);
								System.out.println("c. " + Company.INDUSTRIA_MANUFACTURERA);
								System.out.println("d. " + Company.ELECTRICIDAD_GAS_Y_VAPOR);
								System.out.println("e. " + Company.CONSTRUCCION);
								System.out.println("f. " + Company.COMERCION_AL_POR_MAYOR_Y_AL_POR_MENOR);
								System.out.println("g. " + Company.TRANSPORTE_ALMACENAMIENTO_Y_COMUNICACIONES);
								System.out.println("h. " + Company.CIEROS_SEGUROS_INMUEBLES_SERV_A_COMPANIAS);
								System.out.println("i. " + Company.COMUNALES_SOCIALES);
								organizationType = entrada.nextLine();

								System.out.print("Digite el nombre del representante legal: ");
								legalRepresentativeName = entrada.nextLine();

								System.out.print("Digite el nombre del producto que fabrica la compañia: ");
								nameProduct = entrada.nextLine();

								System.out.print("Digite el codigo del producto: ");
								code = sn.nextInt();

								System.out.print("Digite la cantidad de agua que tomo hacer el producto en litros: ");
								waterAmount = sn.nextInt();

								System.out.print("Digite las unidades existentes en inventario: ");
								unitsInInventory = sn.nextInt();

								System.out.print("Digite el numero de registro sanitario (puede contener numeros y letras): ");
								sanitaryRegistration = entrada.nextLine();

								System.out.println("Digite el estado del medicamento: ");

								System.out.println("1. " + Medicamento.VIGENTE);
								System.out.println("2. " + Medicamento.NO_RENOVADO);
								state = sn.nextInt();

								System.out.print("Digite la fecha de expiracion del medicamento: ");
								expiration = entrada.nextLine();

								System.out.println("Digite el modalidad en la que se va a enfocar la empresa: ");

								System.out.println("1. " + Medicamento.FABRICAR_Y_EXPORTAR);
								System.out.println("2. " + Medicamento.FABRICAR_Y_VENDER);
								System.out.println("3. " + Medicamento.IMPORTAR_Y_VENDER);

							} else if(divisionType2 == 2){


								//falta

								//hacer el metodo y la clase para los alimentos.
								
								//falta
								
							} else if(divisionType2 == 3){

								System.out.println("Por favor ingrese los datos de la nueva compañia:");

								System.out.print("Digite el nombre de la compañia: ");
								name = entrada.nextLine();

								System.out.print("Digite el numero de Nit de la compañia: ");
								nitNumber = sn.nextInt();

								System.out.print("Digite la direccion de la compañia:");
								address = entrada.nextLine();

								System.out.print("Digite el numero telefonico: ");
								phoneNumber = sn.nextInt();

								System.out.print("Digite el numero de empleados que hay en la compañia: ");
								employeeNumber = sn.nextInt();

								System.out.print("Digite el valor en activos de ls compañia: ");
								assetsValue = sn.nextInt();

								System.out.print("Digite la fecha de constitucion de la compañia: ");
								constitutionDate = entrada.nextLine();

								System.out.println("Digite el tipo de organizacion: ");

								System.out.println("a. " + Company.AGRICULTURA_CAZA_SILVICULTURA_Y_PEZCA);
								System.out.println("b. " + Company.EXPLOTACION_DE_MINAS_Y_CANTERAS);
								System.out.println("c. " + Company.INDUSTRIA_MANUFACTURERA);
								System.out.println("d. " + Company.ELECTRICIDAD_GAS_Y_VAPOR);
								System.out.println("e. " + Company.CONSTRUCCION);
								System.out.println("f. " + Company.COMERCION_AL_POR_MAYOR_Y_AL_POR_MENOR);
								System.out.println("g. " + Company.TRANSPORTE_ALMACENAMIENTO_Y_COMUNICACIONES);
								System.out.println("h. " + Company.CIEROS_SEGUROS_INMUEBLES_SERV_A_COMPANIAS);
								System.out.println("i. " + Company.COMUNALES_SOCIALES);
								organizationType = entrada.nextLine();

								System.out.print("Digite el nombre del representante legal: ");
								legalRepresentativeName = entrada.nextLine();

								System.out.print("Digite el nombre del producto que fabrica la compañia: ");
								nameProduct = entrada.nextLine();

								System.out.print("Digite el codigo del producto: ");
								code = sn.nextInt();

								System.out.print("Digite la cantidad de agua que tomo hacer el producto en litros: ");
								waterAmount = sn.nextInt();

								System.out.print("Digite las unidades existentes en inventario: ");
								unitsInInventory = sn.nextInt();
							}
						}



					//------------------------------------------------------------------

						/*System.out.println("Seleciones el empleado: ");

						System.out.println("1. " + control.getEmplo1().getName());
						System.out.println("2. " + control.getEmplo2().getName());
						int employeeOption = sn.nextInt();


						System.out.println("Seleccione el tipo de servicio: ");

						System.out.println("1. " + Service.CORTE_DE_CABELLO);
						System.out.println("2. " + Service.MANICURE);
						System.out.println("3. " + Service.PEDICURE);
						int serviceOption = sn.nextInt();


						System.out.println("Ingrese la cantidad de veces que se realizo el servicio: ");
						int amountTimesService= sn.nextInt();

						control.registerService(serviceOption, employeeOption, amountTimesService);
						
						*/

						break;

					case 2:

						System.out.println();
						break;


					case 3:

					salir = true;
					System.out.println("Menu Cerrado");




				}
			

			
		}

	}

	public void init(){


	
	}


}