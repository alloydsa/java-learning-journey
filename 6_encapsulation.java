class Human {
    private int age; // encapsulated field

    private String name; // encapsulated field

    // Setter for age
    public void setAge(int age) {
        this.age = age; // this keyword refers to the current instance of the class and is used to
                        // differentiate between the instance variable and the parameter, without this
                        // keyword assignment would not work
        // without this keyword, we should pass the object
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

class encapsulation {
    public static void main(String[] args) {
        // Create an instance of the Human class

        Human person = new Human();
        person.setAge(25); // Set the age using setter
        person.setName("John Doe"); // Set the name using setter

        System.out.println("Name: " + person.getName()); // Get the name using getter
        System.out.println("Age: " + person.getAge()); // Get the age using getter
    }
}
