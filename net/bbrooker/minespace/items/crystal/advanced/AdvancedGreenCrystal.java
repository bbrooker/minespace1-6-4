package net.bbrooker.minespace.items.crystal.advanced;

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

public class AdvancedGreenCrystal extends Item {
	
	public AdvancedGreenCrystal(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("AdvancedGreenCrystal");
		setTextureName("minespace" + ":" + "Crytals" + "/" + "Advanced" + "/" + "AdvancedGreenCrystal");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[VERY-RARE] A Custom Green Power Crystal transform");
		}
		
	}
