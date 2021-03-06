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

public class IradiumCore extends Item {
	
	public IradiumCore(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("IradiumCore");
		setTextureName("minespace" + ":" + "CraftingMat" + "/" + "Armour" + "/" + "IradiumCore");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[CORE] Use to craft Rare Armour"); //EDIT HERE
		}
		
	}