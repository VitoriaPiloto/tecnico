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
public class Funcionario {
    private int matr;
    private String nome;
    private double sal;
    private String tipo;
    /**
     * @return the matr
     */
    public int getMatr() {
        return matr;
    }

    /**
     * @param matr the matr to set
     */
    public void setMatr(int matr) {
        this.matr = matr;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sal
     */
    public double getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(double sal) {
        this.sal = sal;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
