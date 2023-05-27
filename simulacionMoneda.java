public class simulacionMoneda
{
    private String cara;
    private String cruz;
    private int numero;
    
    public simulacionMoneda(){
        cara = "cara";
        cruz = "cruz";
        numero = 0;
    }
    
    public String lanzar(){
        String mensaje = "La probabilidad de que salga ";
        numero = (int) (Math.random()*2+1);
        if(numero == 2){
            return  cara; 
        }else{
            return  cruz; 
        }
    }
    
    public String calculoProbabilidad(int numeroCaras){
        double probabilidad = (double)(1.0/numeroCaras*(1.0))*100;
        numero = (int) (Math.random()*2+1);
        String mensaje = "La probabilidad de que salga ";
        if(numero == 2){
            return mensaje + cara + " es de " + (int)probabilidad + "%"; 
        }else{
            return mensaje + cruz + " es de " + (int)probabilidad + "%"; 
        }
    }
}
