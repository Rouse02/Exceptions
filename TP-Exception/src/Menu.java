import java.util.Scanner;

public class Menu {

    public Menu() {}

    public static void gestionarEjercicios(Scanner scanner) {

        int flag, eleccionInciso;
        boolean resultadoValidacion;

        do {
            System.out.println("\n\n1)Ejercicio 1");
            System.out.println("2)Ejercicio 2");
            System.out.println("3)Ejercicio 3");
            System.out.println("4)Ejercicio 4");
            System.out.println("5)Ejercicio 5");
            System.out.println("6)Ejercicio 6");
            System.out.println("7)Ejercicio 7");
            System.out.println("8)Ejercicio 8");
            System.out.println("9)Ejercicio 9");
            System.out.println("\nIngrese el inciso a dirigirse: ");
            eleccionInciso = scanner.nextInt();
            scanner.nextLine();

            switch(eleccionInciso) {

                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    float resultadoDivision = ejercicio1.dividirDosNumeros(scanner);
                break;

                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    String mensajeUsuario = ejercicio2.pedirCadenaTexto(scanner);
                break;

                case 3:
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.mostrarElementoArray(scanner);
                break;

                case 4:
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.mostrarAreaCirculo(scanner);
                break;

                case 5:
                    CuentaBancaria cuentaBancaria = new CuentaBancaria(44145495, 100000.0);
                    resultadoValidacion = cuentaBancaria.retirarDinero(50000.0);
                break;

                case 6:
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    System.out.println("\nIngrese un número entero para calcular el factorial");
                    int nro = scanner.nextInt();

                    try {
                        double factorial = ejercicio6.calcularFactorial(nro);
                        System.out.println("\nEl factorial de "+ nro + " es: " + factorial);
                    }
                    catch(IllegalArgumentException exception) {
                        System.out.println("\nError: " + exception.getMessage());
                    }
                break;

                case 7:
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.pedirFechaNacimiento(scanner);
                break;

                case 8:
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    resultadoValidacion = ejercicio8.calcularImpuestoPorCategoria(scanner);
                break;

                case 9:
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    resultadoValidacion = ejercicio9.validarContraseña(scanner);
                break;

                default:
                    System.out.println("\nOpción no valida\n");
                break;
            }
            System.out.println("\nPulse '0' para continuar o pulse '1' para salir");
            flag = scanner.nextInt();
            scanner.nextLine();

        }while(flag == 0);
    }
}
