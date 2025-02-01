package Dev_Luciano.hexagonal.adpters.in.controller.response;

import Dev_Luciano.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String id;
    private String name;
    private String cpf;
    private AddressResponse address;
    private Boolean isValid;

}
