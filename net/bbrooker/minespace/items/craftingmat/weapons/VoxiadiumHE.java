package net.bbrooker.minespace.items.craftingmat.weapons;

import java.util.Random;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.MCSpaceInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VoxiadiumHE extends Item {
	
	public VoxiadiumHE(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("VoxiadiumHE");
		setTextureName("minespace" + ":" + "CraftingMat" + "/" + "Weapons" + "/" + "VoxiadiumHE");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[GS] Use for exchange item"); //EDIT HERE
		}
		
	}