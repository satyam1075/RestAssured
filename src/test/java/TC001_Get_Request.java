import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_Get_Request {

	@Test
	void getWeatherDetails() {
		
		//Specify the base URI
		RestAssured.baseURI = "https://demoqa.com/utilities/wheather/city";
		
		//Request Object
		RequestSpecification hhtpRequest = RestAssured.given();
		
		//Response object
		Response response = hhtpRequest.request(Method.GET,"/Hyderabad");
		
		
		//Printing response body in console
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: "+ responseBody);
		
		
		//status code validation
		int statusCode = response.getStatusCode();	
		System.out.println("Response code:" + statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		//status line validation
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	
		}

}
