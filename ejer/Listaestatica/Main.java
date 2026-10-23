public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(10);

        lista.insertar(5);
        lista.insertar(12);
        lista.insertar(8);
        lista.insertar(20);

        lista.mostrar();

        System.out.println("Buscar 1: " + lista.buscar(2));
        System.out.println("Buscar 4: " + lista.buscar(4));
    }
}