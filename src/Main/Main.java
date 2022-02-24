package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money, weather;
        System.out.print("Введите количество денег (0 - мало, 1 - много): ");
        money = in.nextInt();
        System.out.print("Введите состояние погоды (0 - плохая, 1 - хорошая): ");
        weather = in.nextInt();
        Person person=new Person();
        if (money == 0 && weather == 0){
            person.SetTransport(new StrategyBus());
        }
        if (money == 1 && weather == 0){
            person.SetTransport(new StrategyTrain());
        }
        if (weather == 1){
            person.SetTransport(new StrategyBicycle());
        }
        person.ExecuteTransport();

    }
}
