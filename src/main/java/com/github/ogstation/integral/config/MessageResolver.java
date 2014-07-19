package com.github.ogstation.integral.config;

public interface MessageResolver
{
    String getMessage(String code);

    String getMessage(String code, Object[] params);
}
