package com.example.fluentbittest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fluentbittest.logic.SampleLogic;
import com.example.fluentbittest.service.SampleService;

import lombok.extern.slf4j.Slf4j;

/**
 * サンプルサービスの実装クラスです
 * 
 */
@Service
@Slf4j
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleLogic sampleLogic;

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String getSampleMessage(String inputMessage) {

        log.info("Start the method getSampleMessage with the input data '" + inputMessage + "'");

        // メッセージの検証
        try {
            sampleLogic.validateMessage(inputMessage);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }

        // 返却用のメッセージ作成
        String outputMessage = "We get the message '" + inputMessage + "'";

        log.info("Successfully make the output message");

        return outputMessage;
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String killApp(String exitCode) {

        log.info("The self-destruct button is pushed");

        if (exitCode.equals("0")) {
            log.warn("System exit with code 0");
        } else if (exitCode.equals("1")) {
            log.error("System exit with code 1");
        } else {
            return "The input '" + exitCode + "' is not valid";
        }

        System.exit(Integer.valueOf(exitCode));
        return null;
    }
}
