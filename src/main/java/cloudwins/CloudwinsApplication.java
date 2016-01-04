package cloudwins;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudwinsApplication {

	@Bean
	public InitializingBean populateDatabase(
			ProviderRepository providerRepository,
			ClientRepository clientRepository) {
		return () -> {
			Provider pivotal = providerRepository.save(new Provider("Pivotal"));
			Provider ibm = providerRepository.save(new Provider("IBM"));
			clientRepository.save(new Client("Home Depot", pivotal));
			clientRepository.save(new Client("Ford", pivotal));
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CloudwinsApplication.class, args);
	}
}
