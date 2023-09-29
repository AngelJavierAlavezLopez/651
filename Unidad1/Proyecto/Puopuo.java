
package pou;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Puopuo {
    Scanner leer= new Scanner(System.in);
    //contructores 
    byte b;
    private String nombre;
     private int vida,ambre,jugar;
      private Timer timer;

      public Puopuo(String nombre){
         
         this.nombre=nombre;
         this.vida=100;
         this.ambre=50;
         this.jugar=50;
         
         
          //metodos
         // Iniciar el temporizador
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                restarVida();
            }
        }, 4000, 2000);
        
     }
      
     private void restarVida() {
        if (vida > 0) {
            vida -= 10;
            // System.out.println("Se ha restado 1 a la vida de " + nombre); 
        } else {
            System.out.println("¡Perdiste! La vida de " + nombre + " ha llegado a 0");
            // Cancelar el temporizador cuando la vida llega a 0
            timer.cancel();
        }
        
          if (ambre > 0) {
            ambre -= 5;
        } else {
            System.out.println("¡Perdiste! Se murio " + nombre + " de hambre");
          
            timer.cancel();
        }
        
    }

     public void alimentar(){
         
         if(ambre<100){
             ambre=ambre +10;
             System.out.println("LE DISTE DE COMER A " +nombre);
         }else{
             if(ambre>=100)
                 
                System.out.println("El "+nombre+" NO TIENE HAMBRE");
               
         }
                 
     }
     public void divertir(){
         
         if(jugar<100){
             jugar=jugar +10;
             System.out.println("YA JUGASTE CON " +nombre);
         }else{
             if(jugar>=100)
                System.out.println("EL "+nombre+" YA NO QUIERE JUGAR");
                 
         }
     }  
     public void bañar(){
         
         jugar =jugar +1;ambre =ambre +1;
         System.out.println("HAS BAÑADO AL "+nombre);
     } 
      
      
     public void estado(){
          System.out.println("La hambre del pou "+nombre+" es:" +ambre);
          System.out.println("La alegria del pou "+nombre+" es:" +jugar);
          System.out.println("La vida del pou "+nombre+" es:" +vida);
         
     }
     
     
     
}

