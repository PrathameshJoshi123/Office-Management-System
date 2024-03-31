package View.Employees;

import javax.swing.*;
import java.awt.*;

public class DeleteEmployee extends JFrame {
    JTextField id;
    JPanel label;
    JLabel l;
    JPanel text;
    JButton del;
    JPanel confirm;
    public DeleteEmployee(){
        id=new JTextField(5);
        id.setSize(10,10);
        label=new JPanel();
        l=new JLabel("Please enter the Employee Id");
        l.setFont(new Font("ADD EMPLOYEE", Font.BOLD, 30));
        text=new JPanel();
        del=new JButton("DELETE THE EMPLOYEE");
        del.setFont(new Font("ADD EMPLOYEE", Font.BOLD, 20));
        label.add(l);
        setLayout(new FlowLayout());
        setSize(600,300);
        add(label);
        text.add(id);
        text.add(del);
        add(text);

        confirm = new JPanel();
        JLabel confirm1 = new JLabel("Employee Deleted Successfully.");
        confirm.add(confirm1);
        confirm.setVisible(false);
        add(confirm);
    }

    public JButton getDel() {
        return del;
    }

    public JLabel getL() {
        return l;
    }

    public JPanel getLabel() {
        return label;
    }

    public JPanel getText() {
        return text;
    }

    public JTextField getId() {
        return id;
    }

    public JPanel getConfirm() {
        return confirm;
    }
}
