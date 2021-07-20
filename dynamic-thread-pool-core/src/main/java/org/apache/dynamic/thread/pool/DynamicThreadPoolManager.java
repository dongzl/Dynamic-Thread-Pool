package org.apache.dynamic.thread.pool;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2021/7/19 9:43 下午
 */
@AllArgsConstructor
public class DynamicThreadPoolManager {

    private final DynamicThreadPoolProperties properties;

    private Map<String, DynamicThreadPoolExecutor> threadPoolExecutorMap = new HashMap<>();


}
