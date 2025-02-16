package sheridan.leenalahmad.asssignment2.data.init;

import sheridan.leenalahmad.asssignment2.data.JPA.Product;
import sheridan.leenalahmad.asssignment2.data.JPA.ProductDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductDataRepository repository;

    public DataInitializer(ProductDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.saveAll(List.of(
                new Product("Laptop", 1200.50, "Electronics", 10),
                new Product("Phone", 699.99, "Electronics", 25),
                new Product("Desk Chair", 150.75, "Furniture", 5),
                new Product("Monitor", 220.00, "Electronics", 15)
        ));
    }
}
