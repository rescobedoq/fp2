public class Empleado{
    String nombre;
    String apellido;
    byte edad;
    double salario;
    float peso;
    float talla;
    float imc;

    public Empleado(String a, String b, byte c, double d, float e, float f){
        this.nombre = a;
        this.apellido = b;
        this.edad = c;
        this.salario = d;
        this.peso = e;
        this.talla = f;
        this.imc = this.peso/(this.talla+this.talla);
    }

    public double getSalario(){
        return this.salario;
    }

    public String evaluarIMC(){
    
        if(this.imc>=40){
            return "Obesidad Grado III (Mórbida)";
        }
        
        if(this.imc>=35 && this.imc<=39.9){
            return  "Obesidad Grado II";
        }

                
        if(this.imc>=30 && this.imc<=34.9){
            return  "Obesidad Grado I";
        }
        
        if(this.imc>=25 && this.imc<=29.9){
            return  "Sobrepeso";
        }

        if(this.imc>=18.5 && this.imc<=24.9){
            return  "Peso Normal";
        }

        if(this.imc<18.4){
            return  "Bajo de peso";
        }

        return "error";

    }

    public String printEmpleado(){
        return "["+this.nombre+", "+this.apellido+", "+this.edad+", "+this.salario+", "+this.evaluarIMC()+"]";
    }
    
}
