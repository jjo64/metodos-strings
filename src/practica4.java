import java.util.Arrays;
import java.util.Scanner;

public class practica4 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ingresa la longitud de tu array: ");
        int longitud = TECLADO.nextInt();
        int nashi[] = new int [longitud];

        //Asignando valores random a nuestro array
        for (int i = 0; i < nashi.length; i++) {
            nashi[i] = (int) (Math.random()*101);
        }

        //Ordenar el array usando el algoritmo de seleccion
        for (int i = 0; i < nashi.length - 1; i++) { //Le doy -1 a la longitud porque no me hace falta comprobar el ultimo digito
            int minIndex = i; //Es para ir buscando siguien el orden del contador, al principio no sabes cual es el mas pequeño asi que empezas a buscar desde el primer en adelante y lo guardamos el valor para no olvidarnos de lo que vimos
            for (int j = i + 1; j < nashi.length; j++) {
                if (nashi[j] < nashi[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento mínimo con el primer elemento no ordenado
            int temp = nashi[minIndex];
            nashi[minIndex] = nashi[i];
            nashi[i] = temp;
        }

        // Imprimir array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(nashi));


    }
}
