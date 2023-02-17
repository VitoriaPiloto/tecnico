/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String func[] = new String[5];
            double sal[] = new double[5];
                int i=0,resp=0;
        
        //carga do vetor 
        
        do{
   carrega(i,func,sal) ;
            resp=Integer.parseInt(JOptionPane.showInputDialog(null, "você deseja carregar o vetor ?"));
            if(resp==1)
                i++;
} while(resp!=0 && i<5) ;
    //valor da folha
        double soma=totSal(i,sal);
        double media=calcmedsal(i,soma);
                System.out.println("total de salário " + media);
    
    
    
    }
   
public static void carrega(int i, String aluno[],double[] sal ){
aluno[i]=JOptionPane.showInputDialog("infore o nome do funcionario " + i+1);
sal[i]=Double.parseDouble(JOptionPane.showInputDialog("Informe o salário " + (i+1)));
}

public static double totSal(int i, double[] sal ){
double total=0;
    for (int j = 0; j <= 1; j++) {
        total=total+sal[j];
    }
        System.out.println("Total de salários " + total);
        return total;
    }

public static double calcmedsal(int i,double total){
double media=0;
media=total/(i+1);
return media;


}
}

