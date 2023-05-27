
/**
 * Esta es mi primer clase en Java
 * SUMA
 */
public class suma
{
   //public ----> Todos pueden ver
   //private ===> No todos pueden ver, solo los que tienen permiso
   //protected ===> Visible solo para permitidos
   //IMPRIMIENDO UN VALOR
   public void sumaProc(){
       int a = 3;
       int b = 4;
       int res = a + b;
       //IMPRIME UN MENSAJE
       System.out.println("El primer valor es: " + a);
       System.out.println("El segundo valor es: " + b);
       System.out.println("El resultado es: " + res);
   }
   //   REALIZANDO SUMA DEVOLVIENDO UN VALOR ENTERO
   public int sumaProc2(){
       int a = 3;
       int b = 4;
       int res = a + b;
       return res;
   }
   //   DECLARAR VARIABLES DESDE AFUERA
   public int suma3(int a, int b){
       int res = a + b;
       return res;
   }
   
   public String suma4(int a, int b){
       int res = a + b;
       return "El primer valor es: " + a + " \n " +
       "El segundo valor es: " + b + "\n " +
       "El valor de la suma es " + res;
       //CONCATENAR combinar texto con numeros, letras, simbolos
   }
   
   public int resta(int a, int b){
       int res = a - b;
       return res;
   }
}
