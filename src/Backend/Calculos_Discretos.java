/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author anclenius
 */
public class Calculos_Discretos {
    //Funcion que retorna el factorial de un numero, utilizando recursividad.
    public static int factorial(int i){
        if(i==0){
            return 1;
        }
        else {
            return i * factorial(i-1);        }
    }
    //Funcion que retorna una permutacion utilizando la funcion factorial para acelerar y comprimir codigo
    public static int permutacion(float[] valor){
        if(valor[0]<valor[1]){
            return 0;
        }
        else {
            return factorial((int) valor[0])/factorial((int) valor[0] - (int) valor[1]);
        }
    }
    //Funcion que retorna una combinacion utilizando la funcion factorial para acelerar y comprimir codigo
    public static int combinacion(float[] valor){
        if(valor[0]<valor[1]){
            return 0;
        }
        else {
            return factorial((int)valor[0])/(factorial((int)valor[0]-(int)valor[1]) * factorial ((int)valor[1]));
        }
    }
}
