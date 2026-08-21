import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int anioNacimiento;
        int anioActual;

        System.out.print("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su año de nacimiento: ");
        anioNacimiento = entrada.nextInt();

        System.out.print("Ingrese el año actual: ");
        anioActual = entrada.nextInt();


        int edadAproximada = anioActual - anioNacimiento;

        int edadEnMeses = edadAproximada * 12;

        boolean esMayorDeEdad = edadAproximada >= 18;

        System.out.println();
        System.out.println("----- RESULTADO -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad aproximada: " + edadAproximada + " años");
        System.out.println("Edad aproximada en meses: " + edadEnMeses + " meses");
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);

        entrada.close();
    }
}