/**
 * One of three upgraded ships that players can choose when they reach level
 * 10.  This ship does 50% more damage with its upgraded weapons.
 *
 * Created by Bobby on 6/30/2017.
 */
public class Gunship extends Upgrades {
    /**
     * Creates a basic, level-1 ship with the given name.
     *
     * @param ship The original ship
     */
    public Gunship(SpaceShip ship) {
        super(ship);
    }

    /**
     * The gunship's massive laser cannons do 50% more damage.
     *
     * @return The base damage of the ship increased by 50%.
     */
    @Override
    public int getDamage() {
        return (int)(super.getDamage() * 1.5);
    }
}
