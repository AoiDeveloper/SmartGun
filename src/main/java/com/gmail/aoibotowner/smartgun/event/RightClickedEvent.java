package com.gmail.aoibotowner.smartgun.event;

import com.gmail.aoibotowner.smartgun.SmartGun;
import com.gmail.aoibotowner.smartgun.gun.util.GunManager;
import com.gmail.aoibotowner.smartgun.gun.util.Launchable;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class RightClickedEvent {
    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if(event.getAction()!=Action.RIGHT_CLICK_AIR && event.getAction()!=Action.RIGHT_CLICK_BLOCK) return;
        ItemMeta meta = event.getItem().getItemMeta();
        PersistentDataContainer data = meta.getPersistentDataContainer();
        if(data.has(new NamespacedKey(SmartGun.getPlugin(), "gun"),PersistentDataType.STRING)) {
            Launchable gun = GunManager.getGun(event.getPlayer(), event.getItem());
            gun.launch();
        }
    }
}
