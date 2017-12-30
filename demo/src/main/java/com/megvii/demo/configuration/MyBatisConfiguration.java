package com.megvii.demo.configuration;

import com.megvii.biz.core.interceptor.PageInterceptor;
import com.megvii.biz.core.interceptor.support.PageSql;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import javax.sql.DataSource;

public class MyBatisConfiguration {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 设置mybatis的主配置文件
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource mybatisConfigXml = resolver.getResource("classpath:mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);
        // 设置别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.megvii.demo.po");
        try {
            // mapper xml配置文件所在路径
            Resource[] resources = new PathMatchingResourcePatternResolver()
                    .getResources("classpath:com/megvii/demo/dao/mapper/*.xml");
            sqlSessionFactoryBean.setMapperLocations(resources);
        } catch (Exception e) {

        }
        // 添加分页拦截器
        PageInterceptor pageInterceptor = new PageInterceptor();
        pageInterceptor.setPageSql(new PageSql.MySqlPageSql()); // mysql
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor});
        return sqlSessionFactoryBean;
    }
}
