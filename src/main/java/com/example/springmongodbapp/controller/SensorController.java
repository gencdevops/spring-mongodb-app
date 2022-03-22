package com.example.springmongodbapp.controller;

import com.example.springmongodbapp.data.entity.Sensor;
import com.example.springmongodbapp.service.SensorAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sensors")
public class SensorController {

    private final SensorAppService sensorAppService;

    public SensorController(SensorAppService sensorAppService) {
        this.sensorAppService = sensorAppService;
    }

    @GetMapping("all")
    public Iterable<Sensor> findAll() {
        return sensorAppService.findAllSensors();
    }

    @GetMapping("sensor")
    public Iterable<Sensor> findSensorsBetween(double min, double max) {
        return sensorAppService.findSensorsBetween(min, max);
    }

}
