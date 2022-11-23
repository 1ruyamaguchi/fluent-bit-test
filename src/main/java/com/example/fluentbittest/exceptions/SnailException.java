package com.example.fluentbittest.exceptions;

/**
 * snail独自例外クラス
 * 
 */
public class SnailException extends Exception {
    static final long serialVersionUID = 1L;

    public SnailException(String msg) {
        super(msg);
    }
}
