public class TypeException extends Exception {
    @Override
    public String getMessage() {
        return "Type is not supported by this application.";
    }
}
