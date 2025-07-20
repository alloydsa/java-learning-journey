
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class enumss {

    // Enum in Java is a special data type that enables a variable to be a set of
    // predefined constants.
    // The enum keyword is used to define an enumerated type.
    // Enums are used when we know all possible values at compile time.
    // They provide type safety and can be used in switch statements
    // By default enum extends Enum class, which is a special class in Java

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
        System.out.println("Ordinal of today: " + today.ordinal()); // Ordinal gives the position of the enum constant
                                                                    // in its enum declaration, starting from 0
    }
}
// Output:
// Today is: MONDAY
// Ordinal of today: 1