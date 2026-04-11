package task1;

public class Dog extends Animals {

    Dog(String name) {
        super(name);
        dogCount++;
    }

    private static int dogCount;

    public static int getDogCount(){
        return dogCount;
    }

    @Override
    protected void run(int distance) {
        if (distance < 0) {
            System.out.println("значение " + distance + " должно быть положительным");
        } else if (distance > 500) {
            System.out.println("Собака не может пробежать больше 500 метров");
        } else {
            System.out.println("собака пробежала " + distance + " метров");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance < 0) {
            System.out.println("значение " + distance + " должно быть положительным");
        } else if (distance > 10) {
            System.out.println("Собака не может проплыть больше 10 метров");
        } else {
            System.out.println("собака проплыла " + distance + " метров");
        }
    }
}
