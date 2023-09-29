package pou;
import java.util.Scanner;

public class correr {
    Scanner leer= new Scanner(System.in);
    int a;
    String nombre;
    private Puopuo pou;
    
    public correr(){
        System.out.println("Ingrese un nombre para el Pou:");
        nombre=leer.next();
        System.out.println("Intrucciones para jugar con el pou "+nombre);
        System.out.println("1-alimentar ");
        System.out.println("2-jugar");
        System.out.println("3-bañar");
        System.out.println("------------------------------------------------");
        pou=new Puopuo(nombre);
    }
    
    public void menu(){
        
        do{
        pou.estado();
        System.out.println("Ingrese un numero para realiazar una accion");
         System.out.println("1-alimentar ");
        System.out.println("2-jugar");
        System.out.println("3-bañar");
        a=leer.nextInt();
        
        switch (a) {
            case 1: pou.alimentar();
                break;
             case 2: pou.divertir();
                break;
             case 3: pou.bañar();
                break;
          
        }
    } while(a !=4);
        System.out.println("Cerraste el juego...");
    }
    
    public static void main(String[] args) {
        
        correr nuevo= new correr();
        nuevo.menu();
    }
    
}
