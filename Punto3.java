package com.mycompany.taller1;


public class Punto3 {
    double a = 23.2; //[0][0]
    double b = 40.1;//[0][1]
    double c = 56.8;//[0][2]
    double d = 35;//[1][0]
    double e = 49.54;//[1][1]
    double f = 70.5;//[1][2]
    double[][] uv = {{a,b,c},{d,e,f}};
    double[] Resultado = new double[3];
    
    public String obtenerSolucion(){
        double i;
        double j;
        double k;
        double Final;
        String Resultado2 = "";
        //operacion i
        i = (uv[0][1]* uv[1][2])-(uv[1][1]*uv[0][2]);
        Resultado[0] = i;
        //operacion j
        j = (uv[0][0]* uv[1][2])-(uv[1][0]*uv[0][2]);
        Resultado[1] = j;
        //operacion k
        k = (uv[0][0]* uv[1][1])-(uv[1][0]*uv[0][1]);
        Resultado[2] = k;
        //Operacion Final
        Final = (Resultado[0]-Resultado[1]+Resultado[2]);
        String Operacion = String.format("i (%s*%s-%s*%s) - j (%s*%s-%s*%s) + k (%s*%s-%s*%s)",uv[0][1],uv[1][2],uv[1][1],uv[0][2],uv[0][0],uv[1][2],uv[1][0],uv[0][2],uv[0][0],uv[1][1],uv[1][0],uv[0][1]);
        Resultado2 += String.format("El resultado de la operación %s es = %s", Operacion, Final);
        return Resultado2;
    }
    
}


/* Desarrollado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/
