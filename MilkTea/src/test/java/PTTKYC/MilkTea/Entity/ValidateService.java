package PTTKYC.MilkTea.Entity;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String PHONE_PATTERN = "^\\d{10}$";

    public boolean validateEmail(String email){
        if(email == null || email.trim().length() == 0){
            return false;
        }

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePhone(String phone){
        if(phone == null || phone.trim().length() == 0){
            return false;
        }

        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
