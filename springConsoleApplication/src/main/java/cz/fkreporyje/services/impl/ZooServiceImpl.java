package cz.fkreporyje.services.impl;

import cz.fkreporyje.services.ZooService;
import org.springframework.stereotype.Service;

@Service
public class ZooServiceImpl implements ZooService {

    @Override
    public String onlyForTest(String s) {
        return s;
    }
}
