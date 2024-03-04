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

    public static void main(String[] args) {
        FahrtToCel ftc = new FahrtToCel();
        System.out.println("32 F is " + ftc.convertFahrt(32) + " °C");
        System.out.println("212 F is " + ftc.convertFahrt(212) + " °C");
        System.out.println("98,6 F is " + ftc.convertFahrt(98.6f) + " °C");
        System.out.println("68 F is " + ftc.convertFahrt(68) + " °C");
        System.out.println("273,15 K is " + ftc.kelvinToCel(273.15f) + " °C");
        System.out.println("373,15 K is " + ftc.kelvinToCel(373.15f) + " °C");
        System.out.println("310,15 K is " + ftc.kelvinToCel(310.15f) + " °C");
        System.out.println("293,15 K is " + ftc.kelvinToCel(293.15f) + " °C");
        System.out.println("300,1 K is " + ftc.kelvinToFahrt(300.1F) + " F");
    }
}
