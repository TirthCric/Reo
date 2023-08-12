import javax.swing.*;
// import java.util.*;
// import java.awt.image.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.beans;
public class Login extends JFrame implements ActionListener {
      
      JButton loginButton , clearButton , signupButton;
      JTextField cField;
      JPasswordField pField;

    Login()
    {
    
        setLayout(null);

        setTitle("Automatic Tialer Mechine");
        
        // ***** Image Logo ****

        ImageIcon i1 = new ImageIcon(("BankLogo.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        // *****  Frame creation *****

         setSize(600, 500);
         setVisible(true);
         setLocation(400, 150);
          getContentPane().setBackground(Color.white);

        //*******  Labels  *******
        
        JLabel lable = new JLabel(i3);
        lable.setBounds(70, 10,70, 70);
        add(lable);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(170, 30, 400, 40);
        add(text);

        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Railway",Font.BOLD,25));
        cardno.setBounds(170, 120, 200, 30);
        add(cardno);

        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway",Font.BOLD,25));
        pin.setBounds(243, 170, 200, 30);
        add(pin);
        

        // ********  Fields  *********

         cField = new JTextField();
        cField.setBounds(310, 125, 210, 25);
        add(cField);
        
         pField = new JPasswordField();
        pField.setBounds(310, 170, 210, 25);
        add(pField);


        // ******  Buttons  ******


         loginButton = new JButton("SIGN IN");
        loginButton.setBounds(310, 210, 90,20);
        loginButton.addActionListener(this);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        add(loginButton);

         clearButton = new JButton("CLEAR");
        clearButton.setBounds(420, 210, 100,20);
        clearButton.addActionListener(this);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        add(clearButton);

        signupButton = new JButton("SIGN IN");
        signupButton.setBounds(310, 240, 210,20);
        signupButton.addActionListener(this);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        add(signupButton);

      }

      // ****** Action Perform on buttons and field ******

      
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource() == clearButton)
         {
            cField.setText("");
            pField.setText("");
         }
         else if (ae.getSource() == loginButton)
         {

         }
         else if (ae.getSource() == signupButton)
         {

         }
    }

   public static void main(String[] args) {
    new Login();
   }
}
