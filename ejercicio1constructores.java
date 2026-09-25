public class ejercicio1constructores {
    public static void main(String[] args) {
        // Instanciación de tres objetos Persona distintos usando el constructor parametrizado
        Persona p1 = new Persona("Juan Pérez", 12345678, 25);
        Persona p2 = new Persona("María Gómez", 87654321, 30);
        Persona p3 = new Persona("Carlos López", 11223344, 40);

        // Mostrar los objetos por consola usando su método toString() sobreescrito
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

class Persona {
    // Atributos privados
    private String nombre;
    private int dni;
    private int edad;

    // Constructor parametrizado que inicializa los tres atributos
    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString() sobreescrito para una representación legible
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', dni=" + dni + ", edad=" + edad + "}";
    }
}
