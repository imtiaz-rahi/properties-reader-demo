package com.github.imtiazrahi.props;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import lombok.Data;

/**
 * Configuration bean to hold tenant configuration.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-28
 */
@Data
public class TenantConfig {
	private String name, type;

	private DataSourceProperties datasource;

}
