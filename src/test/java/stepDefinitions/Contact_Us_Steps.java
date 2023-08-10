package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Objects.Base_PO;
import page.Objects.Contact_Us_PO;

public class Contact_Us_Steps extends Base_PO {

    private Contact_Us_PO contact_us_po;
    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contact_us_po.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contact_us_po.setUnique_LastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contact_us_po.setUnique_Email_Address();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contact_us_po.setUnique_Comment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contact_us_po.setSpecific_FirstName(firstName);
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contact_us_po.setSpecific_LastName(lastName);
    }
    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email(String email) {
        contact_us_po.setSpecific_EmailAddress(email);
    }

    @And("I enter a specific comments {string}")
    public void i_enter_a_specific_comments(String comment) {
        contact_us_po.setSpecific_Comments(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contact_us_po.click_On_Submit_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contact_us_po.validate_Successful_Submission_Message_Text();
    }
}