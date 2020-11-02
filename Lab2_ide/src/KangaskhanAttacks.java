import ru.ifmo.se.pokemon.*;

class TailWhip extends StatusMove {
    protected TailWhip() {
        super(Type.NORMAL, 0, 100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, -1);
    }

    protected String describe() {
        return ("применяет Tail Whip");
    }
}

class RockSlide extends PhysicalMove {
    protected RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3);
        e.flinch(pokemon);
    }

    protected String describe() {
        return ("применяет Rock Slide");
    }
}

class CrushClaw extends PhysicalMove {
    protected CrushClaw() {
        super(Type.NORMAL, 75, 95);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.5).stat(Stat.DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return ("применяет Crush Claw");
    }
}

class Confide extends StatusMove {
    protected Confide() {
        super(Type.NORMAL, 0, 100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    protected String describe() {
        return ("применяет Confide");
    }
}
