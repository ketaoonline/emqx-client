package com.gitee.demo.sub;

import com.gitee.demo.utils.HexConvertUtil;
import com.gitee.mqtt.annotation.Topic;
import com.gitee.mqtt.common.SuperConsumer;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * TODO
 *
 * @author jie
 * @date 2021/5/24 19:52
 */
@Slf4j
@Topic(topic = "device/01/up")
public class Sub01 extends SuperConsumer<String> {
    @Override
    protected void msgHandler(String topic, String entity) {
        log.info("收到设备的数据： {}", entity);
    }

    @Override
    public String decoder(MqttMessage msg) {
        return HexConvertUtil.BinaryToHexString(msg.getPayload());
    }
}
