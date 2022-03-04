import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_Get_Request {
	
	@Test
	void gooogleMapTest() {
		
		//Specify the base URI
		RestAssured.baseURI = "https://reqres.in/api";
		
		//Request Object
		RequestSpecification hhtpRequest = RestAssured.given();
		
		//Response object
		Response response = hhtpRequest.request(Method.GET,"/users/2");
		
		//Printing response body in console
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: "+ responseBody);
		
		
		//status code validation
		int statusCode = response.getStatusCode();	
		System.out.println("Response code:" + statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//capturing details of header from response
		String responseContentType = response.header("Content-Type"); //capture detail of the content type header
		System.out.println("The content type is: "+ responseContentType);
		Assert.assertEquals(responseContentType, "application/json; charset=utf-8");
		
		String responseContentEncoding = response.header("Content-Encoding"); //capture detail of the content encoding header
		System.out.println("The content encoding is: "+ responseContentEncoding);
		Assert.assertEquals(responseContentEncoding, "gzip");

		
	
		}

}
