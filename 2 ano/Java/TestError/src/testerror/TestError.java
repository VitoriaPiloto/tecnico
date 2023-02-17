/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerror;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TestError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux;
        int quo = 0;
        try{
            aux=JOptionPane.showInputDialog("informaivos o dividendo por obséquio");
            int div=Integer.parseInt(aux);
            aux=JOptionPane.showInputDialog("Informaivos o divisor por obséquio");
            int divs=Integer.parseInt(aux);
            quo=div/divs;
        }catch(Exception ex){
            aux="ocorreu uma exceção"+
                    "\nTipo:"+ ex.getClass()+
                    "\nMensagem:"+ ex.getMessage();
            JOptionPane.showMessageDialog(null, aux, "Error",0);
            System.exit(0);
        }
            JOptionPane.showMessageDialog(null,"resultado:"+ quo);
            
        
       
    
    }
}
