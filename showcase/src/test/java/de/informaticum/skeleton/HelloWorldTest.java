package de.informaticum.skeleton;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class HelloWorldTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testHelloWorldPojo()
    throws Exception {
        final HelloWorld hw = new HelloWorld();
        assertThat(hw).isNotNull();
        assertThat(hw.getMessage()).isEqualTo("Hello World!");
    }

    @Test
    public void testSkeletonMainAppLogOut()
    throws Exception {
        HelloWorldApp.main(new String[0]);
        assertThat(this.systemOutRule.getLog()).contains("Starting the Hello-World App");
    }

    @Test
    public void testSkeletonMainAppSystemOut()
    throws Exception {
        HelloWorldApp.main(new String[0]);
        assertThat(this.systemOutRule.getLog()).contains("This is the message: Hello World!");
    }

}
