package net.bbrooker.minespace.blocks.space;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class WarningLine extends Block {

	public WarningLine(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10F);
		this.setResistance(5);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("WarningLine");
		this.setTextureName("minespace" + ":" + "/" + "Space" + "/" + "WarningLine");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "Space" + "/" + "WarningLine");
		
	}
}

