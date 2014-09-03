import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;

public class AddTesterColor
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Expected: (0,0,25,40)");
        System.out.println(box);
        
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        Color myColor = Color.GREEN;
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}