package net.bbrooker.minespace.items.craftingmat.armour;

import java.util.Random;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IIXNanoFiberMetal extends Item {
	
	public IIXNanoFiberMetal(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("IIXNanoFiberMetal");
		setTextureName("minespace" + ":" + "CraftingMat" + "/" + "Armour" + "/" + "IIXNanoFiberMetal");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[ARMAT] Use to craft armour"); //EDIT HERE
		}
		
	}
