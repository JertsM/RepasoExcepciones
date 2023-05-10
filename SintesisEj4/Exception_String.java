package SintesisEj4;

public class Exception_String extends StringIndexOutOfBoundsException{
    public Exception_String(String s){
        super(s);
        System.out.println("ERROR EN LA POSICIÓN SELECCIONADA");

    }
}
