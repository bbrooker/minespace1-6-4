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

public class Screw extends Item {
	
	public Screw(int id) {
		super(id);
		setMaxStackSize(100);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("Screw");
		setTextureName("minespace" + ":" + "Materials" + "/" + "Screw");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("Use to craft many things!");
		}
		
	}
