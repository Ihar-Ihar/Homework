package task1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bax");
        Dog dog2 = new Dog("Max");

        Cat cat1 = new Cat("Simba");
        Cat cat2 = new Cat("Bars");
        Cat cat3 = new Cat("Lars");

        System.out.println("количество котов " + Cat.getCatCount());
        System.out.println("количество собак " + Dog.getDogCount());
        System.out.println("количество животных " + Animals.getAnimalCount());

        dog1.run(250);
        dog2.run(600);
        dog1.swim(15);
        dog2.swim(5);

        cat1.run(100);
        cat2.run(250);
        cat1.swim(10);
        cat2.swim(-100);

        Cat[] cats = new Cat[]{
                cat1, cat2, cat3
        };

        Bowl bowl = new Bowl();
        bowl.addFood(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, 20);
            cats[i].isSatiety();
        }
    }
}
