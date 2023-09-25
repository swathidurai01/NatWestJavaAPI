package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class BDD { 

    private Response response;

    @Given("the base URI is {string}")
    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }

    @When("I send a GET request to {string}")
    public void sendGETRequest(String object) {
        response = RestAssured.given().when().get("/objects");
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code is not as expected");
    }

    @Then("the response content type should be {string}")
    public void verifyContentType(String expectedContentType) {
        String actualContentType = response.getHeader("Content-Type");
        Assert.assertEquals(actualContentType, expectedContentType, "Content-Type is not as expected");
    }

    @Then("the name in the response should be {string}")
    public void verifyName(String expectedName) {
        String actualName = response.jsonPath().getString("name[0]");
        Assert.assertEquals(actualName, expectedName, "Name is not as expected");
    }

    @Then("the color in the response should be {string}")
    public void verifyColor(String expectedColor) {
        String actualColor = response.jsonPath().getString("data[0].color");
        Assert.assertEquals(actualColor, expectedColor, "Color is not as expected");
    }

    @Then("the capacity in the response should be {string}")
    public void verifyCapacity(String expectedCapacity) {
        String actualCapacity = response.jsonPath().getString("data[0].capacity");
        Assert.assertEquals(actualCapacity, expectedCapacity, "Capacity is not as expected");
    }
}



