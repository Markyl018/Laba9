
public class Cat extends Animal{
    Cat(String _name, int _height, int _weight, String _color){
        this.name = _name;
        this.height = _height;
        this.weight = _weight;
        this.color = _color;
    }
    @Override
    void eat(){
        System.out.println("Cat ate");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleeps");
    }
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}
