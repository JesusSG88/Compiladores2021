/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author jesus_sg
 */
public class AFN {

    ArrayList<Estado> C_estados;
    ArrayList<Character> Alfabeto;
    ArrayList<Transition> Transiciones;

    public AFN(ArrayList<Character> Alfabeto) {
        this.Alfabeto = Alfabeto;
        this.C_estados = new ArrayList<Estado>();
        this.Transiciones = new ArrayList<Transition>();
    }
    

}
