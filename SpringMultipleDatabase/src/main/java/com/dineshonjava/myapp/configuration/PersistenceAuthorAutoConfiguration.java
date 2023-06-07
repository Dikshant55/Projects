package com.dineshonjava.myapp.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
  basePackages = "com.dineshonjava.myapp.dao.author", 
  entityManagerFactoryRef = "authorEntityManager", 
  transactionManagerRef = "authorTransactionManager")
public class PersistenceAuthorAutoConfiguration {
   
    @Bean
    @ConfigurationProperties(prefix="spring.author-datasource")
    public DataSource authorDataSource() {
        return DataSourceBuilder.create().build();
    }
   
    @Bean
    public LocalContainerEntityManagerFactoryBean authorEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(authorDataSource());
        em.setPackagesToScan(
                new String[] { "com.dineshonjava.myapp.model.author"});

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "update");
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public PlatformTransactionManager authorTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                authorEntityManager().getObject());
        return transactionManager;
    }
}