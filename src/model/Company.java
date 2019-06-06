package model;

public class Company{

	public final static char AGRICULTURA_CAZA_SILVICULTURA_Y_PEZCA = 'a';
	public final static char EXPLOTACION_DE_MINAS_Y_CANTERAS = 'b';
	public final static char INDUSTRIA_MANUFACTURERA = 'c';
	public final static char ELECTRICIDAD_GAS_Y_VAPOR = 'd';
	public final static char CONSTRUCCION = 'e';
	public final static char COMERCION_AL_POR_MAYOR_Y_AL_POR_MENOR = 'f';
	public final static char TRANSPORTE_ALMACENAMIENTO_Y_COMUNICACIONES = 'g';
	public final static char CIEROS_SEGUROS_INMUEBLES_SERV_A_COMPANIAS = 'h';
	public final static char COMUNALES_SOCIALES = 'i';


	private String name;
	private int nitNumber;
	private String address;
	private int phoneNumber;
	private int employeeNumber;
	private double assetsValue;
	private String constitutionDate;
	private char organizationType;
	private String legalRepresentativeName;


	public Company(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName){

		this.name = name;
		this.nitNumber = nitNumber;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.employeeNumber = employeeNumber;
		this.assetsValue = assetsValue;
		this.constitutionDate = constitutionDate;
		this.organizationType = organizationType;
		this.legalRepresentativeName =legalRepresentativeName;
	}

	public String getName(){

		return name;
	}

	public void setName(String name){

		this.name = name;
	}

	public int getNitNumber(){

		return nitNumber;
	}

	public void setNitNumber(int nitNumber){

		this.nitNumber = nitNumber;
	}

	public String getAddress(){

		return address;
	}

	public void setAddress(String address){

		this.address = address;
	}

	public int getPhoneNumber(){

		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber){

		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeNumber(){

		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber){

		this.employeeNumber = employeeNumber;
	}

	public double getAssetsValue(){

		return assetsValue;
	}

	public void setAssetsValue(double assetsValue){

		this.assetsValue = assetsValue;
	}

	public String getConstitutionDate(){

		return constitutionDate;
	}

	public Void setConstitutionDate(String constitutionDate){

		this.constitutionDate = constitutionDate;
	}

	public char getOrganizationType(){

		return organizationType;
	}

	public Void setOrganizationType(char organizationType){

		this.organizationType = organizationType;
	}

	public  String getLegalRepresentativeName(){

		return legalRepresentativeName;
	}

	public Void setLegalRepresentativeName(String legalRepresentativeName){

		this.legalRepresentativeName = legalRepresentativeName;
	}
}

