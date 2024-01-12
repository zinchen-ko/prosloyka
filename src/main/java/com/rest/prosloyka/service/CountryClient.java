package com.rest.prosloyka.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {

    public CountryTransferredResponse getCountry() {
        CountryTransferredRequest request = new CountryTransferredRequest();

        return (CountryTransferredResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);
    }
}




