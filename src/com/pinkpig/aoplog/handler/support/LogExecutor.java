package com.pinkpig.aoplog.handler.support;

import com.pinkpig.aoplog.annotation.LogLevel;
import org.springframework.stereotype.Component;
import org.slf4j.*;


@Component
public class LogExecutor {
    public void logNormal(Logger logger, LogLevel logLevel, String logContent) {
        switch (logLevel) {
            case INFO:
                if (logger.isInfoEnabled()) {
                    logger.info(logContent);
                }
                break;
            case DEBUG:
                if (logger.isInfoEnabled()) {
                    logger.debug(logContent);
                }
                break;
            case WARN:
                if (logger.isInfoEnabled()) {
                    logger.warn(logContent);
                }
                break;
            case NONE:
                break;
            default:
                throw new UnsupportedLogLevelException(logLevel);
        }
    }


    public void logException(Logger logger, LogLevel logLevel, String logContet, Throwable ex) {
        switch (logLevel) {
            case WARN:
                if (logger.isWarnEnabled()) {
                    logger.warn(logContet, ex);
                }
                break;
            case ERROR:
                if (logger.isWarnEnabled()) {
                    logger.error(logContet, ex);
                }
                break;
            case NONE:
                break;
            default:
                throw new UnsupportedLogLevelException(logLevel);
        }
    }
}
