
package temaarray;
import java.util.ArrayList;
public class ArrayListSeriesTV {

    public static void main(String[] args) {
       ArrayList<String> listaSeries= new ArrayList<>();
       listaSeries.add("Brakin bad");
       listaSeries.add("Friends");
       listaSeries.add("Hola mexico");
       System.out.println(listaSeries);// muestra los listados 
        
       listaSeries.remove("Friends");// elimina uno de la lista 
       System.out.println(listaSeries); 
       
       boolean contaFriends = listaSeries.contains("Friends");
        System.out.println("la lista contiene a Friends: " +contaFriends);
        
        int tamano =listaSeries.size();
        System.out.println("el tamaño del arraylist es: "+tamano);
            
        // declarara diversos tipos de de Arraylist
        ArrayList<Integer>listaInteger = new ArrayList<>();
       ArrayList<Double> listaDouble = new  ArrayList<>();
       ArrayList<Boolean> listaBoolean = new  ArrayList<>();
       
       
    }
    
}
