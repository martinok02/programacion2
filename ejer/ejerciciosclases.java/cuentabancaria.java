public class cuentabancaria {
    private string titular;
    private double saldo;
    private int numeroCuenta;
    private int depositar

    public cuentabancaria(string titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.depositar = 0;

    }
    public 
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
    Try {
        System.out.println("intentando asignar titular vacio...");
        cuenta.setTitular("");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    try {
        System.out.println("intentando asignar saldo negativo...");
        cuenta.setSaldo(-100.0);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    
    system.out.println("\estado de la cuenta tras intentos invalidos");
    system.out.println("titular" + cuenta.gettitular());
    system.out.println("saldo" + cuenta.getsaldo());
}