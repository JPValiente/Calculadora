/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.List;

/**
 *
 * @author anclenius
 */
public class Convertidor_Numerico {
    
    public static String binario(int numeroDecimal){
        if(numeroDecimal == 1){
            return "1";
        } else if(numeroDecimal%2 == 0){
            return "0" + binario(numeroDecimal / 2);     
        } else {
            return "1" + binario(numeroDecimal / 2);
        }
    }
    
    public static int octal(int numeroDecimal){       
        if (numeroDecimal < 8){
            return numeroDecimal;
        }
        else {
            return octal(numeroDecimal/8);
           
        }       
    }
    
    
}
