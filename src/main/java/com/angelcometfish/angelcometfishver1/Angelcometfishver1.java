package com.angelcometfish.angelcometfishver1;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class Angelcometfishver1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void onKill(PlayerDeathEvent e){
        Random rand = new Random();
        int num = rand.nextInt(10);
        Player p = e.getEntity().getKiller();
        assert p != null;
        if(num<5){
            p.sendMessage("5以上です");
            p.getInventory().addItem(new ItemStack(Material.DIAMOND));
    }else{
            p.sendMessage("どんまいｗ");
        }
}}
