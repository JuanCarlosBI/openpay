package com.jb.openpay.bean;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@lombok.Data
@Builder
@Jacksonized
public class Respuesta{
    private String code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private Data data;
    private String etag;


}
