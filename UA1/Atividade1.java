public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " está comendo.");
    }
}

public interface Flyable {
    void fly();
}

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " está voando.");
    }
}

public class Ostrich extends Bird {

    public Ostrich(String name) {
        super(name);
    }

}

public class Zoo {
    public static void main(String[] args) {
        Bird[] aviary = { new Sparrow("Tico"), new Ostrich("Olívia") };
        for (Bird bird : aviary) {
            bird.eat();
            
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            } else {
                System.out.println(bird.getName() + " não pode voar.");
            }
        }
    }
}