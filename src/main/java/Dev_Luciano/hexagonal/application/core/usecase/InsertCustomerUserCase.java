package Dev_Luciano.hexagonal.application.core.usecase;

import Dev_Luciano.hexagonal.application.core.domain.Customer;
import Dev_Luciano.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import Dev_Luciano.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUserCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUserCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,InsertCustomerOutputPort insertCustomerOutputPort){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer custumer,String zipCode){

        var address = findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustomerOutputPort.insert(custumer);

    }
}
