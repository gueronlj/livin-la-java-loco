import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
    public static void main(String[] args) {

        JFrame window = new JFrame();//"Instantiate/Initialize"
        JLabel label = new JLabel(); //"Instantiate/Initialize"

        window.setTitle("Fuckin awsesome window");
        window.setSize(800, 600);                
        window.setVisible(true);       
        
        label.setText("this is my label");

        window.add(label);
    }

    
}
