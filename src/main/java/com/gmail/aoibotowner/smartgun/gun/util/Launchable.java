package com.gmail.aoibotowner.smartgun.gun.util;

import com.gmail.aoibotowner.smartgun.bullet.ammo.AmmoType;

public interface Launchable {
    void launch();
    GunType getGunType();
    AmmoType getAmmoType();
}
