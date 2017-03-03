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
        // add something here for L3VPN for Services for PTS-122
        // add one line for feature-2
        return ServiceType.SERVICE_TYPE_L3VPN;
    }
}
