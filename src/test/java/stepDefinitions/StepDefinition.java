package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDefinition {

    @Given("^Browser should be invoked$")
    public void browser_should_be_invoked(){
        System.out.println("Browser should be invoked");
    }

    @Given("^User is on landing page$")
    public void user_is_on_landing_page(){
        System.out.println("User is on landing page");
    }

    @When("^User logins with (.+) and (.+)$")
    public void user_logins_with_and(String username, String password){
        System.out.println("username : "+username+"--- password : "+password);
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable dataTable){
        List<List<String>> signUpData = dataTable.asLists();
        String firstName = signUpData.get(0).get(0);
        String lastName = signUpData.get(0).get(1);
        String email = signUpData.get(0).get(2);
        String country = signUpData.get(0).get(3);
        String city = signUpData.get(0).get(4);

        System.out.println("Printing "+firstName+"--"+lastName+"--"+email+"--"+country+"--"+city);
    }

    @When("^User navigates to portal$")
    public void user_navigates_to_portal(){
        System.out.println("User navigates to portal");
    }

    @Then("^User should land on Home page$")
    public void user_should_land_on_Home_page(){
        System.out.println("User should land on Home page");
    }

    @And("^User account should be (.+)$")
    public void user_account_should_be(String status){
        System.out.println("status : "+status);
    }
}
