/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jesus_sg
 */
public class Transition {
    Estado e;
    HashMap<Character, ArrayList<Estado>> transiciones;
    
    
    void agregarTransicion(char c, Estado nuevo_estado){
        if(transiciones.containsKey(c) == false){ //Si el simbolo aun no esta se agrega el simbolo y el estado al que sigue
            ArrayList<Estado> estados = new ArrayList<Estado>();
            estados.add(nuevo_estado);
            this.transiciones.put(c, estados);
        }
        else{//Si ya esta el simbolo solo agrega el estado
            this.transiciones.get(c).add(nuevo_estado);
        }
    }
    
    void imprimir_transiciones(){
        for (Character i : transiciones.keySet()) {
            for(Estado estado: transiciones.get(i)){
                System.out.println("{"+" q"+ e.id+ ", " + i + "," + " q" +estado.id + " }");
            }
        }
    }
    
}
