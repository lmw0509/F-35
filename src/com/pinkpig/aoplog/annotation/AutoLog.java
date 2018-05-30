package com.pinkpig.aoplog.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoLog {
    String[] keywords() default {};

    @AliasFor("description")
    String value() default "";

    @AliasFor("value")
    String description() default "";

    LogLevel startLogLevel() default LogLevel.INFO;

    LogLevel finishLogLevel() default LogLevel.INFO;

    LogLevel failLogLevel() default LogLevel.ERROR;
}
