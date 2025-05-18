package ma.enset.bdccspringensetmvc.repository;

import ma.enset.bdccspringensetmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
