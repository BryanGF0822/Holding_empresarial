package model;

public class EmpresasDeTecnologia extends EmpresasDeServicio{

	public final static String CONSULTORIA = "Consultoria";
	public final static String CAPACITACION = "Capacitacion";
	public final static String DESARROLLO_SOFTWARE_ALA_MEDIDA = "Desarrollo de software a la medida";
	public final static String INFRAESTRUCTURA_COMO_SERVICIO = "Infraestructura como servicio";
	public final static String SOFTWARE_COMO_SERVICIO = "Software como servicio";
	public final static String PLATAFORMA_COMO_SERVICIO = "Plataforma como servicio";




	public EmpresasDeServicio(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName){

		super(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName);
	}

}