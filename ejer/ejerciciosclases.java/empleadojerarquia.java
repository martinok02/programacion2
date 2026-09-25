/*Tema 1: Jerarquías con extends y constructores con super() Ejercicio 1 (básico). 
Convertir Empleado (Clase 5) en superclase de dos subclases: EmpleadoPorHoras
 (horas trabajadas, valor hora) y EmpleadoAsalariado (sueldo básico, bono)
 , cada una con su propio constructor que invoque super(nombre, legajo)
  para inicializar los atributos heredados sin duplicarlos./* */

public class empleadojerarquia extends empleado {
    private double sueldoBase;
    private double bono;

    public empleadojerarquia(String nombre, int legajo, double sueldoBase, double bono) {
        super(nombre, legajo);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoBase + this.bono;
    }