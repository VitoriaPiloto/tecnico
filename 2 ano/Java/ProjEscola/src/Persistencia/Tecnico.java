/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author aluno
 */
public class Tecnico extends Aluno{
private int faltas;
public void calcMed(){
    med=(not+not2)/2;
   System.out.println("med"+ med+ "faltas"+getFaltas());
   if(  getFaltas()>70){
       med=med+1;
       
   }else{
       med=med-1;
   }
   if (med>10)
       med=10;
   if(med<0)
      med=0;
   
}

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
}
