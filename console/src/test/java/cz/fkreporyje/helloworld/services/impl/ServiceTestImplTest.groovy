package cz.fkreporyje.helloworld.services.impl

import cz.fkreporyje.helloworld.services.ServiceTest
import org.junit.Assert
import org.junit.Test

class ServiceTestImplTest {

    @Test
    void testReturnMaxValueFromList() {
        ServiceTest serviceTest = new ServiceTestImpl();
        List<Integer> list = Arrays.asList(1,2,3,4,8,10,5,6);
        int maxValueFromList = serviceTest.returnMaxValueFromList(list);
        Assert.assertEquals(10,maxValueFromList);
    }
}
