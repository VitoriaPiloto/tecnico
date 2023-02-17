/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero=lernumero();
        System.out.println(numero);
    }

    private static int lernumero() {
        int n = 0;
        String aux;
        aux=JOptionPane.showInputDialog("informe n");
        n=Integer.parseInt(aux);
                return n;
    }
    
}
