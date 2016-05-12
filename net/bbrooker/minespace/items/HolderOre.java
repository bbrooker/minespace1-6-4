package net.bbrooker.minespace.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolderOre extends Item {
	
	public HolderOre(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName("HolderEcon");
		setTextureName("minespace" + ":" + "HolderOre");
	}


}
