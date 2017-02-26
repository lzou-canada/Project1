package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class CLineService extends Service
{
    public CLineService(String name)
    {
        super(name);
    }

    @Override
    protected ServiceType getServiceType()
    {
        return ServiceType.SERVICE_TYPE_CLINE;
    }
}
