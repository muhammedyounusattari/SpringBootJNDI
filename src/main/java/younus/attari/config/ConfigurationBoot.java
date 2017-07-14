package younus.attari.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class ConfigurationBoot {
	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		// TODO Auto-generated method stub
//		super.configureDefaultServletHandling(configurer);
//	}

	@Bean
	public InternalResourceViewResolver getViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("../WEB-INF/jsp/");
		return viewResolver;
	}
	
//	@Bean
//	public DriverManagerDataSource getDataSource(){
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://183.82.111.145:3005/cu");
//		dataSource.setUsername("root");
//		dataSource.setPassword("qwe@123");
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		return dataSource;
//	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	
}
