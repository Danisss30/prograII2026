import java.util.Scanner;

public class DesafiosLogicos {

    public static void main(String[] args) {

        // Se crea el Scanner para poder ingresar datos
        Scanner entrada = new Scanner(System.in);

        // Variable para guardar la opción del menú
        int opcion;

        // Datos del estudiante
        System.out.println("Daniela Nohemy Divas Carrillo");
        System.out.println("Carné: 9941 23 4568");
        System.out.println("Semana 3 — Condiciones y ciclos");
        System.out.println();

        // El menú se repite hasta seleccionar la opción 6
        do {

            // Mostrar las opciones del menú
            System.out.println("========= DESAFÍOS LÓGICOS =========");
            System.out.println();
            System.out.println("1. Generar una secuencia");
            System.out.println("2. Realizar un conteo regresivo");
            System.out.println("3. Analizar números");
            System.out.println("4. Dibujar una pirámide");
            System.out.println("5. Validar palabra secreta");
            System.out.println("6. Salir");
            System.out.println();

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            // Se utiliza switch para elegir la opción
            switch (opcion) {

                case 1:

                    // Opción 1: Generar una secuencia
                    int inicial;
                    int finalNumero;
                    int incremento;

                    System.out.print("Número inicial: ");
                    inicial = entrada.nextInt();

                    System.out.print("Número final: ");
                    finalNumero = entrada.nextInt();

                    System.out.print("Incremento: ");
                    incremento = entrada.nextInt();

                    // Se validan los datos ingresados
                    if (incremento <= 0) {

                        System.out.println("El incremento debe ser mayor que cero.");

                    } else if (finalNumero <= inicial) {

                        System.out.println("El número final debe ser mayor que el inicial.");

                    } else {

                        System.out.println("Secuencia:");

                        // Se utiliza for para generar la secuencia
                        for (int i = inicial; i <= finalNumero; i = i + incremento) {
                            System.out.print(i + " ");
                        }

                        System.out.println();
                    }

                    break;


                case 2:

                    // Opción 2: Conteo regresivo
                    int numero;

                    System.out.print("Ingrese el número inicial: ");
                    numero = entrada.nextInt();

                    // Se revisa que el número esté entre 10 y 50
                    while (numero < 10 || numero > 50) {

                        System.out.println("Número incorrecto. Debe estar entre 10 y 50.");
                        System.out.print("Ingrese nuevamente el número: ");
                        numero = entrada.nextInt();
                    }

                    // Se realiza el conteo hasta llegar a cero
                    while (numero >= 0) {

                        System.out.print(numero + " ");
                        numero--;
                    }

                    System.out.println();
                    System.out.println("¡Despegue!");

                    break;


                case 3:

                    // Opción 3: Analizar números
                    int num;

                    // Variables para guardar los resultados
                    int positivos = 0;
                    int negativos = 0;
                    int suma = 0;
                    int ignorados = 0;

                    // Se siguen pidiendo números hasta ingresar 0
                    while (true) {

                        System.out.print("Ingrese un número: ");
                        num = entrada.nextInt();

                        // Si se ingresa 0 se termina el ciclo
                        if (num == 0) {
                            break;
                        }

                        // Se revisa si el número es múltiplo de 5
                        if (num % 5 == 0) {

                            System.out.println("El número " + num + " fue ignorado.");
                            ignorados++;

                            // continue pasa al siguiente número
                            continue;
                        }

                        // Se cuentan los números positivos y negativos
                        if (num > 0) {

                            positivos++;

                        } else if (num < 0) {

                            negativos++;

                        } else {

                            System.out.println("Número no válido.");
                        }

                        // Se suman los números que no fueron ignorados
                        suma = suma + num;
                    }

                    // Mostrar los resultados
                    System.out.println();
                    System.out.println("Positivos: " + positivos);
                    System.out.println("Negativos: " + negativos);
                    System.out.println("Suma válida: " + suma);
                    System.out.println("Números ignorados: " + ignorados);

                    break;


                case 4:

                    // Opción 4: Dibujar una pirámide
                    int altura;

                    System.out.print("Ingrese la altura: ");
                    altura = entrada.nextInt();

                    // Se valida que la altura esté entre 3 y 10
                    if (altura < 3 || altura > 10) {

                        System.out.println("La altura debe estar entre 3 y 10.");

                    } else {

                        // Ciclo para cada fila de la pirámide
                        for (int fila = 1; fila <= altura; fila++) {

                            // Ciclo para colocar los espacios
                            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                                System.out.print(" ");
                            }

                            // Ciclo para colocar los asteriscos
                            for (int asterisco = 1; asterisco <= (2 * fila - 1); asterisco++) {
                                System.out.print("*");
                            }

                            // Pasar a la siguiente línea
                            System.out.println();
                        }
                    }

                    break;


                case 5:

                    // Opción 5: Validar palabra secreta

                    // Se limpia el Enter que quedó después de nextInt()
                    entrada.nextLine();

                    String palabra;

                    // El ciclo se ejecuta al menos una vez
                    do {

                        System.out.print("Ingrese la palabra secreta: ");
                        palabra = entrada.nextLine();

                        // Se quitan los espacios del inicio y del final
                        palabra = palabra.trim();

                        // Se compara la palabra sin importar mayúsculas o minúsculas
                        if (palabra.equalsIgnoreCase("Guatemala")) {

                            System.out.println("Palabra correcta.");

                        } else {

                            System.out.println("Palabra incorrecta. Intente nuevamente.");
                        }

                    } while (!palabra.equalsIgnoreCase("Guatemala"));

                    break;


                case 6:

                    // Opción 6: Salir del programa
                    System.out.println("Programa finalizado correctamente.");

                    break;


                default:

                    // Mensaje cuando se ingresa una opción que no existe
                    System.out.println("Opción incorrecta. Seleccione una opción del 1 al 6.");

                    break;
            }

            System.out.println();

            // El menú continúa mientras la opción no sea 6
        } while (opcion != 6);

        // Se cierra el Scanner
        entrada.close();
    }
}