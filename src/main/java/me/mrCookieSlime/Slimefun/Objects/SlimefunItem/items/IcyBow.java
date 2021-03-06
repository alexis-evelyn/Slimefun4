package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.items;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunBow;
import me.mrCookieSlime.Slimefun.Objects.handlers.BowShootHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class IcyBow extends SlimefunBow {

	public IcyBow(SlimefunItemStack item, ItemStack[] recipe) {
		super(item, recipe);
	}

	@Override
	public BowShootHandler onShoot() {
		return (e, n) -> {
			n.getWorld().playEffect(n.getLocation(), Effect.STEP_SOUND, Material.ICE);
			n.getWorld().playEffect(n.getEyeLocation(), Effect.STEP_SOUND, Material.ICE);
			n.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * 2, 10));
			n.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 2, -10));
		};
	}
	
	

}
