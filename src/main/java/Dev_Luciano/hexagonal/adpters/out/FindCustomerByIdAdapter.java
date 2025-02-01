package Dev_Luciano.hexagonal.adpters.out;

import Dev_Luciano.hexagonal.adpters.in.controller.mapper.CustomerMapper;
import Dev_Luciano.hexagonal.adpters.out.repository.CustomerRepository;
import Dev_Luciano.hexagonal.adpters.out.repository.mapper.CustomerEntityMapper;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import Dev_Luciano.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;


    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(x -> customerEntityMapper.toCustomer(x));
    }
}
