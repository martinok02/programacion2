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
}