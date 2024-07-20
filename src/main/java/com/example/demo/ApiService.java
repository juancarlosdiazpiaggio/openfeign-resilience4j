package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    private final ServiceAClient serviceAClient;
    private final ServiceBClient serviceBClient;
    private final ServiceCClient serviceCClient;
    private final ServiceDClient serviceDClient;


    public ApiService(ServiceAClient serviceAClient,
                      ServiceBClient serviceBClient,
                      ServiceCClient serviceCClient,
                      ServiceDClient serviceDClient) {
        this.serviceAClient = serviceAClient;
        this.serviceBClient = serviceBClient;
        this.serviceCClient = serviceCClient;
        this.serviceDClient = serviceDClient;
    }

    public String callServiceA() {
        return serviceAClient.getServiceAResponse();
    }

    public String callServiceB() {
        return serviceBClient.getServiceBResponse();
    }

    public String callServiceC() {
        return serviceCClient.getServiceCResponse();
    }

    public String callServiceD() {
        return serviceDClient.getServiceDResponse();
    }
}
