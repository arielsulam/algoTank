package algotank;

import java.util.ArrayList;

public abstract class FiniteAmmoGun implements Triggerable {

    private int projectileSpeed;

    private int PROJECTILE_SPEED = 100;

    private final ArrayList<Proyectil> projectiles = new ArrayList<Proyectil>();

    public ArmaMunicionFinita(int projectileQuantity) {
        for (int i = 0; i < cantidadProyectiles; i++) {
            this.projectiles.add(new Projectil());
        }
    }

    // Shooting method

    public void toShoot() {
        this.projectiles.remove(0);
    }
}
