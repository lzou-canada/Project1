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
        // added a feature for L3VPN to move the master branch
        // add one line
        // simplified the comments
        return ServiceType.SERVICE_TYPE_L3VPN;
    }
}
