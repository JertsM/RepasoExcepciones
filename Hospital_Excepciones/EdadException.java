package Hospital_Excepciones;

public class EdadException extends IllegalArgumentException{

    public EdadException(){}

    public EdadException(String h){
        super(h);
    }
}
