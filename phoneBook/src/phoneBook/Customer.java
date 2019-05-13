package phoneBook;

import java.util.Collection;

public class Customer {

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " | " + email;
    }

    public static String toString(Collection<Customer> customers) {
        String s = "";
        for(Customer customer : customers) {
            s += customer + "\n";
        }
        return s;
    }

}


