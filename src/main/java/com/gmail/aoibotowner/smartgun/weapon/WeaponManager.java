package com.gmail.aoibotowner.smartgun.weapon;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

public class WeaponManager {
    static HashMap<ItemStack, Weapon> weponMap = new HashMap<ItemStack, Weapon>();
    public static void registerWeapons(ItemStack preparedItem, Weapon asWeapon) {
        weponMap.put(preparedItem, asWeapon);
    }

    public static Weapon getWepon(ItemStack preparedItem) {
        return weponMap.get(preparedItem);
    }

    public static boolean isWepon(ItemStack preparedItem) {
        return weponMap.containsKey(preparedItem);
    }
}