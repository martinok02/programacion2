import java.time.LocalDate;
import java.time.Period;

public class pruebaPersona {
    public static void main(String[] args) {
        // Crear objetos y establecer datos mediante setters
        Persona p1 = new Persona();
        p1.setNombre("Ana");
        p1.setFechaNacimiento(LocalDate.of(1995, 5, 15));

        Persona p2 = new Persona();
        p2.setNombre("Luis");
        p2.setFechaNacimiento(LocalDate.of(1988, 10, 20));

        // Mostrar información usando getters
        System.out.println("p1: " + p1.getNombre() + ", edad: " + p1.getEdad());
        System.out.println("p2: " + p2.getNombre() + ", edad: " + p2.getEdad());

        // Método saludar que usa la edad calculada
        p1.saludar();
        p2.saludar();

        // Ejemplo de validación: fecha futura provocará excepción
        try {
            p1.setFechaNacimiento(LocalDate.now().plusDays(1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar fecha: " + e.getMessage());
        }

        try {
            int numero = 4/0;
        } catch (IllegalArgumentException e){
            System.out.println("División por cero " + e.getMessage());
        }
    }
}

// Clase Persona (no pública para estar en el mismo archivo)
class Persona {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor por defecto
    public Persona() {
        // Opcional: inicialización
    }

    // Getter y Setter para nombre con validación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    // Getter y Setter para fecha de nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        // Validar que no sea una fecha futura
        if (fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura.");
        }
        this.fechaNacimiento = fechaNacimiento;
        // No guardamos la edad, se calculará cuando se necesite
    }

    // Método que calcula la edad a partir de la fecha de nacimiento
    public int getEdad() {
        if (fechaNacimiento == null) {
            throw new IllegalStateException("La fecha de nacimiento no ha sido establecida.");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método saludar que usa la edad calculada
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + getEdad() + " años.");
    }
}