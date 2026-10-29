public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(5);
        lista.insertarFinal(13);
        lista.insertarFinal(12);
        lista.insertarFinal(10);
        lista.insertarFinal(5);

        lista.mostrar();
        System.out.println("Tamaño: " + lista.tamanio());
        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 99: " + lista.buscar(99));
        lista.contar0concurrencias(7);
        lista.eliminartodas(7);
        lista.mostrar();
    
    listaenlazada lista2 = new listaenlazada(); 
    lista2.insertarInicio(7);
    lista2.insertarInicio(3);
    lista2.insertarFinal(7);
    lista2.insertarFinal(7);
    lista2.insertarFinal(5);
    lista2.insertarFinal(7);

    lista2.mostrar();
    System.out.println("ocurrencias de 7: " + lista2.contarocurrencias(7));

    lista2.eliminartodas(7);
    lista2.mostrar();
    System.out.println("ocurrencias de 7: " + lista2.contarocurrencias(7));
    System.out.println("Tamaño: " + lista2.tamanio());
    }
}