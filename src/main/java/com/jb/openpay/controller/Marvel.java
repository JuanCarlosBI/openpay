package com.jb.openpay.controller;


import com.jb.openpay.bean.Respuesta;
import com.jb.openpay.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
@Controller
public class Marvel {
    public Respuesta getAllCharacters() {
        RestTemplate restTemplate = new RestTemplate();
        String url = Constants.BASE_URL + "?ts="+Constants.CODIGO+"&apikey="+Constants.API_KEY_PUBLIC+"&hash="+Constants.HASH;
        return  restTemplate.getForObject(url, Respuesta.class);
    }

    public Respuesta getCharacterById(Long characterId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = Constants.BASE_URL +"/"+characterId+ "?ts="+Constants.CODIGO+"&apikey="+Constants.API_KEY_PUBLIC+"&hash="+Constants.HASH;
        return restTemplate.getForObject(url, Respuesta.class);
    }

}
