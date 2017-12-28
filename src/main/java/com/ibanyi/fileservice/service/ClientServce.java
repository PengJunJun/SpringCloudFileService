package com.ibanyi.fileservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bykj003 on 2017/12/26.
 */
@FeignClient(value = "serviceClient")
public interface ClientServce {

    @RequestMapping(value = "/fileClient")
    String getClientString();
}
