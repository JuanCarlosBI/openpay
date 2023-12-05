package com.jb.openpay.bean;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Urls{
    private String type;
    private String url;
}
