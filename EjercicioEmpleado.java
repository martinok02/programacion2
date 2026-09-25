public class EjercicioEmpleado {
    public static void main(String[] args) {
        // Crear arreglo de empleados
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Ana", 105);
        empleados[1] = new Empleado("Luis", 42);
        empleados[2] = new Empleado("Carlos", 78);
        empleados[3] = new Empleado("María", 201);

        // Llamar al método que muestra legajos extremos
        mostrarLegajosExtremos(empleados);
    }

    /**
     * Método que recibe un arreglo de Empleado y muestra el legajo más bajo y más alto.
     * @param empleados arreglo de objetos Empleado
     */
    public static void mostrarLegajosExtremos(Empleado[] empleados) {
        if (empleados == null || empleados.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        // Inicializar con el primer elemento
        int minLegajo = empleados[0].getLegajo();
        int maxLegajo = empleados[0].getLegajo();

        // Recorrer el arreglo desde el segundo elemento
        for (int i = 1; i < empleados.length; i++) {
            int legajoActual = empleados[i].getLegajo();
            if (legajoActual < minLegajo) {
                minLegajo = legajoActual;
            }
            if (legajoActual > maxLegajo) {
                maxLegajo = legajoActual;
            }
        }
        System.out.println("Legajo más bajo: " + minLegajo);
        System.out.println("Legajo más alto: " + maxLegajo);
    }
}

// Clase Empleado (puede estar en el mismo archivo si no es pública)
class Empleado {
    private String nombre;
    private int legajo;

    // Constructor parametrizado
    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    // Getter para legajo (necesario para el cálculo)
    public int getLegajo() {
        return legajo;
    }

    // Getter para nombre (opcional, por si se necesita)
    public String getNombre() {
        return nombre;
    }

    // Método calcularSueldo (por ahora retorna 0)
    public double calcularSueldo() {
        return 0.0;
    }
}