package com.gmail.aoibotowner.smartgun.gun;

import com.gmail.aoibotowner.smartgun.bullet.ammo.AmmoType;
import com.gmail.aoibotowner.smartgun.gun.util.GunType;
import com.gmail.aoibotowner.smartgun.gun.util.Launchable;
import com.gmail.aoibotowner.smartgun.gun.util.Loadable;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.util.Vector;

public class TestGun implements Launchable, Loadable {
    private final GunType gunType = GunType.TEST_GUN;
    private final AmmoType ammoType = AmmoType.PISTOL;
    private int remaining = 0;
    private final Player owner;
    public TestGun(Player owner) {
        this.owner = owner;
    }
    @Override
    public void launch() {
        Vector facing = owner.getLocation().getDirection();

        Projectile projectile = owner.launchProjectile(Snowball.class, facing);
        projectile.setGravity(false);
        projectile.setSilent(true);
    }

    @Override
    public GunType getGunType() {
        return this.gunType;
    }

    @Override
    public AmmoType getAmmoType() {
        return this.ammoType;
    }

    @Override
    public void load(int amount) {
        this.remaining += amount;
    }

    @Override
    public int getRemaining() {
        return remaining;
    }

    @Override
    public void setRemaining(int amount) {
        this.remaining = amount;
    }
}
