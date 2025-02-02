package Dev_Luciano.hexagonal.adpters.out;

import Dev_Luciano.hexagonal.adpters.in.controller.mapper.CustomerMapper;
import Dev_Luciano.hexagonal.adpters.out.repository.CustomerRepository;
import Dev_Luciano.hexagonal.adpters.out.repository.mapper.CustomerEntityMapper;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import Dev_Luciano.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
