package T1;

public class FahrToCelc {
    public Double fahrToCelc(Double fahr) {
        return (fahr - 32) * 5 / 9;
    }
    public static float kelvintoCel(float kel){
        return (float) (kel-273.15);
    }
    public double kelvintoFahr(double kel){
        return (kel-273.15)*9/5+32;
    }
}
