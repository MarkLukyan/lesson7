package Game;

public class TrainingGraund {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Warrior");
        warrior.attackEnemy();

        Hero mage = new Mage("Mage");
        mage.attackEnemy();

        Hero archer = new Archer("Archer");
        archer.attackEnemy();
    }
}
