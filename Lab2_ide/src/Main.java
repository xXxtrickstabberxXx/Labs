
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Happiny("Happiny", 1));
        b.addAlly(new Archeops("Archeops", 1));
        b.addAlly(new Kangaskhan("Kangaskhan", 1));
        b.addFoe(new Chansey("Chansey", 1));
        b.addFoe(new Archen("Archen", 1));
        b.addFoe(new Blissey("Blissey", 1));
        b.go();
    }
}



