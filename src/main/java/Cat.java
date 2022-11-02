public class Cat extends Animal{
    private String name;
    private static int count = 0;


    public Cat(String name, int rollingDistance, int swimmingDistance) {
        super(rollingDistance, swimmingDistance);
        this.name = name;
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void scopeRunning(int distance) {
        if (distance <= this.getRollingDistance()) {
            System.out.println("Кіт " + name + " зміг пробігти " + distance + " метрів.");
        } else System.out.println("Кіт " + name + " не може пробігти " + distance + " метрів.");
    }

    @Override
    public void scopeSwimming(int distance) {
        if (this.getSwimmingDistance() == 0) {
            System.out.println("Кіт " + name + " не вміє плавати!");
        } else if(distance <= this.getSwimmingDistance()) {
            System.out.println("Кіт " + name + " проплив " + distance + " метрів.");
        } else System.out.println("Кіт " + name + " не може пропливти " + distance + " метрів.");
    }
}
