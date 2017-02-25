package backend.services;

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
        return ServiceType.SERVICE_TYPE_ELINE;
    }
}
