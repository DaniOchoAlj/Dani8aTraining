package Project.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private final TestContext context;
    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void setUpBrowser() {
        this.context.driver.get("https://www.saucedemo.com/");
    }
    @After
    public void tearDown() {
        context.tearDown();
    }
}
