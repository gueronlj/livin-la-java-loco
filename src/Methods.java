public class Methods {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Bob");
    }

    static void sayHelloTo(String name) {
        System.out.println("Greatings "+ name);
    }

    static void sayHello(){
        System.out.println("Hello!");
    }

    static int returnMe(){
        return 2;
    }
}
