import java.util.Scanner;
// Creacion y comparacion de Strings
public class practica1 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {

    }

    // Ejercicio 1 length
    public static void longitud() {
        System.out.println("Ingresa el texto para saber su longitud");
        String texto = TECLADO.nextLine();

        int longitud = texto.length();

        System.out.println("Tu texto tiene una longitud de " + longitud + " caracteres" );
    }

    //Ejercicio 2 Empty
    public static void vacio () {
        System.out.println("Vamos a comprobar si tu texto esta vacio o no");
        String texto = TECLADO.nextLine();

        boolean vacio = texto.isEmpty();
        if (vacio) {
            System.out.println("El texto está vacío.");
        } else {
            System.out.println("El texto no está vacío.");
        }
    }


    //Ejercicio 3 Comparacion de Strings
    public static void comparacion() {
        System.out.println("Elije si queres comparar con sensibilidad a mayusculas o no");
        System.out.println("Opcion 1 ------- No compara mayusculas");
        System.out.println("Opcion 2 ------- Si compara mayusculas");
        System.out.println("Ingresa tu eleccion: ");
        int opcion = TECLADO.nextInt();


        while (opcion > 2 || opcion < 1) {
            System.out.println("Opcion no valida, por favor vuelve a introducir la opcion: ");
            System.out.println("Elije si queres comparar con sensibilidad a mayusculas o no");
            System.out.println("Opcion 1 ------- No compara mayusculas");
            System.out.println("Opcion 2 ------- Si compara mayusculas");
            System.out.println("Ingresa tu eleccion: ");
            opcion = TECLADO.nextInt();
        }

        TECLADO.nextLine();
        System.out.println("Ingresa el texto: ");
        String texto1 = TECLADO.nextLine();
        System.out.println("Ingresa el texto a comparar: ");
        String texto2 = TECLADO.nextLine();

        if (opcion == 1) {
            System.out.println(texto1.equals(texto2));
        } else if (opcion == 2) {
            System.out.println(texto1.equalsIgnoreCase(texto2));
        }

    }
    //Ejercicio 4 para conocer la posicion de nuestra cadena (empieza desde 0)
    public static void posicion() {
        System.out.println("Ingrese un texto: ");
        String texto = TECLADO.nextLine();
        System.out.println("Ingrese el indicie para conocer la posicion de su letra: ");
        int indice = TECLADO.nextInt();

        int longitud = texto.length();

        while (indice > longitud - 1 || indice < 0) {
            System.out.println("Su índice es mayor a la longitud de su texto o negativo, por favor vuelva a ingresar su índice:");
            indice = TECLADO.nextInt();
        }

        System.out.println(texto.charAt(indice));
    }

    //Ejercicio 5 para separar una porcion de la cadena
    public static void separar() {
        System.out.println("Ingrese un texto: ");
        String texto = TECLADO.nextLine();
        System.out.println("Ingrese el primer indice para arrancar a separar desde ahi: ");
        int indice1 = TECLADO.nextInt();
        System.out.println("Ingrese el segundo indice para terminar la separacion: ");
        int indice2 = TECLADO.nextInt();

        int longitud = texto.length();

        while (indice1 < 0 || indice2 > longitud || indice1 > indice2) { // Añadida validación para el primer índice y para que el segundo sea mayor que el primero
            System.out.println("Índices no válidos. Asegúrate de que el primer índice no sea negativo, el segundo índice no sea mayor que la longitud del texto y el primer índice no sea mayor que el segundo.");
            System.out.println("Ingrese el primer índice para arrancar a separar desde ahí: ");
            indice1 = TECLADO.nextInt();
            System.out.println("Ingrese el segundo índice para terminar la separación: ");
            indice2 = TECLADO.nextInt();
        }
        System.out.println("La subcadena es: " + texto.substring(indice1, indice2));
    }
}
