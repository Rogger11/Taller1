package com.mycompany.taller1;

public class Punto2 {
    int[][] Numeros = {{1,2,3,4},{5,6,7,8}};
    
    public String obtenerSolucion(int op){
    String Resultado = "";
    int Num1 = Numeros[0][0];
    int Num2 = Numeros[1][0];
    int Num3 = Numeros[0][1];
    int Num4 = Numeros[1][1];
    int Num5 = Numeros[0][2];
    int Num6 = Numeros[1][2];
    int Num7 = Numeros[0][3];
    int Num8 = Numeros[1][3];
    switch(op){
        case 1:{
            Resultado += Num1 + "."+ Num2 +" + "+ Num3 + "."+ Num4 +" = "+ ((Num1 * Num2) + (Num3 * Num4)) + "\n";
            break;
        }
        case 2:{
            Resultado += Num1 + "."+ Num2 +" + "+ Num3 + "."+ Num4 +" + "+ Num5 +"."+ Num6 +" = "+ ((Num1 * Num2) + (Num3 * Num4) + (Num5 * Num6)) + "\n";
            break;
        }
        case 3:{
            Resultado += Num1 + "."+ Num2 +" + "+ Num3 + "."+ Num4 +" + "+ Num5 +"."+ Num6 +" + "+ Num7 +"."+ Num8 +" = "+ ((Num1 * Num2) + (Num3 * Num4) + (Num5 * Num6) + (Num7 * Num8)) + "\n";
            break;
        }
    }
    return Resultado;
    }
}


/* Desarrollado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/