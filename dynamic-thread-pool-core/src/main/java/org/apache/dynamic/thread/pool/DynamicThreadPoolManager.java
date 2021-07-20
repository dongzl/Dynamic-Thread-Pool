package org.apache.dynamic.thread.pool;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2021/7/19 9:43 下午
 */
@AllArgsConstructor
public final class DynamicThreadPoolManager {

    private final DynamicThreadPoolProperties properties;

    private Map<String, DynamicThreadPoolExecutor> threadPoolExecutorMap = new HashMap<>();

    public void createThreadPoolExecutor() {
        properties.getExecutors().forEach(executor -> {
            if (threadPoolExecutorMap.containsKey(executor.getThreadPoolName())) {
                return;
            }
            DynamicThreadPoolExecutor threadPoolExecutor = new DynamicThreadPoolExecutor(
                    executor.getCorePoolSize(),
                    executor.getMaxNumPoolSize(),
                    executor.getKeepAliveTime(),
                    executor.getUnit(),
                    new ResizableCapacityLinkedBlockingQueue<>(),
                    new ThreadFactory() {
                        @Override
                        public Thread newThread(Runnable runnable) {
                            return null;
                        }
                    },
                    new ThreadPoolExecutor.AbortPolicy(),
                    executor.getThreadPoolName()
            );
            threadPoolExecutorMap.put(executor.getThreadPoolName(), threadPoolExecutor);
        });
    }
}
