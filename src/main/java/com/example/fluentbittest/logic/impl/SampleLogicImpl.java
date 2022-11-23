package com.example.fluentbittest.logic.impl;

import org.springframework.stereotype.Component;

import com.example.fluentbittest.exceptions.SnailException;
import com.example.fluentbittest.logic.SampleLogic;

import lombok.extern.slf4j.Slf4j;

/**
 * サンプルロジックの実装クラスです。
 * 
 */
@Component
@Slf4j
public class SampleLogicImpl implements SampleLogic {

    /**
     * {@inheritDoc}
     * 
     * @throws SnailException
     * 
     */
    @Override
    public void validateMessage(String message) throws SnailException {

        if (message.equals("error")) {
            // メッセージが'error'であれば独自例外を投げる
            throw new SnailException("The message is '" + message + "'");
        } else if (message.equals("warn")) {
            // メッセージが'warn'であれば警告
            log.warn("The message is '" + message + "'");
        }
    }

}
