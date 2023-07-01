public class Loops {
    public static void main(String[] args) {
        forLoop();
    }

    static void whileLoop(){
        int counter = 0;
        while (counter < 10 ) {
            counter = counter + 1;
            System.out.print(counter);
        }
    }

    static void doWhileLoop(){
         int counter = 11;
         do {
            counter = counter + 1;
            System.out.print(counter);
         }  while(counter < 10);
    }

    static void forLoop(){
        for(int counter = 1; counter <= 10; counter = counter + 1){
              System.out.print(counter);
        }
    }
}
