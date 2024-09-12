package ym.tmp.com.server.spring_boot_local.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.MODULE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidateAnnotation {
    String value() default "";
}
