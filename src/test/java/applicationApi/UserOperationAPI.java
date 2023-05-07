package applicationApi;

import io.restassured.response.Response;
import userOperationsPojo.UserOperationsPOJO;
import utils.ConfigLoader;

import java.util.HashMap;
import java.util.Map;

import static api.Route.*;
import static api.SpecBuilder.getRequestSpec;
import static api.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserOperationAPI {
    public static Response postData(UserOperationsPOJO requestUserOperationsPOJO){
        return given(getRequestSpec()).body(requestUserOperationsPOJO).
                when().post(USER_PATH).
                then().spec(getResponseSpec()).
                extract().
                response();
    }
    public static Response getData(String userName){
       return given().spec(getRequestSpec()).
                when().get(USER_PATH+ConfigLoader.getInstance().getUserName()).
                then().spec(getResponseSpec()).
                extract().response();
    }
    public static Response putData(UserOperationsPOJO requestUserOperationsPOJO,String userName ){
        return
                given().spec(getRequestSpec()).body(requestUserOperationsPOJO).
                        when().put(USER_PATH+ConfigLoader.getInstance().getUserName()).
                        then().spec(getResponseSpec()).
                        extract().response();
    }

    public static Response delete(String userName){
        return given().spec(getRequestSpec()).
                when().delete(USER_PATH+ ConfigLoader.getInstance().getUserName()).
//                when().delete("/user/"+userName).
                then().spec(getResponseSpec()).assertThat().statusCode(200).
                body("type",equalTo("unknown")).extract().response();
    }

    public static Response loginUser(Map<String, String> myQueryParams){
        return given().spec(getRequestSpec()).
                queryParams(myQueryParams).
                when().get(USER_LOGIN).
                then().spec(getResponseSpec()).extract().response();
    }
    public static Response logoutMyUser(Map<String, String> myQueryParams){
        return given().spec(getRequestSpec()).
                queryParams(myQueryParams).
                when().get(USER_LOGOUT).
                then().spec(getResponseSpec()).extract().response();
    }


}
