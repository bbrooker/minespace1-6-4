package net.bbrooker.minespace.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolderCrystal extends Item {

	
	public HolderCrystal(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName("HolderCrystal");
		setTextureName("minespace" + ":" + "holdercraftingmats");
	}
}

