package com.jb.openpay.bean;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class Comics{
    private int available;
    private int returned;
    private String collectionURI;
    private List<Items> items;
}
