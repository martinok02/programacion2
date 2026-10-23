package ejer.ejerciciosclases.java;
public class Empleado {
    protected String nombre;
    protected int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public double calcularSueldo() {
        return 0;
    }
}

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int legajo, double horasTrabajadas, double valorHora) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

public class EmpleadoAsalariado extends Empleado {
    private double sueldoBasico;
    private double bono;

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}

public class Main {
    public static void main(String[] args) {
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", 101, 160, 25.0);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Ana", 102, 3000.0, 500.0);

        System.out.println("Sueldo de " + empleado1.nombre + ": " + empleado1.calcularSueldo());
        System.out.println("Sueldo de " + empleado2.nombre + ": " + empleado2.calcularSueldo());
    }
}
    
}
/*Ejercicio 1 (básico-intermedio). Sobreescribir calcularSueldo() en EmpleadoPorHoras (horas × valor hora)
 y en EmpleadoAsalariado (sueldo básico + bono), cada una con @Override.
  Instanciar un objeto de cada subclase y mostrar, para cada uno, el sueldo calculado.*/