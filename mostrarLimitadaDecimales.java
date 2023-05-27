import java.util.*;


public class mostrarLimitadaDecimales
{
   public double decimalCorto(){
       double num = 1.0;
       double den = 3.0;
       double res =  (Math.round((num/den)*100))/100d;
       return res;
   }
}
