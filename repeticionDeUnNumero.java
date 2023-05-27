
public class repeticionDeUnNumero
{
    public int repeticionNumero(int repeticion, int numero){
        int res = 0;
        while(repeticion>0){
            res = res + numero;
            repeticion = repeticion -1;
        }
        return res;
    }
}
