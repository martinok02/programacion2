public class cajero {
    private nodo cabeza;
    private int cantidad;

    private class nodo {
        int dato;
        nodo siguiente;

        nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void insertarInicio(int valor) {
        nodo nuevoNodo = new nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        cantidad++;
    }
    public void insertarFinal(int valor) {
        nodo nuevoNodo = new nodo(valor);
        if (cabeza == null) {
            cabeza= nuevoNodo;
        } else {
            nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        cantidad++;
    }

    
        public int atenderCliente() {
        if (cabeza == null) {
            System.out.println("No hay clientes en la fila.");
            return -1;
        }
        int dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        cantidad--;
        return dato;
    }
    public int primero() {
        if (cabeza == null) {
            System.out.println("No hay clientes en la fila.");
            return -1;
        }
        return cabeza.dato;
    }
    public int tamanio() {
        return cantidad;
    }
    public void recorrer() {
        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}