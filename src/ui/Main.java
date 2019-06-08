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
							int divisionType1 = sn,nextInt();

						} else if(companyType == 2){

							System.out.println("Nuestra divicion de empresas de")
						}



					//------------------------------------------------------------------

						System.out.println("Seleciones el empleado: ");

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