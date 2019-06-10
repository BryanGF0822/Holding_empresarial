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


	/**
	 * [EmpresasDeFabricacion description]
	 * @param  name                     [description]
	 * @param  nitNumber                [description]
	 * @param  address                  [description]
	 * @param  phoneNumber              [description]
	 * @param  employeeNumber           [description]
	 * @param  assetsValue              [description]
	 * @param  constitutionDate         [description]
	 * @param  organizationType         [description]
	 * @param  legalRepresentativeName  [description]
	 * @param  registryNumberMEN        [description]
	 * @param  yearsOfAcreditation      [description]
	 * @param  nationalPosition         [description]
	 * @param  rectorName               [description]
	 * @param  educationSector          [description]
	 * @param  numberStudentsStratum1y2 [description]
	 * @param  totalNumberStudents      [description]
	 * @return                          [description]
	 */
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
	/**
	 * [getRegistryNumberMEN description]
	 * @return [description]
	 */
	public int getRegistryNumberMEN(){

		return registryNumberMEN;
	}
	/**
	 * [setRegistryNumberMEN description]
	 * @param registryNumberMEN [description]
	 */
	public void setRegistryNumberMEN(int registryNumberMEN){

		this.registryNumberMEN = registryNumberMEN;
	}
	/**
	 * [getYearsOfAcreditation description]
	 * @return [description]
	 */
	public int getYearsOfAcreditation(){

		return yearsOfAcreditation;
	}
	/**
	 * [setYearsOfAcreditation description]
	 * @param yearsOfAcreditation [description]
	 */
	public void setYearsOfAcreditation(int yearsOfAcreditation){

		this.yearsOfAcreditation = yearsOfAcreditation;
	}
	/**
	 * [getNationalPosition description]
	 * @return [description]
	 */
	public int getNationalPosition(){

		return nationalPosition;
	}
	/**
	 * [setNationalPosition description]
	 * @param nationalPosition [description]
	 */
	public void setNationalPosition(int nationalPosition){

		this.nationalPosition = nationalPosition;
	}
	/**
	 * [getRectorName description]
	 * @return [description]
	 */
	public String getRectorName(){

		return rectorName;
	}
	/**
	 * [setRectorName description]
	 * @param rectorName [description]
	 */
	public void setRectorName(String rectorName){

		this.rectorName = rectorName;
	}
	/**
	 * [getEducationSector description]
	 * @return [description]
	 */
	public String getEducationSector(){

		return educationSector;
	}
	/**
	 * [setEducationSector description]
	 * @param educationSector [description]
	 */
	public void setEducationSector(String educationSector){

		this.educationSector = educationSector;
	}
	/**
	 * [getNumberStudentsStratum1y2 description]
	 * @return [description]
	 */
	public int getNumberStudentsStratum1y2(){

		return numberStudentsStratum1y2;
	}
	/**
	 * [setNumberStudentsStratum1y2 description]
	 * @param  numberStudentsStratum1y2 [description]
	 * @return                          [description]
	 */
	public Void setNumberStudentsStratum1y2(int numberStudentsStratum1y2){

		this.numberStudentsStratum1y2 = numberStudentsStratum1y2;
	}
	/**
	 * [getTotalNumberStudents description]
	 * @return [description]
	 */
	public int getTotalNumberStudents(){

		return totalNumberStudents;
	}
	/**
	 * [setTotalNumberStudents description]
	 * @param  totalNumberStudents [description]
	 * @return                     [description]
	 */
	public Void setTotalNumberStudents(int totalNumberStudents){

		this.totalNumberStudents = totalNumberStudents;
	}

	
}