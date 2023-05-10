package SintesisEj3;

import java.util.Scanner;

public class SintesisEj3 {
    public static void main(String[] args) {
        try {
            pedirAnho();
        } catch (anhosNegativos ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void pedirAnho() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca año: ");
        int anho = sc.nextInt();
        if (anho < 0)
            throw new anhosNegativos("ERROR: La edad introducida no es válida.");
    }
}
