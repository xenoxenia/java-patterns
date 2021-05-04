package com.company.java2_6_builder.builders;

import com.company.java2_6_builder.cars.CarType;
import com.company.java2_6_builder.components.Engine;
import com.company.java2_6_builder.components.GPSNavigator;
import com.company.java2_6_builder.components.Transmission;
import com.company.java2_6_builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
