import model.Car;
import service.RaceService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList();
        for (int i=1;i<4; i++) {
            System.out.printf("— Введите название машины №:%d%n", i);
            String name = scanner.next();
            boolean valid =false;
            int speed = 0;
            while (!valid) {
                System.out.printf("— Введите скорость машины №%d%n", i);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250)
                        valid = true;
                    else {
                        System.err.println("— Ошибка ввода. Введенное значение должно быть в интервале от 0 до 250 (включительно)");
                    }
                } else {
                    System.err.println("— Ошибка ввода. Введено не целое число");
                    scanner.next();
                }
            }
            cars.add(new Car(name, speed));
        }

        Car winnerCar = new RaceService().getWinnerCar(cars);
        if (winnerCar ==null)
            System.err.println("— Ошибка расчета. Машины не были созданы");
        else
            System.out.printf("— Самая быстрая машина: %s%n", winnerCar.getName());
    }
}