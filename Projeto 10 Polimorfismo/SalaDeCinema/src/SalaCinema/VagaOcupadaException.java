package SalaCinema;

public class VagaOcupadaException extends RuntimeException {
    private String message;

    public VagaOcupadaException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
