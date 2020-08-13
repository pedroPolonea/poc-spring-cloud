package com.psbc.stgermain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageStDTO {

    private String mensage;
    private int port;
    private int portSt;
}
