/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jesus_sg
 */
public class Thompson {

    public static void main(String args[]) {
        ArrayList<Character> Alfabeto = new ArrayList<Character>();
        String er;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta la expresión regular: ");
        er = scanner.nextLine();
        Stack<Character> pila = new Stack<Character>();
        System.out.println(er.length());
        for (int i = 0; i < er.length(); i++) {
            pila.push(er.charAt(i));
        }
        for (int i = 0; i < er.length(); i++) {
            if ((er.charAt(i) != '*') && (er.charAt(i) != '|') && (er.charAt(i) != '(') && (er.charAt(i) != ')') && (er.charAt(i) != '.')) {
                if(!Alfabeto.contains(er.charAt(i))){
                    Alfabeto.add(er.charAt(i));
                }
            }
        }
        for (int i = 0; i < Alfabeto.size(); i++) {
            System.out.print(Alfabeto.get(i));
        }
        AFN afn = new AFN(Alfabeto);
    }
}
