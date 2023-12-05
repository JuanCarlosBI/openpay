package com.jb.openpay.bean;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Jacksonized
public class Results{
    private int id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private List<Urls> urls;
    private Thumbnail thumbnail;
    private Comics comics;
    private Stories stories;
    private  Events events;
    private Series series;

}
