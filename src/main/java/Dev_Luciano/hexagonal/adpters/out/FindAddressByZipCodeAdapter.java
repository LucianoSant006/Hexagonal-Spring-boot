package Dev_Luciano.hexagonal.adpters.out;


import Dev_Luciano.hexagonal.adpters.out.client.FindAddressByZipCodeClient;
import Dev_Luciano.hexagonal.adpters.out.client.mapper.AddressResponseMapper;
import Dev_Luciano.hexagonal.application.core.domain.Address;
import Dev_Luciano.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private AddressResponseMapper addressResponseMapper;


    private FindAddressByZipCodeClient findAddressByZipCodeClient;



    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
