import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;

// import com.toedter.calendar.JDateChooser;
// import com.toedter.calendar.JTextFieldDateEditor;
public class Signup extends JFrame implements ActionListener {

    long random;
    JTextField nameField, fnameField, dobField, emailField,
            addressField, cityField, stateField, pincodeField;
    JRadioButton male, female, other, married, unmarried, other1;
    JButton next;
    Conn c = new Conn(); 

    Signup() {
        setLayout(null);
        setSize(850, 800);
        setLocation(400, 10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        Random ran = new Random();

        // ******* Labels *******

        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel page = new JLabel("Page 1:Personl Detail");
        page.setFont(new Font("Raleway", Font.BOLD, 30));
        page.setBounds(250, 80, 400, 40);
        add(page);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        name.setBounds(100, 140, 100, 30);
        add(name);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 25));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 25));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 25));
        gender.setBounds(100, 290, 100, 30);
        add(gender);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 25));
        email.setBounds(100, 340, 200, 30);
        add(email);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 25));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 25));
        address.setBounds(100, 440, 200, 30);
        add(address);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 25));
        city.setBounds(100, 490, 200, 30);
        add(city);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 25));
        state.setBounds(100, 540, 200, 30);
        add(state);

        JLabel pincode = new JLabel("PinCode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 25));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        // ******* Text Fields ********

        nameField = new JTextField();
        nameField.setBounds(300, 140, 400, 25);
        add(nameField);

        fnameField = new JTextField();
        fnameField.setBounds(300, 190, 400, 25);
        add(fnameField);

        dobField = new JTextField();
        dobField.setBounds(300, 240, 400, 25);
        add(dobField);

        emailField = new JTextField();
        emailField.setBounds(300, 340, 400, 25);
        add(emailField);

        addressField = new JTextField();
        addressField.setBounds(300, 440, 400, 25);
        add(addressField);

        cityField = new JTextField();
        cityField.setBounds(300, 490, 400, 25);
        add(cityField);

        stateField = new JTextField();
        stateField.setBounds(300, 540, 400, 25);
        add(stateField);

        pincodeField = new JTextField();
        pincodeField.setBounds(300, 590, 400, 25);
        add(pincodeField);

        // ******** RadioButtons *******

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 15));
        male.setBounds(300, 290, 100, 25);
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 15));
        female.setBounds(450, 290, 100, 25);
        female.setBackground(Color.WHITE);
        female.setForeground(Color.BLACK);
        add(female);

        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 15));
        other.setBounds(600, 290, 100, 25);
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        add(other);

        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 15));
        married.setBounds(300, 390, 100, 25);
        married.setBackground(Color.WHITE);
        married.setForeground(Color.BLACK);
        add(married);

        unmarried = new JRadioButton("UnMarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
        unmarried.setBounds(450, 390, 150, 25);
        unmarried.setBackground(Color.WHITE);
        unmarried.setForeground(Color.BLACK);
        add(unmarried);

        other1 = new JRadioButton("Other");
        other1.setFont(new Font("Raleway", Font.BOLD, 15));
        other1.setBounds(600, 390, 100, 25);
        other1.setBackground(Color.WHITE);
        other1.setForeground(Color.BLACK);
        add(other1);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        ButtonGroup margroup = new ButtonGroup();
        margroup.add(married);
        margroup.add(unmarried);
        margroup.add(other1);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(600, 640, 100, 25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameField.getText();
        String fname = fnameField.getText();
        String dob = dobField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pincode = pincodeField.getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";

        } else if (female.isSelected()) {
            gender = "Female";

        } else {
            gender = "other";
        }

        String marital = null;
        if (married.isSelected()) {
            gender = "Married";

        } else if (unmarried.isSelected()) {
            gender = "Unmarried";

        } else {
            gender = "other";
        }

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                // Conn c = new Conn();
                String query = " insert into Signup values ('" + formno + "', '" + name + "','" + fname + "','" + dob
                        + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','"
                        + state + "','" + pincode + "')";

                
                c.s.executeQuery(query);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new Signup();
       
    }
}