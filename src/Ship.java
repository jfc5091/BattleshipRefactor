public interface Ship {

    public String getName();

    public int getTotalHitPoints();

    public int getCurrentHitPoints();

    public int getDamage();

    public void underAttack(SpaceShip attacker);

    public boolean isDestroyed();

    public void deductHitPoints(int amount);
}
