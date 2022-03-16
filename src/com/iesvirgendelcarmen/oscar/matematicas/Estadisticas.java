package com.iesvirgendelcarmen.oscar.matematicas;

public class Estadisticas {
    public Estadisticas() {
    }

    public double media(double[] valores){
        double aux = 0;
        for (int i = 0; i < valores.length; i++) {
            aux+=valores[i];
        }
        return aux/valores.length;
    }

    public double moda(double[] valores){
        double modaActual = 0;
        int vecesModaActual = 0;
        for (int i = 0; i < valores.length; i++) {
            int vecesModaAux = 0;
            for (int j = i; j < valores.length; j++)
                if(valores[j] == valores[i])
                    vecesModaAux++;
            if(vecesModaActual<vecesModaAux){
                modaActual = valores[i];
                vecesModaActual = vecesModaAux;
            }
        }
        return  modaActual;
    }

    public double varianza(double[] valores){
        double media = this.media(valores);
        double[] valorMenosMediaCuadrado = new double[valores.length];
        for (int i = 0; i < valores.length; i++)
            valorMenosMediaCuadrado[i] = Math.pow(valores[i]-media,2);
        double sumatorio = 0;
        for (int i = 0; i < valorMenosMediaCuadrado.length; i++)
            sumatorio+=valorMenosMediaCuadrado[i];
        return sumatorio/ valorMenosMediaCuadrado.length;
    }

    public double desviacionTipica(double[] valores){
        return Math.sqrt(varianza(valores));
    }
}
