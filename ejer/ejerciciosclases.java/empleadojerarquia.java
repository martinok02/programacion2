/*Tema 1: Jerarquías con extends y constructores con super() Ejercicio 1 (básico). 
Convertir Empleado (Clase 5) en superclase de dos subclases: EmpleadoPorHoras
 (horas trabajadas, valor hora) y EmpleadoAsalariado (sueldo básico, bono)
 , cada una con su propio constructor que invoque super(nombre, legajo)
  para inicializar los atributos heredados sin duplicarlos./* */

public class Empleadojerarquia {
    protected String nombre;
    protected int legajo;

    public Empleadojerarquia(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
}

public class EmpleadoPorHoras extends Empleadojerarquia {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, double horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
}

public class EmpleadoAsalariado extends Empleadojerarquia {
    private double sueldoBasico;
    private double bono;

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }
}