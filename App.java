package com.mycompany.taller1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        boolean Estado = true;
        while(Estado){
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número según la necesidad:\n\n"
                    + "1. Obtener la respuesta del primer punto.\n"
                    + "2. Obtener la respuesta del segundo punto.\n"
                    + "3. Obtener la respuesta del tercer punto.\n"
                    + "4. Obtener la respuesta del cuarto punto.\n"
                    + "Con otro número sale del programa."));
            switch(Opcion){
                case 1:{
                    Punto1 a = new Punto1();
                    String Solucion = a.obtenerSolucion();
                    JOptionPane.showMessageDialog(null, Solucion);
                    break;
                }
                case 2:{
                    int Op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número según corresponda:\n\n"
                            + "1. Multiplicación a.b + x.y\n"
                            + "2. Multiplicación a.b + x.y + c.z\n"
                            + "3. Multiplicación a.b + x.y + c.z + d.t\n\n"
                            + "Con otro número sale del programa."));
                    switch(Op2){
                        case 1:{
                            Punto2 a = new Punto2();
                            String Solucion = a.obtenerSolucion(1);
                            JOptionPane.showMessageDialog(null, Solucion);
                            break;
                        }
                        case 2:{
                            Punto2 a = new Punto2();
                            String Solucion = a.obtenerSolucion(2);
                            JOptionPane.showMessageDialog(null, Solucion);
                            break;
                        }
                        case 3:{
                            Punto2 a = new Punto2();
                            String Solucion = a.obtenerSolucion(3);
                            JOptionPane.showMessageDialog(null, Solucion);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 3:{
                    Punto3 a = new Punto3();
                    String Solucion = a.obtenerSolucion();
                    JOptionPane.showMessageDialog(null, Solucion);
                    break;
                }
                case 4:{
                    Punto4 a = new Punto4();
                    a.obtenerSolucion();
                    break;
                }
                default:
                    Estado = false;
            }
        }
    }
}

/* Desarrollado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/