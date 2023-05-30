import java.util.*;


public class corazon
{
    public void imprimir(){
        
        for(int i=0;i<=12;i++){
            for(int j=0;j<=12;j++){
                if(i==0){
                    if(j>=5 && j<=7 || j==0 ||  j==1 || j==11 || j>=12){
                      System.out.print("_");
                    }else{
                           System.out.print(" * ");
                    }
                 }else{
                    if(j==1){
                            if(j>=5 && j<=7 || j==0 ||  j==1 || j==11 || j>=12){
                             System.out.print("_");
                           }else{
                           System.out.print(" * ");
                           }
                       }else{
                           System.out.print("* ");
                    }
               }
            }
            System.out.println(" ");
           }
     }  
     
      public void imprimir2(){
        
        for(int i=0;i<=12;i++){
            for(int j=0;j<=12;j++){
                if(i==0){
                    if(j>=5 && j<=7 || j==0 ||  j==1 || j==11 || j>=12){
                      System.out.print(" _ ");
                    }
                    else{
                           System.out.print(" * ");
                    }
                 }else{
                           System.out.print(" * ");
                }
               }
                 System.out.println(" ");
           }
     }  
}