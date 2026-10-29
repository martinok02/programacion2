public class ListaEnlazada {
    private class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private int cantidad;

    public void insertarInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        cantidad++;
    }

    public void insertarFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        cantidad++;
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamanio() {
        return cantidad;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void contar0concurrencias(int valor) {
        Nodo actual = cabeza;
        int contador = 0;
        while (actual != null) {
            if (actual.dato == valor) {
                contador++;
            }
            actual = actual.siguiente;
        }
        System.out.println("El valor " + valor + " aparece " + contador + " veces en la lista.");
    }
    /*
 * eliminarTodas recorre la lista una sola vez y cada eliminación se
 * resuelve cambiando un puntero: no se mueve ningún otro elemento.
 *
 * En ListaEstatica (Tema 1), manteniendo los elementos contiguos, cada
 * eliminación obliga a desplazar a la izquierda todos los elementos que
 * están después (como en eliminarEnPosicion). Si el valor aparece k veces,
 * hay que repetir ese desplazamiento k veces, lo que en el peor caso es
 * O(n * k), o sea O(n²) si casi todos los elementos coinciden. Además hay
 * que cuidar los índices: después de eliminar en la posición i, el
 * siguiente elemento pasa a ocupar esa misma posición, así que no se debe
 * avanzar i, o se saltean ocurrencias consecutivas. Se podría compactar en
 * una sola pasada con dos índices, pero igual habría que copiar elementos
 * en el arreglo, algo que la lista enlazada nunca necesita.
 */
    public void eliminartodas(int valor) {
        while (cabeza != null && cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            cantidad--;
        }
        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                actual.siguiente = actual.siguiente.siguiente;
                cantidad--;
            } else {
                actual = actual.siguiente;
            }
        }
    }/*       */
}