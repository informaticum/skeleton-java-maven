package de.informaticum.skeleton;

public final class HelloWorld {

    private final String message;

    public HelloWorld() {
        this("Hello World!");
    }

    public HelloWorld(final String message) {
        this.message = message;
    }

    public final String getMessage() {
        return this.message;
    }

}
