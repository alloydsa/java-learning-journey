class Mobile {
    String name;
    String brand;
    int price;

    static String company;

    // static block to initialize the static variable, this will be called when the
    // class is loaded and it will be executed only once
    static {
        company = "Default Company";
    }

    public Mobile() {
        // Constructor to initialize the mobile object
        name = "";
        brand = "";
        price = 0;

    }

    public void show() {
        System.out.println("Mobile Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Company: " + company);
    }

    public static void setCompany(String newCompany) {
        company = newCompany;
    }

}

public class Demostatic {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.name = "Galaxy S21";
        mobile1.brand = "Samsung";
        mobile1.price = 799;
        mobile1.show();
        Mobile mobile2 = new Mobile();
        mobile2.name = "iPhone 13";
        mobile2.brand = "Apple";
        mobile2.price = 999;

        // Setting the static variable
        Mobile.company = "TechCorp";

        mobile2.show();

        // static variable is shared among all instances(objects) of the class
    }
}
