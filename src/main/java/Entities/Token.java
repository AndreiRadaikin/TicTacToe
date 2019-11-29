package Entities;

public enum Token {
    X("X"),
    O("O"),
    EMPTY(" ");

    Token(String token) {

        this.token = token;
    }

    private final String token;

    @Override
    public String toString() {

        return this.token;
    }
}
