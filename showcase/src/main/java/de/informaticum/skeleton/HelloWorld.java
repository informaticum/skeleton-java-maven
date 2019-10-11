package de.informaticum.skeleton;

/**
 * Simple Hello-World POJO.
 */
public final class HelloWorld {

    private final String message;

    /**
     * Initialises a new instance, using the message {@code Hello World!}.
     */
    public HelloWorld() {
        this("Hello World!");
    }

    /**
     * Initialises a new instance, using the specified message.
     *
     * @param message
     *            the message to use
     */
    public HelloWorld(final String message) {
        this.message = message;
    }

    /**
     * Returns the message.
     *
     * @return the current message
     */
    public final String getMessage() {
        return this.message;
    }

}
