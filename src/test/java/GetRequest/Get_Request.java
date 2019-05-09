package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Get_Request {

	@Test
	public void GetuserDetails() 
	{
		
		Response resp = RestAssured.get("http://192.168.0.77:8000/api/user");
		int code = resp.getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code,200);
	}
	
	@Test
	public void GetResponseBody() 
	{
		Response resp = RestAssured.get("http://192.168.0.77:8000/api/user");
		String data = resp.asString();
		System.out.println("Response body with data is" +data);
		System.out.println("Response time for Get UserDetails" +resp.getTime());
		
	}
	@Test
	public void GetUser()
	{
		Response resp = RestAssured.get("http://192.168.0.77:8000/api/user");
		RequestSpecification httpRequest = RestAssured.given();
		//Response response = httpRequest.get("/Sagar");
		//ResponseBody interface also has a method called
		// Retrieve the body of the Response
		// ResponseBody body = response.getBody();
		// System.out.println("Response Body is: " + body.asString());
		 
		
	}
}
