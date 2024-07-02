package com.jyp.template.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class HikariDataSourceConfig {
    @Resource
    private JdbcParamConfig jdbcParamConfig;

    @Bean
    //@ConfigurationProperties(prefix = "spring.datasource.click")
    public DataSource clickHouseDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcParamConfig.getUrl());
        config.setUsername(jdbcParamConfig.getUsername());
        config.setPassword(jdbcParamConfig.getPassword());

        // 连接池配置 (根据需要调整)
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setConnectionTimeout(30000);
        config.setIdleTimeout(60000);

//        return DataSourceBuilder.create().build();

        return new HikariDataSource(config);
    }
}
