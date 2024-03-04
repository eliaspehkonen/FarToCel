public class FahrtToCel {
    public static float convertFahrt(float f) {
        float c = (float) ((f - 32) * 5.0 / 9.0);
        return Math.round(c);
    }

    public static float kelvinToCel(float kel){
        return (float) (kel-273.15);
    }

    public static float kelvinToFahrt(float kel){
        return (float) ((kel-273.15) * (9/5) + 32);
    }
}
