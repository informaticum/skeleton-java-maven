package de.informaticum.skeleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkeletonMainApp {

    public static final Logger LOG = LoggerFactory.getLogger(SkeletonMainApp.class);

    public static void main(final String[] args) {
        LOG.info("Starting the Skeleton App");
        final HelloWorld hw = new HelloWorld();
        LOG.info("This is the message: {}", hw.getMessage());
        System.out.format("This is the message: %s%n", hw.getMessage());
    }

}
