package com.gitee.demo.controller;

import com.gitee.demo.utils.HexConvertUtil;
import com.gitee.mqtt.utils.PubMessageUtils;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author jie
 * @date 2021/5/24 19:56
 */
@RestController
@RequestMapping("/mqtt")
public class PubController {

    @GetMapping("/pub")
    public String pub(String topic, String hexmessage) throws MqttException {
        boolean pub = PubMessageUtils.pub(topic, HexConvertUtil.hexStringToBytes(hexmessage));
        if (pub) {
            return "ok";
        } else {
            return "error";
        }
    }
}
