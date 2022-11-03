import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Sharik"),
                new Dog("Wolf"),
                new Cat("Barsik"),
                new Cat("Hooligan")
        };

        //let's start the competition
        System.out.println("В змаганнях приймають участь - " + Animal.getCountAllAnimals() + " тварин(и):" +
                "\n " + Cat.getCount() + " - котів \n " + Dog.getCount() + " - собак");
        System.out.println("Початок змагань!");

        //running track
        System.out.println(" 1. біг");
        List<Integer> rollingDistance = Arrays.asList(100, 200, 500);
        for (Integer distance : rollingDistance) {
            System.out.println("- відстань " + distance + " метрів");
            for (int i = 0; i < animals.length; i++) {
                animals[i].scopeRunning(distance);
            }
            System.out.println("--------------------------------");
        }

        System.out.println("ЗМАГАННЯ З БІГУ ЗАКІНЧЕНІ \n");

        //running pool
        System.out.println(" 2. плавання");
        List<Integer> swimmingDistance = Arrays.asList(10, 20);
        for (Integer distance : swimmingDistance) {
            System.out.println("- відстань " + distance + " метрів");
            for (int i = 0; i < animals.length; i++) {
                animals[i].scopeSwimming(distance);
            }
            System.out.println("--------------------------------");
        }

    }
}
