package com.iesvirgendelcarmen.oscar.matematicas;

public class Geometria {
    public static double calcularAreaTriangulo(double altura, double base){
        return base*altura/2;
    }

    public static double calcularAreaCuadrado(double lado){
        return lado*lado;
    }

    public static double calcularAreaPentagono(double apotema, double lado){
        return 5*lado*apotema/2;
    }

    public static double calcularAreaHexagono(double lado, double apotema){
        return 6*lado*apotema/2;
    }
}
