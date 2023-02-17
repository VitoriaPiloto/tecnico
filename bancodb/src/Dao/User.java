package Dao;
import Connect.Conexao;
import Persistencia.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class User {
    Connection con;
 public void inserir(Usuario u){
     String qry="insert into usuario(nome,cpf,tel,email) values (?,?,?,?)";
     if(u!=null){
      String status="";
      System.out.println(qry);
      try{
          con=Conexao.getConnection();
          PreparedStatement preparador=con.prepareStatement(qry);
          preparador.setString(1,u.getNome());
          preparador.setString(2,u.getCpf());
          preparador.setString(3,u.getEmail());
          preparador.setString(4,u.getTel());
          preparador.execute();
          status = "incluido com sucesso";
          JOptionPane.showMessageDialog(null, status);
      }catch (SQLException e){
          status = e.getMessage();
          JOptionPane.showInputDialog(null, "Erro   na inclusão do usuário" + status);
 }
 } 
 }
}

