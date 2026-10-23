public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(10);

        lista.insertar(5);
        lista.insertar(12);
        lista.insertar(8);
        lista.insertar(20);

        lista.mostrar();

        System.out.println("Buscar 8: " + lista.buscar(8));
        System.out.println("Buscar 99: " + lista.buscar(99));
    }
}