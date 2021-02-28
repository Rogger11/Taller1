package com.mycompany.taller1;

import javax.swing.JOptionPane;

public class Punto4 {
    double[][] NM;

    public Punto4() {
        int f = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el número de filas"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el número de columnas"));
        NM = new double[f][c];
        
        for (int f1 = 0; f1 < NM.length; f1++) {
            for (int c1 = 0; c1 < NM[0].length; c1++) {
                NM[f1][c1] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Ingrese el valor de la fila [%s] en la columna [%s]",f1,c1)));
            }
        } 
    }

    public void obtenerSolucion(){
        int i,j;
        int filas = NM.length;
        int columnas = NM[0].length;
        String Mensaje = "";

        for(i=0; i<filas;i++){

            for(j=0;j<columnas;j++){
                Mensaje += String.format("Matriz en la posicion [%s] [%s]=%s \n",i,j,NM[i][j]);
            }
        }
        JOptionPane.showMessageDialog(null, Mensaje);
    }
        
       
}

/* Desarrollado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/