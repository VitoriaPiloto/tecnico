package Persistencia;
public class Nacional extends Produto{
    private String estado;
 
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void calcImp(){
        double imp=11;
        this.setImposto(imp);
    }
    
}
