package exceptionshandling;

public class CrudException extends RuntimeException  {

    public CrudException(String message) {
        super(message);
    }
}
