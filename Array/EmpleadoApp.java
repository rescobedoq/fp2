import javax.swing.JOptionPane;
import java.util.Arrays;

public class EmpleadoApp {
 
    public static void main(String[] args) {
 
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[]=new Empleado[3];

        String[] nombres = {"Juan", "Maria","Carlos"};
        String[] apellidos = {"Perez", "Caceres","Teves"};        
        int[] edades = {25, 18,40};
        double[] salarios = {2500, 1800,3000};

 
        //Creamos 10 empleados por defecto
        int suma=0;
        for (int i=0;i<arrayObjetos.length;i++){
            //Indicamos cada uno de los parametros del objeto
            String nombre=JOptionPane.showInputDialog("Escribe un nombre",nombres[i]);
 
            String apellido=JOptionPane.showInputDialog("Escribe un apellido",apellidos[i]);
 
            String texto=JOptionPane.showInputDialog("Escribe una edad",edades[i]);
            int edad=Integer.parseInt(texto);
 
            texto=JOptionPane.showInputDialog("Escribe un salario",salarios[i]);
            double salario=Double.parseDouble(texto);
 
            arrayObjetos[i]=new Empleado(nombre, apellido, edad, salario);
        }
 
        //Lo recorremos y sumamos de nuevo los salarios
        for (int i=0;i<arrayObjetos.length;i++){
            //Mostramos la direccion del objeto
            System.out.println(arrayObjetos[i].printEmpleado());
            suma+=arrayObjetos[i].getSalario();
        }
        System.out.println("La suma de salarios es "+suma);
    }
 
}
