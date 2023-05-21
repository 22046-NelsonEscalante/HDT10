import java.util.ArrayList;

public class Navigation {
    private int weather;

    public Navigation(int weather) {
        try {
            setWeather(1);
        } catch (Exception e) {
            System.out.println("es imposible que esto se imprima. :b");
        }
    }

    public void setWeather(int weather) throws Exception {
        if ((0 < weather) && (weather < 5)) {
            this.weather = weather;
        } else {
            throw new Exception();
        }
    }

}
