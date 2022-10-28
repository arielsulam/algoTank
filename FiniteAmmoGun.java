package algotank;

import java.util.ArrayList;

public abstract class FiniteAmmoGun implements Triggerable {

    private int projectileSpeed;

    private int PROJECTILE_SPEED = 100;

    private final ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

    public FiniteAmmoGun(int projectileQuantity) {
        for (int i = 0; i < projectileQuantity; i++) {
            this.projectiles.add(new Projectile());
        }
    }

    // Shooting method

    public void toShoot() {
        this.projectiles.remove(0);
    }
}
