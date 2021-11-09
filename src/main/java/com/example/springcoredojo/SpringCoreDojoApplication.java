package com.example.springcoredojo;

import com.example.springcoredojo.EntidadesYoutuber.Youtuber;
import com.example.springcoredojo.entidades.Config;
import com.example.springcoredojo.entidades.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			creacionBeans();
			creacionBeansYoutuber();
			creacionBeansXML();
		};
	}

	private void creacionBeans() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Usuario usuarioGeneradoPorBean = context.getBean("usuario", Usuario.class);
		System.out.println("usuario: " + usuarioGeneradoPorBean);
	}

	private void creacionBeansYoutuber() {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuberGeneradoPorBean = context.getBean(Youtuber.class);
		System.out.println("Youtuber: " + youtuberGeneradoPorBean.getNombre());
	}

	private void creacionBeansXML() {
		ApplicationContext context = new ClassPathXmlApplicationContext("practica-bean-config.xml");
		Usuario u = (Usuario) context.getBean("usuario");
		System.out.println("Nombre: " + u.getAlumno().getNombre());
		System.out.println("Apellido: " + u.getAlumno().getApellido());
		System.out.println("Edad: " + u.getAlumno().getEdad());
	}

}
