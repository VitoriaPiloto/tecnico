
package Cadastrar;
import Persistencia.Produto;
import java.util.ArrayList;

public class Cadastro {
    private ArrayList <Produto> ListProd = new ArrayList <> ();
    public ArrayList <Produto> getListProd(){
        return ListProd;
    }
    public int Adiciona(Produto p) {
    int retorno=0, tam=0, codRetorno=0;
    retorno=getListProd().size();
    getListProd().add(p);
    tam= getListProd().size();
    if (tam<retorno) {
        codRetorno=0;
    }
    else{
        codRetorno=111;
    }
        System.out.println(getListProd().size());
        return codRetorno;
    }
    public Produto getProd(int posi){
       return getListProd().get(posi);
   }
   public Produto Recupera(String nome){
       int i=0, rc=0;
       boolean achou=false;
       while(i<getListProd().size() && achou==false){
           System.out.println("aaaa" +  i);
           if(getListProd().get(i).getNome().equals(nome)){
               achou=true;}
           else{
               i++;
           }
       }
       if (achou==false){
           rc=111;
           System.out.println("Não achou");
       }
       return getProd(i);
   }
   
}
