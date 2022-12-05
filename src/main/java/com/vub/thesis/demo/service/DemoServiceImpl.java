package com.vub.thesis.demo.service;

import com.vub.thesis.demo.resource.DemoResource;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Service
@Log
public class DemoServiceImpl implements DemoService {

    @Override
    public void save(DemoResource demoResource) {
        log.info("\"" + demoResource.toString() + "\"" + " has been received!");
    }
}
