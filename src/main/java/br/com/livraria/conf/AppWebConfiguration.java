package br.com.livraria.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.livraria.controller.HomeController;
import br.com.livraria.controller.LivroController;
import br.com.livraria.dao.LivroDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses={ HomeController.class, LivroDAO.class })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	
	@Bean
	public InternalResourceViewResolver	internalResourceViewResolver() {
	InternalResourceViewResolver resolver =  	new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/views/");
	resolver.setSuffix(".jsp");
	return resolver;
	}	
}
