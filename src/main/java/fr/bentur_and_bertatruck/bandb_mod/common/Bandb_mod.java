package fr.bentur_and_bertatruck.bandb_mod.common;


import org.apache.logging.log4j.Logger;

import fr.bentur_and_bertatruck.bandb_mod.common.handler.CraftingHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.handler.EventHandlerBandb;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBeverages;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFluids;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFood;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.gui.HandlerGui;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.NetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_CommonProxy;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "bandb_mod", name = "bandb_mod", version = "1.0.0", acceptedMinecraftVersions = "[1.8.9]")
public class Bandb_mod{
	
	public static final String MODID = "bandb_mod";
	 
	@Instance("bandb_mod")	
	public static Bandb_mod instance;
	
	@SidedProxy(clientSide = "fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy", serverSide = "fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_CommonProxy" )
	public static bandb_mod_CommonProxy proxy;			

    public static Logger logger;
    
	//gui block
			//oven			
	public static final int guiIDMac = 23;

	//event
	EventHandlerBandb events = new EventHandlerBandb(); 		
	CraftingHandler craftingHandler = new CraftingHandler();
	
	//test	
	public static Block blockTest, blockTestOGL, blockNuke;	
	public static Block blockDistrib;			
		     
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger = event.getModLog();

		//Items.leather.setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowVanilla");
		//Items.melon.setTextureName(Bandb_mod.MODID + ":fruit/itemMelon");
		
		//event
		MinecraftForge.EVENT_BUS.register(events);
			//crafting
		MinecraftForge.EVENT_BUS.register(craftingHandler);
		
		/**
		//tools and stuff
		BandbStuffs.loaderStuff(true);
		//block
		BandbBlocks.loaderBlock();		
		//crop and seed
		BandbCrops.loaderBlockCrop();
		BandbCrops.loaderCropSeed();
		
		BandbMachines.preInit();
		BandbCocktails.preInit();
		**/
		
		BandbBlocks.register();
		BandbBeverages.register();
		BandbFood.register();
		BandbItems.register();
		BandbFluids.register();

		if(event.getSide() == Side.CLIENT){
			BandbBlocks.registerRender();
			BandbBeverages.registerRender();
			BandbFood.registerRender();
			BandbItems.registerRender();
		}
////////blocks//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////:       
   
		/**
		
		//test
		blockTest = new BlockTest().setBlockName("blockTest").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTitan");
    	GameRegistry.registerBlock(blockTest, "blockTest");
    	
    	blockTestOGL = new BlockTestOGL().setBlockName("blockTestOGL").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockTestOGL, "blockTestOGL");
    	
    	blockDistrib = new BlockDistrib().setBlockName("blockDistrib").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockDistrib, "blockDistrib");
    	
    	blockNuke = new BlockNuke(40).setBlockName("blockNuke").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockNuke, "blockNuke");
    	
    	**/
	    		    	
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		/**
		BandbLists.init();
		BandbMachines.init();
		BandbMachineRecipes.init();
		BandbCraftingRecipes.loaderRecipe();
		BandbCraftingRecipes.loaderFurnaceRecipe();
		BandbOreDictionary.loaderPlankWood();
		
		GameRegistry.registerTileEntity(TileEntityFurnitureKitchenWorktopA.class, "tileEntityFurnitureKitchenWorktopA");
						
		//generation///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		BandbWorldGeneration.init();
		
		//entities 
		Random random = new Random();
			//passive
		EntityHandler.RegisterEntities(EntityCowLaughting.class,"EntityCowLaughting", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowMilka.class,"EntityCowMilka", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowCharolaise.class,"EntityCowCharolaise", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowGasconne.class,"EntityCowGasconne", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowKerry.class,"EntityCowKerry", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowMontbeliarde.class,"EntityCowMontbeliarde", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityCowNorwegian.class,"EntityCowNorwegian", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityGoatWhite.class, "entityGoatWhite", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityZebra.class, "entityZebra", random.nextInt() * 16777215, random.nextInt() * 16777215);			
		
		EntityRegistry.addSpawn(EntityCowCharolaise.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowGasconne.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowKerry.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowMontbeliarde.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowNorwegian.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
			
		EntityRegistry.addSpawn(EntityGoatWhite.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.taigaHills,
				BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityZebra.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
			//walker1
		
			//monster
		EntityHandler.RegisterEntities(EntityWalker1.class, "Walker1", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityBenLaden.class, "BenLaden", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityMomie.class, "Momie", random.nextInt() * 16777215, random.nextInt() * 16777215);
		EntityHandler.RegisterEntities(EntityDracula.class, "EntityDracula", random.nextInt() * 16777215, random.nextInt() * 16777215);

		EntityRegistry.addSpawn(EntityWalker1.class, 10, 1, 2, EnumCreatureType.CREATURE, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
			//Ben Laden
		EntityRegistry.addSpawn(EntityBenLaden.class, 10, 1, 2, EnumCreatureType.AMBIENT, BiomeGenBase.desert, BiomeGenBase.desertHills);
				
		//Momie
		EntityRegistry.addSpawn(EntityMomie.class, 10, 1, 2, EnumCreatureType.AMBIENT, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
		//Dracula
		EntityRegistry.addSpawn(EntityDracula.class, 10, 1, 2, EnumCreatureType.MONSTER, BiomeGenBase.desert, BiomeGenBase.desertHills);
				
		//GameRegistry.registerTileEntity(TileEntityTestOGL.class, "tileEntityTestOGL");
		GameRegistry.registerTileEntity(TileEntityDistributor.class, "tileEntityDistributor");
		
		//gui handler
		
		**/
		//NetworkRegistry.INSTANCE.registerGuiHandler(this, new HandlerGui());	
		
		new NetworkHandler();
		
		//register render
		proxy.init();
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){}
	
	
	
	
}