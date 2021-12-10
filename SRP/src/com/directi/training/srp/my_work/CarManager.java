package com.directi.training.srp.my_work;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private final CarDao _carDao;
    private final CarFilter _carFilter;
    private final CarRater _carRater;

    public CarManager(CarDao carDao, CarFilter carFilter, CarRater carRater)
    {
        _carDao = carDao;
        _carFilter = carFilter;
        _carRater = carRater;
    }

    public Car getFromDb(final String carId)
    {
        return _carDao.getById(carId);
    }

    public String getCarsNames()
    {
        return _carFilter.getNames(_carDao.gatAll());
    }

    public Car getBestCar()
    {
        return _carRater.getBest(_carDao.gatAll());
    }
}
