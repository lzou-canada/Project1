package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public abstract class Service extends AbstractServiceQosProfile
{
    private String name;
    private ServiceType serviceType;

    public Service(String name)
    {
        this.name = name;
        serviceType = getServiceType();
    }

    // one line for feature-2
    public String getName()
    {
        return name;
    }

    protected abstract ServiceType getServiceType();

    public void Print()
    {
        System.out.println("Service name: " + name + ", service type: " + serviceType);
    }
}
