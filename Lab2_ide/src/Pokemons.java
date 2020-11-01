import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setStats(100, 5, 5, 15, 65, 30);
        setType(Type.NORMAL);
        setMove(new Refresh(), new Psychic());
    }
}

class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        setStats(250, 5, 5, 35, 105, 50);
        setType(Type.NORMAL);
        setMove(new Refresh(), new Psychic(), new MudBomb());
    }
}

class Blissey extends Chansey {
    public Blissey(String name, int level) {
        super(name, level);
        setStats(255, 10, 10, 75, 135, 55);
        setType(Type.NORMAL);
        setMove(new Refresh(), new Psychic(), new MudBomb(), new Blizzard());
    }
}

class Archen extends Pokemon {
    public Archen(String name, int level) {
        super(name, level);
        setStats(55, 112, 45, 74, 45, 70);
        setType(Type.ROCK, Type.FLYING);
        setMove(new Agility(), new Roost(), new DragonClaw());
    }
}

class Archeops extends Archen {
    public Archeops(String name, int level) {
        super(name, level);
        setStats(75, 140, 65, 112, 65, 110);
        setType(Type.FLYING, Type.ROCK);
        setMove(new Agility(), new Roost(), new DragonClaw(), new FocusBlast());
    }
}

class Kangaskhan extends Pokemon {
    public Kangaskhan(String name, int level) {
        super(name, level);
        setStats(105, 95, 80, 40, 80, 90);
        setType(Type.NORMAL);
        setMove(new TailWhip(), new RockSlide(), new CrushClaw(), new Confide(), new Confide());
    }
}