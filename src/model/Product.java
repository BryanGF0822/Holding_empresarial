package model;

public class Product{

	private String nameProduct;
	private int code;
	private double waterAmount;
	private int unitsInInventory;

	/**
	 * [Product description]
	 * @param  nameProduct      [description]
	 * @param  code             [description]
	 * @param  waterAmount      [description]
	 * @param  unitsInInventory [description]
	 * @return                  [description]
	 */
	public Product(String nameProduct, int code, double waterAmount, int unitsInInventory){

		this.nameProduct = nameProduct;
		this.code = code;
		this.waterAmount = waterAmount;
		this.unitsInInventory = unitsInInventory;
	}
	/**
	 * [getNameProduct description]
	 * @return [description]
	 */
	public String getNameProduct(){

		return nameProduct;
	}
	/**
	 * [setNameProduct description]
	 * @param  nameProduct [description]
	 * @return             [description]
	 */
	public Void setNameProduct(String nameProduct){

		this.nameProduct = nameProduct;
	}
	/**
	 * [getCode description]
	 * @return [description]
	 */
	public int getCode(){

		return code;
	}
	/**
	 * [setCode description]
	 * @param code [description]
	 */
	public void setCode(int code){

		this.code = code;
	}
	/**
	 * [getWaterAmount description]
	 * @return [description]
	 */
	public double getWaterAmount(){

		return waterAmount;
	}
	/**
	 * [setWaterAmount description]
	 * @param waterAmount [description]
	 */
	public void setWaterAmount(double waterAmount){

		this.waterAmount = waterAmount;
	}
	/**
	 * [getUnitsInInventory description]
	 * @return [description]
	 */
	public int getUnitsInInventory(){

		return unitsInInventory;
	}
	/**
	 * [setUnitsInInventory description]
	 * @param unitsInInventory [description]
	 */
	public void setUnitsInInventory(int unitsInInventory){

		this.unitsInInventory = unitsInInventory;
	}
}