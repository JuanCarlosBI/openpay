package com.jb.openpay.bean;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Items{
    private String resourceURI;
    private String name;
    private String type;
}
