/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Carlos Benavidez
 */
public class Simbolo {
    
    private String nombreNoTerminal;
    private boolean esSimoboloInicial;

    public Simbolo() {
    }
    
    

    public String getNombreNoTerminal() {
        return nombreNoTerminal;
    }

    public void setNombreNoTerminal(String nombreNoTerminal) {
        this.nombreNoTerminal = nombreNoTerminal;
    }

    public boolean isEsSimoboloInicial() {
        return esSimoboloInicial;
    }

    public void setEsSimoboloInicial(boolean esSimoboloInicial) {
        this.esSimoboloInicial = esSimoboloInicial;
    }
    
    
    
    
}
