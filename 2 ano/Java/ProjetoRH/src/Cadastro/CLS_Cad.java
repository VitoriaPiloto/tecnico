/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;
import Persistencia.Comum;
import Persistencia.Funcionário;
import Persistencia.Gerente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CLS_Cad {
    //Array
    private ArrayList<Funcionário>listFuncionario = new ArrayList<>();
    
public void CLS_Cad(){
listFuncionario = new ArrayList();
}
public void carrega (Funcionário a){
 getListFunc().add(a);   
}
     public Funcionário recupera (String nome){
         int i= 0, rc= 0;
         Comum co= new Comum();
        
         boolean achou=false;
         while(i<getListFunc().size()&&achou==false){
             if(getListFunc().get(i).getNome().equals(nome))
                 achou=true;
             else
                 i++;
         }
         
         if(achou==false){
           JOptionPane.showInputDialog(null, nome+" não encontrado...");
           rc=111;}
         
         return getEmpregado(i);
         }
        
    public ArrayList<Funcionário> getListFunc() {
        return listFuncionario;
    }
        public int adiciona(Funcionário a){
        int retorno=0,tam=0,codRetorno=0;
        retorno = getListFunc().size();
        getListFunc().add(a);
        tam=getListFunc().size();
        if(tam > retorno ){
            codRetorno=0;
        }
        else{
            codRetorno=111;
        }
        return codRetorno;
    }
    public double calcMedia(){
        int i=0;
        double total=0;
        while (i<listFuncionario.size()) {
            total=listFuncionario.get(i).getSalario()+total;
            i++;
         
        }
        double med=total/(i);
        return med;
    }
    public Funcionário getEmpregado(int posi) {
	return getListaEmp().get(posi);
    } 
    public ArrayList<Funcionário> getListaEmp() {
        return listFuncionario;
    }
    public double totalGer() {
        int i=0, rc=0;
        double total=0 ;              
        boolean achou=false;
         Funcionário emp=null;
          
          
        while (i<getListaEmp().size() && achou==false){
             emp=getListaEmp().get(i);
            if (getListaEmp().get(i).getTp().equals("Gerente")){
               
               Gerente g = (Gerente) emp;
               total=total + g.getSalario() + g.getComissao();
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
         Funcionário emp=null;
          
          
        while (i<getListaEmp().size() && achou==false){
             emp=getListaEmp().get(i);
            if (getListaEmp().get(i).getTp().equals("Comum")){
               
               Comum co = (Comum) emp;
              if (co.getSalario()>maior){
                maior=co.getSalario();
                maiorNome=co.getNome();
              }
            }
         
              i++;
         }
        return null;
}
}

