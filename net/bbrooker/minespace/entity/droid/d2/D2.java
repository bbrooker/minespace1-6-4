package net.bbrooker.minespace.entity.droid.d2;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.bbrooker.minespace.MineSpace;
import net.bbrooker.minespace.util.EntityUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class D2 extends EntityTameable {
	
	//Entity Temporary
	private EntityAITempt aiTempt;
	
	
    public D2(World par1World)
    {
        super(par1World);
			this.setSize(0.5F, 1.5F);
        	this.getNavigator().setAvoidsWater(true);
			this.getNavigator().setEnterDoors(true);
			this.tasks.addTask(0, this.aiSit);
			this.tasks.addTask(1, new EntityAIFollowOwner(this, 1.0D, 10.0F, 5.0F));
	        this.tasks.addTask(2, new EntityAILeapAtTarget(this, 0.4F));
	        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(6, new EntityAILookIdle(this));
	        this.tasks.addTask(7, new EntityAIMoveThroughVillage(this, 0.6D, true));
	        this.tasks.addTask(8, this.aiTempt = new EntityAITempt(this, 0.6F, MineSpace.RoboticCore.itemID, true));
	        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
	        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntityZombie.class, 200, false));
	        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityCreeper.class, 200, false));
		}
		
    
    
    //Apply Entity Attrubutes
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        if(this.isTamed()) {  
        
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100.0D); //Is tamed
        	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.30000001192092896D);
        	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(10.0D);
        
        }
        else{
        	  
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D); //Is not tamed
        	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.10000000000000369888D);	
        }
    }
    
    
    ///
    public boolean Tamed(EntityPlayer player)
    {
        ItemStack itemstack = player.inventory.getCurrentItem();

        if (this.isTamed())
        {
        	if (itemstack != null && itemstack.itemID == MineSpace.RoboticCore.itemID && !this.isAngry())
        		{
        			if (!player.capabilities.isCreativeMode)
        			{
        				--itemstack.stackSize;
        			}

        			if (itemstack.stackSize <= 0)
        			{
        				player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
        			}

        			if (!this.worldObj.isRemote)
        			{
        				if (this.rand.nextInt(1) == 0)
        				{
        					this.setTamed(true);
        					this.setPathToEntity((PathEntity)null);
        					this.setAttackTarget((EntityLivingBase)null);
        					this.aiSit.setSitting(true);
							player.addChatMessage(EntityUtils.getDroidSittingMessage(!this.isSitting()));
        					this.setHealth(20.0F);
        					this.setOwner(player.getCommandSenderName());
        					this.playTameEffect(true);
        					this.worldObj.setEntityState(this, (byte)7);
        				}
        				else
        				{
        					this.playTameEffect(false);
        					this.worldObj.setEntityState(this, (byte)6);
        					}
        				}	

        			return true;
        		}
        }

        return super.interact(player);
    }
    ///
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	private boolean isAngry() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		if (this == null || player == null){
			return false;
		}

			ItemStack itemstack = player.inventory.getCurrentItem();	
			
			if (itemstack == null)
			
				itemstack = new ItemStack(MineSpace.AdvancedBlueCrystal);
				
				if (this.isTamed())
				{
					if (player.getUniqueID().equals(this.getOwner().getUniqueID()) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack) && itemstack.getItem() == MineSpace.RoboticCore)
					{
							this.aiSit.setSitting(!this.isSitting());
							player.addChatMessage(EntityUtils.getDroidSittingMessage(!this.isSitting()));
							this.isJumping = false;
					}
				}
					else if (itemstack != null && itemstack.getItem() == MineSpace.RoboticCore && player.getDistanceSqToEntity(this) < 9.0D)
				{
						if (!this.worldObj.isRemote)
							if (this.rand.nextInt(3) == 0)
						{
								this.setTamed(true);
								this.func_152115_b(player.getUniqueID().toString());
								this.playTameEffect(true);
								this.aiSit.setSitting(true);
								this.worldObj.setEntityState(this, (byte)7);
								player.addChatMessage(EntityUtils.getDroidSittingMessage(!this.isSitting()));
						}
						else
						{
							this.playTameEffect(false);
							this.worldObj.setEntityState(this, (byte)6);
						}
					return true;
				}
				return super.interact(player);
		}
	
	//drop item on death ?
	@Override
	public void dropFewItems(boolean b, int i)
	{
			if(this.isTamed()){
				
				this.entityDropItem(new ItemStack(Item.ingotIron, 1), this.rand.nextInt(1));	
			}
			else{
				this.entityDropItem(new ItemStack(MineSpace.RoboticCore, 1), this.rand.nextInt(1));
			}
}

	//func_1512115_b set owner
	private void func_152115_b(String parOwnerName)
	{
	this.setOwner(parOwnerName);
	}

	
	//Set AI Enable
	public boolean isAIEnabled(){
		return true;
	}

	//Can Despawn ?
	@Override
	protected boolean canDespawn()
	{
		return false;
	}
	


	//Set Entity Attack Target ?
    public void setAttackTarget(EntityLivingBase arg_par1_entity)
    {
        super.setAttackTarget(arg_par1_entity);

        if (arg_par1_entity == null)
        {
            this.setAngry(false);
        }
        else if (!this.isTamed())
        {
            this.setAngry(true);
        }
    }

    
    //setAngry
	private void setAngry(boolean b) {
		// TODO Auto-generated method stub
		
	}
    
    //If mob is set to tame
	public void setTamed(boolean func_tamed_set)
    {
        super.setTamed(func_tamed_set);
        if (func_tamed_set)
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D);
        }
    }
	

    @Override
    protected String getLivingSound()
    {
        return "yourmod:YourSound";//this refers to:yourmod/sound/YourSound
    }

    @Override
    protected String getHurtSound()
    {
        return "yourmod:optionalFile.YourSound";//this refers to:yourmod/sound/optionalFile/YourSound
    }

    @Override
    protected String getDeathSound()
    {
        return "yourmod:optionalFile.optionalFile2.YourSound";//etc.
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {

		
        return null;
	}



	@Override
	public Entity getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
@Override
	public void updateAITick()
		{
		if (this.getMoveHelper().isUpdating())
			{
			double d0 = this.getMoveHelper().getSpeed();
			if (d0 == 0.6D)
				{
				this.setSneaking(true);
				this.setSprinting(false);
				}
				else if (d0 == 1.33D)
				{
					this.setSneaking(false);
					this.setSprinting(true);
				}
					else
						{
							this.setSneaking(false);
							this.setSprinting(false);
							}
					}
					else
						{
							this.setSneaking(false);
							this.setSprinting(false);
						}
		}
}
