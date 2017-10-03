import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {

    final int size = 200;
    Container contain = getContentPane();
    JButton button = new JButton("Press");

    int counter = 0;
    final int max = 8;
    JLabel label = new JLabel("Thats enough");

    public JFrameDisableButton2(){
        super("Frame");
        contain.setLayout(new FlowLayout());
        setSize(size,size);
        setVisible(true);
        contain.add(button);
        contain.add(label);
        label.setVisible(false);
        button.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent event)
    {++counter;
    if (counter == max){
        button.setEnabled(false);
        label.setVisible(true);
    }

    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }

}
