package exception;

public class IncorrectTaskParameterException extends Exception{

    private final String parametеr;

    public IncorrectTaskParameterException(String parametеr) {
        this.parametеr = parametеr;
    }

    @Override
    public String getMessage() {
        return "Параметр " + parametеr + " задан неверно!";
    }
}
