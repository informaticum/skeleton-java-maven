package de.informaticum.skeleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple Hello-World application.
 */
public class HelloWorldApp {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldApp.class);

    /**
     * Main entry point of the Hello-World application.
     *
     * Will be executed when running the following command:
     *
     * <pre class="brush:bash">
     * java -jar showcase-*.jar
     * </pre>
     *
     * or:
     *
     * <pre class="brush:bash">
     * java -cp showcase-*.jar de.informaticum.skeleton.HelloWorldApp
     * </pre>
     *
     * And it is just that simple:
     *
     * <pre class="brush:java">
     * LOG.info("Starting the Hello-World App");
     * final HelloWorld hw = new HelloWorld();
     * LOG.info("This is the message: {}", hw.getMessage());
     * System.out.format("This is the message: %s%n", hw.getMessage());
     * </pre>
     *
     *
     * @param args
     *            the command line arguments
     */
    public static void main(final String[] args) {
        LOG.info("Starting the Hello-World App");
        final HelloWorld hw = new HelloWorld();
        LOG.info("This is the message: {}", hw.getMessage());
        System.out.format("This is the message: %s%n", hw.getMessage());
    }

}
