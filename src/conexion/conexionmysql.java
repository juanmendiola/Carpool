
package conexion;
import java.sql.*;
public class conexionmysql {
   Connection cn;
   
   public Connection conectar(){
   try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_java_mysql1","root","");
            System.out.println("Conectado");           
} catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexion bd"+e);
}
return cn;
}
}
