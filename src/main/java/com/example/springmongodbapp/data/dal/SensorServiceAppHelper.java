package com.example.springmongodbapp.data.dal;


import com.example.springmongodbapp.data.entity.Sensor;
import com.example.springmongodbapp.data.repository.SensorRepository;
import org.springframework.stereotype.Component;

@Component
public class SensorServiceAppHelper {

private final SensorRepository sensorRepository;

    public SensorServiceAppHelper(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Iterable<Sensor> findAllSensors() {
        return sensorRepository.findAll();
    }

    public Iterable<Sensor> findSensorsBetween(double min, double max) {
        return sensorRepository.findBetween(min, max);
    }

}
