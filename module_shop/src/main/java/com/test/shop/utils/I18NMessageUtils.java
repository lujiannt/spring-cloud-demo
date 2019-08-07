package com.test.shop.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class I18NMessageUtils {
    @Autowired
    private MessageSource messageSource;
    private static MessageSource source;

    @PostConstruct
    public void init() {
        source = messageSource;
    }

    /**
     * 获取单个国际化翻译值
     */
    public static String get(String msgKey) {
        try {
            return source.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }

    }
}