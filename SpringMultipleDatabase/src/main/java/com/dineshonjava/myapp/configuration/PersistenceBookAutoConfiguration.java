package com.dineshonjava.myapp.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
  basePackages = "com.dineshonjava.myapp.dao.book",
  entityManagerFactoryRef = "bookEntityManager",
  transactionManagerRef = "bookTransactionManager")
public class PersistenceBookAutoConfiguration {
    
    @Primary
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource bookDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean bookEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(bookDataSource());
        em.setPackagesToScan(
                new String[] { "com.dineshonjava.myapp.model.book"});

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", properties
               );
        properties.put("hibernate.dialect", properties
               );
        em.setJpaPropertyMap(properties);

        return em;
    }
    @Bean
    @Primary
    public PlatformTransactionManager bookTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                bookEntityManager().getObject());
        return transactionManager;
    }
}
