import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_GET_VALUES_OF_EACH_NODE_IN_JSON {
	
	@Test
	void gooogleMapTest() {
		
		//Specify the base URI
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		//Request Object
		RequestSpecification hhtpRequest = RestAssured.given();
		
		//Response object
		Response response = hhtpRequest.request(Method.GET,"/2");
		
		JsonPath jsonPath = response.jsonPath();
		
		Gson g = new Gson();
		
//		System.out.println(jsonPath.get("id"));
//		
//		System.out.println(jsonPath.get("email"));
//		
//		System.out.println(jsonPath.get("first_name"));
//		
//		System.out.println(jsonPath.get("last_name"));
//		
//		System.out.println(jsonPath.get("avatar"));
//		
//		System.out.println(jsonPath.get("url"));
//		
//		System.out.println(jsonPath.get("url"));
		
		System.out.println(jsonPath.get("data"));
		
		System.out.println(g.toJson(jsonPath.get("data")));
		
		}

}
