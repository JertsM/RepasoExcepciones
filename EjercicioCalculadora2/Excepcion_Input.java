package EjercicioCalculadora2;

import java.util.InputMismatchException;

public class Excepcion_Input extends InputMismatchException {
    public Excepcion_Input(){
    }
    public Excepcion_Input(String inp){
        super(inp);
        System.out.println("ERROR DE FORMATO");
    }
}
