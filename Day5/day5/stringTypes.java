public class stringTypes {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");


        System.out.println(System.identityHashCode(str1)); // Hello
        System.out.println(System.identityHashCode(str2)); // Hello
        System.out.println(System.identityHashCode(str3)); // Hello

        System.out.println(str1 == str2); // true (string literals are interned)
        System.out.println(str1 == str3); // false (str3 is a new object)
        System.out.println(str1.equals(str3)); // true (content is the same)
    }
}