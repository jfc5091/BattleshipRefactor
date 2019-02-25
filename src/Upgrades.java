public abstract class Upgrades implements Ship{

    private Ship ship;

    public Upgrades (Ship ship){
        this.ship = ship;
    }

    public int getDamage(){return this.ship.getDamage();}

    public void deductHitPoints(int amount){this.ship.deductHitPoints(amount);}

    public void shieldProtection(){this.ship.shieldProtection();}
}
