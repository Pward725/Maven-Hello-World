package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest
{
    private Greeter greeter=new Greeter();

    @Test
    public void helloWorldTest_happy ()
    {
        assertThat(greeter.sayHello(), containsString("Hello, World!"));
    }
}