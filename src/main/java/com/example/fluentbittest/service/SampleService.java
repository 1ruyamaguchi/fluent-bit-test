package com.example.fluentbittest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * サンプルサービスのインターフェースです。
 * 
 */
@Service
@RestController
@RequestMapping("/sample")
public interface SampleService {

    /**
     * サンプルメッセージを返すメソッドです。
     * 
     * @param inputMessage
     * @return
     */
    @GetMapping(value = "/message")
    String getSampleMessage(String inputMessage);

    /**
     * 自爆ボタンです。
     * 
     */
    @GetMapping(value = "/kill")
    String killApp(String exitCode);
}
