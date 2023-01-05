/**
 * Srilatha
 */
package ApiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * @author WalkingTree
 *
 */
public class LoginpageApitesting {

	@Test
	
	public void Test01_Get()
	{
		Response response=RestAssured.get("http://115.247.13.130:5555/api/DomainAuthentication/GetActiveDomainDetails");
		System.out.println("The status code ->" +response.getStatusCode());
		System.out.println("The response timing of an API ->" +response.getTime());
		System.out.println("It gets the body as a string format-> "+response.asString());
		System.out.println("Retuns the response body ->"+response.body());
	}
	
	

	
	}

