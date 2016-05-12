package net.bbrooker.minespace;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.bbrooker.minespace.entity.droid.d2.D2;
import net.bbrooker.minespace.model.entity.droid.ModelD2;
import net.bbrooker.minespace.render.entity.RenderD2;
import net.bbrooker.minespace.model.entity.droid.*;
import net.minecraftforge.common.MinecraftForge;

public class MineSpaceClientProxy extends MineSpaceCommonProxy {
	
	public void registerRenderInformation() {
		
		//RENDER 3D ITEM HERE
		/** CREATIVE TABS */
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabBlock.getTranslatedTabLabel(),"Block");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabMaterial.getTranslatedTabLabel(),"Materials");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabCrystal.getTranslatedTabLabel(),"Crystal");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabCore.getTranslatedTabLabel(),"Core");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabWeaponsMat.getTranslatedTabLabel(),"Weapons Materials");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabEcon.getTranslatedTabLabel(),"Economic");
		LanguageRegistry.instance().addStringLocalization(MineSpace.MineSpaceTabOre.getTranslatedTabLabel(),"Ore");

	

		}

	public void registerEntity(){
		//ENTITY MOB RENDERING
		RenderingRegistry.registerEntityRenderingHandler(D2.class, new RenderD2(new ModelD2()));
	}
	
	
	}

