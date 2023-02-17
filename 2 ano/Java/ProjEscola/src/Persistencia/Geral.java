/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author aluno
 */
public class Geral extends Aluno {
    private double prova;

    /**
     * @return the prova
     */
    public double getProva() {
        return prova;
    }

    /**
     * @param prova the prova to set
     */
    public void setProva(double prova) {
        this.prova = prova;
    }
    
    public void calcMed(){
        med=(not+ not2+ 2 * prova)/4;
    }
}
