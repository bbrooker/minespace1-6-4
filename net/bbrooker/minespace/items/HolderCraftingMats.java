package net.bbrooker.minespace.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HolderCraftingMats extends Item {

	public HolderCraftingMats(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName("Aluminium");
		setTextureName("minespace" + ":" + "holdercraftingmats");
	}
}
