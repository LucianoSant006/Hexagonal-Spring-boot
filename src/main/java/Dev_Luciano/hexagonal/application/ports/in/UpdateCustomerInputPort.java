package Dev_Luciano.hexagonal.application.ports.in;

import Dev_Luciano.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort  {

    void update(Customer customer,String zipCode);
}
