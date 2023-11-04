package me.mill_floverr.passionandpersistence.Listeners;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerSneakListener implements Listener {
    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();

        Location playerLocation = new Location(world,
                player.getLocation().getX(), player.getLocation().getY() + 1, player.getLocation().getZ());

        Location blockLocation = new Location(world,
                player.getLocation().getX(), Math.round(player.getLocation().getY()) - 1, player.getLocation().getZ());

        if (blockLocation.getBlock().getType().name().contains("_BED")) {
            player.spawnParticle(Particle.HEART, playerLocation, 2, .5, .5, .5);
        }
    }
}
