
import T1.FahrToCelc;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrToCelTest {
    // initial method
    @Test
    void convertFahr() {
        int test = (FahrToCelc.convertFahr(32));

        assertEquals(0, test);

    }


    // Add in the class demo
    @Test
    void convertCel(){
        int test= (FahrToCelc.convertCel(20));
        assertEquals(68,test);
    }

    // Inclass exercise
    @Test
    void convertKel(){
        int test= (FahrToCelc.kelvintoCel(273));
        assertEquals(0,test);
    }

    @Test
    void convertKeltoFarTest() {
        double test =Math.round(FahrToCelc.kelvinToFah(300.1));
        assertEquals(59.0, test);
    }
}