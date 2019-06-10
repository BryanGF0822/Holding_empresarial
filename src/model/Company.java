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

	/**
	 * [Company description:]
	 * @param  name                    [description]
	 * @param  nitNumber               [description]
	 * @param  address                 [description]
	 * @param  phoneNumber             [description]
	 * @param  employeeNumber          [description]
	 * @param  assetsValue             [description]
	 * @param  constitutionDate        [description]
	 * @param  organizationType        [description]
	 * @param  legalRepresentativeName [description]
	 * @return                         [description]
	 */
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
	/**
	 * [getName description]
	 * @return [description]
	 */
	public String getName(){

		return name;
	}
	/**
	 * [setName description]
	 * @param name [description]
	 */
	public void setName(String name){

		this.name = name;
	}
	/**
	 * [getNitNumber description]
	 * @return [description]
	 */
	public int getNitNumber(){

		return nitNumber;
	}
	/**
	 * [setNitNumber description]
	 * @param nitNumber [description]
	 */
	public void setNitNumber(int nitNumber){

		this.nitNumber = nitNumber;
	}
	/**
	 * [getAddress description]
	 * @return [description]
	 */
	public String getAddress(){

		return address;
	}
	/**
	 * [setAddress description]
	 * @param address [description]
	 */
	public void setAddress(String address){

		this.address = address;
	}
	/**
	 * [getPhoneNumber description]
	 * @return [description]
	 */
	public int getPhoneNumber(){

		return phoneNumber;
	}
	/**
	 * [setPhoneNumber description]
	 * @param phoneNumber [description]
	 */
	public void setPhoneNumber(int phoneNumber){

		this.phoneNumber = phoneNumber;
	}
	/**
	 * [getEmployeeNumber description]
	 * @return [description]
	 */
	public int getEmployeeNumber(){

		return employeeNumber;
	}
	/**
	 * [setEmployeeNumber description]
	 * @param employeeNumber [description]
	 */
	public void setEmployeeNumber(int employeeNumber){

		this.employeeNumber = employeeNumber;
	}
	/**
	 * [getAssetsValue description]
	 * @return [description]
	 */
	public double getAssetsValue(){

		return assetsValue;
	}
	/**
	 * [setAssetsValue description]
	 * @param assetsValue [description]
	 */
	public void setAssetsValue(double assetsValue){

		this.assetsValue = assetsValue;
	}
	/**
	 * [getConstitutionDate description]
	 * @return [description]
	 */
	public String getConstitutionDate(){

		return constitutionDate;
	}
	/**
	 * [setConstitutionDate description]
	 * @param  constitutionDate [description]
	 * @return                  [description]
	 */
	public Void setConstitutionDate(String constitutionDate){

		this.constitutionDate = constitutionDate;
	}
	/**
	 * [getOrganizationType description]
	 * @return [description]
	 */
	public char getOrganizationType(){

		return organizationType;
	}
	/**
	 * [setOrganizationType description]
	 * @param  organizationType [description]
	 * @return                  [description]
	 */
	public Void setOrganizationType(char organizationType){

		this.organizationType = organizationType;
	}
	/**
	 * [getLegalRepresentativeName description]
	 * @return [description]
	 */
	public  String getLegalRepresentativeName(){

		return legalRepresentativeName;
	}
	/**
	 * [setLegalRepresentativeName description]
	 * @param  legalRepresentativeName [description]
	 * @return                         [description]
	 */
	public Void setLegalRepresentativeName(String legalRepresentativeName){

		this.legalRepresentativeName = legalRepresentativeName;
	}
}

