package products.Packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import products.Packages.model.Product;

public interface ProductRepositorie extends JpaRepository<Product, String > {

	
}
