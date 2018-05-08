package com.mikhaylovich.gwmonitoring.port.adapter.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
@RestController
public class MonitoringResources {
    @RequestMapping("/**")
    public String greet() {
        return "Hello, GW Monitoring";
    }
}
