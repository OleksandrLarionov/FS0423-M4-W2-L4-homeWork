package Larionov;

import Larionov.entitites.Category;
import Larionov.entitites.Customer;
import Larionov.entitites.Product;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.ITALY);

        Supplier<Integer> supplieruplyRandom = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1,11);
        };

        System.out.println("*************************Book Products***********************************");

        Supplier<Double> supBookPrice = () -> {Random rndm = new Random(); return rndm.nextDouble(1,100);};
        Supplier<Product> booksSupplier = () -> new Product(faker.gameOfThrones().character(), Category.Books, supBookPrice.get());
        for (int i = 0; i < 100; i++) {
            Product.addToStore(booksSupplier.get());
        }
        Product.store.forEach(System.out::println);

        System.out.println("*************************Customer List***********************************");
        Supplier<Customer> customerSupplier = () -> new Customer(faker.funnyName().name(), faker.name().lastName(), supplieruplyRandom.get());
        for (int i = 0; i < 6; i++) {
            Customer.addCustomer(customerSupplier.get());
        }
        Customer.customers.forEach(System.out::println);
    }
}
