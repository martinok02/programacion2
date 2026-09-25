
public class Persona {
    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona { Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad + " }";
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Pérez", 38123456, 30);
        Persona p2 = new Persona("María Gómez", 41987654, 25);
        Persona p3 = new Persona("Carlos Rodríguez", 32112233, 42);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

```