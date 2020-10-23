import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {
    Calculator calculator;
    int result;

    @Before
    public void showText() {
        System.out.println("URUCHAMIAM KALKULATOR");
    }

    @Given("I have calculator")
    public void iHaveCalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        result = calculator.addTwoNumbers(arg0, arg1);
    }

    @Then("Result is {int}")
    public void resultIs(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
