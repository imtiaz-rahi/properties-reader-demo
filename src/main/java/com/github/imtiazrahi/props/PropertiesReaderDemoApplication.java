package com.github.imtiazrahi.props;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * {@link PropertiesReaderDemoApplication} spring boot entry point.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-30
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class PropertiesReaderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesReaderDemoApplication.class, args);
	}
}
