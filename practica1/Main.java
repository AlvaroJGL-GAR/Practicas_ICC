import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("Opciones de la calculadora:");
        System.out.println("1. Suma");
        System.out.println("2. Multiplicación");
        System.out.println("3. División");
        System.out.println("4. Unir cadenas de texto");
        System.out.println("Teclea el número de operación que deseas realizar: ");


        if (scanner.hasNextInt()) {
            int numeroIngresado = scanner.nextInt();
            scanner.nextLine();

            if (numeroIngresado >= 1 && numeroIngresado <= 4) {
                if (numeroIngresado == 4) {
                    System.out.println("Ingresa la primer cadena: ");
                    String primerCadena = scanner.nextLine();
                    System.out.println("Ingresa la segunda cadena:");
                    String segundaCadena = scanner.nextLine();
                    System.out.println("Unión de las cadenas:" + primerCadena + " " + segundaCadena);
                } else {
                    System.out.println("Ingresa el primer número:");
                    if (scanner.hasNextDouble()) {
                        double primerNumero = scanner.nextDouble();
                        System.out.println("Ingresa el segundo número:");
                        if (scanner.hasNextDouble()) {
                            double segundoNumero = scanner.nextDouble();

                            if (numeroIngresado == 1) {
                                System.out.println("Suma de los números:" + (primerNumero + segundoNumero));
                            } else if (numeroIngresado == 2) {
                                System.out.println("Multiplicación de los números:" + (primerNumero * segundoNumero));
                            } else if (numeroIngresado == 3) {
                                if (segundoNumero != 0) {
                                    System.out.println("División de los números:" + (primerNumero / segundoNumero));
                                } else {
                                    System.out.println("No se puede dividir entre 0.");
                                }
                            }
                        } else {
                            System.out.println("El segundo número no es valido");
                        }
                    } else {
                        System.out.println("El primer número no es valido.");
                    }
                }
            } else {
                System.out.println("Opción no valida.");
            }
        } else {
            System.out.println("Debe ingresar un número entero");
        }
        scanner.close();
    }
}
