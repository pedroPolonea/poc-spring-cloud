package com.psbc.stgermain.client;


import com.psbc.stgermain.dto.MessageDTO;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@RibbonClient("cagliostro")
@FeignClient(name = "cagliostro")
public interface CagliostroClient {

    @GetMapping("/messages")
    MessageDTO getMessageResource();
}
