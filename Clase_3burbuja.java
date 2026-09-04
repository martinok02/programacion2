import java.util.Arrays;

public class Clase_3burbuja {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 9, 2, 1, 6, 0, 7};

        // Algoritmo de Ordenamiento Burbuja con seguimiento por cada pasada
        ordenarBurbuja(numeros);

        System.out.println("Resultado final: " + Arrays.toString(numeros));
    }

    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            // Muestra únicamente el estado del arreglo al finalizar cada pasada
            System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(arr));

            if (!huboIntercambio) {
                break;
            }
        }
    }
}
