public class Empleado{
    String nombre;
    String apellido;
    int edad;
    double salario;

    public Empleado(String a, String b, int c, double d){
        this.nombre = a;
        this.apellido = b;
        this.edad = c;
        this.salario = d;
    }

    public double getSalario(){
        return this.salario;
    }

    public String printEmpleado(){
        return "["+this.nombre+", "+this.apellido+", "+this.edad+", "+this.salario+"]";
    }
    
}
