package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELanService extends Service
{
    // add BB to move PTS-199
    // added one line here to advance the Services branch
    public ELanService(String name)
    {
        // add line B2 to move the master
        // add CC to move the master
        super(name);
    }

    // add AA to move the master
    @Override
    protected ServiceType getServiceType()
    {
        return ServiceType.SERVICE_TYPE_ELAN;
    }
}
