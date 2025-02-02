package Dev_Luciano.hexagonal.adpters.in.consumer;

import Dev_Luciano.hexagonal.adpters.in.consumer.mapper.CustomerMessageMapper;
import Dev_Luciano.hexagonal.adpters.in.consumer.message.CustomerMessage;
import Dev_Luciano.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;



    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated",groupId = "devluciano")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer,customerMessage.getZipCode());
    }



}
