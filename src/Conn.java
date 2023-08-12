import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public void print()
    {
        System.out.println("Hello World");
    }
   public Conn()
    {
     try{
      Class.forName("com.mysql.cj.jdbc.Driver");
     c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Tirth@123");
     s = c.createStatement();

     }catch(Exception e){

        System.out.println(e);
     }

    }
   public static void main(String[] args) {
       Conn a =  new Conn();
       a.print();
   }
}
