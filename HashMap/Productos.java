import java.util.HashMap;
class Productos {
    public static void main(String[] args) {
        HashMap<Integer, String> ProductoInfo = new HashMap<>();
 
        ProductoInfo.put(1, "Zapatos de Cuero"); 
        ProductoInfo.put(2, "Casacas Cortaviento"); 
        ProductoInfo.put(3, "Zapatillas Running");
        
        // Actualizar key 1
        ProductoInfo.replace(1, "Zandalias Moradas");
        
        /* Salida */
        System.out.println(ProductoInfo);
        // {1=Zandalias Moradas, 2=Casacas Cortaviento, 3=Zapatillas Running} 
    }
}
