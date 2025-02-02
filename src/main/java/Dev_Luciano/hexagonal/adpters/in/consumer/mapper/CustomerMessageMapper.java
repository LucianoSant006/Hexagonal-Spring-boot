package Dev_Luciano.hexagonal.adpters.in.consumer.mapper;

import Dev_Luciano.hexagonal.adpters.in.consumer.message.CustomerMessage;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
