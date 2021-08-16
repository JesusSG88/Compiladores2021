#include <stdlib.h>
#include <stdio.h>
#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <list>
using namespace std;

#define MAX 100

list<int> crearEstados(int numE)
{
    list<int> Estados;
    for(int i=0; i<numE; i++){
        Estados.push_back(i);
    };
    return Estados;
}

list<char> ingresarSimbolos(int numE)
{
    list<char> Simbolos;
    char c;
    for(int i=0; i<numE; i++){
        cout << "\t Simbolo " << i+1 << " : ";
        cin >> c;
        Simbolos.push_back(c);
    };
    return Simbolos;
}

void transicciones(int* T[MAX][MAX], int numE, int numS){
    cout << "\n INGRESE TABLA DE TRANSICIONES \n\n";
    int 
    for(int i=0; i<numE; i++){
        for(int j=0; j<numS; j++){
            cout << "\t T["<<i<<"]["<<j<<"] : ";
            //cin >> ;
           // T[i][j] =
        };
    };
};

class AFN{
    int numE;  // Numero de estados
    int numS;  // Numero de simbolos
    list<int> Estados;
    list<char> Simbolos;
    int inicial; //Estado inicial
    int final[MAX]; //Estados finales
    int T[MAX][MAX]; //Transiciones
};

