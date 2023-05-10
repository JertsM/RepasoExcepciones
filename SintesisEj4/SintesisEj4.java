package SintesisEj4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SintesisEj4 {
    public static void main(String[] args) {
        boolean datosValidos = true;
        try {
            try {
                imprimirCaracter();
            } catch (InputMismatchException ex) {
                throw new Excepcion_Input("ERROR AL INTRODUCIR LOS DATOS: FORMATO INCORRECTO");
            }
        }catch(Exception_String ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void imprimirCaracter() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca la cadena de texto a almacenar: ");
            String cad = sc.next();
            System.out.println("Introduzca la posición donde desea almacenarlo: ");
            int pos = sc.nextInt();

            if(pos > 0 || pos > cad.length() - 1){
                throw new Excepcion_Input("ERROR POSICIÓN INCORRECTA " + pos + " en la cadena: " + cad);
            }
        System.out.println("El carácter seleccionado es: " + cad.charAt(pos));
        }
    }
