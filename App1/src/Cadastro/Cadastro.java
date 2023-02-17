package Cadastro;
import Persistencia.Animal;
import Persistencia.Cao;
import Persistencia.Gato;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Cadastro {
    private ArrayList<Animal> lstAnimal = new ArrayList<>();
    public ArrayList<Animal> getlstAnimal(){
        return lstAnimal;
    }
    public Animal getAnim(int r){
        return getlstAnimal().get(r);
    }
    public void adicionar (Animal a){
        int i=0;
        i=getlstAnimal().size();
        System.out.println("iii "+ i);
        getlstAnimal().add(a);
        System.out.println(getlstAnimal().get(0).getNome());
        if(i>getlstAnimal().size()||i==getlstAnimal().size()){
            JOptionPane.showMessageDialog(null,"Não Foi possivel Adicionar");
            System.exit(111);
        }
    }
    public Animal recuperar(String proc){
        int i=1;
        boolean achou=false;
        
         System.out.println(getlstAnimal().size());
        while(i<=getlstAnimal().size()||achou==false){
           System.out.println(getlstAnimal().get(i).getNome() + " ii  "+ i);
            if(getlstAnimal().get(i).getNome().equalsIgnoreCase(proc)){
                achou=true;
            }
            i++;
        }
        if(achou==false){
            JOptionPane.showMessageDialog(null,"Houve um erro ao localizar a conta");
        }
        return getAnim(i); 
        }
    public void nomeCao (){
        int i=0;
        boolean achou=false;
         while(i<getlstAnimal().size()||achou==false)
            if(i<getlstAnimal().get(i).getTipo("cao")|achou==false){
              if(getlstAnimal().get(i).getCor().equalsIgnoreCase("preto")){
                 System.out.println(getlstAnimal().get(i).getNome());
            } 
        
    }
      i++;
         }
}
