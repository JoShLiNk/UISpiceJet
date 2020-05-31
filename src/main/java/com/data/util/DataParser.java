package com.data.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class DataParser {

//metodo regrsa un Objeto en una lista dado un string en json TAREA
	// para no crear objeto static
	// clases y metodos genericos, clases que retornar objectos de cualquier tipo <
	// T >
	// <T>
//parsejason es get aunqe no tenga get

	public static <T> List<T> parseJson(String json, Class<?> clazz) {
		ObjectMapper mapper = new ObjectMapper();// <= Inicializas el objeto
		// mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		try {
			CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);

			List<T> returnList = mapper.readValue(json, listType);
			return returnList;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static <T> String parseObject(Object[] list) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			return mapper.writeValueAsString(list);
		} catch (Exception e) {
			return null;
		}

	}

}