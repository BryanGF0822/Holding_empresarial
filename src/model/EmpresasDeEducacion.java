package model;

public class EmpresasDeEducacion extends EmpresasDeServicion{

	public final static String BACHILLERATO = "Bachillierato";
	public final static String UNIVERSIDAD = "Universidad";

	private int registryNumberMEN;
	private int yearsOfAcreditation;
	private int nationalPosition;
	private String rectorName;
	private String educationSector;
	private int numberStudentsStratum1y2;
	private int totalNumberStudents;



	public EmpresasDeFabricacion(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName, int registryNumberMEN, int yearsOfAcreditation, int nationalPosition, String rectorName, String educationSector, int numberStudentsStratum1y2, int totalNumberStudents){

		super(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName);

		this.registryNumberMEN = registryNumberMEN;
		this.yearsOfAcreditation = yearsOfAcreditation;
		this.nationalPosition = nationalPosition;
		this.rectorName = rectorName;
		this.educationSector = educationSector;
		this.numberStudentsStratum1y2 = numberStudentsStratum1y2;
		this.totalNumberStudents = totalNumberStudents;
	}

	public int getRegistryNumberMEN(){

		return registryNumberMEN;
	}

	public void setRegistryNumberMEN(int registryNumberMEN){

		this.registryNumberMEN = registryNumberMEN;
	}

	public int getYearsOfAcreditation(){

		return yearsOfAcreditation;
	}

	public void setYearsOfAcreditation(int yearsOfAcreditation){

		this.yearsOfAcreditation = yearsOfAcreditation;
	}

	public int getNationalPosition(){

		return nationalPosition;
	}

	public void setNationalPosition(int nationalPosition){

		this.nationalPosition = nationalPosition;
	}

	public String getRectorName(){

		return rectorName;
	}

	public void setRectorName(String rectorName){

		this.rectorName = rectorName;
	}

	public String getEducationSector(){

		return educationSector;
	}

	public void setEducationSector(String educationSector){

		this.educationSector = educationSector;
	}

	public int getNumberStudentsStratum1y2(){

		return numberStudentsStratum1y2;
	}

	public Void setNumberStudentsStratum1y2(int numberStudentsStratum1y2){

		this.numberStudentsStratum1y2 = numberStudentsStratum1y2;
	}

	public int getTotalNumberStudents(){

		return totalNumberStudents;
	}

	public Void setTotalNumberStudents(int totalNumberStudents){

		this.totalNumberStudents = totalNumberStudents;
	}

	
}