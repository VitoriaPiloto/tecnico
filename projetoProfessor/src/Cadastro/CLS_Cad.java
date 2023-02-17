
package Cadastro;
import Persistencia.Professor;
import Persistencia.FormacaoG;
import Persistencia.Tecnico;
import java.util.ArrayList;

public class CLS_Cad {
 private ArrayList<Professor>listProf = new ArrayList<>();

 public void CLS_Cad(){
 // listProf = new ArrayList();
}
 
 public ArrayList<Professor> getListProf() {
        return listProf;
    }
  public Professor getListProf(int posi) {
	return getListProf().get(posi);
    } 
 public void carrega (Professor p){
  getListProf().add(p);   
}
 
 public Professor recupera (String nome){
     int i= 0, rc= 0;
     boolean achou=false;
     while(i<getListProf().size()&& achou==false){
        if(getListProf().get(i).getNome().equals(nome))
            achou=true;
            else
            i++;
         }
         if(achou==false)
           System.out.println(nome+" não encontrado...");
        
           
             return getListProf(i);
         
     }   
        public int adiciona(Professor p){
        int retorno=0,tam=0,codRetorno=0;
        retorno = getListProf().size();
        getListProf().add(p);
        System.out.println(getListProf().get(0).getNome());
        tam=getListProf().size();
        if(tam > retorno ){
            codRetorno=0;
        }
        else{
            codRetorno=111;
        }
        return codRetorno;
    }
        
     public double medSal() {
        int i=0, rc=0;
         double soma=0, media=0 ;            
         boolean achou=false;
        while (i<getListProf().size() && achou==false){
            if (getListProf().get(i).getNome().equals("Programador")){
              soma = soma+ getListProf().get(i).getSalario();
              rc++;
            }
              i++;
          
        }
       media=soma/rc;  
        return media;
      } 
     public String maiorSalFormGeral() {
        int i=0, rc=0;
         double maior=0 ;            
         String mGerente="";
         boolean achou=false;
        while (i<getListProf().size()) {
            if (getListProf().get(i).getSalario()> maior) {
              maior = getListProf().get(i).getSalario();
              mGerente=getListProf().get(i).getNome();
            } 
              i++;
          
        }
      
        return mGerente;
}
}
