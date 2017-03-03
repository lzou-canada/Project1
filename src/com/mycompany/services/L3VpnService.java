package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class L3VpnService extends Service
{
    public L3VpnService(String name)
    {
        super(name);
    }

    @Override
    protected ServiceType getServiceType()
    {
        // add one line
        // simplified the comments
        return ServiceType.SERVICE_TYPE_L3VPN;
    }
}
