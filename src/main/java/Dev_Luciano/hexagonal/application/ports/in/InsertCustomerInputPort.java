package Dev_Luciano.hexagonal.application.ports.in;

import Dev_Luciano.hexagonal.application.core.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
