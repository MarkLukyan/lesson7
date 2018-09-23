package Game;

public abstract class Hero {

    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void attackEnemy() {
        System.out.println(getName() + " атакует противника");
    }
}

