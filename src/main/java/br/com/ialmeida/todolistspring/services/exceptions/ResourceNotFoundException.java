package br.com.ialmeida.todolistspring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Task not found. Id: " + id);
    }

}
