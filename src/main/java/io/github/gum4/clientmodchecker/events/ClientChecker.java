package io.github.gum4.clientmodchecker.events;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ClientChecker implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        String clientBrandName = player.getClientBrandName();
        if (!clientBrandName.equalsIgnoreCase("vanilla")){
            player.kick(
                    Component.text("모드를 적용한 플레이어는 입장하실 수 없습니다.")
            );
        }
    }
}
