package com.pinkpig.aoplog.handler.support;

import com.pinkpig.aoplog.annotation.LogLevel;

class UnsupportedLogLevelException extends UnsupportedOperationException {
    UnsupportedLogLevelException(LogLevel logLevel) {
        super(String.format("unsupported log level '%s' occurred here.", logLevel.toString()));
    }
}
