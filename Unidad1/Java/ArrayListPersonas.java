
package temaarray;
import java.util.ArrayList;

public class ArrayListPersonas {

    public static void main(String[] args) {
        ArrayList<persona>listaPersonas=new ArrayList<>();
        listaPersonas.add(new persona (1, "Benito",15));
        listaPersonas.add(new persona (2, "Pedrito",17));
        listaPersonas.add(new persona (3, "juan",25));
        
        //System.out.println("Imprime lista de personas: "+listaPersonas);
        System.out.println("---------FOR-------------------");
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println("Contenido"+ listaPersonas.get(i).getNombre());
         
        }
        System.out.println("----------FOR EACH----------------");
                for (persona perso:listaPersonas){
                    System.out.println("contenido"+perso.getNombre());
                }
        
        
    }
    
}
