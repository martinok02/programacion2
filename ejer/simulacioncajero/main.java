public class main {
    public static void main(String[] args) {
        cajero cola = new cajero();
        int atendidos = 0;


        for (int minuto = 1; minuto <= 600; minuto++) {
            if (minuto % 2 == 0) {
                cola.insertarFinal(minuto);
            }
            if (minuto % 4 == 0 && cola.tamanio() > 0) {
                cola.atenderCliente();
                atendidos++;

            }
        }

        int llegada = cola.primero();
        System.out.println("Clientes atendidos en 10 horas: " + atendidos);
        System.out.println("Clientes restantes en la fila: " + cola.tamanio());
        System.out.println("Llegada del primer cliente sin atender: minuto " + llegada
                + " (" + (llegada / 60) + " h " + (llegada % 60) + " min)");
    }
}