public abstract class Animal {

    private int rollingDistance;
    private int swimmingDistance;

    public Animal(int rollingDistance, int swimmingDistance) {
        this.rollingDistance = rollingDistance;
        this.swimmingDistance = swimmingDistance;
    }

    public int getRollingDistance() {
        return rollingDistance;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }

    public abstract void scopeRunning (int distance);

    public abstract void scopeSwimming (int distance);


}
