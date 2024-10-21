public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("рекс","німецька вівчарка ");
        Cat cat = new Cat("чорний ","мурчик");

        System.out.println(dog.info());
        System.out.println(cat.info());

        System.out.println(dog.speak());
        System.out.println(cat.speak());

    }
}