package net.consensys.mahuta.core.exception;

public class NotFoundException extends MahutaException {

    private static final long serialVersionUID = -1577067446504139812L;

    public NotFoundException(String messageFormat, Object... args) {
        this(String.format(messageFormat, args));
    }
    
    public NotFoundException(String message) {
        super(message);
    }

}
