package com.directi.training.ocp.my_work;

public abstract class Resource {

    public abstract void markSlotFree(int resourceId);

    public abstract void markSlotBusy(int resourceId);

    public int findFreeSlot()
    {
        return 0;
    }
}
