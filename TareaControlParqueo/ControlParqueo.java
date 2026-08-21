import java.util.Scanner;

public class ControlParqueo {

    public static double obtenerTarifa(int tipoVehiculo) {

        double tarifa = 0;

        switch (tipoVehiculo) {
            case 1:
                tarifa = 5.00;
                break;

            case 2:
                tarifa = 8.00;
                break;

            case 3:
                tarifa = 12.00;
                break;

            default:
                tarifa = 0;
                break;
        }

        return tarifa;
    }

    public static String obtenerNombreVehiculo(int tipoVehiculo) {

        String nombre = "";

        switch (tipoVehiculo) {
            case 1:
                nombre = "Motocicleta";
                break;

            case 2:
                nombre = "Automovil";
                break;

            case 3:
                nombre = "Pickup o camioneta";
                break;

            default:
                nombre = "Desconocido";
                break;
        }

        return nombre;
    }

    public static double calcularDescuento(double subtotal, int horas) {

        double descuento = 0;

        if (horas > 8) {
            descuento = subtotal * 0.15;
        }

        return descuento;
    }

    // Sobrecarga 1
    public static double calcularPago(int horas, double tarifa) {

        return horas * tarifa;
    }

    // Sobrecarga 2
    public static double calcularPago(int horas, double tarifa, double recargo) {

        return (horas * tarifa) + recargo;
    }

    public static void mostrarComprobante(
            String placa,
            String nombreVehiculo,
            int horas,
            double tarifa,
            double subtotal,
            double descuento,
            double recargo,
            double total) {

        System.out.println();
        System.out.println("========== COMPROBANTE ==========");
        System.out.println("Placa: " + placa);
        System.out.println("Tipo: " + nombreVehiculo);
        System.out.println("Horas estacionado: " + horas);
        System.out.printf("Tarifa por hora: Q%.2f%n", tarifa);
        System.out.printf("Subtotal: Q%.2f%n", subtotal);
        System.out.printf("Descuento: Q%.2f%n", descuento);
        System.out.printf("Recargo por ticket perdido: Q%.2f%n", recargo);
        System.out.printf("TOTAL: Q%.2f%n", total);
        System.out.println("=================================");
    }

    public static int validarNumeroPositivo(Scanner entrada, String mensaje) {

        int numero;

        do {
            System.out.print(mensaje);
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Error. El numero debe ser mayor que cero.");
            }

        } while (numero <= 0);

        return numero;
    }

    public static int validarTipoVehiculo(Scanner entrada) {

        int tipo;

        do {
            System.out.println();
            System.out.println("Tipo de vehiculo:");
            System.out.println("1. Motocicleta");
            System.out.println("2. Automovil");
            System.out.println("3. Pickup o camioneta");
            System.out.print("Seleccione una opcion: ");

            tipo = entrada.nextInt();

            if (tipo < 1 || tipo > 3) {
                System.out.println("Error. Debe seleccionar 1, 2 o 3.");
            }

        } while (tipo < 1 || tipo > 3);

        return tipo;
    }

    public static char validarTicket(Scanner entrada) {

        char ticket;

        do {
            System.out.print("Perdio el ticket? (S/N): ");
            ticket = entrada.next().toUpperCase().charAt(0);

            if (ticket != 'S' && ticket != 'N') {
                System.out.println("Error. Escriba solamente S o N.");
            }

        } while (ticket != 'S' && ticket != 'N');

        return ticket;
    }

    // Validar horas para el reto opcional
    public static int validarHora(Scanner entrada, String mensaje) {

        int hora;

        do {
            System.out.print(mensaje);
            hora = entrada.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Error. La hora debe estar entre 0 y 23.");
            }

        } while (hora < 0 || hora > 23);

        return hora;
    }

    // Validar minutos para el reto opcional
    public static int validarMinutos(Scanner entrada, String mensaje) {

        int minutos;

        do {
            System.out.print(mensaje);
            minutos = entrada.nextInt();

            if (minutos < 0 || minutos > 59) {
                System.out.println("Error. Los minutos deben estar entre 0 y 59.");
            }

        } while (minutos < 0 || minutos > 59);

        return minutos;
    }

    // Calcula los minutos que estuvo el vehiculo
    public static int calcularMinutos(int horaEntrada, int minutoEntrada,
                                      int horaSalida, int minutoSalida) {

        int entrada = (horaEntrada * 60) + minutoEntrada;
        int salida = (horaSalida * 60) + minutoSalida;

        if (salida < entrada) {
            salida = salida + (24 * 60);
        }

        return salida - entrada;
    }

    // Convierte los minutos a horas cobradas
    public static int calcularHorasCobradas(int minutos) {

        int horas = minutos / 60;

        if (minutos % 60 != 0) {
            horas++;
        }

        return horas;
    }

    public static void mostrarResumen(
            int motocicletas,
            int automoviles,
            int pickups,
            int ticketsPerdidos,
            double totalRecaudado,
            String placaMayorPago,
            double mayorPago) {

        System.out.println();
        System.out.println("========== RESUMEN DE LA JORNADA ==========");
        System.out.println("Motocicletas: " + motocicletas);
        System.out.println("Automoviles: " + automoviles);
        System.out.println("Pickups o camionetas: " + pickups);
        System.out.println("Tickets perdidos: " + ticketsPerdidos);
        System.out.printf("Total recaudado: Q%.2f%n", totalRecaudado);
        System.out.println("Vehiculo con el pago mas alto: " + placaMayorPago);
        System.out.printf("Pago mas alto: Q%.2f%n", mayorPago);
        System.out.println("===========================================");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre = "Daniela Nohemy DIvas Carrillo";
        String carne = "9941 23 4568";

        System.out.println("======================================");
        System.out.println("       CONTROL DE PARQUEO");
        System.out.println("======================================");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Carnet: " + carne);
        System.out.println();

        int opcionTiempo;

        do {
            System.out.println("Seleccione el tipo de registro:");
            System.out.println("1. Ingresar cantidad de horas");
            System.out.println("2. Usar hora de entrada y salida");
            System.out.print("Opcion: ");

            opcionTiempo = entrada.nextInt();

            if (opcionTiempo < 1 || opcionTiempo > 2) {
                System.out.println("Error. Seleccione 1 o 2.");
            }

        } while (opcionTiempo < 1 || opcionTiempo > 2);

        int cantidadVehiculos =
                validarNumeroPositivo(entrada, "Ingrese la cantidad de vehiculos: ");

        int motocicletas = 0;
        int automoviles = 0;
        int pickups = 0;
        int ticketsPerdidos = 0;

        double totalRecaudado = 0;
        double mayorPago = 0;
        String placaMayorPago = "";

        for (int i = 1; i <= cantidadVehiculos; i++) {

            System.out.println();
            System.out.println("======================================");
            System.out.println("Vehiculo numero " + i);
            System.out.println("======================================");

            System.out.print("Ingrese el numero de placa: ");
            String placa = entrada.next();

            int tipoVehiculo = validarTipoVehiculo(entrada);

            String nombreVehiculo =
                    obtenerNombreVehiculo(tipoVehiculo);

            double tarifa =
                    obtenerTarifa(tipoVehiculo);

            int horas;

            // Variables para el reto opcional
            int minutosTotales = 0;

            if (opcionTiempo == 1) {

                horas = validarNumeroPositivo(
                        entrada,
                        "Ingrese las horas estacionadas: ");

            } else {

                int horaEntrada = validarHora(
                        entrada,
                        "Hora de entrada (0-23): ");

                int minutoEntrada = validarMinutos(
                        entrada,
                        "Minuto de entrada (0-59): ");

                int horaSalida = validarHora(
                        entrada,
                        "Hora de salida (0-23): ");

                int minutoSalida = validarMinutos(
                        entrada,
                        "Minuto de salida (0-59): ");

                minutosTotales = calcularMinutos(
                        horaEntrada,
                        minutoEntrada,
                        horaSalida,
                        minutoSalida);

                horas = calcularHorasCobradas(minutosTotales);

                int horasExactas = minutosTotales / 60;
                int minutosExactos = minutosTotales % 60;

                System.out.println();
                System.out.println("Tiempo estacionado: "
                        + horasExactas + " horas y "
                        + minutosExactos + " minutos");

                System.out.println("Horas cobradas: " + horas);
            }

            char ticket = validarTicket(entrada);

            double subtotal;

            // Uso de la sobrecarga de calcularPago
            if (ticket == 'S') {
                subtotal = calcularPago(horas, tarifa);
            } else {
                subtotal = calcularPago(horas, tarifa);
            }

            double descuento =
                    calcularDescuento(subtotal, horas);

            double recargo = 0;

            if (ticket == 'S') {
                recargo = 50.00;
                ticketsPerdidos++;
            }

            double total;

            if (ticket == 'S') {
                total = calcularPago(horas, tarifa, recargo);
                total = total - descuento;
            } else {
                total = subtotal - descuento;
            }

            // Contadores de tipos de vehiculo
            switch (tipoVehiculo) {

                case 1:
                    motocicletas++;
                    break;

                case 2:
                    automoviles++;
                    break;

                case 3:
                    pickups++;
                    break;
            }

            totalRecaudado = totalRecaudado + total;

            if (total > mayorPago) {
                mayorPago = total;
                placaMayorPago = placa;
            }

            mostrarComprobante(
                    placa,
                    nombreVehiculo,
                    horas,
                    tarifa,
                    subtotal,
                    descuento,
                    recargo,
                    total);
        }

        mostrarResumen(
                motocicletas,
                automoviles,
                pickups,
                ticketsPerdidos,
                totalRecaudado,
                placaMayorPago,
                mayorPago);

        entrada.close();
    }
}