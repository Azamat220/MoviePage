package dota.pos5.movies.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg) {
        super(msg);
    }

    public NotFoundException(String msg, Integer id) {
        super(msg);
    }
}
