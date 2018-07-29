
package SubMenuOperacionesBasicas;

public class Multiplicacion {
    public float multiplicaciones(float [] numeros){
        float resultado=1;        
            for(int i=0; i<numeros.length ; i++){
                resultado = resultado * numeros[i];
            }
        return resultado;
    }
}
