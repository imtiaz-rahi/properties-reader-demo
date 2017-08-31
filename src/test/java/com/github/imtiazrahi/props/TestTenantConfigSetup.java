package com.github.imtiazrahi.props;

import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.imtiazrahi.props.MultitenantDataSourceConfig;
import com.github.imtiazrahi.props.PropertiesReaderDemoApplication;
import com.github.imtiazrahi.props.TenantConfig;

/**
 * Test binding of {@code tenants} prefixed properties to {@link MultitenantDataSourceConfig} class from tenant.properties file.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PropertiesReaderDemoApplication.class })
public class TestTenantConfigSetup {

	@Autowired
	MultitenantDataSourceConfig tenantConfig;

	@Test
	public void test() {
		System.out.println("====================");
		for (Entry<String, TenantConfig> it: tenantConfig.getTenants().entrySet()) {
			System.out.println("Tenant : " + it.getKey());
			System.out.println("  " + it.getValue());

			DataSourceProperties dbprop = it.getValue().getDatasource();
			System.out.println("  DS name: " + dbprop.getName());
			System.out.println("  DS URL: " + dbprop.getUrl());
		}
		System.out.println("====================");
	}

}
