package com.rbasystems.poc.helm.helmdemoproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelmChartDemoController {
    @Value("${ENVIRONMENT_NAME}")
    private String environmnetName="default";

    @GetMapping("/")
    public String sayHello(){
    return "Hello World from Helm! "+environmnetName;
    }
}
