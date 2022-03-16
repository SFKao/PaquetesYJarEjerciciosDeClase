package com.iesvirgendelcarmen.oscar.test;

import com.iesvirgendelcarmen.oscar.matematicas.Estadisticas;
import com.iesvirgendelcarmen.oscar.matematicas.Geometria;

public class TestMatematicas {
    public static Estadisticas estadisticas = new Estadisticas();
    public static void main(String[] args) {
        double[] valores = {9,3,8,9,16};
        System.out.println("La media es "+ estadisticas.media(valores));
        System.out.println("La varianza es "+estadisticas.varianza(valores));
        System.out.println("La desviacion tipica es "+ estadisticas.desviacionTipica(valores));
        //Nota: Estos valores estan probados y el resultado es correcto.

        System.out.println("El area de un triangulo de lado 2 y altura 1 es "+Geometria.calcularAreaTriangulo(1,2) );
        System.out.println("El area de un cuadrado de lado 2 es "+Geometria.calcularAreaCuadrado(2));
        System.out.println("El area de un pentagono de lado 1 y apotema 1 es "+Geometria.calcularAreaPentagono(1,1));
        System.out.println("El area de un hexagono de lado 1 y apotema 1 es "+Geometria.calcularAreaHexagono(1,1));
    }
}
