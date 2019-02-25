public abstract class Upgrades implements Ship{

    private SpaceShip ship;

    public Upgrades (SpaceShip ship){
        this.ship = ship;
    }

    @Override
    public String getName() {
        return ship.getName();
    }

    @Override
    public int getTotalHitPoints() {
        return ship.getTotalHitPoints();
    }

    @Override
    public int getCurrentHitPoints() {
        return ship.getCurrentHitPoints();
    }

    @Override
    public void underAttack(SpaceShip attacker) {
        ship.underAttack(attacker);
    }

    @Override
    public boolean isDestroyed() {
        return ship.isDestroyed();
    }

    public int getDamage(){return ship.getDamage();}

    public void deductHitPoints(int amount){ship.deductHitPoints(amount);}
}
