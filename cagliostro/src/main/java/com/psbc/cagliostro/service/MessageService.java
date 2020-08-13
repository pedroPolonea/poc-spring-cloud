package com.psbc.cagliostro.service;

import com.psbc.cagliostro.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageService {

    @Autowired
    private Environment environment;

    public MessageDTO getMessage(){
        log.info("getMessage");
        return new MessageDTO(
                "Mensagem Cagliostro",
                Integer.parseInt(environment.getProperty("local.server.port"))
        );
    }

    public MessageDTO getMessageFallBack(){
        log.info("getMessage");
        return new MessageDTO(
                "Mensagem Cagliostro fallback",
                Integer.parseInt(environment.getProperty("local.server.port"))
        );
    }
}
