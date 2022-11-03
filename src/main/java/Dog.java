public class Dog extends Animal{
    private String name;
    private static final int MAX_ROLLING_DISTANCE = 500;
    private static final int MAX_SWIMMING_DISTANCE = 10;
    private static int countDogs = 0;


    public Dog(String name) {
        this.name = name;
        countDogs += 1;
    }

    public static int getCount() {
        return countDogs;
    }

    @Override
    public void scopeRunning(int distance) {
        if (distance <= MAX_ROLLING_DISTANCE) {
            System.out.println("Пес " + name + " зміг пробігти " + distance + " метрів.");
        } else System.out.println("Пес " + name + " не може пробігти " + distance + " метрів.");
    }

    @Override
    public void scopeSwimming(int distance) {
        if(distance <= MAX_SWIMMING_DISTANCE) {
            System.out.println("Пес " + name + " проплив " + distance + " метрів.");
        } else System.out.println("Пес " + name + " не може пропливти " + distance + " метрів.");
    }

}
