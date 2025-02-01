package Dev_Luciano.hexagonal.adpters.in.controller;

import Dev_Luciano.hexagonal.adpters.in.controller.mapper.CustomerMapper;
import Dev_Luciano.hexagonal.adpters.in.controller.request.CustomerRequest;
import Dev_Luciano.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();

    }
}
