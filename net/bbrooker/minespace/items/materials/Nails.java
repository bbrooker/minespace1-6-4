package net.bbrooker.minespace.items.materials;

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

public class Nails extends Item {
	
	public Nails(int id) {
		super(id);
		setMaxStackSize(100);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("Nails");
		setTextureName("minespace" + ":" + "Materials" + "/" + "Nails");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("Tool that use to craft weapon and other things");
		}
		
	}