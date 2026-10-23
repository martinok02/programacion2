public class empleado {
    private String nombre;
    private int legajo;

    public empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
public double calcularSueldo() {
        return this.sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    // Método aparte para recorrer el arreglo y mostrar la información
    public static void mostrarNomina(Empleado[] empleados) {
        System.out.println("--- Nómina de Empleados ---");
        for (Empleado e : empleados) {
            System.out.println("Legajo: " + e.getLegajo() + 
                               " | Nombre: " + e.getNombre() + 
                               " | Sueldo: $" + e.calcularSueldo());
        }
    }

    public static void main(String[] args) {
        // Instanciación del arreglo con 4 empleados distintos
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Ana Gómez", 1001, 850000.0);
        empleados[1] = new Empleado("Carlos López", 1002, 920000.0);
        empleados[2] = new Empleado("Lucía Fernández", 1003, 780000.0);
        empleados[3] = new Empleado("Mariano Rossi", 1004, 1100000.0);

        // Llamada al método aparte pasándole el arreglo
        mostrarNomina(empleados);
    }
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
public class Main {
    public static void main(String[] args) {
        // Arreglo declarado como Empleado[], pero cada posición puede contener
        // un objeto de cualquier subclase (EmpleadoPorHoras, EmpleadoAsalariado).
        // Esto es posible gracias al polimorfismo.
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpleadoPorHoras("Juan", 101, 160, 25.0);
        empleados[1] = new EmpleadoAsalariado("Ana", 102, 3000.0, 500.0);
        empleados[2] = new EmpleadoPorHoras("Luis", 103, 140, 30.0);
        empleados[3] = new EmpleadoAsalariado("Marta", 104, 3500.0, 300.0);

        for (Empleado empleado : empleados) {
            // Aunque la referencia declarada es de tipo Empleado, la JVM
            // resuelve qué versión de calcularSueldo() ejecutar en tiempo
            // de ejecución, según el tipo REAL del objeto apuntado por la
            // referencia (no según el tipo de la referencia declarada).
            // Esto se llama binding dinámico (o enlace tardío): la variable
            // "empleado" solo determina qué métodos son visibles en tiempo
            // de compilación, pero cuál implementación se ejecuta lo decide
            // el objeto real en tiempo de ejecución. Como calcularSueldo()
            // fue sobreescrito (@Override) en cada subclase, se ejecuta la
            // fórmula correspondiente a cada una.
            System.out.println("Sueldo de " + empleado.nombre + ": " + empleado.calcularSueldo());
        }
    }
}
}
