public class Dog extends Animal{
    private String name;
    private static int count;


    public Dog(String name, int rollingDistance, int swimmingDistance) {
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
            System.out.println("Пес " + name + " зміг пробігти " + distance + " метрів.");
        } else System.out.println("Пес " + name + " не може пробігти " + distance + " метрів.");
    }

    @Override
    public void scopeSwimming(int distance) {
        if (this.getSwimmingDistance() == 0) {
            System.out.println("Пес " + name + " не вміє плавати!");
        } else if(distance <= this.getSwimmingDistance()) {
            System.out.println("Пес " + name + " проплив " + distance + " метрів.");
        } else System.out.println("Пес " + name + " не може пропливти " + distance + " метрів.");
    }

}
