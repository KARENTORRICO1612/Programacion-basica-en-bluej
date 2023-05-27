
public class areaPerimetroCirculo
{
    public String calcular(int radio){
        double area = Math.pow(radio,2)*Math.PI;
        double perimetro = 2*Math.PI*radio;
        
        return "El area del circulo es: " + area + " - " +
        " El perimetro del circulo es "+perimetro;
     }
}
