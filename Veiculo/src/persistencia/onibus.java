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
public class onibus extends veiculo {
    private int assentos;

    /**
     * @return the assentos
     */
    public int getAssentos() {
        return assentos;
    }

    /**
     * @param assentos the assentos to set
     */
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public void exibeDadosI(){
        String str="dados do veiculo:"+"\n\nPlaca"+getPlaca()+"\nAno:"+getAno()+"\nEixos:"+ assentos;
    }
}
