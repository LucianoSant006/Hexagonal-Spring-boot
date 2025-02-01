package Dev_Luciano.hexagonal.application.core.usecase;

import Dev_Luciano.hexagonal.application.core.domain.Customer;
import Dev_Luciano.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import Dev_Luciano.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort){
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){

        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Customer not Found"));
    }

}
