package task1;

public class Cat extends Animals {

    Cat(String name) {
        super(name);
        catCount++;
        satiety = false;
    }

    private static int catCount;
    private boolean satiety;

    public static int getCatCount() {
        return catCount;
    }

    @Override
    protected void run(int distance) {
        if (distance < 0) {
            System.out.println("значение " + distance + " должно быть положительным");
        } else if (distance > 200) {
            System.out.println("Кот не может пробежать больше 200 метров");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance < 0) {
            System.out.println("значение " + distance + " должно быть положительным");
        } else {
            System.out.println("Коты не умеют плавать");
        }
    }

    public void eat(Bowl bowl, int food) {
        if (food < 0) {
            System.out.println("значение " + food + " должно быть положительным");
        } else if (food > bowl.getFood()) {
            System.out.println(getName() + " не достаточно еды в миске");
        } else {
            System.out.println(getName() + " поел " + food + " еды");
            satiety = true;
            bowl.eatFood(food);
        }
    }
    public void isSatiety() {
        if (satiety){
            System.out.println(getName()+" поел и сыт");
        } else {
            System.out.println(getName()+ " не хватило еды, остался голодным");
        }
    }
}
