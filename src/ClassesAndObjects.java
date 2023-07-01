import javax.swing.JLabel;

public class ClassesAndObjects {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        Person john = new Person("John");
        john.age = 23;
        john.lastName = "Fish";

        Person bob = new Person("Bob");
        bob.age = 32;
        bob.lastName = "Pickle";

        //john.setLastName("Ball");
        System.out.println(bob.name + ' ' + bob.lastName); //lastname is declared as Static so the values cannot be different
    }
}
