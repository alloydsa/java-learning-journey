public class string {
    public static void main(String[] args) {
        // String is a class in Java that represents a sequence of characters.

        String name = new String("John Doe");
        System.out.println("Name: " + name);
        System.out.println("Hashcode: " + name.hashCode());
        System.out.println("Concat: " + name.concat("is best"));

        // StringBuffer is a mutable sequence of characters. and thread safe.
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.capacity());
        System.out.println("StringBuffer: " + sb);

    }
}
