import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener{

    FlowLayout flow = new FlowLayout();
    String companyN = new String("Starbucks");
    Font font = new Font("Century", Font.PLAIN, 25);
    final int pPrice = 600, poolPrice = 750, lakePrice = 825 ;
    int totalPrice = 0;
    ButtonGroup locationGroup = new ButtonGroup();
    JCheckBox parkBox = new JCheckBox("Parkside",false);
    JCheckBox poolBox = new JCheckBox("Poolside", false);
    JCheckBox lakeBox = new JCheckBox("Lakeside", false);

    final int priceOne = 0, priceTwo = 75, priceThree = 150;

    ButtonGroup group = new ButtonGroup();
    JCheckBox boxOne = new JCheckBox("1 bedroom", false);
    JCheckBox boxTwo = new JCheckBox("2 bedrooms", false);
    JCheckBox boxThree = new JCheckBox("3 bedrooms", false);

    final int  priceWithoutMeal = 0, priceWithMeal = 200;

    ButtonGroup meal = new ButtonGroup();
    JCheckBox boxWoutMeal = new JCheckBox("No meals",false);
    JCheckBox boxWithMeal = new JCheckBox("Meals included",false);
    JTextField toPrice = new JTextField(10);

    String output;

    public JVacationRental(){
        super("Vacation rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        locationGroup.add(parkBox);
        parkBox.addItemListener(this);
        locationGroup.add(poolBox);
        poolBox.addItemListener(this);
        locationGroup.add(lakeBox);
        lakeBox.addItemListener(this);
        group.add(boxOne);
        boxTwo.addItemListener(this);
        group.add(boxTwo);
        boxThree.addItemListener(this);
        group.add(boxThree);
        meal.add(boxWoutMeal);
        boxWoutMeal.addItemListener(this);
        meal.add(boxWithMeal);
        boxWithMeal.addItemListener(this);
        add(parkBox);
        add(poolBox);
        add(lakeBox);
        add(boxOne);
        add(boxTwo);
        add(boxThree);
        add(boxWoutMeal);
        add(boxWithMeal);
        toPrice.setText("0");
        add(toPrice);
    }

    public static void main(String[] args) {
        JVacationRental frame = new JVacationRental();
        frame.setSize(360,200);
        frame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        if(source == parkBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += pPrice;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= pPrice;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == poolBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += poolPrice;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= poolPrice;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == lakeBox)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += lakePrice;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= lakePrice;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == boxOne)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += priceOne;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= priceOne;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == boxTwo)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += priceTwo;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= priceTwo;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == boxThree)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += priceThree;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= priceThree;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == boxWoutMeal)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += priceWithoutMeal;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= priceWithoutMeal;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
        else if(source == boxWithMeal)
        {
            int select = check.getStateChange();
            if(select == ItemEvent.SELECTED)
                totalPrice += priceWithMeal;
            else if(select == ItemEvent.DESELECTED)
                totalPrice -= priceWithMeal;
            output = " " + totalPrice;
            toPrice.setText(output);
        }
    }
}
