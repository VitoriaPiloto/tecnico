package Cadastro;
import Persistencia.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Cadastrar {
    private ArrayList<Produto>listProd = new ArrayList<>();
    public ArrayList<Produto> getlistProd(){
        return listProd;
    }
 public void adciona(Produto p){
     int retorno=0,tam=0;
     retorno=getlistProd().size();
     getlistProd().add(p);
     tam=getlistProd().size();
     if(tam>retorno){
         JOptionPane.showMessageDialog(null,"Adicionado ao registro");
     }
     else{
         JOptionPane.showMessageDialog(null,"Erro ao adicionar ao registro");
     }
 }
 public int PesqNome(String proc){
     int i=0;
     boolean achou=false;
     while(i<listProd.size()&&achou==false){
         if(getlistProd().get(i).getNome().equalsIgnoreCase(proc)){
             achou=true;
         }
         else{
             i++;
         }
     }
     if(achou==false){
         JOptionPane.showMessageDialog(null,"Produto não encontrado");
         System.exit(111);
     }
     return i;
 }
 public int consporCod(int codProc){
     int i=0;
     boolean achou=false;
     while(i<listProd.size()&&achou==false){
         if(codProc==listProd.get(i).getcodprod()){
             achou=true;
         }
         else{
             i++;
         }
     }
     if(achou==false){
         JOptionPane.showMessageDialog(null,"Codigo não encontrado");
         System.exit(222);
     }
     return i;
 }
 public String maiorNome(){
     String mn="";
     int i=0,c=0;
     while(i<getlistProd().size()){
         if(c<(getlistProd().get(i).getNome()).length()){
             mn=getlistProd().get(i).getNome();
         }
         i++;
     }
     return mn;
 }
 public double med(){
     double med,a=0;
     for(int i=0;i<getlistProd().size();i++){
         a=a+(getlistProd().get(i).getPreco());
     }
     med=a/(getlistProd().size());
     return med;
 }
 public double prodabmed(){
     double med,a=0,c=0;
     for(int i=0;i<getlistProd().size();i++){
         a=a+(getlistProd().get(i).getPreco());
     }
     med=a/(getlistProd().size());
     for(int i=0;i<getlistProd().size();i++){
         if(med>getlistProd().get(i).getPreco()){
             c++;
         }
     }
     return c;
 }
 public void qntpre(){
     int q=0;
     for(int i=0;i<getlistProd().size();i++){
         if((getlistProd().get(i).getNome()).substring(0, 3).equalsIgnoreCase("apa")){
             q++;
         }
     }
     JOptionPane.showMessageDialog(null,"Existem "+q+" produtos com o prefixo Apa");
 }
 public double valorest(){
     double ve=0;
     for(int i=0;i<getlistProd().size();i++){
         ve=ve+(getlistProd().get(i).getPreco());
     }
     return ve;
 }
 public int remov(int proc){
        int i=0,bc=0;
        boolean achou=false;
        while(i<listProd.size()&&achou==false){
            if(getlistProd().get(i).getcodprod()==proc){
                achou=true;
                        }
            else{
                i++;
            }
        }
        if(achou==false){
            JOptionPane.showMessageDialog(null,"Não encontrado");
            bc=3;
        }
        else{
        getlistProd().remove(i);
        bc=0;
        }
        return bc;
    }
}