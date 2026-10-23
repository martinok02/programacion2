public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(5);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.mostrar();
        System.out.println("Tamaño: " + lista.tamanio());
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 99: " + lista.buscar(99));
    }
}