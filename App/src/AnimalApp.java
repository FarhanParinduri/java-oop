class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.family);
        cat.makeSound("Meaow");
        cat.getCountFoot();

        Duck duck = new Duck();
        System.out.println(duck.family);
        duck.makeSound("Quack");
        duck.getFavoriteFood();
    }
    
}
