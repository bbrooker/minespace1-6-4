package net.bbrooker.minespace.blocks.crystalore;

import java.util.Random;

import net.bbrooker.minespace.MineSpace;
import net.bbrooker.minespace.creativetabs.MineSpaceTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlueCrystalOre extends Block {

	public BlueCrystalOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10F);
		this.setResistance(5);
		this.setCreativeTab(MineSpaceTabs.tabBlock);
		this.setUnlocalizedName("BlueCrystalOre");
        this.setTextureName("minespace" + ":" + "/" + "CrystalOre" + "/" + "BlueCrystalOre");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "CrystalOre" + "/" + "BlueCrystalOre");
		
	}
	
	public Block setBlockDrop(int metadata, Random rand, int fortune){
		
		return MineSpace.BlueCrystalOre;
	}
}
