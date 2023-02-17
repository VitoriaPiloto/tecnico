package cadastrar;
import persistencia.funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Cadastro {
    private ArrayList<funcionario>ListFunc = new ArrayList<>();
    public double totfo=0;
    private int valueMaior=0;
    private double media=0;
    private double soma=0;
    
    
    public ArrayList<funcionario> getListFunc() {
        return ListFunc;
    }
    
    public int adiciona(funcionario f){
        int retorno=0,tam=0,codRetorno=0;
        retorno = getListFunc().size();
        getListFunc().add(f);
        tam=getListFunc().size();
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
        while(i<ListFunc.size()&&achou==false){
            if(getListFunc().get(i).getnomef().equalsIgnoreCase(proc)){
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
    public double totFolha(){
        int i=0;
        double totFolha=0;
        while(i<ListFunc.size()){
            totFolha=totFolha + ListFunc.get(i).getSal();
            i++;
        }
        return totFolha;
    }
 //   public String FuncionarioComMaiorSalario (double salariofuncionario,funcionario f) {
   //     double salario = getListFunc().indexOf(f);
     //   if (salario>valueMaior) {
       //     JOptionPane.showMessageDialog(null, "Funcionário de maior salário");
       // }
       // return salario;
   // }
}
