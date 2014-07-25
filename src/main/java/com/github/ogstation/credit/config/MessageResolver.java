package com.github.ogstation.credit.config;

public interface MessageResolver
{
    String getMessage(String code);

    String getMessage(String code, Object[] params);
}
