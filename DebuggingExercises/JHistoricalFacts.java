import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press to change information");
    JLabel header = new JLabel("*****");
    JLabel labelOne = new JLabel("EBola is bad");
    JLabel labelTwo = new JLabel("Cairns has the largest population of drop bears");
    JLabel labelThree = new JLabel("Bon JOvi made his first million 17 years ago ");
    JLabel labelFour = new JLabel("EBola is not bad");
    int counter = 0;

    public JHistoricalFacts(){
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(header);
        add(labelOne);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        ++counter;
        if (counter == 5)
            counter = 0;
        if (counter == 1){
            remove(labelOne);
            add(labelTwo);
        }
        else
        if(counter == 2)
        {
            remove(labelTwo);
            add(labelThree);
        }
        else
        if(counter == 3)
        {
            remove(labelThree);
            add(labelFour);
        }
        else
        if(counter == 4)
        {
            remove(labelFour);
        }

        validate();
        repaint();
        }
    }





