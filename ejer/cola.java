package ejer;

public class cola {
    private nodo primero;
    private nodo ultimo;
    private int tamaño;

    public cola() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }
    
    public boolean Vacia() {
        return this.tamaño == 0;
    }

    public void Encolar(String valor) {
        nodo nuevoNodo = new nodo(valor);
        if (Vacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        tamaño++;
    }

    public String Desencolar() {
        if (Vacia()) {
            return null;
        }
        String aux = primero.valor;
        primero = primero.siguiente;
        tamaño--;
        if (Vacia()) {
            ultimo = null;
        }
        return aux;
    }

    public void imprimir() {
        nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
