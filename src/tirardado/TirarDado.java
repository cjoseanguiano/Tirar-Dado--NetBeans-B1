/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tirardado;

import java.util.Random;

/**
 *
 * @author carlosjoseanguiano
 */
public class TirarDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instancia de la clase Random
        Random numerosAleatorios = new Random();
        //Declaracion del arreglo con un tamaño de 7
        int[] frecuencia = new int[7];
        //Se recorre el ciclo donde disparo es inicia en 1 y disparo sera menor a 100 
        for (int disparo = 1; disparo <= 100; disparo++) {
            //Se aumenta 1 a frecuenta y se suma numero aleatorio
            ++frecuencia[1 + numerosAleatorios.nextInt(6)];
        }
        //Se imprime el titulo de las columnas
        System.out.printf("%s%10s\n", "Lado", "Disparo");

        //Se inicia el ciclo for donde cara es 1 y cara debe ser menor al numeo de frecuencia
        for (int cara = 1; cara < frecuencia.length; cara++) {
            //Se imprime el resultado de los disparos
            System.out.printf("%4d %10d\n", cara, frecuencia[cara]);
        }

    }

}
