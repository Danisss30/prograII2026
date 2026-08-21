import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {
        
// Se crea Scanner para recibir los datos que el usuario escriba en la consola
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int anioNacimiento;
        int anioActual;

        //Se requieren los datos de los estudiantes y se declaran las variables
        System.out.print("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su año de nacimiento: ");
        anioNacimiento = entrada.nextInt();

        System.out.print("Ingrese el año actual: ");
        anioActual = entrada.nextInt();

// Calcula la edad aproximada utilizando los años ingresados
        // No se toma en cuenta el mes ni el día de nacimiento
        
        int edadAproximada = anioActual - anioNacimiento;

        int edadEnMeses = edadAproximada * 12;
        
// Comprueba si la persona tiene 18 años o más
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
