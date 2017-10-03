import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {

    final int size = 180;
    Container contain = getContentPane();
    JButton button = new JButton("Press");

    public JFrameDisableButton{
        super("Frame");
        contain.setLayout(new FlowLayout());
        setSize(size, size);
        setVisible(true);
        contain.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actPerform(ActionEvent event){
        button.setEnabled(false);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}
