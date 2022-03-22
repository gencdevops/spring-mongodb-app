package com.example.springmongodbapp.service;

import com.example.springmongodbapp.data.dal.SensorServiceAppHelper;
import com.example.springmongodbapp.data.entity.Sensor;
import org.springframework.stereotype.Service;

@Service
public class SensorAppService {
    private final SensorServiceAppHelper sensorServiceAppHelper;

    public SensorAppService(SensorServiceAppHelper sensorServiceAppHelper) {
        this.sensorServiceAppHelper = sensorServiceAppHelper;
    }

    public Iterable<Sensor> findAllSensors() {
        return sensorServiceAppHelper.findAllSensors();
    }

    public Iterable<Sensor> findSensorsBetween(double min, double max) {
        return sensorServiceAppHelper.findSensorsBetween(min, max);
    }

}
