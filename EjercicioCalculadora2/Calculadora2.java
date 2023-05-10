package EjercicioCalculadora2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora2 {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        if (num2 == 0)
            System.out.println("Error: No se puede dividir entre 0.");
        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        double resultado = 0;
        boolean datosValidos = true;
        do {
            sc = new Scanner(System.in);
            try{


            try {
                System.out.println("Introduzca el primer número: ");
                num1 = sc.nextInt();
                System.out.println("Introduzca el segundo número: ");
                num2 = sc.nextInt();
                datosValidos = true;
            } catch (InputMismatchException e) {
                throw new Excepcion_Input();
            }
            }catch(Excepcion_Input ex){
                datosValidos = false;
                System.out.println("ERROR");
            }
        } while (!datosValidos);
        System.out.println("Elija la opción que desee realizar: ");
        String opcion = sc.next();
        switch (opcion) {
            case "suma":
                resultado = suma(num1, num2);
                break;
            case "resta":
                resultado = resta(num1, num2);
                break;
            case "multiplicacion":
                resultado = multiplicacion(num1, num2);
                break;
            case "division":
                try {
                    resultado = division(num1, num2);
                } catch (Excepcion_Aritmetica ex) {
                    System.out.println(ex);
                }
                break;
            case "potencia":
                resultado = potencia(num1, num2);
                break;
        }
        System.out.println("El resultado de la operación seleccionada es " + resultado);
    }
}
