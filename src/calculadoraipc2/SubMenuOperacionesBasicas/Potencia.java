package SubMenuOperacionesBasicas;

public class Potencia {
    public float potencias(float [] numeros){
        float resultado=numeros[0];
        for(int i=1; i<numeros[1]; i++){
            resultado=resultado*resultado;
        }
        return resultado;
    }
}
