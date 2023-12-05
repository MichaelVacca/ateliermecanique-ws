package com.champlain.ateliermecaniquews.customeraccountsmanagementsubdomain.presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerAccountRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
