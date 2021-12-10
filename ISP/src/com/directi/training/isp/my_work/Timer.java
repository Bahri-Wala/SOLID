package com.directi.training.isp.my_work;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final TimerTreatment timerTreatment)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timerTreatment.timeOutCallback();
            }
        }, timeOut);
    }
}
