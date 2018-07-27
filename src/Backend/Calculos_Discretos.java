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
    
    public static int factorial(int i){
        if(i==0){
            return 1;
        }
        else {
            return i * factorial(i-1);        }
    }
    
    public static int permutacion(int n, int r){
        if(n<r){
            return 0;
        }
        else {
            return factorial(n)/factorial(n-r);
        }
    }
    
    public static int combinacion(int n, int r){
        if(n<r){
            return 0;
        }
        else {
            return factorial(n)/(factorial(n-r) * factorial (r));
        }
    }
}
