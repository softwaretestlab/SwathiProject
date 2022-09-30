package StepDefinations;

import SeleniumCode.AT04_CreatAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD04_CreatAnAccount {

    @Given("user navigates to Create an account screen")
    public void user_navigates_to_create_an_account_screen() throws IOException {
        AT04_CreatAnAccount.NavCreateAcc();
    }

    @Then("Enter valis {string},{string},{string}")
    public void enter_valis(String FirstName, String lastName, String EmailAddress) throws IOException {
        AT04_CreatAnAccount.EnterAccDetials(FirstName,lastName,EmailAddress);
    }


    }
