package spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.model.Merchandise;
import spring.model.Merchandise_Type;
 
public class dropBoxValidator implements Validator {
 
        public boolean supports(Class<?> paramClass) {
            return Merchandise.class.equals(paramClass);
        }
 
        public void validate(Object obj, Errors errors) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "merchandise_type_id", "valid.type");
        }
}
