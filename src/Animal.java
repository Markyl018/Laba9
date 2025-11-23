public abstract class Animal {
    protected String name;
    protected int height;
    protected int weight;
    protected String color;
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
    void infoOut(){
        System.out.println(name + " " + color +" " + height+" "+ weight+ "\n");
    }
}
