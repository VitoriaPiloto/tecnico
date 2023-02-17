/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastra;

import Persistencia.Aluno;
import Persistencia.Geral;
import Persistencia.Tecnico;
import java.util.ArrayList;

/**
 *
 * @author octa77
 */
public class ClsCad {
   private ArrayList<Aluno> listAluno = new ArrayList<>(); /* O objeto e nome listAluno como do tipo ArrayList
   composta da classse Aluno. */
   private ArrayList listadeAluno = new ArrayList(); //crio o arrayList sem especificar nada	
 public void ClsCad() {
     listAluno = new ArrayList();
 }     
      public void carrega(Aluno a){
          getListAluno().add(a);
          listadeAluno.add("Octa");
          System.out.println(listadeAluno.get(0));
      }
      public int recupera(String nome) {
        int i=0, rc=0;
        
        boolean achou=false;
        while (i<getListAluno().size() && achou==false){
            // Veja que O getListaAluno possui Parentesis. Por que?
            //Porque para acessar o nome uso geet(i).getNome() ? 
          if(getListAluno().get(i).getNome().equals(nome))
              achou=true;
          else
              i++;
          }
        if (achou==false)
            System.out.println(nome + " Não encontrado!!");
     
           
        
        return i;
      }

    /**
     * @return the listAluno
     */
    public ArrayList<Aluno> getListAluno() {
         System.out.println(listadeAluno.get(0));  // eu que coloquei
        return listAluno;
    }
    public double calcMedia() {
      int i=0;
      double total=0;
      while(i<listAluno.size()){
          total=listAluno.get(i).getMed()+ total;
          i++;
      }
     
      double med=total/(i);
      return med;
    }
    public double calcMediaTec() {
      int i=0,contTec=0;
      double totalTec=0;
      while(i<listAluno.size()){
          if(listAluno.get(i).getArea().equalsIgnoreCase("Técnico"))
              totalTec=listAluno.get(i).getMed()+ totalTec;
              contTec++;
          i++;
      }
      
      double med=totalTec/(i-1);
      return med;
    } 
}
