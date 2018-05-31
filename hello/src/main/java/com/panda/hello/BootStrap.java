package com.panda.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

@SpringBootApplication
public class BootStrap implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
	public static void main(String[] args) {
		SpringApplication.run(BootStrap.class, args);
	}

	@Override
	public void customize(ConfigurableWebServerFactory factory) {
		// 优先级高于application.properties中的配置
		factory.setPort(8088);
	}
}
