//package com.jyp.template.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jdbc.core.convert.JdbcConverter;
//import org.springframework.data.jdbc.core.mapping.JdbcMappingContext;
//import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
//import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
//import org.springframework.data.jdbc.repository.support.JdbcRepositoryFactoryBean;
//import org.springframework.data.relational.core.dialect.Dialect;
//import org.springframework.data.relational.core.mapping.NamingStrategy;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJdbcRepositories(basePackages = {"com.jyp.template.repository"})
//@EnableTransactionManagement
//public class ClickHouseDataConfig {
//
//    @Bean
//    public DataSource clickHouseDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:clickhouse://localhost:8123/?database=default&socket_timeout=60000");
//        config.setUsername("default");
//        config.setPassword("");
//
//        // 连接池配置 (根据需要调整)
//        config.setMaximumPoolSize(10);
//        config.setMinimumIdle(5);
//        config.setConnectionTimeout(30000);
//        config.setIdleTimeout(60000);
//
//        return new HikariDataSource(config);
//    }
//
//    @Bean
//    public Dialect jdbcDialect() {
//        return new ClickHouseDialect();
//    }
//
//
//    @Bean
//    public NamingStrategy namingStrategy() {
//        // 可以使用默认的策略，或者自定义策略
//        return NamingStrategy.INSTANCE; // 例如，使用默认策略
//    }
//
//    @Bean
//    public JdbcMappingContext relationalMappingContext(NamingStrategy namingStrategy) {
//        return new JdbcMappingContext(namingStrategy); // 使用 NamingStrategy
//    }
//
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource clickHouseDataSource) {
//        return new JdbcTemplate(clickHouseDataSource);
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(DataSource clickHouseDataSource) {
//        return new DataSourceTransactionManager(clickHouseDataSource);
//    }
//
//
//
//
//
//}
