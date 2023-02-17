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
public abstract class Produto {
    private int codProduto;
    private String nome,tipo;
    private int quant;
    private double imposto,preco;
    public int getCodProduto() {
        return codProduto;
    }
   public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
   public String getNome() {
        return nome;
    }
   public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    abstract void calcImp();
    
}
