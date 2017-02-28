package com.mycompany.services;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum ServiceType
{
    // this is good
    // add something here for the Service Repo
    // add one line here again for PTS-122
    // add something else for PTS-222
    // add one line here
    SERVICE_TYPE_UNKNOWN(0,"Unknown"),
    SERVICE_TYPE_ELINE(1,"E-Line"),
    SERVICE_TYPE_ELAN(2, "E-LAN"),
    SERVICE_TYPE_L3VPN(3, "L3-VPN"),
    SERVICE_TYPE_CLINE(4, "C-Line");

    private int index;
    private String name;
    private static Map<Integer,ServiceType> map = new HashMap<>();

    ServiceType(int index, String name)
    {
        this.index = index;
        this.name = name;
    }

    static
    {
        for ( ServiceType lType : ServiceType.values() )
        {
            map.put(lType.getIndex(), lType);
        }
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public static ServiceType valueOf(Integer index)
    {
        if ( index == null )
        {
            return SERVICE_TYPE_UNKNOWN;
        }

        ServiceType lServiceType = map.get(index);

        if ( lServiceType == null )
        {
            return SERVICE_TYPE_UNKNOWN;
        }
        return lServiceType;
    }
}
