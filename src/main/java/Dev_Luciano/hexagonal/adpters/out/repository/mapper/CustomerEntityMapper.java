package Dev_Luciano.hexagonal.adpters.out.repository.mapper;

import Dev_Luciano.hexagonal.adpters.out.repository.Entity.CustomerEntity;
import Dev_Luciano.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
