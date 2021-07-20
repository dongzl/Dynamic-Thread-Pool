package org.apache.dynamic.thread.pool;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2021/7/19 9:44 下午
 */
@Setter
@Getter
public final class DynamicThreadPoolProperties {

    /**
     * 线程池配置
     */
    private List<ThreadPoolProperties> executors = new ArrayList<>();
}
