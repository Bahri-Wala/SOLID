package com.directi.training.dip.example;

public class Button
{
    private Equipment equipment;
    private boolean _state;

    public Button(Equipment equipment)
    {
        this.equipment = equipment;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
            equipment.turnOn();
        } else {
            equipment.turnOff();
        }
    }

}
