package Dev_Luciano.hexagonal.adpters.in.controller.mapper;


import Dev_Luciano.hexagonal.adpters.in.controller.request.CustomerRequest;
import Dev_Luciano.hexagonal.adpters.in.controller.response.CustomerResponse;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "adress",ignore = true)
    @Mapping(target = "isValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
