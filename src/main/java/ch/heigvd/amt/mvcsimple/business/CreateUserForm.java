package ch.heigvd.amt.mvcsimple.business;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class CreateUser {
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final String EMAIL_ADDRESS = "emailAddress";

    private Map<String, String> errors = new HashMap<String, String>();

    public CreateUser(HttpServletRequest request){
        String firstName = request.getParameter(FIRST_NAME);
        String lastName = request.getParameter(LAST_NAME);
        String emailAddress = request.getParameter(EMAIL_ADDRESS);


    }

    private String getFirstName()
}
