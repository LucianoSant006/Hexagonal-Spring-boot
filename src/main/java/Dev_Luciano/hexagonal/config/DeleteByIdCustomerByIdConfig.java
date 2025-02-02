package Dev_Luciano.hexagonal.config;

import Dev_Luciano.hexagonal.adpters.out.DeleteCustomerByIdAdapter;
import Dev_Luciano.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import Dev_Luciano.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteByIdCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);
    }
}
