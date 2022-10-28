package algotank;

public class Tank {

    private Triggerable triggerable;

    private int INITIAL_RESISTANCE = 100;
    private Resistance resistance;

    private int INITIAL_SPEED = 100;
    private Speed speed;
    private Projectile projectileSpeed;

    public Tank(Resistance resistance) {
        this.resistance = new Resistance(INITIAL_RESISTANCE);
        this.triggerable = new Cannon();
        this.speed = new Speed(INITIAL_SPEED);

    }

    public int getResistance() {
        return this.resistance.getValue();
    }

    public void toShoot() {
        this.triggerable.toShoot();
    }

    public void receiveProjectile(Projectile projectile) {
        this.resistance.lowerResistance(projectile.getDestructivePower();
    }

    public boolean isAlive() {
        return this.resistance.getValue() > 0;
    }

    public void receiveWeapon(Triggerable triggerable) {
        this.triggerable = triggerable;
    }

    public void receiveLifeBonus(Bonus bonus) {
        this.resistance.increaseResistance(bonus.getLifeBonus());
    }

    public void receiveAttackSpeedBonus(Bonus bonus, Projectile projectile) {
        this.speed.increaseSpeed(bonus.getAttackSpeedBonus());
        this.projectileSpeed.increaseProjectileSpeed(bonus.getAttackSpeedDisBOnus());
    }


}

