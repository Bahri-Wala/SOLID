package com.directi.training.srp.my_work;

import java.util.List;

public class CarFilter {

    public String getName(Car car){
        StringBuilder sb = new StringBuilder();
        sb.append(car.getBrand());
        sb.append(" ");
        sb.append(car.getModel());
        return sb.toString();
    }

    public String getNames(List<Car> cars){
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(this.getName(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
