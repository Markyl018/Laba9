class Main{
    static void main(String[] args){
        Dog John = new Dog("John", 60, 20, "Black");

        Cat Andrew = new Cat("Andrew", 30, 8, "Grey");

        Cow Martha = new Cow("Martha", 150, 300, "white-brown");

        John.makeSound();
        John.eat();
        John.sleep();
        John.infoOut();

        Andrew.makeSound();
        Andrew.eat();
        Andrew.sleep();
        Andrew.infoOut();

        Martha.makeSound();
        Martha.eat();
        Martha.sleep();
        Martha.infoOut();
    }
}
