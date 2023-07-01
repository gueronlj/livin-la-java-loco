public class TypesAndVars {

    static String global = "everyone can use me"; //this is global simply because of where it is initialized
    public static void main(String[] args) {
        String local; // declaring;
        
        local = "this is scoped to this function";//initializing 

        System.out.println(local);
    }
}
