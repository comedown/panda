package com.panda.service;

import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@ComponentScan(basePackages = {"com.panda.service.*"})
@MapperScan("com.panda.dao.*")
public class JunitServiceConfig {
}
