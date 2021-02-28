
package com.mycompany.taller1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Punto1 {
    String Entrada;
    String[] Split;
    int NumeroMayor;
    int NumeroMenor;
    int Suma;
    double Promedio;
    int[] Numeros;

    public Punto1() {
        this.Entrada = JOptionPane.showInputDialog(null, "Ingrese los números separados por comas.");
        this.Split = this.Entrada.split(",");
        this.NumeroMayor = 0;
        this.NumeroMenor = 0;
        this.Suma = 0;
        this.Promedio = 0;
        this.Numeros = new int[this.Split.length];
    }
    
    public String obtenerSolucion(){
        String Resultado = "";
        int Contador = 0;
        for (int i = 0; i < this.Split.length; i++){ 
            this.Numeros[i] = Integer.parseInt(this.Split[i]); // Convertimos en INT los números del String Array
        }
        
        for (int i = 0; i < this.Numeros.length; i++){
            this.Suma = this.Suma + this.Numeros[i]; // Sumar los números
        }
        Resultado += "Suma: " + this.Suma + "\n";
        
        for (int i = 0; i < this.Numeros.length; i++){
            Contador = Contador + 1; // Promedio
        }
        Resultado += "Promedio: " + this.Suma/Contador + "\n";
        
        for (int i = 0; i < this.Numeros.length; i++){
            this.NumeroMayor =  Arrays.stream(this.Numeros).max().getAsInt(); // Obtener mayor
        }
        Resultado += "Mayor: " + this.NumeroMayor + "\n";
        
        for (int i = 0; i < this.Numeros.length; i++){
            this.NumeroMenor = Arrays.stream(this.Numeros).min().getAsInt(); // Obtener menor
        }
        Resultado += "Menor: " + this.NumeroMenor + "\n";
        
        return Resultado;
    }
}


/* Desarrollado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/