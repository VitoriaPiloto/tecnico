/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastrar;

import Persistencia.Comum;
import Persistencia.Funcionario;
import Persistencia.Gerente;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cadastro {
 private ArrayList<Funcionario> listaEmp = new ArrayList<>();  
 public void adiciona( Funcionario f){
        getListaEmp().add(f);
 }
     public double media(){
         int i=0;
       double media=0,total=0;
       
        //Gerente g= new Gerente();
       
        while(i< getListaEmp().size()){
           
            total= getListaEmp().get(i).getSal() + total;
            
        }
     return media;
}
     public Funcionario recupera(String nome) {
        int i=0, rc=0;
        Comum co= new Comum();

        boolean achou=false;
        while (i<getListaEmp().size() && achou==false){
          if(getListaEmp().get(i).getNome().equals(nome))
              achou=true;
          else
              i++;
          }
        if (achou==false)
            rc=111;
        
        return getEmpregado(i);
      }
public double totalGer() {
        int i=0, rc=0;
        double total=0 ;              
        boolean achou=false;
         Funcionario emp=null;
          
          
        while (i<getListaEmp().size() && achou==false){
             emp=getListaEmp().get(i);
            if (getListaEmp().get(i).getTipo().equals("Gerente")){
               
               Gerente g = (Gerente) emp;
               total=total + g.getSal() + g.getComissao();
               System.out.println("Com  " + g.getComissao() );
             
            }
         
              i++;
          }
       
       return total;
      }
public String  MaiornomeComum() {
        int i=0, rc=0;
        double maior=0 ;              
        boolean achou=false;
        String maiorNome="";
         Funcionario emp=null;
          
          
        while (i<getListaEmp().size() && achou==false){
             emp=getListaEmp().get(i);
            if (getListaEmp().get(i).getTipo().equals("Comum")){
               
               Comum co = (Comum) emp;
              if (co.getSal()>maior){
                maior=co.getSal();
                maiorNome=co.getNome();
              }
            }
         
              i++;
          }
       
        /*else{
            if (listAluno.get(i).getArea().equals("Geral"))
              g.setArea(listAluno.get(i).getArea());
              g.setMatr(Integer.parseInt(String.valueOf(listAluno.get(i).getMatr())));
              g.setMed(Double.parseDouble(String.valueOf(listAluno.get(i).getMatr()))); */
              
      //  }
        return maiorNome;
      }
   public Funcionario getEmpregado(int posi) {
	return getListaEmp().get(posi);
    }    

    /**
     * @return the listaEmp
     */
    public ArrayList<Funcionario> getListaEmp() {
        return listaEmp;
    }
}
