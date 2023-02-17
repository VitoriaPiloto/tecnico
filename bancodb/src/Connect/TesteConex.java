package Connect;
import Gui.*;
public class TesteConex {
    public static void main(String[] args) {
        Conexao.getConnection();
        System.out.println(Conexao.status);
    }
    
}
