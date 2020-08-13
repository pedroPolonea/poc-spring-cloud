package com.psbc.stgermain.service;

import com.psbc.stgermain.client.CagliostroClient;
import com.psbc.stgermain.dto.MessageDTO;
import com.psbc.stgermain.dto.MessageStDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageService {

    @Autowired
    private Environment environment;

    @Autowired
    private CagliostroClient cagliostroClient;

    public MessageStDTO getMessage(){
        log.info("getMessage");
        MessageDTO messageResource = cagliostroClient.getMessageResource();
        String messageSt = messageResource.getMensage().concat(", St-Germain");

        return new MessageStDTO(
                messageSt,
                messageResource.getPort(),
                Integer.parseInt(environment.getProperty("local.server.port"))
        );
    }
}
