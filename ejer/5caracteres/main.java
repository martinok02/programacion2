public class main {
public static void main(String[] args) {
    listadecaracter lista = new listadecaracter();

    lista.insertarInicio('a');
    lista.insertarInicio('b');
    lista.insertarInicio('c');
    lista.insertarInicio('d');


    System.out.print("Lista: ");
    lista.recorrer();   
    // Aquí podrías agregar un método para recorrer y mostrar la lista si lo deseas
  }
}