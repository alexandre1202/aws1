package br.com.aab.sbnewrelease.aws1.repository;

import br.com.aab.sbnewrelease.aws1.model.Product;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);
}
