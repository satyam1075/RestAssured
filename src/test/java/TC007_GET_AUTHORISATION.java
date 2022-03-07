import org.testng.Assert;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC007_GET_AUTHORISATION {

	void authorisationTest() {

		// Specify the base URI
		RestAssured.baseURI = "https://reqres.in/api/users";

		// Authentication UPI
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("Something");
		authScheme.setPassword("Password");

		RestAssured.authentication = authScheme;

		// Request Object
		RequestSpecification hhtpRequest = RestAssured.given();

		// Response object
		Response response = hhtpRequest.request(Method.GET, "/2");

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Response code:" + statusCode);
		Assert.assertEquals(statusCode, 200);

		// Printing response body in console
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: " + responseBody);

	}
}
