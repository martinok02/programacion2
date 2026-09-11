public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        setTitular(titular);
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters con validaciones y excepciones
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser una cadena vacía.");
        }
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede fijarse en un valor negativo.");
        }
        this.saldo = saldo;
    }

    // Método main para verificar las validaciones
    public static void main(String[] args) {
        System.out.println("--- Creando cuenta válida ---");
        CuentaBancaria cuenta = new CuentaBancaria("Martin", "ES12345", 1000.0);
        System.out.println("Titular: " + cuenta.getTitular() + ", Saldo: " + cuenta.getSaldo());

        System.out.println("\n--- Probando titular vacío ---");
        try {
            cuenta.setTitular("");
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción atrapada correctamente: " + e.getMessage());
        }

        System.out.println("\n--- Probando saldo negativo ---");
        try {
            cuenta.setSaldo(-500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción atrapada correctamente: " + e.getMessage());
        }
    }
}
