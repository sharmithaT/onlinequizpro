package com.onlinequiz.pro.validators;

import com.onlinequiz.pro.models.Register;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

        Register register=(Register)o;

        if(register.getFirstName()==null||register.getFirstName()=="")
        {
            errors.rejectValue("firstname","register.firstName","First Name cannot be empty");
        }

        if(register.getLastName()==null||register.getLastName()=="")
        {
            errors.rejectValue("lastname","register.lastName","Lastname cannot be empty");
        }

        if(register.getEmail()==null||register.getEmail()=="")
        {
            errors.rejectValue("email","register.email","email cannot be empty");
        }

    }
}
