
public class Moneda
{
        private double resultado;
        private int numero;
    public Moneda()
    {
        resultado = 0.0;
        numero = 0;
    }
    public int lanzar()
    {
        numero = (int) (Math.random()*2+1);
        return numero;
    }
    public double probabilidad()
    {
        double numerador = 1.0;
        double denominador = 2.0;
        double proba;
        proba = numerador / denominador;
        resultado= 100* proba;
        System.out.println("La probabilidad de que al lanzar una moneda te salga el numero "+numero+ " es de: "+resultado);
        return resultado;
    }
}
