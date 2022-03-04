import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_GET_Validate_JSON_RESPONSE 
{
	@Test
	void gooogleMapTest() {
		
		//Specify the base URI
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		//Request Object
		RequestSpecification hhtpRequest = RestAssured.given();
		
		//Response object
		Response response = hhtpRequest.request(Method.GET,"/2");
		
		//Printing response body in console
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: "+ responseBody);
		
		Assert.assertEquals(responseBody.contains("Janet"), true);
		
		
		}
}
