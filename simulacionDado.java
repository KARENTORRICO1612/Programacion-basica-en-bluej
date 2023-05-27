
public class simulacionDado
{
 
    public String lanzar(){
        String mensaje = "La probabilidad de que salga ";
        int numero = (int) (Math.random()*6+1);
        return numero + " ";
    }
    
    public String calculoProbabilidad(int numeroCaras){
        double probabilidad = (double)(1.0/numeroCaras*(1.0))*100;
        int numero = (int) (Math.random()*6+1);
        return  "La probabilidad de que salga " + numero +  " es de " + (int)probabilidad + "%"; 
    }
}
