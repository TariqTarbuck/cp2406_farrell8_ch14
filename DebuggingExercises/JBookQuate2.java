import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuate2 extends JFrame implements ActionListener{


    FlowLayout flow = new FlowLayout();
    JLabel messageOne = new JLabel("In the beginning god created the heavens " +
            "and the earth");
    JButton button = new JButton("Click for book");
    JLabel messageTwo = new JLabel("The Bible");

    public JBookQuate2(){
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(messageOne);
        add(button);
        button.addActionListener(this);

    }

    @Override
    public void actPerformed(ActionEvent event){
        add(messageTwo);
        validate();
        repaint();
    }

    public static void main(String[] args) {
        JBookQuate2 frame = new JBookQuate2();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
