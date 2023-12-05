package com.jb.openpay.bean;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@lombok.Data
@Builder
@Jacksonized
public class Data{
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Results> results;
}
