package com.mycompany.services;

import java.util.List;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class AbstractServiceQosProfile
{
    private String profileId;
    private List<Queue> queueOverrides;

    public void setProfileId(String profileId)
    {
        this.profileId = profileId;
    }

    // add line B3 to move the master
    public String getProfileId()
    {
        return profileId;
    }

    public void setQueueOverrides(List<Queue> queueOverrides)
    {
        this.queueOverrides = queueOverrides;
    }

    public List<Queue> getQueueOverrides()
    {
        return queueOverrides;
    }

    public static class Queue
    {
        Integer queueId = null;
        int cir = -2;
        int pir = -2;
        int cbs = -2;
        int mbs = -2;

        public Queue(int queueId, int cir, int pir, int cbs, int mbs)
        {
            this.queueId = queueId;
            this.cir = cir;
            this.pir = pir;
            this.cbs = cbs;
            this.mbs = mbs;
        }

        public Integer getQueueId()
        {
            return queueId;
        }

        public void setQueueId(Integer queueId)
        {
            this.queueId = queueId;
        }

        public int getCir()
        {
            return cir;
        }

        public void setCir(int cir)
        {
            this.cir = cir;
        }

        public int getPir()
        {
            return pir;
        }

        public void setPir(int pir)
        {
            this.pir = pir;
        }

        public int getCbs()
        {
            return cbs;
        }

        public void setCbs(int cbs)
        {
            this.cbs = cbs;
        }

        public int getMbs()
        {
            return mbs;
        }

        public void setMbs(int mbs)
        {
            this.mbs = mbs;
        }
    }
}
