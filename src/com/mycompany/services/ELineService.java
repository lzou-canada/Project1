package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELineService extends Service
{
    public ELineService(String name)
    {
        super(name);
    }

    @Override
    protected ServiceType getServiceType()
    {
        // add CCC to move the master
        return ServiceType.SERVICE_TYPE_ELINE;
    }
}
