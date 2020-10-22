import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class DeleteStation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI=payLoad.baseURI();
		given().header("Content-Type","application/json").header("APPID","454a7e2b224641163768836ff26025e0")
		.when().delete("/stations/{:id}").then().log().all().assertThat().statusCode(204);
	}

}
