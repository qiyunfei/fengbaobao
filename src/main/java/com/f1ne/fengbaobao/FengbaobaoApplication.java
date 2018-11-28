package com.f1ne.fengbaobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ServletComponentScan
public class FengbaobaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FengbaobaoApplication.class, args);
	}
}
