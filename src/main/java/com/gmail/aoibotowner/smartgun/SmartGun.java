package com.gmail.aoibotowner.smartgun;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class SmartGun extends JavaPlugin {
    private static SmartGun plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
