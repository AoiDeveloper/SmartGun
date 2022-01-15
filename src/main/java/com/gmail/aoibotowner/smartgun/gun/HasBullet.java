package com.gmail.aoibotowner.smartgun.gun;

public interface HasBullet {
    int reloadBullet(int amount);
    void setBullet(int amount);
    void setMaxBullet(int amount);
    int getBullet();
    int getMaxBullet();
}
