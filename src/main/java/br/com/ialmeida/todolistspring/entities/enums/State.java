package br.com.ialmeida.todolistspring.entities.enums;

public enum State {

    CREATED(1),
    READ_TO_WORK(2),
    READ_FOR_INFO(3),
    IN_PROGRESS(4),
    COMPLETED(5);

    private int code;

    private State(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static State valueOf(int code) {
        for (State state : State.values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        throw new IllegalArgumentException("Invalid State code.");
    }

}
