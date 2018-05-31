package com.young.panda.hello.web.config;

import ch.qos.logback.classic.ViewStatusMessagesServlet;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.young.panda.hello.web.filter.MyFirstFilter;
import com.young.panda.hello.web.filter.MySecondFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.young.panda.hello.controller.*"})
public class ApplicationConfig {

	//		QuoteFieldNames           输出key时是否使用双引号,默认为true
//		UseSingleQuotes           使用单引号而不是双引号,默认为false
//		WriteMapNullValue         是否输出值为null的字段,默认为false
//		WriteEnumUsingToString    Enum输出name()或者original,默认为false
//		UseISO8601DateFormat      Date使用ISO8601格式输出，默认为false
//		WriteNullListAsEmpty      List字段如果为null,输出为[],而非null
//		WriteNullStringAsEmpty    字符类型字段如果为null,输出为”“,而非null
//		WriteNullNumberAsZero     数值字段如果为null,输出为0,而非null
//		WriteNullBooleanAsFalse   Boolean字段如果为null,输出为false,而非null
//		SkipTransientField        如果是true，类中的Get方法对应的Field是transient，序列化时将会被忽略。默认为true
//		SortField                 按字段名称排序后输出。默认为false
//		WriteTabAsSpecial         把\t做转义输出，默认为false     不推荐
//		PrettyFormat              结果是否格式化,默认为false
//		WriteClassName            序列化时写入类型信息，默认为false。反序列化是需用到
//		DisableCircularReferenceDetect    消除对同一对象循环引用的问题，默认为false
//		WriteSlashAsSpecial       对斜杠’/’进行转义
//		BrowserCompatible	将中文都会序列化为\\uXXXX格式，字节数会多一些，但是能兼容IE 6，默认为false
//		WriteDateUseDateFormat	全局修改日期格式,默认为false。JSON.DEFFAULT_DATE_FORMAT = “yyyy-MM-dd”;JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
//		DisableCheckSpecialChar	一个对象的字符串属性中如果有特殊字符如双引号，将会在转成json时带有反斜杠转移符。如果不需要转义，可以使用这个属性。默认为false
//		NotWriteRootClassName	含义
//		BeanToArray	将对象转为array输出
//		WriteNonStringKeyAsString	含义
//		NotWriteDefaultValue	含义
//		BrowserSecure	含义
//		IgnoreNonFieldGetter	含义
//		WriteEnumUsingName	含义

//	/**
//	 * FastJsonHttpMessageConverter
//	 * @return
//	 */
//	@Bean
//	public HttpMessageConverters fastJsonConverter() {
//		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(new SerializerFeature[]{SerializerFeature.PrettyFormat, SerializerFeature.WriteNullListAsEmpty,
//				SerializerFeature.WriteMapNullValue});
//		//日期格式化
//		fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
//		converter.setFastJsonConfig(fastJsonConfig);
//		return new HttpMessageConverters(converter);
//	}

	/**
	 * MappingJackson2HttpMessageConverter
	 *
	 * @return
	 */
	@Bean
	public MappingJackson2HttpMessageConverter messageConverter() {
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
		// mediaType
		List<MediaType> mediaTypes = new ArrayList<>();
		mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		messageConverter.setSupportedMediaTypes(mediaTypes);
		// ObjectMapper
		ObjectMapper objectMapper = new ObjectMapper();
		// 设置null字段不显示
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		messageConverter.setObjectMapper(objectMapper);

		return messageConverter;
	}

//	/**
//	 * InternalResourceViewResolver
//	 * @return
//	 */
//	@Bean
//	@ConditionalOnMissingBean
//	public InternalResourceViewResolver defaultViewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setPrefix("/WEB-INF/views/");  // 前缀
//		viewResolver.setSuffix(".jsp");  // 后缀
//
//		return viewResolver;
//	}

	@Bean
	public FilterRegistrationBean myFirstFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFirstFilter());
		registration.setName("firstFilter");
		registration.addUrlPatterns("/*", "/");
		registration.setOrder(1); // 执行顺序，越小越先执行
		registration.addInitParameter("param1", "value1");
		registration.addInitParameter("param1", "value1.1");
		registration.addInitParameter("param2", "value2");

		return registration;
	}

	@Bean
	@Order(2)
	public FilterRegistrationBean mySecondFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MySecondFilter());
		registration.setName("secondFilter");
		registration.addUrlPatterns("/auth/*");

		return registration;
	}

	/**
	 * logback，ViewStatusMessagesServlet以html表格的形式打印与当前LoggerContext关联的StatusManager
	 *
	 * @return
	 */
	@Bean
	public ServletRegistrationBean viewStatusMessageServlet() {
		ServletRegistrationBean registration = new ServletRegistrationBean();
		registration.setServlet(new ViewStatusMessagesServlet());
		registration.setName("viewStatusMessageServlet");
		registration.addUrlMappings("/lbClassicStatus");

		return registration;
	}

}
