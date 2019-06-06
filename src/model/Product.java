package model;

public class Product{

	private String name;
	private int code;
	private double waterAmount;
	private int unitsInInventory;


	public Product(String name, int code, double waterAmount, int unitsInInventory){

		this.name = name;
		this.code = code;
		this.waterAmount = waterAmount;
		this.unitsInInventory = unitsInInventory;
	}

	public String getName(){

		return name;
	}

	public Void setName(String name){

		this.name = name;
	}

	public int getCode(){

		return code;
	}

	public void setCode(int code){

		this.code = code;
	}

	public double getWaterAmount(){

		return waterAmount;
	}

	public void setWaterAmount(double waterAmount){

		this.waterAmount = waterAmount;
	}

	public int getUnitsInInventory(){

		return unitsInInventory;
	}

	public void setUnitsInInventory(int unitsInInventory){

		this.unitsInInventory = unitsInInventory;
	}
}