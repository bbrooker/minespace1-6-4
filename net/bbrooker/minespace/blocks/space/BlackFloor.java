package net.bbrooker.minespace.blocks.space;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlackFloor extends Block {

	public BlackFloor(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10F);
		this.setResistance(5);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("BlackFloor");
        this.setTextureName("minespace" + ":" + "/" + "Space" + "/" + "BlackFloor");
	}

	public void registerIcons(IconRegister icon) {
		
		blockIcon = icon.registerIcon("minespace" + "/" + "Space" + "/" + "BlackFloor");
		
	}
}

