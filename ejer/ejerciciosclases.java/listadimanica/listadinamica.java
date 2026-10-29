public class listadinamica {

    private class nodo {
        String dato;
        nodo siguiente;

        nodo(String dato) {
            this.dato = dato;
        }
    }

    private nodo cabeza;
    private int cantidad;

    public void insertarInicio(String valor) {
        nodo nuevoNodo = new nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        cantidad++;
    }

    public void insertarFinal(String valor) {
        nodo nuevoNodo = new nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        cantidad++;
    }

    public void recorrer() {
        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void eliminar(String valor) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.dato.equals(valor)) {
            cabeza = cabeza.siguiente;
            cantidad--;
            return;
        }
        nodo actual = cabeza;
        while (actual.siguiente != null) {
            System.out.println("el siguiente en la lista es: " + actual.siguiente.dato);
            if (actual.siguiente.dato.equals(valor)) {
                actual.siguiente = actual.siguiente.siguiente;
                cantidad--;
                return;
            }
            actual = actual.siguiente;
        }
    }
}