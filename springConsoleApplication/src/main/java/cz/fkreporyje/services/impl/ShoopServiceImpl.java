package cz.fkreporyje.services.impl;

import cz.fkreporyje.services.ShoopService;
import org.springframework.stereotype.Service;

@Service

public class ShoopServiceImpl implements ShoopService {

    @Override
    public String onlyForTest(String z) {
        return z;
    }
}
