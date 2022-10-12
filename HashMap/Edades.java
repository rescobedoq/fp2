import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;


class Edades {
    public static void main(String[] args) {
        // Un HashMap simple de llave String y valor Integer.
        HashMap<String, Integer> hashMapEdad = new HashMap<String, Integer>(); 
        
        // Con el metodo put() agregamos un item al HashMap.
        hashMapEdad.put("Pedro", 21);
        hashMapEdad.put("Pepe", 35);
        hashMapEdad.put("Jose", 15);

        // Obtener la edad de Pepe
        int edad = hashMapEdad.get("Pepe");
        System.out.println("Edad de Pepe : " + edad); 
              
        System.out.println("Recorriendo HashMap"); 
        for(String key: hashMapEdad.keySet()){
            System.out.println(key + " tiene " + hashMapEdad.get(key) + " años de edad.");
        }
        
        System.out.println("Recorriendo TreeMap"); 
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(hashMapEdad);
        for (String key : treeMap.keySet()) {
            System.out.println(key + " tiene " + treeMap.get(key) + " años de edad.");
        }    
        
        System.out.println("Imprimiendo ArrayList");          
        ArrayList<String> keyList = new ArrayList<String>(hashMapEdad.keySet());
        System.out.println(keyList);
        ArrayList<Integer> valueList = new ArrayList<Integer>(hashMapEdad.values());
        System.out.println(valueList);
              
        System.out.println("Imprimiendo Map"); 
        Map map= Collections.synchronizedMap(hashMapEdad);
        System.out.println(map);
    }
}
