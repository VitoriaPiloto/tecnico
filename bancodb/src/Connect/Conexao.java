package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
  public static String status = "";
  
  public static Connection getConnection(){
      Connection con= null;
      try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          String url="jdbc:mysql://localhost/merda?user=root&password=";
          // String url="jdbc:mysql://localhost/[Nome do banco]?user=[Usuario]&password=[senha]";
          con = DriverManager.getConnection(url);
          status = "Conexão Aberta";
      }catch(SQLException e){
          status = e.getMessage();
      }catch(ClassNotFoundException e){
          status = e.getMessage();
      }catch(Exception e){
          status = e.getMessage();
      }
      return con;
  }}
