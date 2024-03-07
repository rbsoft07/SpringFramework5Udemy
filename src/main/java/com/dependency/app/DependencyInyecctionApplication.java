package com.dependency.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.dependency.app.AOP.TargetObjectAOP;
import com.dependency.app.lifeCycle.ExplicitBean;
import com.dependency.app.lifeCycle.LifeCycleBean;

//Nodificacion para enviar segundo commit.

@SpringBootApplication
public class DependencyInyecctionApplication {

	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyecctionApplication.class);

	
	public static void main(String[] args) {
		
		
		
	//Creacion de objetos manejados por el contenedor de spring 
//		ConfigurableApplicationContext context=  SpringApplication.run(DependencyInyecctionApplication.class, args);
//		Coche c = context.getBean(Coche.class);
//		System.out.println(c);
//		
	/*
	 * Crecion de objetos de manera tradicional. 
	 * */
		/*
		Motor motor = new Motor("XL1",1981);
		Coche c = new Coche("Toyota" , 1982, motor);
		
		System.out.println(c);
		*/
		

	//ejempo para el uso de los qualifiers 
 		//ConfigurableApplicationContext contextApp = SpringApplication.run(DependencyInyecctionApplication.class, args); //para manejer el contexto de spring donde se almancenan los objetos. 
		/*
 		Perro perro = contextApp.getBean(Perro.class);
		//Pajaro pajaro = contextApp.getBean(Pajaro.class);
		log.info("Objetos de la clase perro {} ", perro.getNombre());
		//log.info("Objetos de la clase Pajaro {} ", pajaro.getNombre());*/
		
		
	//Inyectando por medio de Qualifier asignando nombre a el Bean.
		/*Animal ani = contextApp.getBean("pajaro",Animal.class);
		log.info(" Nombre = {} , Edad = {} ", ani.getNombre(), ani.getEdad());*/
		
		
	/*
	 * Uso de Qualifier por medio de propiedad en el clase nido.
	 * Y uso de la Anotacion Primary 
	 *	
	*/	
    	/*
		Nido nido = contextApp.getBean(Nido.class);
		nido.imprimir();
		
		
		Caballo an = contextApp.getBean( Caballo.class);
		an.rebusnar();
		*/
		
		
	//Manejo para el uso de la etiqueta @Profile
		/*
		 * ConfigurableApplicationContext contextApp = SpringApplication.run(DependencyInyecctionApplication.class, args);
		 * EnviromentService EnvServices = contextApp.getBean(EnviromentService.class);
		log.info( EnvServices.getEnviroment());*/
		
		
	//Manejo de Scopes
		/*
		 * ConfigurableApplicationContext contextApp = SpringApplication.run(DependencyInyecctionApplication.class, args);
		 * EjemploScopeService ejs0 = contextApp.getBean(EjemploScopeService.class);
		EjemploScopeService ejs1 = contextApp.getBean(EjemploScopeService.class);
		
		log.info("Beans iguales (Equalas): {} " ,ejs0.equals(ejs1));
		log.info("Beans iguales (==) {}: ", ejs1.equals(ejs0));*/

	//Manejo de la etiqueta @Beans
		
		/*ConfigurableApplicationContext contextApp = SpringApplication.run(DependencyInyecctionApplication.class, args); 
 		String nombreApp = 	contextApp.getBean(String.class);
 		log.info("Este es el nombre de la App: {}" , nombreApp);*/
 		
 	//Inyeccion de varios objetos usando @Autowired y uso de archivos propiedades.
 		/*ConfigurableApplicationContext ctxApp = SpringApplication.run(DependencyInyecctionApplication.class, args);
 		AreaCalculatorService objAreaCalculatorService = 	ctxApp.getBean(AreaCalculatorService.class);
 		log.info("Calculo total del Area : {}" , objAreaCalculatorService.getTotalCalcArea());*/
		
	//Uso de spEL y los diferentes operadores.
		/*
		ExpressionParser parse = new SpelExpressionParser();
		Expression expression = parse.parseExpression(" 2 ne 1 ? 'ad' : 'fd' ");
		log.info("Valor del spEL : {}" , expression.getValue());*/
		
		
	//Uso de las interfaces Aware y el ciclo de vida de un Bean @posConstruct & @preDestroy.
		//ConfigurableApplicationContext contextApp  = SpringApplication.run(DependencyInyecctionApplication.class, args);
		//LifeCycleBean lcb =  contextApp.getBean(LifeCycleBean.class);
		
	//Ejemplo del uso de Lazy & Eager con la clase ExplicitBean
		//ConfigurableApplicationContext contextApp  = SpringApplication.run(DependencyInyecctionApplication.class, args);
		
	//Uso de la interfaz BeanPostProcessor (para probar este proceso se debe colocar @component a la clase SpringFrameworkBeanProcess
		//ConfigurableApplicationContext contextApp  = SpringApplication.run(DependencyInyecctionApplication.class, args);
		
	//Manejo de diferentes Anotaciones para el uso de la programacion AOP. 
		ConfigurableApplicationContext contextApp  = SpringApplication.run(DependencyInyecctionApplication.class, args);
		TargetObjectAOP  targetAop = contextApp.getBean(TargetObjectAOP.class);
		targetAop.before("Mostrando valor de TargetAop.");
		log.info("Result Calcular Importe -- Class TargetAOP : {} ", targetAop.calularImporte(5, 4, 2));
		//log.info("Result Calcular Mora -- Class TargetAOP : {} ", targetAop.calularMora(5, 4, 8));
		
	}

	@Bean 
	public String getNombreApp() {
		return "SpringFramework5-AppName";
	}
	
	/**
	 * 
	 * con esta declaracion de metodo se realiza la llamada del metodo ini y destroy
	 * cuando no son anotados con @postConstruct y @predestroy.
	**/
//	@Bean(initMethod = "init" , destroyMethod = "destroy")
//	public ExplicitBean getExplicitBean() {
//		return new ExplicitBean();
//	}
}
