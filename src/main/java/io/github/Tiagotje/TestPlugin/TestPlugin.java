package io.github.Tiagotje.TestPlugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getLogger().info("TestPlugin has started!");

	}
	
	@Override
	public void onDisable(){
		getLogger().info("TestPlugin has disabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("OPME") && sender instanceof Player) {
			sender.setOp(true);
			sender.sendMessage("You're op now!");
			
			
		}else if(cmd.getName().equalsIgnoreCase("online") && sender instanceof Player){
			sender.sendMessage("You're online! (But are lagging like apeshit)");
			
			
		}else if(cmd.getName().equalsIgnoreCase("glowstonePlease") && sender instanceof Player){
			((Player) sender).getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
		}
		else{
			return false;
		}

		return true; 
	}
	
	
	
}
