package net.bbrooker.minespace.blocks.spawner;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class TestSpawner extends Block{
   public TestSpawner(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(10F);
		this.setResistance(5);
		this.setUnlocalizedName("TestSpawner");
		this.setTextureName("minespace:test");
   }
		
   private static void Spawner(World world, int x, int y, int z, String EntityZombie){
   
   world.setBlock(x, y, z, Block.mobSpawner.blockID);
   TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getBlockTileEntity(x, y, z);
   tileentitymobspawner.getSpawnerLogic().setMobID("EntityZombie");
   
   }
   
    @Override
    public boolean hasTileEntity(int metadata) {
    return true;
    }
    
}