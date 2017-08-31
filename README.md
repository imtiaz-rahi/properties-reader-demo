# properties-reader-demo (Spring property/YAML file read and bind to POJO)

## Implementation Details
Demo application to test binding of Spring properties (complex ones) to POJO.

Custom YamlPropertySourceFactory had to be developed to bind properties from YAML file using @PropertySource.

Run the test cases TestTenantConfigSetup and TestTenantConfigMkYongSetup to check things out.

Took help from the article by mkyong [Spring Boot @ConfigurationProperties example](https://www.mkyong.com/spring-boot/spring-boot-configurationproperties-example)
