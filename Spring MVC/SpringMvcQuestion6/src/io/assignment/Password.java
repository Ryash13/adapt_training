package io.assignment;

import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;  
  
  
@Constraint(validatedBy = PasswordConstraintValidator.class)  
@Target( { ElementType.METHOD, ElementType.FIELD } )  
@Retention(RetentionPolicy.RUNTIME)  


public @interface Password {
	
        public String message() default "Password Must Contains 1 UPPERCASE , 1 LOWERCASE , 1 NUMERIC-VALUE and 1 SPECIAL-CHARACTER"; 
        public Class<?>[] groups() default {};
        public Class<? extends Payload>[] payload() default {};  

}