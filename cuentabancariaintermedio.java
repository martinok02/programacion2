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

    // Setters con validaciones
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

    // Métodos de depósito y extracción encapsulados
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        this.saldo += monto;
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a extraer debe ser positivo.");
        }
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para realizar la extracción.");
        }
        this.saldo -= monto;
    }

    // Método main con las pruebas solicitadas (2 válidas y 2 que fallan)
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Martin", "ES12345", 1000.0);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // 1. Operación Válida: Depositar
        try {
            System.out.println("\n--- Intentando depositar 500 ---");
            cuenta.depositar(500.0);
            System.out.println("Depósito exitoso. Nuevo saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Operación Válida: Extraer
        try {
            System.out.println("\n--- Intentando extraer 200 ---");
            cuenta.extraer(200.0);
            System.out.println("Extracción exitosa. Nuevo saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Operación que falla: Depositar un monto negativo o cero
        try {
            System.out.println("\n--- Intentando depositar -50 ---");
            cuenta.depositar(-50.0);
            System.out.println("Depósito exitoso. Nuevo saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }

        // 4. Operación que falla: Extraer más del saldo disponible
        try {
            System.out.println("\n--- Intentando extraer 5000 ---");
            cuenta.extraer(5000.0);
            System.out.println("Extracción exitosa. Nuevo saldo: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }
    }
}
