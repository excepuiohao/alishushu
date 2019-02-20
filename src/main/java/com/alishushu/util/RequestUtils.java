package com.alishushu.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {
	
	public static Map<String, Object> getSplitPageParam(HttpServletRequest request) {
			Map<String, Object> map = new HashMap<>();
			Map<String, String[]> parameterMap = request.getParameterMap();
			for(Map.Entry<String, String[]> entry: parameterMap.entrySet()) {
				String key = entry.getKey();
				String[] value = entry.getValue();
				if(value.length == 1) {
					map.put(key, value[0]);
				} else {
					map.put(key, value);
				}
			}
//			page pageSize
			Integer page = map.get("page") == null ? 1 : Integer.parseInt(String.valueOf(map.get("page")));
	        Integer pageSize = map.get("pageSize")==null ? 5 : Integer.parseInt(String.valueOf(map.get("pageSize")));
	        int start = (page - 1) * pageSize + 1;
	        int end = page * pageSize;
	        map.put("start", start);
	        map.put("end", end);
	        map.put("page", page);
	        map.put("pageSize", pageSize);
	        return map;
	}
	
	

}
