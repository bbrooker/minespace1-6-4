package net.bbrooker.minespace.creativetabs;

import net.bbrooker.minespace.MineSpace;
import net.bbrooker.minespace.creativetabs.*;
import net.minecraft.creativetab.CreativeTabs;

public class MineSpaceTabs extends CreativeTabs{

	public MineSpaceTabs(int par1, String par2Str) {
		super(par1, par2Str);

	}

	public int getTabIconItemIndex(){
		return MineSpace.ModHolder.itemID;
	}
	
	public String getTranslateTabLabel()
	{
		return "Infectionz";
	}
}

