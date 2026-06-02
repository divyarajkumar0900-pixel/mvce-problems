public class strUppercase {
    public static void main(String[] args) {
        String str = "hello world";
        String upperStr = str.toUpperCase();
        System.out.println(upperStr); // Output: HELLO WORLD
        System.out.println(str.toUpperCase()); 
        str=str.toUpperCase();
        System.out.println(str); // Output: HELLO WORLD (original string remains unchanged)


    }
}