package com.gitee.mqtt.entity;

/**
 * 订阅模式
 * @author jie
 */

public enum Pattern {
    /**
     * 普通订阅
     */
    NONE,
    /**
     * 不带群组的共享订阅
     */
    QUEUE,
    /**
     * 带群组的共享订阅
     */
    SHARE;
}
