package net.bbrooker.minespace;

import net.bbrooker.minespace.blocks.*;
import net.bbrooker.minespace.blocks.space.*;
import net.bbrooker.minespace.blocks.spawner.*;
import net.bbrooker.minespace.creativetabs.ModHolder;
import net.bbrooker.minespace.entity.droid.d2.D2;
import net.bbrooker.minespace.blocks.crystalore.*;

import net.bbrooker.minespace.items.craftingmat.*;
import net.bbrooker.minespace.items.crystal.*;
import net.bbrooker.minespace.items.materials.*;
import net.bbrooker.minespace.items.materials.coreevol.*;
import net.bbrooker.minespace.items.materials.lightsabermat.*;
import net.bbrooker.minespace.items.ore.*;
import net.bbrooker.minespace.items.crystal.advanced.*;
import net.bbrooker.minespace.items.crystal.warheroes.*;
import net.bbrooker.minespace.items.econ.*;
import net.bbrooker.minespace.items.econ.classes.*;
import net.bbrooker.minespace.items.license.*;
import net.bbrooker.minespace.items.license.ID.*;
import net.bbrooker.minespace.items.craftingmat.armour.*;
import net.bbrooker.minespace.items.craftingmat.weapons.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import java.awt.Color;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid=MCSpaceInfo.ID, name=MCSpaceInfo.Name, version=MCSpaceInfo.VERS)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MineSpace {
  
//////////////////////////////////////////////////////////////////////////////////////////////
	
	
/*LIST YOUR MOD HERE [ITEM]

    ///////////////////////
	ITEM METERIAL FOR CRAFT (IRON, METAL etc)*/
  	///////////////////////	
  	
	public static Item Screw = new Screw(1000);
	public static Item Wrench = new Wrench(1001);
	public static Item Hammer = new Hammer(1002);
	public static Item Nails = new Nails(1003);
	//ORE
	public static Item Metal = new Metal(1004);
	public static Item Titanium = new Titanium(1005);
	public static Item Aluminium = new Aluminium(1006);
	public static Item Tiberium = new Tiberium(1007);
	public static Item Iradium = new Iradium(1008);
	public static Item Silver = new Silver(1009);
	public static Item Voxadium = new Voxadium(1010);
  	
	//FIBER
	public static Item Fiber = new Fiber(1050);
  	public static Item Nanometerial = new NanoMaterial(1051);
  	
  	//CRYSTALEVOL
  	public static  Item CrystalEvol = new CrystalEvol(1060);
  	public static  Item AdvancedCrystalCore = new CrystalEvol(1061);
  	
  	
  	
/*LIST YOUR MOD HERE [LIGHTSABER]*/  	
	
	/////////////////////////////////
  	//Material for crafting Lightsaber 
  	/////////////////////////////////
  	
 	public static Item CommonHandgrip = new CommonHandgrip(1070);
  	public static Item SharpHandgrip = new SharpHandgrip(1071);
  	public static Item AdvancedHandgrip = new AdvancedHandgrip(1072);
    
  	
  	
  	
  	
  	
/*LIST YOUR MOD HERE [CRYSTAL]*/  	
	
	///////////////////////
  	//Crystal for crafting Lightsaber 
  	///////////////////////
  	
  	public static Item BlueCrystal = new BlueCrystal(1200);
  	public static Item RedCrystal = new RedCrystal(1201);
  	public static Item GreenCrystal = new GreenCrystal(1202);
  	public static Item YellowCrystal = new YellowCrystal(1203);
  	public static Item OrangeCrystal = new OrangeCrystal(1204);
  	public static Item PurpleCrystal = new PurpleCrystal(1205);
  	public static Item PinkCrystal = new PinkCrystal(1206);
  	public static Item BlackCrystal = new BlackCrystal(1207);
  	public static Item WhiteCrystal = new WhiteCrystal(1208);
  	
  	//ADVANCE
  	public static Item AdvancedBlueCrystal = new AdvancedBlueCrystal(1250);
  	public static Item AdvancedRedCrystal = new AdvancedRedCrystal(1251);
  	public static Item AdvancedGreenCrystal = new AdvancedGreenCrystal(1252);
  	public static Item AdvancedPurpleCrystal = new AdvancedPurpleCrystal(1253);
  	public static Item AdvancedPinkCrystal = new AdvancedPinkCrystal(1254);
  	
  	
  	//WAR HEROES
  	public static Item BlueWarHeroesCrystal = new BlueWarHeroesCrystal(1260);
  	public static Item RedWarHeroesCrystal = new RedWarHeroesCrystal(1261);
  	public static Item GreenWarHeroesCrystal = new GreenWarHeroesCrystal(1262);
  	public static Item PurpleWarHeroesCrystal = new PurpleWarHeroesCrystal(1263);
  	public static Item OrangeWarHeroesCrystal = new OrangeWarHeroesCrystal(1264);
  	
  
  	///////////////////////
  	/*  ECONOMIC ITEM    */
  	///////////////////////
  
  	//USE ALL OVER THE GALAXY
  		public static Item GalacticGold = new GalacticGold(1300);
  
  	//OTHER ECON
  		public static Item BlackCoin = new BlackCoin(1301);
  
  	//Class + Quest ECON
  		public static Item CitizenCoin = new CitizenCoin(1303);
  		public static Item OutlawCoin = new OutlawCoin(1304);
  		public static Item GuardianCoin = new GuardianCoin(1305);
  		public static Item SinsCoin = new SinsCoin(1305);
  
  
    ///////////////////////
  	/*  LICENSE ITEM    */
    ///////////////////////
  
  	//vehicle license
    	public static Item AirLicense = new AirLicense(1400);
    	public static Item WeaponLicense = new WeaponLicense(1401);
    	public static Item LargeWeaponLicense = new LargeWeaponLicense(1402);
    	public static Item SpeederLicense = new SpeederLicense(1403);
  	
  	//ID Card
  		public static Item CitizenID = new CitizenID(1406);
    	public static Item OutlawID = new OutlawID(1405);

  
  	//Goverment ID
  		public static Item PoliceID = new PoliceID(1406);
  		public static Item GiaID = new GIAID(1407);
  	
  	//REBEL ID
  		public static Item RebelID = new RebelID(1408);
  	
  	// === CASH LICENSE ===
  		public static Item LargeShipLicense = new LargeShipLicense(1409);
  		public static Item WingsLicense = new WingsLicense(1410);
   		public static Item RoboticLicense = new RoboticLicense(1411);
  
  
  
     ///////////////////////////////////////////////
  	 /*  METERIAL FOR ITEM ARMOUR & WEAPON       */
    ///////////////////////////////////////////////
  
  	//ARMOUR
    	public static Item NanoFiber = new NanoFiber(1500); 
    	public static Item QuarkArmour = new QuarkArmour(1501); 
    	public static Item RoboticCore = new RoboticCore(1502); //Need to craft Armour material
     	public static Item TitaniumCore = new TitaniumCore(1503); //Titanium
     	public static Item IradiumCore = new IradiumCore(1504); //Iradium 
     	public static Item IVMetal = new IVMetal(1505); //Silver
     	public static Item IXTiberiumCore = new IXTiberiumCore(1505); //Tiberium
     	public static Item IIXNanoFiberMetal = new IIXNanoFiberMetal(1505); //Aluminium
     	
     	//WEAPONS AMMO
	
	/** public static  RoboticCore = new RoboticCore(1502).setUnlocalizedName("RoboticCore").setMaxStackSize(1); */
	//public static  RoboticCore = new RoboticCore(1502).setUnlocalizedName("RoboticCore").setMaxStackSize(1); //Need to craft Armour material
     	//public static  TitaniumCore = new TitaniumCore(1503).setUnlocalizedName("TitaniumCore").setMaxStackSize(1);
	// ^^ use for core crafting ^^
	
     	public static Item BlasterCore = new BlasterCore(1550);
     	public static Item VBXBlaster = new VBXBlaster(1551); //BLUE VBX Blaster
     	public static Item IradiumBlaster = new IradiumBlaster(1552); //RED Iradium Blaster
     	public static Item TiberiumBlaster = new TiberiumBlaster(1553); //GREEN Tiberium Blaster
  		public static Item VoxiadiumHE = new VoxiadiumHE(1554);
  
  
  		
  	
  
  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  		
/* BLOCK ITEM	
  		
  		*/
  
  	      ////////////////////////////////
  	  	 /*     BLOCK ON SPACE SHIP    */
  	    ///////////////////////////////
  
  		public static Block SpaceShipCore = new SpaceShipCore(3000, Material.iron);
  		public static Block MetalFloor = new MetalFloor(3001, Material.iron);
  		public static Block WarningLine = new WarningLine(3002, Material.iron);
  		public static Block LightBlockBlack = new LightBlockBlack(3003, Material.iron);
  		public static Block LightBlock = new LightBlock(3004, Material.iron);
  		public static Block BlackFloor = new BlackFloor(3005, Material.iron);
  		
  		
	      ////////////////////////////////
	  	 /*     BLOCK ORES             */
	    ///////////////////////////////	
  		
  		public static Block BlueCrystalOre = new BlueCrystalOre(4000, Material.rock);
  		public static Block GreenCrystalOre = new GreenCrystalOre(4001, Material.rock);
  		public static Block RedCrystalOre = new RedCrystalOre(4002, Material.rock);
  		public static Block YellowCrystalOre = new YellowCrystalOre(4003, Material.rock);		
  		
  		public static Block TestSpawner = new TestSpawner(4004, Material.clay);
  		
  		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//CREATIVE TABS
  		
  		public static Item ModHolder = new ModHolder(900).setUnlocalizedName("ModHolder");
  		
		public static CreativeTabs MineSpaceTabBlock = new CreativeTabs("MineSpace Block"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.GreenCrystalOre.blockID;
			}
			
		}; 
	
		public static CreativeTabs MineSpaceTabMaterial = new CreativeTabs("MineSpace Material"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.Hammer.itemID;
			}
			
		}; 
		
		public static CreativeTabs MineSpaceTabCrystal = new CreativeTabs("MineSpace Crystal"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.OrangeWarHeroesCrystal.itemID;
			}
			
		}; 
		
		public static CreativeTabs MineSpaceTabCore = new CreativeTabs("MineSpace Core"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.RoboticCore.itemID;
			}
			
		}; 
		
		public static CreativeTabs MineSpaceTabWeaponsMat = new CreativeTabs("Weapons Stuff"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.AdvancedHandgrip.itemID;
			}
			
		}; 		
		
		public static CreativeTabs MineSpaceTabEcon = new CreativeTabs("Economic"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.GalacticGold.itemID;
			}
			
		}; 	
		
		public static CreativeTabs MineSpaceTabOre = new CreativeTabs("Ore"){
			@SideOnly(Side.CLIENT)
			@Override
			public int getTabIconItemIndex(){
				return MineSpace.GalacticGold.itemID;
			}
			
		}; 	
				
		
		
       @Instance("Minespace")
       public static MineSpace instance;
  
       // Says where the client and server 'proxy' code is loaded.
       
      @SidedProxy(clientSide="net.bbrooker.minespace.MineSpaceClientProxy", serverSide="net.bbrooker.minespace.MineSpaceCommonProxy")
       public static MineSpaceCommonProxy proxy;
  
          @EventHandler
       public void preInit(FMLPreInitializationEvent event) {

          }

       public void load(FMLInitializationEvent event) {
    	   

    	   	proxy.registerRenderInformation();

        }

        public MineSpace() {

        		//ITEM NAME REGISTER ITEM METAL, Misc
                LanguageRegistry.addName(Screw, "Screw");
                LanguageRegistry.addName(Wrench, "Wrench");
                LanguageRegistry.addName(Hammer, "Hammer");
                LanguageRegistry.addName(Nails, "Nails");
                LanguageRegistry.addName(Metal, "Metal");
                LanguageRegistry.addName(Titanium, "Titanium Ore");
                LanguageRegistry.addName(Aluminium, "Aluminium Ore");
                LanguageRegistry.addName(Tiberium, "Tiberium Ore");
                LanguageRegistry.addName(Iradium, "Iradium");
                LanguageRegistry.addName(Silver, "Silver Ore");
                LanguageRegistry.addName(Voxadium, "Voxadium Gas");
                LanguageRegistry.addName(Fiber, "Fiber");
                LanguageRegistry.addName(Nanometerial, "NanoFiber");


                //ITEM CRYSTAL
                LanguageRegistry.addName(BlueCrystal, "[C]Blue Crystal");
                LanguageRegistry.addName(RedCrystal, "[C]Red Crystal");
                LanguageRegistry.addName(GreenCrystal, "[C]Green Crystal");
                LanguageRegistry.addName(YellowCrystal, "[C]Yellow Crystal");
               	LanguageRegistry.addName(OrangeCrystal, "[C]Orange Crystal");
                LanguageRegistry.addName(PurpleCrystal, "[C]Purple Crystal");
                LanguageRegistry.addName(PinkCrystal, "[C]Pink Crystal");
                LanguageRegistry.addName(BlackCrystal, "[C]Black Crystal");                
                LanguageRegistry.addName(WhiteCrystal, "[C]White Crystal");
                /* ADVANCED */
                LanguageRegistry.addName(AdvancedBlueCrystal, "[AC]Advanced Blue Crystal");
                LanguageRegistry.addName(AdvancedRedCrystal, "[AC]Advanced Red Crystal");
                LanguageRegistry.addName(AdvancedGreenCrystal, "[AC]Advanced Green Crystal");
                LanguageRegistry.addName(AdvancedPurpleCrystal, "[AC]Advanced Purple Crystal");
               	LanguageRegistry.addName(AdvancedPinkCrystal, "[AC]Advanced Pink Crystal");
                /* WARHEROES */                
                LanguageRegistry.addName(BlueWarHeroesCrystal, "[WH]Blue War Heroes Crystal");
                LanguageRegistry.addName(RedWarHeroesCrystal, "[WH]Red War Heroes Crystal");
                LanguageRegistry.addName(GreenWarHeroesCrystal, "[WH]Green War Heroes Crystal");
                LanguageRegistry.addName(PurpleWarHeroesCrystal, "[WH]Purple War Heroes Crystal");
               	LanguageRegistry.addName(OrangeWarHeroesCrystal, "[WH]Pink War Heroes Crystal");



               	//ITEM ECON
               	LanguageRegistry.addName(GalacticGold, "Galactic Gold");
               	LanguageRegistry.addName(BlackCoin, "Black Coin");
               	LanguageRegistry.addName(CitizenCoin, "Citizen Coin");
               	LanguageRegistry.addName(OutlawCoin, "Outlaw Coin");
               	LanguageRegistry.addName(GuardianCoin, "Guardian Coin");
               	LanguageRegistry.addName(SinsCoin, "Sins Coin");

 		
               	//ITEM LICENSE
               	LanguageRegistry.addName(AirLicense, "Air License");
               	LanguageRegistry.addName(WeaponLicense, "Weapon License");
               	LanguageRegistry.addName(LargeWeaponLicense, "Large-Weapon License");
               	LanguageRegistry.addName(SpeederLicense, "Speeder License");
               	LanguageRegistry.addName(CitizenID, "Citizen ID");
               	LanguageRegistry.addName(OutlawID, "Outlaw ID");
               	LanguageRegistry.addName(PoliceID, "Police ID");
               	LanguageRegistry.addName(GiaID,"GIA ID");
               	LanguageRegistry.addName(RebelID,"Rebel ID");
               	LanguageRegistry.addName(LargeShipLicense,"Large-Ship License");
               	LanguageRegistry.addName(WingsLicense,"Wings License");
 				LanguageRegistry.addName(RoboticLicense,"Robotic License");
 		
 				//ITEM ARMOUR AND WEAPON
 				LanguageRegistry.addName(NanoFiber,"Nano Fiber");
 				LanguageRegistry.addName(QuarkArmour,"Quark Armour");
 				LanguageRegistry.addName(RoboticCore,"Robotic Core");
 				LanguageRegistry.addName(TitaniumCore,"Titanium Core");
 				LanguageRegistry.addName(IradiumCore,"Iradium Core");
 				LanguageRegistry.addName(IVMetal,"IV Metal");
 				LanguageRegistry.addName(IXTiberiumCore,"IXTiberium Core");
 				LanguageRegistry.addName(IIXNanoFiberMetal,"IIXNanoFiber Metal");
 		
 				//ITEM AMMO
 				LanguageRegistry.addName(BlasterCore,"Blaster Core");
 				LanguageRegistry.addName(VBXBlaster,"VBX Blaster");
 				LanguageRegistry.addName(IradiumBlaster,"Iradium Blaster");
 				LanguageRegistry.addName(TiberiumBlaster,"Tiberium Blaster");
 				LanguageRegistry.addName(VoxiadiumHE,"Voxiadium HE");
 	
 				
 	           	
                //==============================//
                //         ITEM BLOCK           //
                //=============================//
 	           	
 				
 	           	GameRegistry.registerBlock(SpaceShipCore, "Space Ship Core Light");
 	           	LanguageRegistry.addName(SpaceShipCore, "Space Ship Core Light");
 	           	GameRegistry.registerBlock(MetalFloor, "Metal Floor");
 	           	LanguageRegistry.addName(MetalFloor, "Metal Floor");		
 	           	GameRegistry.registerBlock(WarningLine, "WarningLine");
 	           	LanguageRegistry.addName(WarningLine, EnumChatFormatting.GRAY + "Warning Line");		
 	           	GameRegistry.registerBlock(LightBlockBlack, "Ship Light Block Black");
 	           	LanguageRegistry.addName(LightBlockBlack, EnumChatFormatting.GRAY + "Ship Light Block Black");
 	           	GameRegistry.registerBlock(LightBlock, "Ship Light Block");
 	           	LanguageRegistry.addName(LightBlock, "Ship Light Block"); 	           	
 	           	
 	           	
 	           	//ORE
 	           	GameRegistry.registerBlock(BlueCrystalOre, "Blue Crystal Ore");
 	           	LanguageRegistry.addName(BlueCrystalOre, "Blue Crystal Ore"); 	  	           	
 	           	GameRegistry.registerBlock(GreenCrystalOre, "Green Crystal Ore");
 	           	LanguageRegistry.addName(GreenCrystalOre, "Green Crystal Ore");  	           	
 	           	GameRegistry.registerBlock(RedCrystalOre, "Red Crystal Ore");
 	           	LanguageRegistry.addName(RedCrystalOre, "Red Crystal Ore"); 	           	
 	           	GameRegistry.registerBlock(YellowCrystalOre, "Yellow Crystal Ore");
 	           	LanguageRegistry.addName(YellowCrystalOre, "Yellow Crystal Ore");  	           	
 	           	
 	        	GameRegistry.registerBlock(TestSpawner, "TestSpawner");
 	           	LanguageRegistry.addName(TestSpawner, "TestSpawner");  	           	
 	           	
 	           	
 	           	
 	           	
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabBlock", "Block");
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabMaterial", "Materials");
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabCrystal", "Crystal");
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabCore", "Core");   
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabWeaponsMat", "Weapons Materials");
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabEcon", "Economic");   
 	           LanguageRegistry.instance().addStringLocalization("container.MineSpaceTabOre", "Ore");
 	         
 	           
 	           
 	           
 	           
 	            //==============================//
                //         CRAFTING RECIPE     //
                //=============================//
 	           	
 				GameRegistry.addRecipe(new ItemStack(IradiumBlaster, 1),
 					    "xyx",
 					    "y y",
 					    "xyx",
 					    
 					    'x', IradiumBlaster, 'y', VoxiadiumHE);
 				

 				
                // LanguageRegistry.instance().addStringLocalization("container.TestTabsStuff", "Test Stuff");

                //====================================================================//
                //         ANTI HACK/SPY/COPY SYS BY TANAWAT BOONMAK [MRBBOOK]       //
                //==================================================================//
                
                //HOW TO USE ? 
                //1.) Disable // On Mark GameRegistry and ClientRegistry
                //2.) Run server for testing
                //3.) Pack and .Zip File to ClientSide 
                
                
                //********** if this mod is on server side please add "//" in the front of GameRegistry and ClientRegistry ******
                
                
                //GameRegistry.registerTileEntity(TileEntityTrashbin.class, "Trashbin");
                //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrashbin.class, new RendererTrashbin());

                //===================================================================//
                //     NO SPY NO KAK GREAN  NO COPY By. FRIDAY ANTIHACK SYSTEM      //
                //=================================================================//

 				
 				
 	    	   	EntityRegistry.registerGlobalEntityID(D2.class, "D2 Droid", EntityRegistry.findGlobalUniqueEntityId(), -65536, -65536);
 	    	   	
 	    	   	proxy.registerEntity();
 				
 				
 				
 				
 				
 				
 				
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
	}

