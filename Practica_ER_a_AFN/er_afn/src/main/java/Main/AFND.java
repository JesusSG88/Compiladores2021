/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author jesus_sg
 */
public class AFND {
    
    Automata automata;
    Stack<Automata> pila = new Stack();
    String expresion;
    ArrayList<String> alfabeto;
    ArrayList<Integer> listaEstados;
    
    AFND(String expresion){
        this.alfabeto = new ArrayList();
        this.listaEstados = new ArrayList();        
        this.expresion = expresion;
        setAlfabeto();        
        this.generar_automata();
        setListaEstados();
    }
}
