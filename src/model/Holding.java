package model;

import java.util.ArrayList;

public class Holding{

	private ArrayList<Company>company;

	private Company company;


	/**
	 * [Holding description]
	 * @return [description]
	 */
	public Holding(){

		company = new ArrayList<Company>();
	}
	/**
	 * [getCompany description]
	 * @return [description]
	 */
	public ArrayList<Company> getCompany(){

		return company;
	}
	/**
	 * [agregarCompanye description]
	 * @param name                     [description]
	 * @param nitNumber                [description]
	 * @param address                  [description]
	 * @param phoneNumber              [description]
	 * @param employeeNumber           [description]
	 * @param assetsValue              [description]
	 * @param constitutionDate         [description]
	 * @param organizationType         [description]
	 * @param legalRepresentativeName  [description]
	 * @param registryNumberMEN        [description]
	 * @param yearsOfAcreditation      [description]
	 * @param nationalPosition         [description]
	 * @param rectorName               [description]
	 * @param educationSector          [description]
	 * @param numberStudentsStratum1y2 [description]
	 * @param totalNumberStudents      [description]
	 */
	public void agregarCompanye(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName, int registryNumberMEN, int yearsOfAcreditation, int nationalPosition, String rectorName, String educationSector, int numberStudentsStratum1y2, int totalNumberStudents){

		EmpresasDeEducacion e = new EmpresasDeEducacion(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName, registryNumberMEN, yearsOfAcreditation, nationalPosition,rectorName, educationSector, numberStudentsStratum1y2, totalNumberStudents);
		company.add(e);
	}
	/**
	 * [agregarCompanyt description]
	 * @param name                    [description]
	 * @param nitNumber               [description]
	 * @param address                 [description]
	 * @param phoneNumber             [description]
	 * @param employeeNumber          [description]
	 * @param assetsValue             [description]
	 * @param constitutionDate        [description]
	 * @param organizationType        [description]
	 * @param legalRepresentativeName [description]
	 * @param serviceType             [description]
	 */
	public void agregarCompanyt(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName, String serviceType){

		EmpresasDeTecnologia t = new EmpresasDeTecnologia(name, nitNumber, address, phoneNumber,employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName, serviceType);
		company.add(t);
	}
	/**
	 * [agregarCompanyf description]
	 * @param name                    [description]
	 * @param nitNumber               [description]
	 * @param address                 [description]
	 * @param phoneNumber             [description]
	 * @param employeeNumber          [description]
	 * @param assetsValue             [description]
	 * @param constitutionDate        [description]
	 * @param organizationType        [description]
	 * @param legalRepresentativeName [description]
	 */
	public void agregarCompanyf(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName){

		EmpresasDeFabricacion f = new EmpresasDeFabricacion(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName);
		company.add(f);
	}
	/**
	 * [agregarCompanypn description]
	 * @param name             [description]
	 * @param code             [description]
	 * @param waterAmount      [description]
	 * @param unitsInInventory [description]
	 */
	public void agregarCompanypn(String name, int code, double waterAmount, int unitsInInventory){

		Product pn = new Product(name, code, waterAmount, unitsInInventory);
		company.add(pn);
	}
	/**
	 * [agregarCompanym description]
	 * @param name                 [description]
	 * @param code                 [description]
	 * @param waterAmount          [description]
	 * @param unitsInInventory     [description]
	 * @param sanitaryRegistration [description]
	 * @param state                [description]
	 * @param expiration           [description]
	 * @param modality             [description]
	 */
	public void agregarCompanym(String name, int code, double waterAmount, int unitsInInventory, String sanitaryRegistration, String state, String expiration, String modality){

		Medicamentos m = new Medicamentos(name, code, waterAmount, unitsInInventory, sanitaryRegistration, state, expiration, modality);
		company.add(m);
	}

	
}