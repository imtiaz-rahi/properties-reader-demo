package com.github.imtiazrahi.props;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.imtiazrahi.props.PropertiesReaderDemoApplication;
import com.github.imtiazrahi.props.TenantConfigMkYong;

/**
 * Test binding of {@code tenantconfig.mkyong} prefixed properties to {@link TenantConfigMkYong} class using properties
 * (tenant-mkyong.properties) or YAML (tenant-mkyong.yml) file.
 * 
 * @author Imtiaz Rahi
 * @since 2017-08-31
 * @see TenantConfigMkYong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PropertiesReaderDemoApplication.class })
public class TestTenantConfigMkYongSetup {

	@Autowired
	TenantConfigMkYong tenantConfig;

	@Test
	public void test() {
		System.out.println(tenantConfig);
		System.out.println("Tenant name is : " + tenantConfig.getName());
		System.out.println("====================");
	}

}
