package semana02;

import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private String apellido;
    private int genero;
    private String imagen;
    private double salario;
    private Fecha fechaIngreso;
    private Fecha fechaNacimiento;
    private int numerohijos;

    public Empleado() {

    }

    public String darNombre() {
        return nombre;
    }

    public String darApellido() {
        return apellido;
    }

    public String darImagen() {
        return imagen;
    }

    public int dargenero() {
        return genero;
    }

    public double darSalario() {
        return salario;
    }
    
    public int darNumeroHijos(){
        return numerohijos;
    }

    //
    public int calcularEdad() {
        Fecha fechaActual = new Fecha(9, 4, 2023);
        int edad;
        if (fechaActual.darMes() > this.fechaNacimiento.darMes()) {
            edad = fechaActual.darAnio() - this.fechaNacimiento.darAnio();
        } else {
            if (fechaActual.darMes() == this.fechaNacimiento.darMes()) {
                if (fechaActual.darDia() >= this.fechaNacimiento.darDia()) {
                    edad = fechaActual.darAnio() - this.fechaNacimiento.darAnio();
                } else {
                    edad = fechaActual.darAnio() - this.fechaNacimiento.darAnio();
                    edad = edad - 1;
                }
            } else {
                edad = fechaActual.darAnio() - this.fechaNacimiento.darAnio();
                edad = edad - 1;

            }
        }

        return edad;
    }

    public int calcularAntiguedad() {
        Fecha fechaActual = new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
        int antiguedad;
        if (fechaActual.darMes() > this.fechaIngreso.darMes()) {
            antiguedad = fechaActual.darAnio() - this.fechaIngreso.darAnio();
        } else {
            if (fechaActual.darMes() == this.fechaIngreso.darMes()) {
                if (fechaActual.darDia() >= this.fechaIngreso.darDia()) {
                    antiguedad = fechaActual.darAnio() - this.fechaIngreso.darAnio();
                } else {
                    antiguedad = fechaActual.darAnio() - this.fechaIngreso.darAnio();
                    antiguedad = antiguedad - 1;
                }
            } else {
                antiguedad = fechaActual.darAnio() - this.fechaIngreso.darAnio();
                antiguedad = antiguedad - 1;

            }
        }

        return antiguedad;
    }

    public double calcularPrestaciones() {
        double prestaciones;
        prestaciones=(this.calcularAntiguedad()*this.salario)/12;
        return prestaciones;
    }

    public void cambiarEmpleado(String pNombre, String pApellido, int pGenero, Fecha pfNacimiento, Fecha pfIngreso, String pImagen, double pSalario) {
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.genero = pGenero;
        this.fechaNacimiento = pfNacimiento;
        this.fechaIngreso = pfIngreso;
        this.imagen = pImagen;
        this.salario = pSalario;
    }
    
    public void cambiarSalario(double pSalario){
        this.salario=pSalario;
    }
    
    public double calculaAuxilioEducativo(){
        return 0.05*this.salario*this.numerohijos;
    }
    
    public double calculaAuxilioEducativo(double pSalario){
        return 0.05*pSalario*this.numerohijos;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", imagen=" + imagen + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
