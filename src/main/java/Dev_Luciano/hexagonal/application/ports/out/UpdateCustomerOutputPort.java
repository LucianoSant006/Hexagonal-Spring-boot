package Dev_Luciano.hexagonal.application.ports.out;

import Dev_Luciano.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
