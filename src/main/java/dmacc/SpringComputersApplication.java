package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);

	}

	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setOperatingSystem("macOS");
		repo.save(c);
		
		Computer a = new Computer("H510", 2022, "nzxt", "Windows OS");
		Computer b = new Computer("Macbook Pro", 2020, "Apple", "macOS");
		
		repo.save(a);
		repo.save(b);
		
		List<Computer> allComputers = repo.findAll();
		
		for(Computer pcs: allComputers) {
			System.out.println(pcs.toString());
		}
	}

}
