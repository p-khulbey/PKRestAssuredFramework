package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import static api.Route.BASE_PATH;

public class SpecBuilder {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    public static RequestSpecification getRequestSpec() {
       return new RequestSpecBuilder().
                setBaseUri("https://petstore.swagger.io").
                setBasePath(BASE_PATH).
                setContentType(ContentType.JSON).log(LogDetail.ALL).build();
    }
        public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                log(LogDetail.ALL).build();
    }



}
