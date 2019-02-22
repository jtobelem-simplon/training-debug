package debug.temperature;

public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = Math.round((temperature - 32) * (5/9.0)*Math.pow(10,15))/Math.pow(10,15);
        return celsius;
    }
}