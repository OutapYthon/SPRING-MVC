package ma.enset.bdccspringensetmvc;

import ma.enset.bdccspringensetmvc.entities.Product;
import ma.enset.bdccspringensetmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BdccSpringEnsetMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdccSpringEnsetMvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner star(ProductRepository productRepository ){
        return args -> {
            productRepository.save(Product.builder()
                            .name("computer")
                            .price(5400)
                            .quantity(100)
                    .build());
            productRepository.save(Product.builder()
                            .name("phone")
                            .price(9000)
                            .quantity(50)
                    .build());
            productRepository.findAll().forEach(product ->
                    System.out.println(product.toString()));
        };
    }
}
