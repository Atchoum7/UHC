package net.samagames.uhc.events;

import net.samagames.uhc.UHC;
import net.samagames.uhc.arena.ArenaCommon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class UHCPlayerDropItemEvent implements Listener
{
    @EventHandler
    public void event(PlayerDropItemEvent event)
    {        
        Player player = event.getPlayer();
        ArenaCommon arena = UHC.getPlugin().getArena();
        
        if(!arena.isGameStarted())
        {
            event.setCancelled(true);
        }
        else
        {            
            if(!arena.hasPlayer(player))
            {
                event.setCancelled(true);
            }
        }
    }
}