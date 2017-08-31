package com.github.imtiazrahi.props;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

/**
 * POJO to hold configuration properties.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-31
 */
@Data
@Configuration
@PropertySource("classpath:tenant.properties")
@ConfigurationProperties
public class MultitenantDataSourceConfig {

	Map<String, TenantConfig> tenants;

}
