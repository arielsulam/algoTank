package algotank;

public class Projectile {

    private int destructivePower;

    private int projectileSpeed;


    public int getDestructivePower() {
        return destructivePower;
    }

    public void setDestructivePower(int destructivePower) {
        this.destructivePower = destructivePower;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public void setProjectileSpeed(int projectileSpeed) {
        this.projectileSpeed = projectileSpeed;
    }

    public void increaseProjectileSpeed(double multiplier) {
        this.projectileSpeed = (int) (this.projectileSpeed * multiplier);
    }

    //Move
    //Destroy
}
