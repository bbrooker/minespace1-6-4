package net.bbrooker.minespace.blocks.space;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SpaceShipCore extends Block {

	public SpaceShipCore(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setLightValue(0.8F);
		this.setHardness(4F);
		this.setResistance(5);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("SpaceShipCore");
		this.setTextureName("minespace" + ":" + "/" + "Space" + "/" + "SpaceShipCore");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "Space" + "/" + "SpaceShipCore");
		
	}
	
}
