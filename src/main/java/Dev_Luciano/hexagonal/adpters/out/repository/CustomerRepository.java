package Dev_Luciano.hexagonal.adpters.out.repository;

import Dev_Luciano.hexagonal.adpters.out.repository.Entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends MongoRepository<CustomerEntity,String> {
}
