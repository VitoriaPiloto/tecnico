/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peganomeusaku;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Peganomeusaku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double somar,op1 = 0 , op2 = 0 ;
            String codOp="";
                String controleLoop="sim";
                do {
            codOp=lerOpera();
            op1=lerop1();
            op2=lerOp2();
                somar=soma(op1,op2);
                    System.out.println(op1 + codOp);
        } while (true);
        
    }

    

    private static String lerOpera() {
        String codOp;
        codOp=JOptionPane.showInputDialog("Informe o Cod Op");
        System.out.println("você digitou : " + codOp);
        return codOp;
    }
    private static double lerop1() {
       String aux;
       double op1;
       aux=JOptionPane.showInputDialog("Informe o primeiro numero");
       op1=Double.parseDouble(aux);
       return op1;
    }
    private static double lerOp2() {
        double op2;
        String aux;
        aux=JOptionPane.showInputDialog("informe o segundo numero");
        op2=Double.parseDouble(aux);
       return op2;
    }

    private static double soma(double op1, double op2) {
        double soma=0;
        soma=op1+op2;
        return soma;
    }

    

   
    
}
