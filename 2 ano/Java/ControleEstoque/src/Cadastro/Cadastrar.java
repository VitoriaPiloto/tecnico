/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;
import Persistencia.Produto;
import java.util.ArrayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
    public class Cadastrar {
    private ArrayList<Produto>ListProd = new ArrayList<>();
    private int valueMaior=0;
    private double media=0;
    private double soma=0;
    
    
    public ArrayList<Produto> getListProd() {
        return ListProd;
    }
    
    public int adiciona(Produto f){
        int retorno=0,tam=0,codRetorno=0;
        retorno = getListProd().size();
        getListProd().add(f);
        tam=getListProd().size();
        if(tam > retorno ){
            codRetorno=0;
        }
        else{
            codRetorno=111;
        }
        return codRetorno;
    }
    public int pesquisa(String proc){
        int i=0;
        boolean achou=false;
        while(i<ListProd.size()&&achou==false){
            if(getListProd().get(i).getnomep().equalsIgnoreCase(proc)){
                achou=true;
                        }
            else{
                i++;
            }
        }
        if(achou==false){
            JOptionPane.showMessageDialog(null,"Não encontrado");
            System.exit(111);
        }
        return i;
    }
//    public int ConsultaPorCodigo (int codproc){
//        boolean achou=false;
//        int i=0;
//        while(i<ListProd.size()&&achou==false){
//            if(getListProd().get(i).getCodProd()){
//                achou=true;
//                        }
//            else{
//                i++;
//            }
 //       }
 //       if(achou==false){
//            JOptionPane.showMessageDialog(null,"Não encontrado");
 //           System.exit(111);
//        }
    }
    
      
    
                        
        
    

