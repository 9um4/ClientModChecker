package io.github.gum4.clientmodchecker;

import io.github.gum4.clientmodchecker.events.ClientChecker;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ClientModChecker extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ClientChecker(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
