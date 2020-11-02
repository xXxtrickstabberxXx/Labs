import ru.ifmo.se.pokemon.*;

class Agility extends StatusMove {
    protected Agility() {
        super(Type.PSYCHIC, 0, 100);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 2);
    }

    protected String describe() {
        return ("применяет Agility");
    }
}

class Roost extends StatusMove {
    protected Roost() {
        super(Type.FLYING, 0, 100);
    }

    protected void applySelfEffects(Pokemon pokemon) {
        double max_hp = pokemon.getStat(Stat.HP);
        pokemon.setMod(Stat.HP, (int) -max_hp / 2);
    }

    protected String describe() {
        return ("применяет Roost");
    }
}

class DragonClaw extends PhysicalMove {
    protected DragonClaw() {
        super(Type.DRAGON, 80, 100);
    }

    protected String describe() {
        return ("применяет Dragon Claw");
    }
}

class FocusBlast extends SpecialMove {
    protected FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return ("применяет Focus Blast");
    }
}