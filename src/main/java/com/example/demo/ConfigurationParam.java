package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class ConfigurationParam {

    @Value("${dollarOfficial}")
    double dollarOfficial;

    double getOfficialDollar() {
        return dollarOfficial;
    }
}
