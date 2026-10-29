public class listadecaracter {

  private class nodo {
    char dato;
    nodo siguiente;

    nodo(char dato) {
      this.dato = dato;
      this.siguiente = null;
    }
  }
  private nodo inicio;
  private nodo fin;
  private int cantidad;

    public void insertarInicio(char valor) {
    nodo nuevoNodo = new nodo(valor);
    nuevoNodo.siguiente = inicio;
    inicio = nuevoNodo;
    if (fin == null) {
      fin = nuevoNodo;
    }
    cantidad++;
  }
  
  public void insertarFinal(char valor) {
    nodo nuevoNodo = new nodo(valor);
    if (fin == null) {
      fin = nuevoNodo;
      inicio = nuevoNodo;
    } else {
      fin.siguiente = nuevoNodo;
      fin = nuevoNodo;
    }
    cantidad++;
  }
  public void recorrer() {
    nodo actual = inicio;
    while (actual != null) {
      System.out.print(actual.dato + " ");
      actual = actual.siguiente;
    }
    System.out.println();
  }
    
}
