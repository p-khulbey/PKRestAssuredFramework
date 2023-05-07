package tests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import userOperationsPojo.UserOperationsPOJO;

import java.util.HashMap;
import java.util.Map;

import static applicationApi.UserOperationAPI.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class UserOperation {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
//6053
    public UserOperationsPOJO userOperationBuilder(){
        return new UserOperationsPOJO().
        setId(0).
                setUsername("string").
                setFirstName("string").
                setLastName("string").
                setEmail("string").
                setPhone("string").
                setUserStatus(0);
    }
    @Test(description = "Should be able to create a new user ")
    public void createUser(){
        UserOperationsPOJO requestUserOperationsPOJO=userOperationBuilder();
        response= postData(requestUserOperationsPOJO);
        UserOperationsPOJO responseUserOperationsPOJO=response.as(UserOperationsPOJO.class);
        assertThat(responseUserOperationsPOJO.getType(),equalTo("unknown"));
        assertThat(responseUserOperationsPOJO.getCode(),equalTo(200));
    }

    @Test(description = "Should be able to get the created user data ")
    public void getUserData(){
        response=getData("string");
        assertThat(response.statusCode(),equalTo(200));
    }

    @Test(description = "Should be able to modify username ")
    public void putUserData(){
        UserOperationsPOJO requestUserOperationsPOJO=userOperationBuilder();
        response=putData(requestUserOperationsPOJO,"tomy");
        UserOperationsPOJO responseUserOperationsPOJO= response.as(UserOperationsPOJO.class);
        assertThat(responseUserOperationsPOJO.getType(),equalTo("unknown"));
        assertThat(responseUserOperationsPOJO.getCode(),equalTo(200));
    }

    @Test(description = "Should be able to delete newly created user ")
    public void deleteUserData(){
        response=delete("string");
        assertThat(response.statusCode(),equalTo(200));
        UserOperationsPOJO responseUserOperationsPOJO=response.as(UserOperationsPOJO.class);
        assertThat(responseUserOperationsPOJO.getType(),equalTo("unknown"));
    }

    @Test(description = "Should be able to login using username and password ")
    public void loginUserWithUserNamePassword(){
        Map<String, String>myQueryParams=new HashMap<String,String>();
        myQueryParams.put("username","abc");
        myQueryParams.put("password","abc123");

        response= loginUser(myQueryParams);
               assertThat(response.statusCode(),equalTo(200));
        UserOperationsPOJO responseUserOperationsPOJO=response.as(UserOperationsPOJO.class);
                assertThat(responseUserOperationsPOJO.getType(),equalTo("unknown"));
                assertThat(responseUserOperationsPOJO.getMessage(),containsString("logged in user session:"));
    }

    @Test(description = "Should be able to logout the account ")
    public void logoutUser(){
        Map<String, String>myQueryParams=new HashMap<String,String>();
        myQueryParams.put("username","abc");
        myQueryParams.put("password","abc123");
        response= logoutMyUser(myQueryParams);
        UserOperationsPOJO responseUserOperationsPOJO=response.as(UserOperationsPOJO.class);
        assertThat(responseUserOperationsPOJO.getType(),equalTo("unknown"));
        assertThat(responseUserOperationsPOJO.getMessage(),equalTo("ok"));
    }


//    @Test
//    public void createUserWithNullValues(){
//        String payload="{\n" +
//                "  \"id\": ,\n" +
//                "  \"username\": \"string\",\n" +
//                "  \"firstName\": \"string\",\n" +
//                "  \"lastName\": \"string\",\n" +
//                "  \"email\": \"string\",\n" +
//                "  \"password\": \"string\",\n" +
//                "  \"phone\": \"string\",\n" +
//                "  \"userStatus\": 0\n" +
//                "}";
//        given().spec(requestSpecification).body(payload).
//                when().post("/user").
//                then().spec(responseSpecification).assertThat().statusCode(400).
//                body("code",equalTo(400),
//                        "type",equalTo("unknown"),
//                        "message",equalTo("bad input"));
//    }
//
//    @Test
//    public void createUserWithTypeChange(){
//        String payload="{\n" +
//                "  \"id\": 0,\n" +
//                "  \"username\": \"string\",\n" +
//                "  \"firstName\": \"string\",\n" +
//                "  \"lastName\": \"string\",\n" +
//                "  \"email\": \"string\",\n" +
//                "  \"password\": \"string\",\n" +
//                "  \"phone\": \"string\",\n" +
//                "  \"userStatus\": \"string\"\n" +
//                "}";
//        given().spec(requestSpecification).body(payload).
//                when().post("/user").
//                then().spec(responseSpecification).assertThat().statusCode(500).
//                body("code",equalTo(500),
//                        "type",equalTo("unknown"),
//                        "message",equalTo("something bad happened"));
//    }
//@Test
//public void postUserWithArray(){
//    UserOperationsPOJO requestUserOperationsPOJO=new UserOperationsPOJO();
//    requestUserOperationsPOJO.setId(0);
//    requestUserOperationsPOJO.setUsername("string");
//    requestUserOperationsPOJO.setFirstName("string");
//    requestUserOperationsPOJO.setLastName("string");
//    requestUserOperationsPOJO.setEmail("string");
//    requestUserOperationsPOJO.setPassword("string");
//    requestUserOperationsPOJO.setPhone("string");
//    requestUserOperationsPOJO.setUserStatus(0);
//
//    given().spec(requestSpecification).body(requestUserOperationsPOJO).
//            when().post("/user/createWithArray").
//            then().spec(responseSpecification).assertThat().
//            statusCode(200).
//            body("code",equalTo(200),
//                    "type",equalTo("unknown"),
//                    "message",equalTo("ok"));
//}
}