import java.util.Scanner;

public class practica2 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio10();
    }

    public static void ejercicio1() {
        int[] numero = {14, 15, 16, 19, 20};
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    public static void ejercicio2() {
        int[] numero = {14, 15, 16, 19, 20};
        int max = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            }
        }
        System.out.println("El valor máximo en el array es: " + max);
    }

    public static void ejercicio3() {
        int[] numero = {14, 15, 16, 19, 20};
        int suma = 0;
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        System.out.println("La suma total de los numeros de tu array es: " + suma);
    }

    public static void ejercicio4 () {
        String nombres[] = {"Nadia", "Nina", "Salome", "Angelica"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i].toUpperCase());
        }
    }

    public static void ejercicio5() {
        int [][] multiplicacion = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < multiplicacion.length; i++) {
            for (int j = 0; j < multiplicacion[i].length; j++) {
                System.out.print(multiplicacion[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio6() {
        int [][] multiplicacion = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz transpuesta");
        for (int i = 0; i < multiplicacion.length; i++) {
            for (int j = 0; j < multiplicacion[i].length; j++) {
                System.out.print(multiplicacion[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio7() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Crear una matriz para almacenar la suma
        int[][] matrizSuma = new int[3][3];

        System.out.println("Suma de dos matrices");
        // Recorrer ambas matrices y sumar sus elementos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Imprimir la matriz resultante
        System.out.println("Matriz suma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio8() {
        int numero[] = {10, 20, 30, 40, 50};
        System.out.println("Escribe el valor que quieras buscar en el array: ");
        int buscar = TECLADO.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numero.length; i++) {
            if (buscar == numero[i]) {
                System.out.println("El valor buscado se encuentra el posicion: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El valor " + buscar + " no se encuentra en el array.");
        }

    }

    //Ordenacion de un Array
    public static void ejercicio9() {
        System.out.println("Ingresa el tamaño de tu array: ");
        int tamaño = TECLADO.nextInt();
        int vector[] = new int [tamaño];

        //Le asigno valores aleatorios a mi vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }

        //Imprimo el vector original
        System.out.println("Vector original: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Ordeno el vector usando el algoritmo de la burbuja
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) { //Compara elementos adyacentes
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    int temporal = vector[j]; //Guardo el valor del vector[j] en una variable temporal
                    vector[j] = vector[j + 1]; //Asigno el valor del vector [j + 1] a vector [j]
                    vector[j + 1] = temporal; //Asigno el valor temporal a vector [j + 1]
                }
            }
        }

        //Imprimo el vector ordenado
        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }

    public static void ejercicio10() {
        System.out.println("Ingresa el tamaño de tu array: ");
        int tamaño = TECLADO.nextInt();
        int vector[] = new int [tamaño];
        System.out.println("Ingrese el número de rotaciones: ");
        int rotaciones = TECLADO.nextInt();

        // Asegurarse de que el número de rotaciones no sea mayor que el tamaño del array
        rotaciones = rotaciones % vector.length;

        //Le asigno valores aleatorios a mi vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }

        // Imprimir el array original
        System.out.println("Vector original: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Crear un array temporal para almacenar los elementos que se moverán al final
        int[] temp = new int[rotaciones];

        // Copiar los primeros elementos a la matriz temporal
        for (int i = 0; i < rotaciones; i++) {
            temp[i] = vector[i];
        }

        // Desplazar los elementos restantes a la izquierda
        for (int i = rotaciones; i < vector.length; i++) {
            vector[i - rotaciones] = vector[i];
        }

        // Copiar los elementos del array temporal al final del array original
        for (int i = 0; i < rotaciones; i++) {
            vector[vector.length - rotaciones + i] = temp[i];
        }

        // Imprimir el array rotado
        System.out.println("Vector rotado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}

