import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Sharik", 500, 20),
                new Cat("Murka", 30, 0),
                new Dog("Wolf", 1500, 200),
                new Cat("Barsik", 100, 10 ),
                new Cat("Hooligan", 200, 20)
        };


        //let's start the competition
        System.out.println("Початок змагань ");
        System.out.println(" в змаганнях приймають участь \n " + Cat.getCount() + " котів \n " + Dog.getCount() + " собак");

        //running track
        System.out.println("1. бігова доріжка");
        List<Integer> rollingDistance = Arrays.asList(10, 100, 500, 1000, 1500);
        for (Integer distance : rollingDistance) {
            System.out.println("відстань " + distance + " метрів");
            for (int i = 0; i < animals.length; i++) {
                animals[i].scopeRunning(distance);
            }
            System.out.println("--------------------------------");
        }

        System.out.println("ЗМАГАННЯ З БІГУ ЗАКІНЧЕНІ \n");

        //running pool
        System.out.println("2. басейн");
        List<Integer> poolDistance = Arrays.asList(10, 20, 100);
        for (Integer distance : poolDistance) {
            System.out.println("відстань " + distance + " метрів");
            for (int i = 0; i < animals.length; i++) {
                animals[i].scopeSwimming(distance);
            }
            System.out.println("--------------------------------");
        }

        //


    }
}
