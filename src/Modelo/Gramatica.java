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
public class Gramatica {
    

    private ArrayList<Simbolo> noTerminales;
    private ArrayList<Terminal> terminales;
    private ArrayList<Produccion> producciones;    
    private ArrayList<Simbolo> noTerminalesAnulables;
    private ArrayList<Integer> produccionesAnulables;
   
    public void agregarNoterminal(ArrayList<Simbolo> noTerminales)
    {
        this.noTerminales=noTerminales;
    }
    
    public void agregarProducciones(ArrayList<Produccion> producciones)
    {
        this.producciones=producciones;
    }
    public void imprimirNoTerminales()
    {
          for (Simbolo s : this.noTerminales)
          {
              System.out.println("No Terminal:"+s.getNombreNoTerminal()+" es simobolo Inicial"+s.isEsSimoboloInicial());
          }
    }
    
    public void imprimirProducciones()
    {   int i=0;
        for(Produccion p: this.producciones)
        {
            System.out.println("Produccion #"+i+p.getLefSide()+"="+p.getRightSide());
            i++;
        }
    }
    
    
    
    public ArrayList<Object> cacularTerminalesAnulables()
    {
        return null;
    }
    
    public ArrayList<Integer> calcularProduccionesAnulables()
    {
        return null;
    }
    
    public ArrayList<Terminal> calcularPrimerosTerminal(Simbolo noTerminal)
    {
        return null;
    }
    
    public ArrayList<Terminal> calcularPrimerosProduccion(Produccion produccion)
    {
        return null;
    }
    
    public ArrayList<Object> calcularSiguienteTerminal(Simbolo notoTerminal)
    {
        return null;
    }
    
    public ArrayList<Object> calcularSeleccionProduccion(Produccion produccion)
    {
        return null;
    }
    
    
    
    
}
