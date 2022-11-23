package com.example.fluentbittest.logic;

import org.springframework.stereotype.Component;

import com.example.fluentbittest.exceptions.SnailException;

/**
 * サンプルロジックのインターフェースです。
 * 
 */
@Component
public interface SampleLogic {

    /**
     * メッセージを検証するメソッドです。
     * 
     * @param message
     * @throws SnailException
     */
    public void validateMessage(String message) throws SnailException;
}
