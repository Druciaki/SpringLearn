package dev.newrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDB {

	  private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

	  @Bean
	  CommandLineRunner initDatabase(RegisterRepository repository) {

	    return args -> {
	      // log.info("Preloading " + repository.save(new Register(33,44)));
	      // log.info("Preloading " + repository.save(new Register(44,55)));
	    };
	  }
}
