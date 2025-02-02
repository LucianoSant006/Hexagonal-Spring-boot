package Dev_Luciano.hexagonal.config;

import Dev_Luciano.hexagonal.adpters.out.FindAddressByZipCodeAdapter;
import Dev_Luciano.hexagonal.adpters.out.InsertCustomerAdapter;
import Dev_Luciano.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCostumerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter);

    }
}
