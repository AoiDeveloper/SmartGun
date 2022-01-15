package com.gmail.aoibotowner.smartgun.gun;

public class Gun implements HasBullet, Launchable {

    private int bullet;
    private int maxBullet;
    private int bulletPerShot;
    private int reloadTime;

    public Gun(int bullet, int maxBullet, int bulletPerShot, int reloadTime) {
        this.bullet = bullet;
        this.maxBullet = maxBullet;
        this.bulletPerShot = bulletPerShot;
        this.setReloadTime(reloadTime);
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    @Override
    public boolean launchWepon() {
        if (this.bullet >= this.bulletPerShot) {
            this.bullet -= this.bulletPerShot;
            return true;
        }
        return false;
    }

    @Override
    public int reloadBullet(int amount) {
        this.bullet += amount;
        if (this.bullet > this.maxBullet) {
            int res = this.bullet - this.maxBullet;
            this.bullet = this.maxBullet;
            return res;
        }
        return 0;
    }

    @Override
    public void setBullet(int amount) {
        this.bullet = amount;
    }

    @Override
    public void setMaxBullet(int amount) {
        this.maxBullet = amount;
    }

    @Override
    public int getBullet() {
        return this.bullet;
    }

    @Override
    public int getMaxBullet() {
        return this.maxBullet;
    }
}
