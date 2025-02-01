package Dev_Luciano.hexagonal.adpters.in.controller;

import Dev_Luciano.hexagonal.adpters.in.controller.mapper.CustomerMapper;
import Dev_Luciano.hexagonal.adpters.in.controller.request.CustomerRequest;
import Dev_Luciano.hexagonal.adpters.in.controller.response.CustomerResponse;
import Dev_Luciano.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import Dev_Luciano.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;



    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerReponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerReponse);
    }
}
