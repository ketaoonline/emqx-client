package com.gitee.mqtt.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jie
 */
public class ThreadUtils {
    /**
     * 线程池
     */
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
}
