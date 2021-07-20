package org.apache.dynamic.thread.pool;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.TimeUnit;

/**
 * Thread pool Properties.
 */
@Getter
@Setter
public class ThreadPoolProperties {

    /**
     * Thread pool name.
     */
    private String threadPoolName = "DynamicThreadPool";

    /**
     * Core pool size.
     */
    private int corePoolSize = 1;

    /**
     * Max num pool size, default value is available processor num.
     */
    private int maxNumPoolSize = Runtime.getRuntime().availableProcessors();

    /**
     * Queue capacity, default value is Integer.MAX_VALUE.
     */
    private int queueCapacity = Integer.MAX_VALUE;

    /**
     * Queue type,
     */
    private String queueType = "";

    /**
     *
     */
    private boolean fair;

    /**
     * Rejected execution type.
     */
    private String rejectedExecutionType = "";

    /**
     * Keep alive time.
     */
    private long keepAliveTime;

    /**
     * Time unit, default value is TimeUnit.MILLISECONDS.
     */
    private TimeUnit unit = TimeUnit.MILLISECONDS;

    /**
     * Queue capacity threshold, default value is queueCapacity.
     */
    private int queueCapacityThreshold = queueCapacity;
}
