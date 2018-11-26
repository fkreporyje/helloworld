package cz.fkreporyje.services.impl;

import cz.fkreporyje.services.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public String onlyForTest(String s) {
        return s;
    }
}
