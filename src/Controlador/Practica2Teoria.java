/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Archivo;
import Modelo.Gramatica;
import java.io.IOException;

/**
 *
 * @author Carlos Benavidez
 */
public class Practica2Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         String cadena="C:\\Users\\ASUS\\Documents\\Carlos Alberto Benavidez\\8 semestre\\Teoria de Lenguaje y laboratorio\\Segunda Practica\\GramaticaQ.txt";
         Archivo archivo=new Archivo();
         String hilera=archivo.cargarGramatica(cadena);
         Gramatica gramatica=archivo.convertirCadenaGramatica(hilera);
         gramatica.imprimirNoTerminales();
         gramatica.imprimirProducciones();
        
    }
    
}
