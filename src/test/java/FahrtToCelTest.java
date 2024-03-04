import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrtToCelTest {
    // Define a small delta value for floating-point comparisons
    private static final double DELTA = 0.001;
    private static final double DELTA2 = 0.1;

    @Test
    public void testConvertFahrt() {
        assertEquals(0, FahrtToCel.convertFahrt(32), DELTA);
        assertEquals(100, FahrtToCel.convertFahrt(212), DELTA);
        assertEquals(37, FahrtToCel.convertFahrt(98.6f), DELTA);
        assertEquals(20, FahrtToCel.convertFahrt(68), DELTA);
    }

    @Test
    public void testKelvinToCel() {
        assertEquals(0, FahrtToCel.kelvinToCel(273.15f), DELTA);
        assertEquals(100, FahrtToCel.kelvinToCel(373.15f), DELTA);
        assertEquals(37, FahrtToCel.kelvinToCel(310.15f), DELTA);
        assertEquals(20, FahrtToCel.kelvinToCel(293.15f), DELTA);
    }

    @Test
    public void testKelvinToFahrt() {
        float test = Math.round(FahrtToCel.kelvinToFahrt(300.1F));
        assertEquals(59.1F, test, DELTA2);
    }
}
