package com.wealthsystemsweb.dto.converter;

import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static <T> T converterObject(Object objectOrigem, Class<T> classDestino) {
        try {
            ModelMapper modelMapper = new ModelMapper();

            T converter = modelMapper.map(objectOrigem, classDestino);

            if (converter == null) {
                throw new RuntimeException("Operaçao de converçao falhou.");
            }
            return converter;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static <T> List<T> converterList(Collection<? extends Object> objectOrigem, Class<T> classDestino) {
        if (objectOrigem == null || classDestino == null) return Collections.EMPTY_LIST;

        return objectOrigem.stream()
                .map(origem -> converterObject(origem, classDestino))
                .collect(Collectors.toList());
    }
}