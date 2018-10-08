package com.softpower.seoro.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringUtil {
	@SuppressWarnings("finally")
	public static String mkJsonResult(List<?> list) {
		String rtnStr = null;
		
		try {
			Map<String, Object> jsonObject = new HashMap<String, Object>();
			ObjectMapper om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
			
			jsonObject.put("status", "success");
			if( list != null ) {
				jsonObject.put("total", list.size());
				jsonObject.put("record", list);
			} else {
				jsonObject.put("total", 0);
				jsonObject.put("record", "");
			}
			
			rtnStr = om.writeValueAsString(jsonObject);
		}
		catch(JsonGenerationException e) {
			e.getMessage();
		}
		catch(JsonMappingException e) {
			e.getMessage();
		}
		catch(IOException e) {
			e.getMessage();
		}
		finally {
			return rtnStr;
		}
	}
	
	@SuppressWarnings("finally")
	public static String mkJsonResult(Object vo) {
		String rtnStr = null;
		
		try {
			Map<String, Object> jsonObject = new HashMap<String, Object>();
			ObjectMapper om = new ObjectMapper();
			rtnStr = om.writeValueAsString(vo);
		}
		catch(JsonGenerationException e) {
			e.getMessage();
		}
		catch(JsonMappingException e) {
			e.getMessage();
		}
		catch(IOException e) {
			e.getMessage();
		}
		finally {
			return rtnStr;
		}
	}
}
