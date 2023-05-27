
public class conversorDeUnidades
{
    public String CentimetroaPulgada(int longitud){
        double res = (double) longitud *(1.0/2.54);
        return " " + longitud + " cm " + "tiene " + res + " in ";
    }
}
