package Larionov.entitites;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Product {
	private long id;
	private String name;
	private final Category category;
	private double price;

	public static List<Product> store = new ArrayList<>();

	public Product(String name, Category category, double price) {
		this.name = name;
		this.category = category;
		if (price < 0) {
			throw new IllegalArgumentException("Il prezzo deve essere positivo.");
		}
		this.price = price;
		Random random = new Random();
		this.id = random.nextLong(1,1000000000);

	}


	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public static void addToStore(Product product){
		store.add(product);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", category=" + category +
				", price=" + price +
				'}';
	}
}
