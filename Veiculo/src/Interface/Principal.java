/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import persistencia.caminhao;
import persistencia.onibus;
import persistencia.veiculo;


/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String sexo="f";
        System.out.println("sexo"+sexo);
        
        onibus o1=new onibus();
        veiculo v=new veiculo();
        o1.setPlaca("yso2313");
        o1.setAno(2017);
        o1.setAssentos(48);
        o1.exibeDadosI();
        
        caminhao c=new caminhao();
        c.setPlaca("Nul0593");
        c.setAno(1999);
        c.setEixos(6);
        c.exibeDadosI();
       
        veiculo v2=new caminhao();
        caminhao cam=(caminhao) v2;
        cam.setPlaca("Bolsominiondumal");
        cam.setValor(12.122);
        cam.setAno(2011);
        cam.setEixos(4);
        System.out.println("chamada da mother class");
        cam.exibeDadosI();
        //parasuperclasse
        
        veiculo v1=new onibus();
        onibus bus=(onibus) v1;
        bus.setAno(1998);
        bus.setPlaca("peidei");
        bus.setValor(1293.2);
        bus.setAssentos(42);
        System.out.println("chamada da mother class");
        bus.exibeDadosI();
                
    }
    
}
