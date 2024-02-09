import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class GUIadd extends JFrame implements ActionListener
{
    JTextField tf1, tf2, tf3;
    JLabel lb1,lb2,lb3;
    JButton b;
    GUIadd()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        tf3=new JTextField(10);
        lb1=new JLabel("Number 1");
        lb2=new JLabel("Number 2");
        lb3=new JLabel("Answer");
        b=new JButton("Calculate");
        b.addActionListener(this);
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(b);

        setSize(650,100);
        setVisible(true);
    }

    public static void main(String args[])
    {
        GUIadd obj=new GUIadd();
    }
    public void actionPerformed(ActionEvent e)
    {
        String number1=tf1.getText();
        int num1=Integer.parseInt(number1);
        String number2=tf2.getText();
        int num2=Integer.parseInt(number2);
        int sum=num1+num2;
        String add=Integer.toString(sum);
        tf3.setText(add);
    }
}
