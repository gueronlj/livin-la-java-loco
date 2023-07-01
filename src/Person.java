public class Person {

    String name; //creates a porperty of Person called 'name' and its a string
    int age; //creates a porperty of Person called 'age', its am integer
   
    String lastName; //Because it is static, its value is shared by all instances of Person class, its value will always be the last one assigned.

    public Person(String name){ //This is custom Constructor Method, this will run every (new Person())
        this.name = name; //"this" object refers to this Person, it wokrs because Person was created at this point, thats why we have arrived at this line of code. 
        System.out.println("Person created, their name is "+ name);
    }

    public void setLastName(String string) {
       this.lastName = string;
    }

    public String getLastName() {
        return this.lastName;
    }
}
