package EjercicioCalculadora2;

public class Excepcion_Aritmetica extends ArithmeticException{

    public Excepcion_Aritmetica(){}

    public Excepcion_Aritmetica(String arit){
        super(arit);
        System.out.println("ERROR: No se puede dividir entre 0.");
    }
}
