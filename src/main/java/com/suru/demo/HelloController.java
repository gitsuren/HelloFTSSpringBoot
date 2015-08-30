package com.suru.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

import com.suru.featuretoggle.service.FeatureService;
import com.suru.featuretoggle.service.FeaturesByIDRepository;
import com.suru.featuretoggle.service.cache.GuavaCacheStrategy;

@RestController

public class HelloController {

	@Autowired
	private FeatureService featureService;

	@RequestMapping("/hello")
	public String hello(@RequestParam("name") String name) {

		if (featureService.hasAccess(name, "TEST_FEATURE")) {
			return "Hola!!! - U have access to this feature ";
		} else {
			return ":( - U do not have access";
		}
	}

}
