package com.infiniteskills.mvc.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.infiniteskills.mvc.data.entities.Resource;
import com.infiniteskills.mvc.data.services.ResourceService;

public class ResourceConverter implements Converter<String, Resource> {

	@Autowired
	private ResourceService service;
	
	@Override
	public Resource convert(String resourceId) {
		return service.find(new Long(resourceId));
	}

}
