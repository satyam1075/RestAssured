import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_Post_Request {

	@Test
	void registerCustomerAPI() {
		//Specify the base URI
				RestAssured.baseURI = "https://reqres.in/api";
				
				//Request Object
				RequestSpecification hhtpRequest = RestAssured.given();
				
				//Request pay load sending along with post request
				JSONObject requsetParams =  new JSONObject();
				
//				requsetParams.put("FirstName", "someName");
//				requsetParams.put("LastName", "someSIRName");
//				requsetParams.put("UserName", "someUser");
//				requsetParams.put("Password", "passwordq1");
//				requsetParams.put("Email", "someName@gmail.com");
				
				requsetParams.put("name", "morpheus");
				requsetParams.put("job", "leader");
				
				hhtpRequest.header("Content-Type","application/json");
				
				hhtpRequest.body(requsetParams.toJSONString());
				
				//Response object
				Response response = hhtpRequest.request(Method.POST,"/users");
				
				//Printing response body in console
				String responseBody = response.getBody().asString();
				System.out.println("Response Body: "+ responseBody);
				
				
				//status code validation
				int statusCode = response.getStatusCode();	
				System.out.println("Response code:" + statusCode);
				Assert.assertEquals(statusCode, 201);
				
				String successCode = response.jsonPath().get("name");
				Assert.assertEquals(successCode,"morpheus");
				
				
	}

}
