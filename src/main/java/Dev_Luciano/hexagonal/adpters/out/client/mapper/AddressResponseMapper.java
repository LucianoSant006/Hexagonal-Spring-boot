package Dev_Luciano.hexagonal.adpters.out.client.mapper;
import Dev_Luciano.hexagonal.adpters.out.client.response.AddressResponse;
import Dev_Luciano.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
