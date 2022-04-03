package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@RegressionTest")
    public void beforeMobile(){
        System.out.println("Before Running Mobile Hook");
    }

    @After("@RegressionTest")
    public void afterMobile(){
        System.out.println("After running Mobile hook");
    }
}
