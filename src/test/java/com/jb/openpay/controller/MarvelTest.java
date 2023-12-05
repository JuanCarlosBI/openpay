package com.jb.openpay.controller;

import com.jb.openpay.bean.Respuesta;
import com.jb.openpay.util.Constants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.eq;

class MarvelTest {

    @Test
    void getAllCharacters() {
        RestTemplate restTemplateMock = Mockito.mock(RestTemplate.class);
        Marvel marvel = new Marvel(restTemplateMock);
        Respuesta respuesta = marvel.getAllCharacters();

        Mockito.verify(restTemplateMock).getForObject(
                eq(Constants.BASE_URL + "?ts=" + Constants.CODIGO + "&apikey=" + Constants.API_KEY_PUBLIC + "&hash=" + Constants.HASH),
                eq(Respuesta.class)
        );
    }


    @Test
    void getCharacterById() {
        RestTemplate restTemplateMock = Mockito.mock(RestTemplate.class);
        Marvel marvel = new Marvel(restTemplateMock);
        Long characterId = 123L;
        Respuesta respuesta = marvel.getCharacterById(characterId);

        Mockito.verify(restTemplateMock).getForObject(
                eq(Constants.BASE_URL + "/" + characterId + "?ts=" + Constants.CODIGO + "&apikey=" + Constants.API_KEY_PUBLIC + "&hash=" + Constants.HASH),
                eq(Respuesta.class)
        );
    }
}