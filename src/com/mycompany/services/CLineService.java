package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class CLineService extends Service
{
    // add one line here for the Services repo testing
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
