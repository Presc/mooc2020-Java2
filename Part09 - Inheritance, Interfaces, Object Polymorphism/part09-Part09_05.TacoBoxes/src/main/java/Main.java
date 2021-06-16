
public class Main {

    public static void main(String[] args) {
        TripleTacoBox tacoTriple = new TripleTacoBox();
        CustomTacoBox tacoCustom = new CustomTacoBox(5);
        
        tacoTriple.eat();
        tacoCustom.eat();
    }
}
