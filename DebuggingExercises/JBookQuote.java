import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {


    FlowLayout flow = new FlowLayout();
    JLabel message1 = new JLabel("In the beginning god created the heavens " +
            "and the earth");


    public JBookQuote(){
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(message1);
    }

    public static void main(String[] args) {
        JBookQuote frame = new JBookQuote();
        frame.setSize(200, 75);
        frame.setVisible(true);

    }
}




