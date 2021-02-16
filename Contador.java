import java.util.Random;
/**
 * Cuenta cuantos numeros positivos, negativos y ceros han salido de una cantidad de numeros n
 * 
 * @author (Roberto Alarcon Bardon) 
 * @version (16/02/2021)
 */
public class Contador
{
    // instance variables - replace the example below with your own
    private int contadorPositivos;
    private int contadorNegativos;
    private int contadorCeros;
    /**
     * Crea un objeto contador
     */
    public Contador()
    {
        contadorPositivos = 0;
        contadorNegativos = 0;
        contadorCeros = 0;        
    }

    /**
     * Cuenta
     */
    public void cuenta(int cantidadDeNumeros){
        Random random = new Random();
        for(int i=0;i<cantidadDeNumeros;i++){
            int numero = random.nextInt((cantidadDeNumeros+1));
            numero = numero - (cantidadDeNumeros/2);
            if (numero>0){
                contadorPositivos++;
            }
            else if (numero<0){
                contadorNegativos++;
            }
            else {
                contadorCeros++;
            }
        }
        System.out.println("Hay " + contadorPositivos + " numeros positivos");
        System.out.println("Hay " + contadorNegativos + " numeros negativos");
        System.out.println("Hay " + contadorCeros + " ceros");
    }
}
