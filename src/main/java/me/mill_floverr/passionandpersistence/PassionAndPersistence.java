package me.mill_floverr.passionandpersistence;

import me.mill_floverr.passionandpersistence.Listeners.PlayerSneakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PassionAndPersistence extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[PassionAndPersistence] has been enabled successfully. Start your engines!");

        getServer().getPluginManager().registerEvents(new PlayerSneakListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("[PassionAndPersistence] has been disabled successfully. Don't forget the after-care!");
    }
}
