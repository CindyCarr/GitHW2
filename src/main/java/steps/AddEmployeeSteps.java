package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonMethods;
import utils.configReader;

public class AddEmployeeSteps extends commonMethods {


    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {

        sendText(login.usernameTextField, configReader.getPropertyValue("username"));
        sendText(login.passwordTextField, configReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button(){
        click(login.loginButton);
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("test passed");
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dash.pimOption);
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {

        click(dash.addEmployeeOption);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added");
    }

    @When("user enter {string} , {string} and {string}")
    public void user_enter_and(String fn, String mn, String ln) {
        sendText(addEmployeePage.firstName, fn);
        sendText(addEmployeePage.middleName, mn);
        sendText(addEmployeePage.lastName, ln);
    }

}