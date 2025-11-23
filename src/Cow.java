public class Cow extends Animal{
    Cow(String _name, int _height, int _weight, String _color){
        this.name = _name;
        this.height = _height;
        this.weight = _weight;
        this.color = _color;
    }
    @Override
    void eat(){
        System.out.println("Cow ate");
    }

    @Override
    void sleep() {
        System.out.println("Cow sleeps");
    }
    @Override
    void makeSound() {
        System.out.println("Mooo");
    }
}
