package sheridan.leenalahmad.asssignment2.data.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends JpaRepository<Product, Long> {

}
