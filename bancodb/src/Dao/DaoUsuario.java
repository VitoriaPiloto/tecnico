package Dao;
import javax.swing.JOptionPane;
import Connect.Conexao;
import Persistencia.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class DaoUsuario {
    Connection con;
    // Inserir Brabão mané, inserindo tudo
   public void inserir(Usuario u){
       String qry="insert into usuario(nome,cpf,email,tel) values(?,?,?,?)";
       if(u !=null){
           String status="";
       
       System.out.println(qry);
       try{
           con=Conexao.getConnection();
           PreparedStatement preparador= con.prepareStatement(qry);
           preparador.setString(1,u.getNome());
           preparador.setString(2,u.getCpf());
           preparador.setString(3,u.getEmail());
           preparador.setString(4,u.getTel());
           preparador.execute();
           status = "Incluido com sucesso";
           JOptionPane.showMessageDialog(null, status);
           con.close();
       }catch(SQLException e){
           status = e.getMessage();
           JOptionPane.showMessageDialog(null,"Erro na inclusão do usuario "+status);
       }
   }}//Alterando o bagulho manooo
   public void alterar(Usuario u){
       String sql ="update usuarui set nome=?,cpf=?,tel=?,email=? where id=?";
   }
}
