
package Cadastro;
import Persistencia.Especialidade;

import java.util.ArrayList;

public class Cadastrar {
   private ArrayList <Especialidade> ListEsp = new ArrayList <> ();   

    public ArrayList <Especialidade> getListEsp() {
        return ListEsp;
    }
    
    public int Adiciona(Especialidade e) {
    int retorno=0, tam=0, codRetorno=0;
    retorno=getListEsp().size();
    getListEsp().add(e);
    tam= getListEsp().size();
    if (tam<retorno) {
        codRetorno=0;
    }
    else{
        codRetorno=111;
    }
        return codRetorno;
    }
    public Especialidade getEsp(int posi){
       return getListEsp().get(posi);
   }
   public Especialidade Recupera(String nome){
       int i=0, rc=0;
       boolean achou=false;
       while(i<getListEsp().size() && achou==false){
            if(getListEsp().get(i).getNome().equals(nome)){
            achou=true;}
           else{
               i++;
           }
       }
       if (achou==false){
           rc=111;
           System.out.println("Não achou");
       }
       return getEsp(i);
   }
   public double medSal() {
        int i=0, rc=0;
         double soma=0, media=0 ;            
         boolean achou=false;
        while (i<getListEsp().size() && achou==false){
            if (getListEsp().get(i).getTipo().equals("Cínico Geral")){
              soma = soma+ getListEsp().get(i).getPreco();
              media= media/soma;
              rc++;
            }
              i++;
          
        }
       media=soma/rc;  
        return media;
      } 
}
