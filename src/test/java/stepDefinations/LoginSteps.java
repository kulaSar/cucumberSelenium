package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is in loginpage")
    public void user_is_in_loginpage(){
        System.out.println("1st");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password(){
        System.out.println("2nd");
    }

    @And("click on login button")
    public void click_on_login_button(){
        System.out.println("3rd");
    }

    @Then("user should get navigate to the homepage")
    public void user_should_get_navigate_to_the_homepage(){
        System.out.println("4th");
    }
}
