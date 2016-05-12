package net.bbrooker.minespace.blocks.space;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MetalFloor extends Block {

	public MetalFloor(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10F);
		this.setResistance(5);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("MetalFloor");
		this.setTextureName("minespace" + ":" + "/" + "Space" + "/" + "MetalFloor");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "Space" + "/" +  "MetalFloor");
		
	}
}
	