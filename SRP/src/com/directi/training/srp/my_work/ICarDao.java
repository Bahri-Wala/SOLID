package com.directi.training.srp.my_work;

import java.util.List;

public interface ICarDao {
    public Car getById(final String carId);
    public List<Car> gatAll();
}
