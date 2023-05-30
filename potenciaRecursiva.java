
public class potenciaRecursiva
{
    public int potencia(int base, int exp){
        int res;
        if(exp==0){
            res = 1;
        }else{
            res = base * potencia(base, exp-1);
        }
        return res;
    }
}
