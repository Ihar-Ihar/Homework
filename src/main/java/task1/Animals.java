package task1;

public abstract class Animals {

    Animals(String name ){
        this.name =name;
        animalCount++;
    }

    private String name;
    private static int animalCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);

}
