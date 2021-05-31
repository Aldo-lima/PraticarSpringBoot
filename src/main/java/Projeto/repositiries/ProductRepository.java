package Projeto.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Projeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
