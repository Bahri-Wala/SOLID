package com.directi.training.srp.my_work;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private final ICarDao _carDao;
    private final ICarFilter _carFilter;
    private final ICarRater _carRater;

    public CarManager(ICarDao carDao, ICarFilter carFilter, ICarRater carRater)
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
