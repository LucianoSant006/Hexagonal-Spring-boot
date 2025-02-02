package Dev_Luciano.hexagonal.adpters.out;

import Dev_Luciano.hexagonal.adpters.out.repository.CustomerRepository;
import Dev_Luciano.hexagonal.adpters.out.repository.mapper.CustomerEntityMapper;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import Dev_Luciano.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter  implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {

        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
