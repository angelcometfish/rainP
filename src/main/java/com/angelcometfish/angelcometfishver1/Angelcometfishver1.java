package com.angelcometfish.angelcometfishver1;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
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
    public void onKill(EntityDeathEvent e){
        Random rand = new Random();
        int num = rand.nextInt(100);
        Player p = e.getEntity().getKiller();
        String w = e.getEntity().getName();
        assert p != null;
        if (1 == num) {
                p.sendMessage("特に何もないよ");
            } else {
                ItemStack myitem = new ItemStack(Material.DIAMOND);
                String dispname = w+"の心";
                List lores = new ArrayList();
                lores.add(w+"の心");
                lores.add("めっちゃレア");
                myitem.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
                ItemMeta im = myitem.getItemMeta();
                assert im != null;
                im.setDisplayName(dispname);
                im.setLore(lores);
                myitem.setItemMeta(im);
                p.sendMessage(w + "の心をドロップしました");
                p.getInventory().addItem(myitem);
        }
    }}
