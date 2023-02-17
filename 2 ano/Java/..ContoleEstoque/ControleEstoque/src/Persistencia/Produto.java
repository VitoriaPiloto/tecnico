package Persistencia;
public class Produto {
 private int codProd,quant;
 private String nome,tam;
 private double preco;
public void setcodprod(int codprod){
    codProd=codprod;
}
public int getcodprod(){
    return codProd;
}
public void setQuant(int Quant){
    quant=Quant;
}
public int getQuant(){
    return quant;
}
public void setNome(String Nome){
    nome=Nome;
}
public String getNome(){
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
public double getPreco(){
    return preco;
}  
}
