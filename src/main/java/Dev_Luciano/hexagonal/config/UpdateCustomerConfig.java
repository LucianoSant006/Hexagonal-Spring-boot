package Dev_Luciano.hexagonal.config;

import Dev_Luciano.hexagonal.adpters.out.FindAddressByZipCodeAdapter;
import Dev_Luciano.hexagonal.adpters.out.FindCustomerByIdAdapter;
import Dev_Luciano.hexagonal.adpters.out.UpdateCustomerAdapter;
import Dev_Luciano.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import Dev_Luciano.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase,
                findAddressByZipCodeAdapter
                ,updateCustomerAdapter);
    }

}
