package persistencia;
public class funcionario {
 private int codFunc,mati;
 private String nome,funcao;
 private double sal;
public void setCodFunc(int codfunc){
    codFunc=codfunc;
}
public int getCodFunc(){
    return codFunc;
}
public void setnomef(String nomef){
    nome=nomef;
}
public String getnomef(){
    return nome;
}
public void setFuncao(String Funcao){
    funcao=Funcao;
}
public String getFuncao(){
    return funcao;
}
public void setSal(double Sal){
    sal=Sal;
}
public double getSal(){
    return sal;
}
}