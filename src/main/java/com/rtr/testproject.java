package com.rtr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;


/**
 * @SpringbootApplication define a sprint boot app
 * Created by lenovo on 21/11/2019.
 */
@SpringBootApplication
//public class testproject extends WebMvcConfigurerAdapter{
public class testproject {
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
//        super.configureMessageConverters(converters);
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        FastJson.setSerializerFeature(SerializerFeature.PrettyFormat);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(fastConverter);
//    }

    public static void main(String[] args) {
        SpringApplication.run(testproject.class,args);
    }
}
