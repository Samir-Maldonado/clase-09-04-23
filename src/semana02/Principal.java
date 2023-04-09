package semana02;
public class Principal {
    public static void main(String[] args) {
        Fecha mifecha1 = new Fecha(9,4,2023);
        Fecha mifecha2 = new Fecha(2,7,2023);
        Fecha fechaNacimiento = new Fecha(8,4,2000);
        Fecha fechaIngreso = new Fecha(9,4,2022);
        
        Empleado juan =new Empleado();
        juan.cambiarEmpleado("Juan", "Arias", 1, fechaNacimiento, fechaIngreso, "juan.jpg", 2300.00);
        juan.cambiarSalario(2400);
        
        
        System.out.println(juan);
        System.out.println("edad"+juan.calcularEdad());
        System.out.println("antiguedad: "+juan.calcularAntiguedad());
        System.out.println("prestaciones:" +juan.calcularPrestaciones());
    }
    
}
