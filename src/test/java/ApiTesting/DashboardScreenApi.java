/**
 * Srilatha
 */
package ApiTesting;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * @author WalkingTree
 *
 */
public class DashboardScreenApi{

	@Test
	public void dashboardouthapi()
	{
		Response respone=get("http://115.247.13.130:5555/Oauth");
		System.out.println(respone.getBody());
		System.out.println(respone.asString());
		System.out.println(respone.contentType());
		System.out.println(respone.statusCode());
		System.err.println(respone.asPrettyString());
		System.out.println(respone.statusLine());
		
	}

@Test
public void invenotryitem()
{
	Response response=get("http://115.247.13.130:5555/api/InventoryItemRequest?active=true");
	
	System.out.println("Get the data --> "+response.asString());
	System.out.println(response.getBody());
	System.out.println(response.asString());
	System.out.println(response.contentType());
	System.out.println(response.statusCode());
	System.err.println(response.asPrettyString());
	System.out.println(response.statusLine());
}





}

