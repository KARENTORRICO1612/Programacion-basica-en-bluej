import java.util.*;

public class Promedio
{
    public void promedio(int nota1, int nota2, int nota3, int nota4){
        System.out.println("La primera nota es: " + nota1);
        System.out.println("La segunda nota es: " + nota2);
        System.out.println("La tercera nota es: " + nota3);
        System.out.println("La cuarta nota es: " + nota4);
        double promedio = (double)(nota1 + nota2 + nota3 +nota4) /4;
        System.out.println("El promedio es: " + promedio);
    }
}
