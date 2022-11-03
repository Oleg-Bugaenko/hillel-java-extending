public class Cat extends Animal{
    private String name;
    private static final int MAX_ROLLING_DISTANCE = 200;
    private static final int MAX_SWIMMING_DISTANCE = 0;
    private static int countCats = 0;


    public Cat(String name) {
        this.name = name;
        countCats += 1;
    }

    public static int getCount() {
        return countCats;
    }

    @Override
    public void scopeRunning(int distance) {
        if (distance <= MAX_ROLLING_DISTANCE) {
            System.out.println("Кіт " + name + " зміг пробігти " + distance + " метрів.");
        } else System.out.println("Кіт " + name + " не може пробігти " + distance + " метрів.");
    }


    @Override
    public void scopeSwimming(int distance) {
        if (MAX_SWIMMING_DISTANCE == 0) {
            System.out.println("Кіт " + name + " не вміє плавати!");
        } else if (distance <= MAX_SWIMMING_DISTANCE) {
            System.out.println("Кіт " + name + " зміг пропливти " + distance + " метрів.");
        } else System.out.println("Кіт " + name + " не може пропливти " + distance + " метрів.");

    }
}
