package Dev_Luciano.hexagonal.config;

import Dev_Luciano.hexagonal.adpters.out.FindAddressByZipCodeAdapter;
import Dev_Luciano.hexagonal.adpters.out.FindCustomerByIdAdapter;
import Dev_Luciano.hexagonal.adpters.out.InsertCustomerAdapter;
import Dev_Luciano.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import Dev_Luciano.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindByIdCostumerConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
        
    }
}
