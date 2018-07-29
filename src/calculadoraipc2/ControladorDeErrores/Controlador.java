package ControladorDeErrores;

import Backend.Calculos_Discretos;
import Backend.Convertidor_Numerico;
import SubMenuOperacionesBasicas.Divicion;
import SubMenuOperacionesBasicas.Multiplicacion;
import SubMenuOperacionesBasicas.Potencia;
import SubMenuOperacionesBasicas.Raiz;
import SubMenuOperacionesBasicas.Residuo;
import SubMenuOperacionesBasicas.Suma;
import javax.swing.JOptionPane;

public class Controlador {
    public float separadorDeOperaciones(String operacion, String calculo){
        float resultado=0;
        String resultadoTransformacion = null;
        if(operacion.equals("suma")){
            Suma suma = new Suma();
            try{
            resultado=suma.sumas(separador(calculo, "┼"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("multiplicacion")){
            Multiplicacion multiplicacion = new Multiplicacion();
            try{
            resultado=multiplicacion.multiplicaciones(separador(calculo, "x"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("divicion")){
            Divicion divicion = new Divicion();
            try{
            resultado=divicion.diviciones(separador(calculo, "/"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("residuo")){
            Residuo residuo = new Residuo();
            try{
            resultado=residuo.residuos(separador(calculo, "%"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("raiz")){
            Raiz raiz = new Raiz();
            String numerosTexto= calculo.substring(1); 
            try{
            float numeros = Float.parseFloat(numerosTexto);
            resultado=raiz.raices(numeros);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("potencia")){
            Potencia potencia = new Potencia();
            try{
            resultado=potencia.potencias(separador(calculo, " A La "));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }
        else if(operacion.equals("permutacion")){
            try{
                resultado=Calculos_Discretos.permutacion(separador(calculo,"P"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }
        else if(operacion.equals("combinacion")){
            try{
                resultado=Calculos_Discretos.combinacion(separador(calculo,"C"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }else if(operacion.equals("factorial")){
            try{
                resultado=Calculos_Discretos.factorial((int)separador(calculo,"!")[0]);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Uno De Los Numeros Es Invalido");
            }
        }
        
        return resultado;
    }
    
   public float[] separador(String calculo, String caracter){
        String [] numerosTexto= calculo.split(caracter);
        float [] numeros = new float[numerosTexto.length];
        for(int i = 0; i<numerosTexto.length; i++){
            numeros[i]= Float.parseFloat(numerosTexto[i]);
        } 
        return numeros;
    }
}
