package model;

public class Medicamentos extends Product{

	public final static String VIGENTE = "vigente";
	public final static String NO_RENOVADO = "No renovado";

	public final static String FABRICAR_Y_EXPORTAR = "Fabricar y exportar";
	public final static String FABRICAR_Y_VENDER = "Fabricar y vender";
	public final static String IMPORTAR_Y_VENDER = "Importar y vender";

	private String sanitaryRegistration;
	private String state;
	private String expiration;
	private String modality;

	/**
	 * [Medicamentos description]
	 * @param  name                 [description]
	 * @param  code                 [description]
	 * @param  waterAmount          [description]
	 * @param  unitsInInventory     [description]
	 * @param  sanitaryRegistration [description]
	 * @param  state                [description]
	 * @param  expiration           [description]
	 * @param  modality             [description]
	 * @return                      [description]
	 */
	public Medicamentos(String name, int code, double waterAmount, int unitsInInventory, String sanitaryRegistration, String state, String expiration, String modality){

		super(name, code, waterAmount, unitsInInventory);

		this.sanitaryRegistration = sanitaryRegistration;
		this.state = state;
		this.expiration = expiration;
		this.modality = modality;
	}
	/**
	 * [getSanitaryRegistration description]
	 * @return [description]
	 */
	public String getSanitaryRegistration(){

		return sanitaryRegistration;
	}
	/**
	 * [setSanitaryRegistration description]
	 * @param sanitaryRegistration [description]
	 */
	public void setSanitaryRegistration(String sanitaryRegistration){

		this.sanitaryRegistration = sanitaryRegistration;
	}
	/**
	 * [getState description]
	 * @return [description]
	 */
	public String getState(){

		return state;
	}
	/**
	 * [setState description]
	 * @param state [description]
	 */
	public void setState(String state){

		this.state = state;
	}
	/**
	 * [getExpiration description]
	 * @return [description]
	 */
	public String getExpiration(){

		return expiration;
	}
	/**
	 * [setExpiration description]
	 * @param expiration [description]
	 */
	public void setExpiration(String expiration){

		this.expiration = expiration;
	}
	/**
	 * [getModality description]
	 * @return [description]
	 */
	public String getModality(){

		return modality;
	}
	/**
	 * [setModality description]
	 * @param  modality [description]
	 * @return          [description]
	 */
	public Void setModality(String modality){

		this.modality = modality;
	}
}