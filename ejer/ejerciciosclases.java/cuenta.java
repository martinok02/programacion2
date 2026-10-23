public class cuenta {
    string titular;
    double cantidad;
    
    getTitular() {
        return titular;
    }
    getCantidad() {
        return cantidad;
    }
    public cuenta(string titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    setTitular(string titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío.");
        }
        this.titular = titular;
    }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        } else {
            this.cantidad = cantidad;
        } 
    
    }
    public static void main(string[] args) {
        cuenta cuenta = new cuenta("Juan Pérez", 1000.0);
        System.out.println("Titular: " + cuenta.getTitular() + ", Cantidad: $" + cuenta.getCantidad());

        try {
            System.out.println("Intentando asignar titular vacío...");
            cuenta.setTitular("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Intentando asignar cantidad negativa...");
            cuenta.setCantidad(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nEstado de la cuenta tras intentos inválidos:");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Cantidad: $" + cuenta.getCantidad());
    }
    
}
