package racing;

import java.util.List;

public class ResultView {
    public static void printResult(List<Car> cars) {
        for(Car car:cars) {
            System.out.println(car.toString());
        }
        System.out.println();
    }
}
