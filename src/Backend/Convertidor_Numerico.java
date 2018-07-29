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
    
    public static String toBinary(int numeroDecimal){
        if(numeroDecimal == 1){
            return "1";
        } else if(numeroDecimal%2 == 0){
            return "0" + toBinary(numeroDecimal / 2);     
        } else {
            return "1" + toBinary(numeroDecimal / 2);
        }
    }
    
    public static String toOctal(int decimal){    
    int residuo;  
    String octal="";   
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
   
    while(decimal>0)  
    {  
       residuo=decimal%8;   
       octal=octalchars[residuo]+octal;   
       decimal=decimal/8;  
    }  
    return octal;  
}    
    
    
}
