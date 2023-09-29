
package temaarray;
import java.util.Scanner;
public class Temaarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //guardar las ventas de 10 dias en un arreglo 
        //y determinar cuales son mayores a 2000 (inclusive)
        double ventas[]= new double [10];
        Scanner entrada= new Scanner(System.in);
        System.out.println("********Ventas mayores a 2000*****");
        System.out.println("");
        System.out.println("ingrese las 10 ventas del mes");
        
        //llenar el arreglo
        for (int i = 0; i <= ventas.length -1; i++) {
            System.out.println("ingrese la venta:"+ (i+1)+ " ");
            ventas[i] = entrada.nextDouble();
            
        }
        //seterminar cuales ventas en el arreglo son mayores o iguales 
        //a 2000
        ventasMayores2000(ventas);
    }
    public static void ventasMayores2000(double x[]){
        int j=0;
        int total=0;
        double acumuladorventas=0;
        System.out.println("estas son las ventas mayores o iguales a 2000");
        
        //recorrer el arreglo
        while(j <10){
            if(x[j] >=2000){
                System.out.println("$"+ x[j]);
                total ++;
                acumuladorventas =acumuladorventas + x[j];
                
            }
            j++;
        }
        System.out.println("El total de las ventas >=2000: " + total);
        System.out.println("el acumulador total es: " + acumuladorventas);
    
    }
        
    }
    
