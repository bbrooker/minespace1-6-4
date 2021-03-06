package net.bbrooker.minespace.items.materials.coreevol;

import java.awt.Color;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrystalEvol extends Item {
	
	public CrystalEvol(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("Fiber");
		setTextureName("minespace" + ":" + "Materials" + "/" + "CoreEvol" + "/" + "CrystalEvol");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add(Color.ORANGE + "[EVOL]" + Color.GREEN + "Use to upgrade crystal");
		}
		
	}
