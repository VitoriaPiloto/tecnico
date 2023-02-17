/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int num, soma, num2,result ;
        String resp = null;
        String codop;
        soma=0;
        System.out.println(soma);
        num=Integer.parseInt(JOptionPane.showInputDialog("Insira os número 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        do{
            codop=JOptionPane.showInputDialog("Insira a operação (+,-,*,/,p,r)");
            if (codop.equals("+")){
            result=soma(num,num2);
                                  }
            
       while(resp.equals("sim"));  }
              }
                
        
    private static int soma(int num,int num2){
       int somar;
       somar=0;
       
       somar=num2+num;
       return somar;
    }
    
   private static int subt (int num, int num2){
       int subt;
       subt=0;
       
       subt=num2-num;
       return subt;
   } 
   
   private static int mult (int num, int num2){
       int mult;
       mult=0;
       
       mult=num2*num;
       return mult;
           
   }
   
   private static int div (int num, int num2){
       int div;
       div=0;
       
       div=num2/num;
       return div;
               
   }
   private static int root (int num, int num2){
       int root;
       root=0;
       
       root= (int) Math.sqrt(num);
       root= (int) Math.sqrt(num2);
       return root;
   }
   private static int pot (int num, int num2){
       int pot;
       pot=0;
       
       pot=(int) Math.pow(num, num2);
       return pot;  
   }
   
}
