package com.pinkpig.aoplog.annotation;

public enum LogLevel {
    NONE("none"),
    DEBUG("debug"),
    INFO("info"),
    WARN("warn"),
    ERROR("error");

    private String name;

    LogLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
