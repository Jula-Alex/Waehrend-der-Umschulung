class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable())
            return 10;
        else 
            return 6;
    }

    @Override 
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}

class Wizard extends Fighter {
    boolean vln = true;
    void prepareSpell() {
        vln = false;
    }

    @Override 
    boolean isVulnerable() {
        return vln;
    }

    void reset() {
        vln = true;
    }

    @Override 
    int getDamagePoints(Fighter fighter) {
        if(this.isVulnerable())
            return 3;
        else
            return 12;
    }

    @Override 
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}
