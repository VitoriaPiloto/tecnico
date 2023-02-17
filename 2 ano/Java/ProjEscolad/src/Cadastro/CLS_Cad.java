/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;
import Persistencia.Aluno;
import Persistencia.Geral;
import Persistencia.Tecnico;
import java.util.ArrayList;
/** 
 *
 * @author aluno
 */
public class CLS_Cad {
  private ArrayList<Aluno>listAluno = new ArrayList<>();

public void CLS_Cad(){
listAluno = new ArrayList();
}
public void carrega (Aluno a){
 getListAluno().add(a);   
}
     public int recupera (String nome){
         int i= 0, rc= 0;
         
         boolean achou=false;
         while(i<getListAluno().size()&& achou==false){
             if(getListAluno().get(i).getNome().equals(nome))
                 achou=true;
             else
                 i++;
         }
         if(achou==false)
             System.out.println(nome+" não encobtrado...");
         
         return i;
         
     }   

    /**
     * @return the listAluno
     */
    public ArrayList<Aluno> getListAluno() {
        return listAluno;
    }
    public double calcMedia(){
        int i=0;
        double total=0;
        while (i<listAluno.size()) {
            total=listAluno.get(i).getMed()+total;
            i++;
         
        }
        double med=total/(i);
        return med;
    }
        public double calcMediaTec(){
        int i=0,contTec=0;
        double totalTec=0;
        while (i<listAluno.size()) {
            totalTec=listAluno.get(i).getMed()+totalTec;
            i++;
         
        }
        double med=totalTec/(i-1);
        return med;
    }
        public int adiciona(Aluno a){
        int retorno=0,tam=0,codRetorno=0;
        retorno = getListAluno().size();
        getListAluno().add(a);
        tam=getListAluno().size();
        if(tam > retorno ){
            codRetorno=0;
        }
        else{
            codRetorno=111;
        }
        return codRetorno;
    }
}

