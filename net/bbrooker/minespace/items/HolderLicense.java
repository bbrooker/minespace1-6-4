package net.bbrooker.minespace.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolderLicense extends Item {
	
	public HolderLicense(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName("HolderEcon");
		setTextureName("minespace" + ":" + "HolderEcon");
	}


}
