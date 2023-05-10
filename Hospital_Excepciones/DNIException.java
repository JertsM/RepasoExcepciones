package Hospital_Excepciones;

import java.util.InputMismatchException;

public class DNIException extends InputMismatchException {
    public DNIException(String h){
        super(h);
    }
}
