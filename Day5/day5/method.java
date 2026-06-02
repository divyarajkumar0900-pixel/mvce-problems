
public class method {
    public static void main(String[] args) {
            sayHello();
            sayHii("Alice");
            System.out.println(getPi());
        System.out.println(sum(2, 5));
        System.out.println(sum(8, 5));
        System.out.println(sum(16, 5));
    }

    // wo return wo param
    static void sayHello() {
        System.out.println("Hello");
    }

    // wo return w param
    static void sayHii(String name) {
        System.out.println("Hii " + name + "!");
    }

    // w return wo param
    static double getPi() {
        return 3.14159265;
    }

    // w return w param
    static int sum(int a, int b) {
        return a + b;
    }
}

