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
}