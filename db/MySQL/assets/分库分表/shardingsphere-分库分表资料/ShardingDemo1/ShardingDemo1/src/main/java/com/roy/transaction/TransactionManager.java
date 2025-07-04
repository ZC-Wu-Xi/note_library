package com.roy.transaction;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author roy
 * @date 2022/3/27
 * @desc
 */
@Configuration
@EnableTransactionManagement
public class TransactionManager {

    @Bean
    public PlatformTransactionManager txManager(final DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
