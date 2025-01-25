package Dev_Luciano.hexagonal.application.ports.out;

import Dev_Luciano.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {


    Address find(String zipCode);
}
