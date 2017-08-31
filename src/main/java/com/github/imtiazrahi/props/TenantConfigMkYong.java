package com.github.imtiazrahi.props;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

/**
 * Configuration bean to hold tenant configuration.
 * 
 * Spring PropertySource does not support YAML mapping. So custom source factory implemented.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-28
 * @see <a href="https://www.mkyong.com/spring-boot/spring-boot-configurationproperties-example"></a>
 */
@Data
@Configuration
/* Uncomment it to bind this class to a .property file */
//@PropertySource("classpath:tenant-mkyong.properties")
@PropertySource(name="mkyong", value="classpath:tenant-mkyong.yml", factory=YamlPropertySourceFactory.class)
@ConfigurationProperties("tenantconfig.mkyong")
public class TenantConfigMkYong {
	private String name;

	/** JDBC url of the database. */
	private String url;

	/** Login user of the database. */
	private String username;

	/** Login password of the database. */
	private String password;

	private List<Menu> menus;

	private Map<String, Menu> maps;

	@Data
	public static class Menu {
		String name, path, title;
	}
}
