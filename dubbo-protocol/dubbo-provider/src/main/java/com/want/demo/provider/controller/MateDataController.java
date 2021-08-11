package com.want.demo.provider.controller;

import com.alibaba.cloud.dubbo.metadata.repository.DubboServiceMetadataRepository;
import com.alibaba.cloud.dubbo.util.JSONUtils;
import org.apache.dubbo.common.URL;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.hutool.core.map.MapUtil.isEmpty;
import static java.util.Collections.unmodifiableMap;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@RestController
public class MateDataController {
    @Autowired
    private ObjectProvider<DubboServiceMetadataRepository> dubboServiceMetadataRepository;

    @Autowired
    private JSONUtils jsonUtils;

    @GetMapping("getAllExportedURLs")
    public Map<String, String> getAllExportedURLs() {
        Map<String, List<URL>> allExportedUrls = getRepository().getAllExportedUrls();
        if (isEmpty(allExportedUrls)) {
            return Collections.emptyMap();
        }

        Map<String, String> result = new HashMap<>(allExportedUrls.size());

        allExportedUrls.forEach((serviceKey, urls) -> {
            result.put(serviceKey, jsonUtils.toJSON(urls) );
        });

        return unmodifiableMap(result);
    }

    private DubboServiceMetadataRepository getRepository() {
        return dubboServiceMetadataRepository.getIfAvailable();
    }
}
