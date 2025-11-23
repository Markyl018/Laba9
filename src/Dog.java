
public class Dog extends Animal{
    Dog(String _name, int _height, int _weight, String _color){
        this.name = _name;
        this.height = _height;
        this.weight = _weight;
        this.color = _color;
    }
    @Override
    void eat(){
        System.out.println("Dog ate");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }
    @Override
    void makeSound(){
        System.out.println("Woof!");
    }
}
