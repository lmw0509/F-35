package com.pinkpig.aoplog.handler;

import com.pinkpig.aoplog.handler.support.LogContentResolver;
import com.pinkpig.aoplog.handler.support.LogExecutor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AutoLogAspect {

    private final LogContentResolver logContentResolver;
    private final LogExecutor logExecutor;

    @Autowired
    public AutoLogAspect(LogContentResolver logContentResolver, LogExecutor logExecutor) {
        this.logContentResolver = logContentResolver;
        this.logExecutor = logExecutor;
    }

    @Pointcut(value = "@annotation(com.pinkpig.aoplog.annotation.AutoLog)")
      private void poitcut(){

    }


}
