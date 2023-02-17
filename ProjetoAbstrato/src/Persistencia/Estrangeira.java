package Persistencia;
public class Estrangeira extends Produto {
  private String origem;
  private double aliquota;
  private double imposto;
public String getOrigem(){
    return origem;
    }
public void setOrigem(String origem){
    this.origem=origem;
    }
public double getImposto(){
    return imposto;
    }
public void setImposto(double imposto){
    this.imposto=imposto;
    }
public void calcImp() {
    }
public double getAliquota(){
    return aliquota;
    }
public void setAliquota(double aliquota){
    this.aliquota=aliquota;
    }
}

