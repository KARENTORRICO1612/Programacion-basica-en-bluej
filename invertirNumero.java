
public class invertirNumero
{
    public String invertir(int num){
        String res = " ";
        if(num==0){
            res = 0 + "";
        }
        while(num>0){
            res = res  + (num%10);
            num = num/10;
        }
        return res;
    }
}
