package com.directi.training.srp.my_work;

import java.util.List;

public class CarRater implements ICarRater{

    public Car getBest(List<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
