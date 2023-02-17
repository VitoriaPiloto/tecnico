package aula11_03_2019;

import javax.swing.JOptionPane;


public class Aula11_03_2019 {


    public static void main(String[] args) {
    int op1;
    int op2;
    String codop;
    double res, resb;
        do {
            codop=JOptionPane.showInputDialog(null,"Informe o codigo da operação( + , - , x , : , r ou p)");
            op1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a operação 1"));
            op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a operação 2"));
            
            if(codop.equalsIgnoreCase("+")){
                res=soma(op1,op2);
                exib(codop, op1, op2, res);
            }
            if(codop.equals("-")){
                res=subt(op1, op2);
                exib(codop, op1, op2, res);
            }
            
            if(codop.equals("x")){
                res=mult(op1, op2);
                exib(codop, op1, op2, res);
            }
            if(codop.equals(":")){
                res=div(op1, op2);
                exib(codop, op1, op2, res);
            }
            if(codop.equalsIgnoreCase("r")){
                res=raiz(op1);
                resb=raizb(op2);
                exib(codop, op1, op2, res);
            }
            if(codop.equalsIgnoreCase("p")){
                res=pot(op1, op2);
                exib(codop, op1, op2, res);
            }
        } while (true);
        
    }

    private static double soma(int op1, int op2) {
        double res;
        res=op1+op2;
        return res;
    }
    
    private static double subt(int op1, int op2) {
        double res;
        res=op1 - op2;
        return res;
    }

    private static double mult(int op1, int op2) {
        double res;
        res=op1 * op2;
        return res;
    }

    private static double div(int op1, int op2) {
        double res;
        res=op1/op2;
        return res;
    }

    private static double raiz(int op1) {
        double res;
        res=Math.sqrt(op1);
        return res;
    }

    private static double raizb(int op2) {
        double resb;
        resb=Math.sqrt(op2);
        return resb;
    }
    
    private static double pot(int op1, int op2){
        double res;
        res=Math.pow(op1, op2);
        return res;
    }
    private static void exib(String codop, int op1, int op2, double res) {
        System.out.println("O resultado de "+ op1 +" "+ codop +" "+ op2 +" vale = "+ res);
    }
}
