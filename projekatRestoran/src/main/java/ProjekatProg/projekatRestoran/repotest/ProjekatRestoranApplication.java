package ProjekatProg.projekatRestoran.repotest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@SpringBootApplication
public class ProjekatRestoranApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjekatRestoranApplication.class, args);

	}
	@Bean
	public CommandLineRunner testDatabaseConnection(kontrolertest databaseConnectionTest) {
		return args -> {
			databaseConnectionTest.testConnection();
		};
	}
	}

