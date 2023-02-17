
package Persistencia;

public class Especialidade {
   private int codEsp; 
   private String nome;
   private double preco;
   private String tipo;
   private int codFunc;

    public int getCodEsp() {
        return codEsp;
    }

   
    public void setCodEsp(int codEsp) {
        this.codEsp = codEsp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodFunc() {
        return codFunc;
    }
   
    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }
   
}
