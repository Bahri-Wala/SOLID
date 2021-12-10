package com.directi.training.isp.my_work;

import java.util.Random;

public class Sensor
{
    public void register(SensorTreatment sensorTreatment)
    {
        while (true) {
            if (isPersonClose()) {
                sensorTreatment.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
