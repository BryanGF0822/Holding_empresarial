package model;

public class EmpresasDeServicio extends Company{





	/**
	 * [EmpresasDeServicio description]
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
	public EmpresasDeServicio(String name, int nitNumber, String address, int phoneNumber, int employeeNumber, double assetsValue, String constitutionDate, char organizationType, String legalRepresentativeName){

		super(name, nitNumber, address, phoneNumber, employeeNumber, assetsValue, constitutionDate, organizationType, legalRepresentativeName);
	}


}