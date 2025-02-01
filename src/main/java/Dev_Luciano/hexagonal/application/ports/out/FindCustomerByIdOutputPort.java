package Dev_Luciano.hexagonal.application.ports.out;

import Dev_Luciano.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
