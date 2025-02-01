package Dev_Luciano.hexagonal.application.ports.in;

import Dev_Luciano.hexagonal.application.core.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
