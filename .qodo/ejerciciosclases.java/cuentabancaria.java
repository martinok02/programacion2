public class cuentabancaria {
    private string titular;
    private double saldo;
    private int numeroCuenta;

    public cuentabancaria(string titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    public string getTitular() {
        return titular;
        if (titular == null || titular.isEmpty()) {
            return "Titular no especificado";
        }
        else {
            system.out.println("Error: El titular no puede estar vacío.");
            
        }
    }
    public double getSaldo() {
        return saldo;
        if (saldo < 0) {
            return 0.0; // Retorna 0 si el saldo es negativo
        } else {
            return saldo;
        }
    }
    public static void main (string[] args) {
        cuentabancaria cuenta1 = new cuentabancaria("Juan Pérez", 1500.75, 123456);
        cuentabancaria cuenta2 = new cuentabancaria("", -500.00, 654321);

        system.out.println("Titular: " + cuenta1.getTitular() + ", Saldo: $" + cuenta1.getSaldo());
        system.out.println("Titular: " + cuenta2.getTitular() + ", Saldo: $" + cuenta2.getSaldo());
    }
    //intento de titular vacio
    cuenta.settitular("");
    //intento de saldo negativo
    cuenta.getsaldo(-5555.0);
    
    system.out.println("Titular: " + cuenta.getTitular() + ", Saldo: $" + cuenta.getSaldo());



}
