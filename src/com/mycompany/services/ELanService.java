package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELanService extends Service
{
    public ELanService(String name)
    {
        super(name);
    }

    @Override
    protected ServiceType getServiceType()
    {
        return ServiceType.SERVICE_TYPE_ELAN;
    }
}
