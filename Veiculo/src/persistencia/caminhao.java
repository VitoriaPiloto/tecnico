/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author aluno
 */
public class caminhao extends veiculo {
    private int eixos;

    /**
     * @return the eixos
     */
    public int getEixos() {
        return eixos;
    }

    /**
     * @param eixos the eixos to set
     */
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    public void exibeDadosI(){
        String str="dados do veiculo:"+"\n\nPlaca"+getPlaca()+"\nAno:"+getAno()+"\nEixos:"+eixos;
        System.out.println(str);
        
    }
    
    
}
