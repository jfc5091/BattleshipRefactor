public abstract class Upgrades extends SpaceShip{

    private SpaceShip ship;

    public Upgrades (SpaceShip ship){
        super(ship.getName());
        this.ship = ship;
    }

    public int getDamage(){return this.ship.getDamage();}

    public void deductHitPoints(int amount){this.ship.deductHitPoints(amount);}

    public void shieldProtection(){this.ship.shieldProtection();}
}
