package SalaCinema;

public class ClienteReservadoException extends RuntimeException {
    private String message;

    public ClienteReservadoException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
