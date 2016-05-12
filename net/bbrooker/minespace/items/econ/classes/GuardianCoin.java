package net.bbrooker.minespace.items.econ.classes;

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

public class GuardianCoin extends Item {
	
	public GuardianCoin(int id) {
		super(id);
		setMaxStackSize(1024);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("GuardianCoin");
		setTextureName("minespace" + ":" + "Econ" + "/" + "Classes" + "/" + "GuardianCoin");
	}
	
	@SideOnly(Side.CLIENT) //add item lore
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
		{
		list.add("[GC] Use to exchange rare crystal");
		}
		
	}
