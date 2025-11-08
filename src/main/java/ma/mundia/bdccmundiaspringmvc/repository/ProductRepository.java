package ma.mundia.bdccmundiaspringmvc.repository;

import ma.mundia.bdccmundiaspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
