
/**
 *Contador de digitos
 */
public class contadorDigitos
{
    public int contadorDigitos(int numero)
    {
       int cont = 0;
       while(numero>0){
           numero = numero/10;
           cont++;
       }
       return cont;
    }
}