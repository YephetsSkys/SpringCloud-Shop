package com.kedacom.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 实习期考核项目
 * com.kedacom.consumer
 * 2018-01-02-19:05
 * 2018科达科技股份有限公司-版权所有
 * Created by suxiongwei on 2018-01-02.
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
