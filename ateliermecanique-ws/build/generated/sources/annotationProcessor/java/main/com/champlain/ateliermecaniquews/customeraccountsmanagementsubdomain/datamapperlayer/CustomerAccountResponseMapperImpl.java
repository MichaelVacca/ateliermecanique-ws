package com.champlain.ateliermecaniquews.customeraccountsmanagementsubdomain.datamapperlayer;

import com.champlain.ateliermecaniquews.customeraccountsmanagementsubdomain.datalayer.CustomerAccount;
import com.champlain.ateliermecaniquews.customeraccountsmanagementsubdomain.presentationlayer.CustomerAccountResponseModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-29T00:00:26-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CustomerAccountResponseMapperImpl implements CustomerAccountResponseMapper {

    @Override
    public CustomerAccountResponseModel entityToResponseModel(CustomerAccount customerAccount) {
        if ( customerAccount == null ) {
            return null;
        }

        CustomerAccountResponseModel.CustomerAccountResponseModelBuilder customerAccountResponseModel = CustomerAccountResponseModel.builder();

        customerAccountResponseModel.customerFirstName( customerAccount.getCustomerFirstName() );
        customerAccountResponseModel.customerLastName( customerAccount.getCustomerLastName() );
        customerAccountResponseModel.customerEmail( customerAccount.getCustomerEmail() );
        customerAccountResponseModel.customerPhoneNumber( customerAccount.getCustomerPhoneNumber() );

        customerAccountResponseModel.customerAccountId( customerAccount.getCustomerAccountIdentifier().getCustomerAccountId() );

        return customerAccountResponseModel.build();
    }

    @Override
    public List<CustomerAccountResponseModel> entityToResponseModelList(List<CustomerAccount> customerAccounts) {
        if ( customerAccounts == null ) {
            return null;
        }

        List<CustomerAccountResponseModel> list = new ArrayList<CustomerAccountResponseModel>( customerAccounts.size() );
        for ( CustomerAccount customerAccount : customerAccounts ) {
            list.add( entityToResponseModel( customerAccount ) );
        }

        return list;
    }
}