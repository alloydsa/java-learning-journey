class Human {
    private int age; // encapsulated field

    private String name; // encapsulated field

    Human() { // Default constructor
        this.age = 12; // Default age
        this.name = "John"; // Default name
    }

    Human(int age, String name) {
        this.age = age; // Parameterized constructor
        this.name = name; // Parameterized constructor
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class constructors {

    public static void main(String[] args) {
        Human person = new Human();

        Human person2 = new Human(25, "Alice");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }

}
