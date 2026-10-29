public class listadinamicamain {
    public static void main(String[] args) {
        listadinamica lista = new listadinamica();

        lista.insertarInicio("juan");
        lista.insertarInicio("pedro");
        lista.insertarFinal("ana");
        lista.insertarFinal("nina");

        System.out.print("Lista: ");
        lista.recorrer();

        lista.eliminar("ana");
        System.out.print("Lista después de eliminar 'ana': ");
        lista.recorrer();
    }
}