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
public class Produto {
    private int codProd,quant;
 private String nome,tam;
 private double preco;
public void setCodProd(int codprod){
    codProd=codprod;
}
public int getCodProd(){
    return codProd;
}
public void setnomeP(String nomep){
    nome=nomep;
}
public String getnomep(){
    return nome;
}
public void setTam(String Tam){
    tam=Tam;
}
public String getTam(){
    return tam;
}
public void setPreco(double Preco){
    preco=Preco;
}
public double getSal(){
    return preco;
}
}
    

