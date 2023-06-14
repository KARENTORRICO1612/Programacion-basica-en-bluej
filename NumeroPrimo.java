
public class NumeroPrimo
{
    public String esPrimo(int num){
        int gen = 9;
        int cont = 0;
        String res =  "El numero no es primo";
        
        if(num == 1){
          return  res;
        }else
          while(gen>0){
              int div = num%gen;
              if(div == 0){
                  cont ++;
                }
                gen--;
         } 
         if(cont <= 2 ){
             return "El numero es primo";
         }else{
             return res;
         }
    }
}
