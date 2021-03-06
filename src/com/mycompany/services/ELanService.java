package com.mycompany.services;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELanService extends Service
{
    // add line E2 to further move the master
    // add line E1 to move the master
    // add line A3 to move the PTS-200
    // add line B3 to move the master
    // add BB to move PTS-199
    // added one line here to advance the Services branch
    public ELanService(String name)
    {
        // add line B5 to further move the master
        // add line B4 to move the master
        // add line B2 to move the master
        // add CC to move the master
        super(name);
    }

    // add line D2 to further move the feature-production after merging with master
    // add line D1 to move the feature-production
    // add AA to move the master
    @Override
    protected ServiceType getServiceType()
    {
        return ServiceType.SERVICE_TYPE_ELAN;
    }
}
