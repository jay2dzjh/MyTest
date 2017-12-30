package com.megvii.demo.configuration;


import com.megvii.biz.core.configuration.BaseDataSourceConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class DataSourceConfiguration extends BaseDataSourceConfiguration {

    @Bean("dataSource1")
    public DataSource dataSource(){
        return super.dataSource();
    }
}
