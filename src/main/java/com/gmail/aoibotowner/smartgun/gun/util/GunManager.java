package com.gmail.aoibotowner.smartgun.gun.util;

import com.gmail.aoibotowner.smartgun.SmartGun;
import com.gmail.aoibotowner.smartgun.gun.TestGun;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class GunManager {
    public static Launchable getGun(Player owner, ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer data = meta.getPersistentDataContainer();
        String name = data.get(new NamespacedKey(SmartGun.getPlugin(), "gun_type"), PersistentDataType.STRING);
        if(name.equals("TestGun")) {
            return new TestGun(owner);
        }
        return null;
    }
}
