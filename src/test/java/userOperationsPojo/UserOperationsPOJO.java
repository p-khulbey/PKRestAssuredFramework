package userOperationsPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserOperationsPOJO {

    @JsonProperty("id")
        private int id;
    @JsonProperty("username")
        private String username;
    @JsonProperty("firstName")
        private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("userStatus")
    private int userStatus;




    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public UserOperationsPOJO setId(int id) {
        this.id = id;
        return this;
    }
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }
    @JsonProperty("username")
    public UserOperationsPOJO setUsername(String username) {
        this.username = username;
        return this;
    }
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }
    @JsonProperty("firstName")
    public UserOperationsPOJO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }
    @JsonProperty("lastName")
    public UserOperationsPOJO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }
    @JsonProperty("email")
    public UserOperationsPOJO setEmail(String email) {
        this.email = email;
        return this;
    }
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }
    @JsonProperty("password")
    public UserOperationsPOJO setPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }
    @JsonProperty("phone")
    public UserOperationsPOJO setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    @JsonProperty("userStatus")
    public int getUserStatus() {
        return userStatus;
    }
    @JsonProperty("userStatus")
    public UserOperationsPOJO setUserStatus(int userStatus) {
        this.userStatus = userStatus;
        return this;
    }

//8888888888888888
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
    public UserOperationsPOJO setCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public UserOperationsPOJO setType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public UserOperationsPOJO setMessage(String message) {
        this.message = message;
        return this;
    }

}
