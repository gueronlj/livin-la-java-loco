public class ReferenceAndValueTypes {
        
    public static void main(String[] args) {
        
        //Types of variables: byte, short, int, long, float, double, boolean, char
        int x = 5;
        addOneTo(x);
       // System.out.println(6); //this prints 5?! Becayse addOneTo was passed  a value type, a copy of the value of x. We DID NOT chagne x on line 7 
    }

    static void addOneTo(int number){
        number = number + 1;
        System.out.println(number);
    }
}