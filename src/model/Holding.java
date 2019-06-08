package model;

import java.util.ArrayList;

public class Holding{

	private ArrayList<Company>company;



	public Holding(){

		company = new ArrayList<Company>();
	}

	public ArrayList<Company> getCompany(){

		return company;
	}

	public void agregarCompany(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName, int registryNumberMEN, int yearsOfAcreditation, int nationalPosition, String rectorName, String educationSector, int numberStudentsStratum1y2, int totalNumberStudents){

		EmpresasDeEducacion e = new EmpresasDeEducacion(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName, registryNumberMEN, yearsOfAcreditation, nationalPosition,rectorName, educationSector, numberStudentsStratum1y2, totalNumberStudents);
		company.add(e);
	}

	public void agregarCompany(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName, String serviceType){

		EmpresasDeTecnologia t = new EmpresasDeTecnologia(name, nitNumber, address, phoneNumber,employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName, serviceType);
		company.add(t);
	}

	
}