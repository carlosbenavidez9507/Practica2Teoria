/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos Benavidez
 */
public class Produccion {
    
    private String lefSide;
    private String rightSide;

    public String getLefSide() {
        return lefSide;
    }

    public void setLefSide(String lefSide) {
        this.lefSide = lefSide;
    }

    public String getRightSide() {
        return rightSide;
    }

    public void setRightSide(String rightSide) {
        this.rightSide = rightSide;
    }
    private Simbolo ladoIzquierdo;
    private ArrayList<Object> ladoDerecho;

    public Simbolo getLadoIzquierdo() {
        return ladoIzquierdo;
    }

    public void setLadoIzquierdo(Simbolo ladoIzquierdo) {
        this.ladoIzquierdo = ladoIzquierdo;
    }

    public ArrayList<Object> getLadoDerecho() {
        return ladoDerecho;
    }

    public void setLadoDerecho(ArrayList<Object> ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
    }
    
    
    
    
}
