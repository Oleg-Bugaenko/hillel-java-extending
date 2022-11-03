public abstract class Animal {
    private static int countAllAnimals = 0;

    public Animal() {
        countAllAnimals += 1;
    }

    public static int getCountAllAnimals() {
        return countAllAnimals;
    }

    public abstract void scopeRunning (int distance);

    public abstract void scopeSwimming (int distance);


}
