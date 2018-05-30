package com.pinkpig.aoplog.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AutoLog(startLogLevel = LogLevel.NONE, failLogLevel = LogLevel.NONE)
public @interface AutoLogFinish {

    @AliasFor(annotation = AutoLog.class, attribute = "finishLogLevel")
    LogLevel loglevel() default LogLevel.INFO;

    @AliasFor(annotation = AutoLog.class)
    String[] keywords() default {};

    @AliasFor(annotation = AutoLog.class)
    String description() default "";

    @AliasFor("description")
    String value() default "";
}
