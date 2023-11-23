
package pkg651trabajadores;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class suma {
     private static final String nombreArchivo="ArchivoBaseTrabajdores.txt";
   
     public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        File archivo= new File(nombreArchivo);
        Scanner s= null;
        
        try{
            s= new Scanner(archivo);
            while(s.hasNextLine()){
                String linea= s.nextLine();
                String[] CortarString=linea.split(" ");
                
                if(CortarString.length >= 2){
                   
                    Departamento departamento = new Departamento(CortarString[3]);
                    departamentos.add(departamento);
             }
             
            }
        }catch (Exception e){
            e.printStackTrace();
        }
      
        Map<String,Integer>cantidadDeDepartamentos= new HashMap<>();
        for(Departamento departamento:departamentos){
            String Departamento =departamento.getDepartamento();
            cantidadDeDepartamentos.put(Departamento,cantidadDeDepartamentos.getOrDefault(Departamento, 0) + 1 );
        }
        System.out.println("Nombre de departamento | Numero total de departamentos");
        System.out.println("______________________________________________________");
        
        for(Map.Entry<String, Integer> entry : cantidadDeDepartamentos.entrySet() ){
            System.out.printf("%-22s | %d\n", entry.getKey(), entry.getValue());
        }
       
            }
           
        
    }
    

