package Persistencia;
public class Animal {
    private int cod;
    private String nome,cor,tipo;
    private double peso;
    
  public void setCod(int Cod){
      cod=Cod;
  }
  public void setNome(String Nome){
      nome=Nome;
  }
  public void setCor(String Cor){
      cor=Cor;
  }
  public void setTipo(String Tipo){
      tipo=Tipo;
  }
  public void setPeso(double Peso){
      peso=Peso;
  }
  public int getCod(){
      return cod;
  }
  public String getNome(){
      return nome;
  }
  public String getCor(){
      return cor;
  }
  public String getTipo(){
      return tipo;
  }
  public double getPeso(){
      return peso;
  }

    public int getTipo(String cao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
