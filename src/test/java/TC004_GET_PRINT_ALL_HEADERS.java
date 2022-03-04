import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_PRINT_ALL_HEADERS {
	
	@Test
	void printAllHeaders() {
		
		RestAssured.baseURI="https://reqres.in/api";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET, "/users/2");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response body: "+ responseBody);
		
		Headers allHeaders = response.headers(); //capture all the headers from the response
		
		for(Header header : allHeaders) {
			
			System.out.print(header.getName()+ ":	");
			System.out.println(header.getValue());
			
		}
		
	}

}
