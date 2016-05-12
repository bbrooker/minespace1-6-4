package net.bbrooker.minespace.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolderMaterials extends Item {
	
	public HolderMaterials(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName("HolderEcon");
		setTextureName("minespace" + ":" + "HolderMaterials");
	}


}
