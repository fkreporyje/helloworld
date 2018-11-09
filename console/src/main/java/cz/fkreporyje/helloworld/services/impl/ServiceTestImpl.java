package cz.fkreporyje.helloworld.services.impl;

import cz.fkreporyje.helloworld.services.ServiceTest;

import java.util.Comparator;
import java.util.List;

public class ServiceTestImpl implements ServiceTest {
    @Override
    public int returnMaxValueFromList(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder()).get();
    }
}
