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


	public Medicamentos(String name, int code, double waterAmount, int unitsInInventory, String sanitaryRegistration, String state, String expiration, String modality){

		super(name, code, waterAmount, unitsInInventory);

		this.sanitaryRegistration = sanitaryRegistration;
		this.state = state;
		this.expiration = expiration;
		this.modality = modality;
	}

	public String getSanitaryRegistration(){

		return sanitaryRegistration;
	}

	public void setSanitaryRegistration(String sanitaryRegistration){

		this.sanitaryRegistration = sanitaryRegistration;
	}

	public String getState(){

		return state;
	}

	public void setState(String state){

		this.state = state;
	}

	public String getExpiration(){

		return expiration;
	}

	public void setExpiration(String expiration){

		this.expiration = expiration;
	}

	public String getModality(){

		return modality;
	}

	public Void setModality(String modality){

		this.modality = modality;
	}
}