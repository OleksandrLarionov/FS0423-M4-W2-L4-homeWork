package Larionov.entitites;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer {
	private long id;
	private String name;
	private String surname;
	private int tier;
	public static List<Customer> customers = new ArrayList<>();

	public Customer(String name, String surname, int tier) {
		this.name = name;
		this.surname = surname;
		this.tier = tier;
		Random rndm = new Random();
		this.id = rndm.nextLong(1,1000000000);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public long getId() {
		return id;
	}

	public static void addCustomer (Customer customer){
		customers.add(customer);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + " ,Surname=" + surname + ", tier=" + tier + ", id=" + id +"]";
	}

}
