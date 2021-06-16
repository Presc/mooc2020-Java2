public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Cat");
    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}