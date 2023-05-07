package userOperationsPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserOperationsResponsePOJO {


@JsonProperty("code")
private Integer code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("message")
    private String message;

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public UserOperationsResponsePOJO setCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public UserOperationsResponsePOJO setType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public UserOperationsResponsePOJO setMessage(String message) {
        this.message = message;
        return this;
    }

}
