package SubMenuOperacionesBasicas;

public class Suma {
    public float sumas(float [] numeros){
        float resultado=0;        
            for(int i=0; i<numeros.length ; i++){
                resultado = resultado + numeros[i];
            }
        return resultado;
    }
}
