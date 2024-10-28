import java.util.Arrays;
import java.util.Scanner;

public class practica3 {
     final static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        ordenarBurbuja();
    }

    public static void ordenarBurbuja(){
        System.out.println("Introduce la longitud de tu array: ");
        int longitud = TECLADO.nextInt();
        int[] array = new int [longitud]; //Declaramos nuestro array

        // Imprimir array original
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*101);
        }
        System.out.println("Array desordenado: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        System.out.println();
        System.out.println("Array ordenado: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void ordenarSeleccion(){
        int[] array = {64, 25, 12, 22, 11};

        // Ordenar el array usando el algoritmo de selección
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el elemento mínimo con el primer elemento no ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Imprimir array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void ordenarInsercion() {
        System.out.println("Introduce la longitud de tu array: ");
        int longitud = TECLADO.nextInt();
        int[] array = new int [longitud]; //Declaramos nuestro array

        // Imprimir array original
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*101);
        }
        System.out.println("Array desordenado: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        //
        for (int i = 0; i < array.length; i++) {
            int temporal = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temporal) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temporal;
        }

        System.out.println();
        System.out.println("Array ordenado: ");

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void creandoArray() {
        System.out.println("Introduce la longitud de tu array: ");
        int longitud = TECLADO.nextInt();
        int[] array = new int [longitud]; //Declaramos nuestro array

        // Imprimir array original
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*101);
        }
        System.out.println("Array desordenado: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

