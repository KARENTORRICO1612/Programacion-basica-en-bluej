
public class factorialNumero
{
    public int factorial(int num){
        int res;
       if(num==0){
           res = 1;
        }else{
           res = num * factorial(num-1); 
        }
        return res;
    }
}
