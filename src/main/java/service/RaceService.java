package service;

import model.Car;

import java.util.ArrayList;

public class RaceService {

    public Car getWinnerCar(ArrayList<Car> cars) {
        Car winnerCar;
        if (!cars.isEmpty())
            winnerCar = cars.get(0);
        else
            return null;
        for (Car car : cars)
            if (getDistance(car)>getDistance(winnerCar))
                winnerCar = car;
        return winnerCar;
    }


    private int getDistance(Car car){
        return car.getSpeed()*24;
    }


}
