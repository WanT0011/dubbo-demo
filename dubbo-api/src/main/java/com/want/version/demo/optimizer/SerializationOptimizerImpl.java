package com.want.version.demo.optimizer;

import com.want.version.demo.DTO.DemoDTO;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author WangZhiJian
 * @since 2021/7/29
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
    /**
     * Get serializable classes
     *
     * @return serializable classes
     */
    @Override
    public Collection<Class<?>> getSerializableClasses() {
        List<Class<?>> classes = new LinkedList<>();
        classes.add(DemoDTO.class);
        return classes;
    }
}
