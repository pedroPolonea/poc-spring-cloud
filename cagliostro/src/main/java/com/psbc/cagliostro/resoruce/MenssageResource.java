package com.psbc.cagliostro.resoruce;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.psbc.cagliostro.dto.MessageDTO;
import com.psbc.cagliostro.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MenssageResource {

    @Autowired
    private MessageService messageService;

    @HystrixCommand(fallbackMethod = "fallBackGetMessage")
    @GetMapping("/messages")
    public MessageDTO getMessageResource(){
        log.info("getMessageResource");
        return  messageService.getMessage();
    }

    public MessageDTO fallBackGetMessage(){
        return messageService.getMessageFallBack();
    }
}
