package phoneBook;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Bert", "bert@gmail.com"));
        customers.add(new Customer("Ernie", "ernie@gmail.com"));
        System.out.println("customers before email change - start");
        System.out.println(Customer.toString(customers));
        System.out.println("end");
        customers.get(1).setEmail("new.email@gmail.com");
        System.out.println("customers after email change - start");
        System.out.println(Customer.toString(customers));
        System.out.println("end");
    }

}
