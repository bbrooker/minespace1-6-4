package net.bbrooker.minespace.blocks.crystalore;

import java.util.Random;

import net.bbrooker.minespace.MineSpace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreenCrystalOre extends Block {

	public GreenCrystalOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10F);
		this.setResistance(5);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("GreenCrystalOre");
		this.setTextureName("minespace" + ":" + "/" + "CrystalOre" + "CrystalOre" + "/" + "BlueCrystalOre");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "CrystalOre" + "/" + "GreenCrystalOre");
		
	}
	
	public Block setBlockDrop(int metadata, Random rand, int fortune){
		
		return MineSpace.GreenCrystalOre;
	}
}
