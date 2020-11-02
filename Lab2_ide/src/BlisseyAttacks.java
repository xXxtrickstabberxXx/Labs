import ru.ifmo.se.pokemon.*;

class Psychic extends SpecialMove {
    protected Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return ("применяет Psychic");
    }
}

class Refresh extends StatusMove {
    protected Refresh() {
        super(Type.NORMAL, 0, 100);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        Status c = pokemon.getCondition();
        Effect e = new Effect().condition(Status.NORMAL);
        if (c.equals(Status.PARALYZE) || c.equals(Status.BURN) || c.equals(Status.POISON)) pokemon.addEffect(e);
    }

    protected String describe() {
        return ("применяет Refresh");
    }
}

class MudBomb extends SpecialMove {
    protected MudBomb() {
        super(Type.GROUND, 65, 85);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3).stat(Stat.ACCURACY, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return ("применяет Mud Bomb");
    }
}

class Blizzard extends SpecialMove {
    protected Blizzard() {
        super(Type.ICE, 110, 70);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1);
        e.freeze(pokemon);
    }

    protected String describe() {
        return ("применяет Blizzard");
    }
}