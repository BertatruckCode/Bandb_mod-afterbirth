package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeLeaf;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingApple;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingFruit;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingHight;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingPalmTree;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeWood;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandbBlocks {
	
	//woods
	public static Block blockWoodAbiu, blockWoodAfrican, blockWoodAllspice, blockWoodAlmond, blockWoodAmla;
	public static Block blockWoodAnise, blockWoodApricot, blockWoodAvocado, blockWoodBael, blockWoodBanana;
	public static Block blockWoodBer, blockWoodBlackCherry, blockWoodBlackthorn, blockWoodBloodOrange, blockWoodBrazilNut;
	public static Block blockWoodBreadNut, blockWoodBunyaNut, blockWoodButternut, blockWoodCacao, blockWoodCashew;
	public static Block blockWoodCherry, blockWoodChestnut, blockWoodCinnamon, blockWoodClementine, blockWoodClove;
	public static Block blockWoodCoconut, blockWoodCurry, blockWoodDamsonPlum, blockWoodDate, blockWoodDragonfruit;
	public static Block blockWoodElderberry, blockWoodFig, blockWoodGingkoNut, blockWoodGrapefruitPink, blockWoodGrapefruit;
	public static Block blockWoodGuava, blockWoodHuckleberries, blockWoodJackFruit, blockWoodJujube, blockWoodKiwi;
	public static Block blockWoodKumquat, blockWoodLaurel, blockWoodLemon, blockWoodLime, blockWoodLongan;
	public static Block blockWoodLoquat, blockWoodLychee, blockWoodMacadamia, blockWoodMameySapote, blockWoodMango;
	public static Block blockWoodMangosteen, blockWoodMaple, blockWoodMirabelle, blockWoodMorelloCherry, blockWoodNectarine;
	public static Block blockWoodNutmeg, blockWoodNuts, blockWoodOhiaAi, blockWoodOlive, blockWoodOrange;
	public static Block blockWoodOsageOrange, blockWoodPapaya, blockWoodParadiseNut, blockWoodPassionfruit, blockWoodPeach;
	public static Block blockWoodPear, blockWoodPersimmon, blockWoodPineNut, blockWoodPistachio, blockWoodPlane;
	public static Block blockWoodPlantain, blockWoodPlum, blockWoodPomegranate, blockWoodPomelo, blockWoodQuince;
	public static Block blockWoodRedBanana, blockWoodSapodilla, blockWoodSatsuma, blockWoodSoursop, blockWoodStarAnise;
	public static Block blockWoodTamarillo, blockWoodTangerine, blockWoodTonkaBean, blockWoodVanilla, blockWoodWalnut;
	public static Block blockWoodWhitePeach, blockWoodCinchona;
	
		//apple
	public static Block blockWoodAppleAntares, blockWoodAppleAriane, blockWoodAppleBelchardChantecier, blockWoodAppleBelleDeBoskoop, blockWoodAppleBraeburn;
	public static Block blockWoodAppleElstar, blockWoodAppleFuji, blockWoodAppleGala, blockWoodAppleGolden, blockWoodAppleGrannySmith;
	public static Block blockWoodAppleHoneycrunch, blockWoodAppleJazz, blockWoodAppleJonagoldJonagored, blockWoodAppleLesRouges, blockWoodApplePinkLady;
	public static Block blockWoodApplePommeLimousin, blockWoodAppleReineDesReinettes, blockWoodAppleReinetteGriseDuCanada, blockWoodAppleTentation, blockWoodCrabapple;
					
	//leaves
	public static Block blockLeavesAbiu, blockLeavesAfrican, blockLeavesAllspice, blockLeavesAlmond, blockLeavesAmla;
	public static Block blockLeavesAnise, blockLeavesApricot, blockLeavesAvocado, blockLeavesBael, blockLeavesBanana;
	public static Block blockLeavesBer, blockLeavesBlackCherry, blockLeavesBlackthorn, blockLeavesBloodOrange, blockLeavesBrazilNut;
	public static Block blockLeavesBreadNut, blockLeavesBunyaNut, blockLeavesButternut, blockLeavesCacao, blockLeavesCashew;
	public static Block blockLeavesCherry, blockLeavesChestnut, blockLeavesCinchona, blockLeavesCinnamon, blockLeavesClementine;
	public static Block blockLeavesClove, blockLeavesCoconut, blockLeavesCurry, blockLeavesDamsonPlum, blockLeavesDate;
	public static Block blockLeavesDragonfruit, blockLeavesElderberry, blockLeavesFig, blockLeavesGingkoNut, blockLeavesGrapefruit;
	public static Block blockLeavesGrapefruitPink, blockLeavesGuava, blockLeavesHuckleberries, blockLeavesJackFruit, blockLeavesJujube;
	public static Block blockLeavesKiwi, blockLeavesKumquat, blockLeavesLaurel, blockLeavesLemon, blockLeavesLime;
	public static Block blockLeavesLongan, blockLeavesLoquat, blockLeavesLychee, blockLeavesMacadamia, blockLeavesMameySapote;
	public static Block blockLeavesMango, blockLeavesMangosteen, blockLeavesMaple, blockLeavesMirabelle, blockLeavesMorelloCherry;
	public static Block blockLeavesNectarine, blockLeavesNutmeg, blockLeavesNuts, blockLeavesOhiaAi, blockLeavesOlive;
	public static Block blockLeavesOrange, blockLeavesOsageOrange, blockLeavesPapaya, blockLeavesParadiseNut, blockLeavesPassionfruit;
	public static Block blockLeavesPeach, blockLeavesPear, blockLeavesPersimmon, blockLeavesPineNut, blockLeavesPistachio;
	public static Block blockLeavesPlane, blockLeavesPlantain, blockLeavesPlum, blockLeavesPomegranate, blockLeavesPomelo;
	public static Block blockLeavesQuince, blockLeavesRedBanana, blockLeavesSapodilla, blockLeavesSatsuma, blockLeavesSoursop;
	public static Block blockLeavesStarAnise, blockLeavesTamarillo, blockLeavesTangerine, blockLeavesTonkaBean, blockLeavesVanilla;
	public static Block blockLeavesWalnut, blockLeavesWhitePeach;
		
		//apple
	public static Block blockLeavesAppleAntares, blockLeavesAppleAriane, blockLeavesAppleBelchardChantecier, blockLeavesAppleBelleDeBoskoop, blockLeavesAppleBraeburn;
	public static Block blockLeavesAppleElstar, blockLeavesAppleFuji, blockLeavesAppleGala, blockLeavesAppleGolden, blockLeavesAppleGrannySmith;
	public static Block blockLeavesAppleHoneycrunch, blockLeavesAppleJazz, blockLeavesAppleJonagoldJonagored, blockLeavesAppleLesRouges, blockLeavesApplePinkLady;
	public static Block blockLeavesApplePommeLimousin, blockLeavesAppleReineDesReinettes, blockLeavesAppleReinetteGriseDuCanada, blockLeavesAppleTentation, blockLeavesCrabapple;
		
	
	//sapling		
	public static Block blockSaplingAbiu, blockSaplingAfrican, blockSaplingAllspice, blockSaplingAlmond, blockSaplingAmla;
	public static Block blockSaplingAnise, blockSaplingApricot, blockSaplingAvocado, blockSaplingBael, blockSaplingBananaPlantain;
	public static Block blockSaplingBanana, blockSaplingBer, blockSaplingBlackCherry, blockSaplingBlackthorn, blockSaplingBloodOrange;
	public static Block blockSaplingBrazilNut, blockSaplingBreadNut, blockSaplingBunyaNut, blockSaplingButternut, blockSaplingCacao;
	public static Block blockSaplingCashew, blockSaplingCherry, blockSaplingChestnut, blockSaplingCinnamon, blockSaplingClementine;
	public static Block blockSaplingClove, blockSaplingCoconut, blockSaplingCurry, blockSaplingDamsonPlum, blockSaplingDate;
	public static Block blockSaplingDragonfruit, blockSaplingElderberry, blockSaplingFig, blockSaplingGingkoNut, blockSaplingGrapefruitPink;
	public static Block blockSaplingGrapefruit, blockSaplingGuava, blockSaplingHuckleberries, blockSaplingJackFruit, blockSaplingJujube;
	public static Block blockSaplingKiwi, blockSaplingKumquat, blockSaplingLaurel, blockSaplingLemon, blockSaplingLime;
	public static Block blockSaplingLongan, blockSaplingLoquat, blockSaplingLychee, blockSaplingMacadamia, blockSaplingMameySapote;
	public static Block blockSaplingMango, blockSaplingMangosteen, blockSaplingMirabelle, blockSaplingMorelloCherry, blockSaplingNectarine;
	public static Block blockSaplingNuts, blockSaplingOhiaAi, blockSaplingOlive, blockSaplingOrange, blockSaplingOsageOrange;
	public static Block blockSaplingPapaya, blockSaplingParadiseNut, blockSaplingPassionfruit, blockSaplingPeach, blockSaplingPear;
	public static Block blockSaplingPersimmon, blockSaplingPineNut, blockSaplingPistachio, blockSaplingPlum, blockSaplingPomegranate;
	public static Block blockSaplingPomelo, blockSaplingQuince, blockSaplingRedBanana, blockSaplingCinchona, blockSaplingMaple;
	public static Block blockSaplingNutmeg, blockSaplingPlane, blockSaplingTonkaBean, blockSaplingSapodilla, blockSaplingSatsuma;
	public static Block blockSaplingSoursop, blockSaplingStarAnise, blockSaplingTamarillo, blockSaplingTangerine, blockSaplingVanilla;
	public static Block blockSaplingWalnut, blockSaplingWhitePeach;
	
    	//apple
	public static Block blockSaplingAppleAntares, blockSaplingAppleAriane, blockSaplingAppleBelchardChancelier, blockSaplingAppleBelleDeBoskoop, blockSaplingAppleBraeburn;
	public static Block blockSaplingAppleElstar, blockSaplingAppleFuji, blockSaplingAppleGala, blockSaplingAppleGolden, blockSaplingAppleGrannySmith;
	public static Block blockSaplingAppleHoneycrunch, blockSaplingAppleJazz, blockSaplingAppleJonagoldJonagored, blockSaplingAppleLesRouges, blockSaplingApplePinkLady;
	public static Block blockSaplingApplePommeDuLimousin, blockSaplingAppleReineDesReinettes, blockSaplingAppleReinetteGriseDuCanada, blockSaplingAppleTentation, blockSaplingCrabapple;
    		
    //plank   	
    	public static Block blockPlankAlmond,blockPlankAvocado,blockPlankBanana,blockPlankCherry,blockPlankChestnut;
		public static Block blockPlankClementine,blockPlankDate,blockPlankDragonfruit,blockPlankFig,blockPlankGrapefruit;
		public static Block blockPlankGuava,blockPlankLemon,blockPlankLime,blockPlankLychee,blockPlankMango;
		public static Block blockPlankMirabelle,blockPlankNuts,blockPlankOlive,blockPlankOrange,blockPlankPapaya;
		public static Block blockPlankPassionfruit,blockPlankPeach,blockPlankPear,blockPlankPlum,blockPlankPomegranate;
		public static Block blockPlankQuince,blockPlankTangerine,blockPlankWalnut,blockPlankApricot,blockPlankCoconut;
		public static Block blockPlankAmla,blockPlankAppleAntares,blockPlankAppleAriane,blockPlankAppleBelchardChancelier,blockPlankAppleBelleDeBoskoop;
		public static Block blockPlankAppleBraeburn,blockPlankAppleElstar,blockPlankAppleFuji,blockPlankAppleGala,blockPlankAppleGolden;
		public static Block blockPlankAppleGrannySmith,blockPlankAppleHoneyCrunch,blockPlankAppleJazz,blockPlankAppleJonagoldJonagored,blockPlankAppleLesRouges;
		public static Block blockPlankApplePinkLady,blockPlankApplePommeLimousin,BlockPlankAppleReineDesReinettes,blockPlankAppleReinetteGriseDuCanada,blockPlankAppleTentation;
		public static Block blockPlankCrabapple,blockPlankJujube,blockPlankKumquat,blockPlankNectarine,blockPlankPersimmon;
		public static Block blockPlankAfrican,blockPlankBreadnut,blockPlankCashew,blockPlankPistachio,blockPlankVanilla;
		public static Block blockPlankAnise,blockPlankCacao,blockPlankKiwi,blockPlankStarAnise;
		public static Block blockPlankAbiu,blockPlankAllspice,blockPlankBael,blockPlankBlackCherry,blockPlankBlackthorn;
		public static Block blockPlankBloodOrange,blockPlankBrazilNut,blockPlankButternut,blockPlankCinnamon,blockPlankClove;
		public static Block blockPlankDamsonPlum,blockPlankElderberry,blockPlankLaurel,blockPlankLongan,blockPlankLoquat;
		public static Block blockPlankMacadamia,blockPlankMorelloCherry,blockPlankNutmeg,blockPlankPlane,blockPlankPlantain;
		public static Block blockplankPomelo,blockPlankSatsuma,blockPlankTonkaBean,blockPlankWhitePeach;
		public static Block blockPlankGrapefruitPink,blockPlankMaple,blockPlankBer,blockPlankCurry,blockPlankRedBanana;
		public static Block blockPlankBunyaNut,blockPlankGingkoNut,blockPlankHuckleberries,blockPlankJackFruit,blockPlankMameySapote;
		public static Block blockPlankMangosteen,blockPlankOhiaAi,blockPlankOsageOrange,blockPlankParadiseNut,blockPlankPineNut;
		public static Block blockPlankSapodilla,blockPlankSoursop,blockPlankTamarillo,blockPlankCinchona;
		
		//block plants
		public static Block blockMint,blockRape,blockBetterCactus,blockDaisy,blockOrchid;	
		public static Block blockSesame,blockLicorice,blockHibiscus,blockJasmine,blockLavender;
		public static Block blockRosmary,blockTarragon,blockAgave,blockAmaryllisPink,blockAmaryllisRed;
		public static Block blockAmaryllisWhite,blockBachelorsButtonBlue,blockBelladonna,blockBlowball,blockButtercup;
		public static Block blockCallaBlack,blockCallaWhite,blockChrysantheme,blockEnzian,blockFoxglove;
		public static Block blockHeather,blockIrisBlue,blockIrisPurple,blockLily,blockMarshMarigold;
		public static Block blockPansy,blockPeony,blockSyringa,blockViolet,blockLemonGrass;
		public static Block blockPeyote,blockBluebell,blockDill,blockNettle,blockGardenia;
		public static Block blockThistle;
		public static Block blockWormwood,blockCinchona,blockChives,blockChervil,blockWatercress;
		public static Block blockThyme,blockSage,blockOregano,blockFennel,blockGentian;
			//mushrooms	
		public static Block blockTruffle,blockMorel,blockHornOfPlenty,blockCep,blockHydnumRepandum;
		public static Block blockAmanitaMuscaria;
						
		//ore 
			//ingot 
		public static Block blockOreAluminium,blockOrePlatinum, blockOreTitan;
			//gem
		public static Block blockOreAmethyst,blockOreJade,blockOreOnyx;
		public static Block blockOreOpal,blockOreRuby,blockOreSalt,blockOreSapphire;
		public static Block blockOreTopaz,blockOrePainite;						
			//block ingot 
		public static Block blockAluminium,blockAmethyst,blockJade,blockPainite;
		public static Block blockOnyx,blockOpal;
		public static Block blockPlatinum;
		public static Block blockRuby,blockSapphire,blockSteel;
		public static Block blockTitan,blockTopaz;
		
		//block gen map
		public static Block blockMarble;
	
			//other
		public static Block blockCobblestoneMilka,blockStoneMilka,blockDirtMilka_top;
				
		public static Block blockFurnitureKitchenWorktopA;
		
	public static void register(){
		blockWoodAbiu = new BlockTreeWood().setUnlocalizedName("blockWoodAbiu");
		blockWoodAfrican = new BlockTreeWood().setUnlocalizedName("blockWoodAfrican");
		blockWoodAllspice = new BlockTreeWood().setUnlocalizedName("blockWoodAllspice");
		blockWoodAlmond = new BlockTreeWood().setUnlocalizedName("blockWoodAlmond");
		blockWoodAmla = new BlockTreeWood().setUnlocalizedName("blockWoodAmla");

		GameRegistry.registerBlock(blockWoodAbiu, "blockWoodAbiu");
		GameRegistry.registerBlock(blockWoodAfrican, "blockWoodAfrican");
		GameRegistry.registerBlock(blockWoodAllspice, "blockWoodAllspice");
		GameRegistry.registerBlock(blockWoodAlmond, "blockWoodAlmond");
		GameRegistry.registerBlock(blockWoodAmla, "blockWoodAmla");

		blockWoodAnise = new BlockTreeWood().setUnlocalizedName("blockWoodAnise");
		blockWoodApricot = new BlockTreeWood().setUnlocalizedName("blockWoodApricot");
		blockWoodAvocado = new BlockTreeWood().setUnlocalizedName("blockWoodAvocado");
		blockWoodBael = new BlockTreeWood().setUnlocalizedName("blockWoodBael");
		blockWoodBanana = new BlockTreeWood().setUnlocalizedName("blockWoodBanana");

		GameRegistry.registerBlock(blockWoodAnise, "blockWoodAnise");
		GameRegistry.registerBlock(blockWoodApricot, "blockWoodApricot");
		GameRegistry.registerBlock(blockWoodAvocado, "blockWoodAvocado");
		GameRegistry.registerBlock(blockWoodBael, "blockWoodBael");
		GameRegistry.registerBlock(blockWoodBanana, "blockWoodBanana");

		blockWoodBer = new BlockTreeWood().setUnlocalizedName("blockWoodBer");
		blockWoodBlackCherry = new BlockTreeWood().setUnlocalizedName("blockWoodBlackCherry");
		blockWoodBlackthorn = new BlockTreeWood().setUnlocalizedName("blockWoodBlackthorn");
		blockWoodBloodOrange = new BlockTreeWood().setUnlocalizedName("blockWoodBloodOrange");
		blockWoodBrazilNut = new BlockTreeWood().setUnlocalizedName("blockWoodBrazilNut");

		GameRegistry.registerBlock(blockWoodBer, "blockWoodBer");
		GameRegistry.registerBlock(blockWoodBlackCherry, "blockWoodBlackCherry");
		GameRegistry.registerBlock(blockWoodBlackthorn, "blockWoodBlackthorn");
		GameRegistry.registerBlock(blockWoodBloodOrange, "blockWoodBloodOrange");
		GameRegistry.registerBlock(blockWoodBrazilNut, "blockWoodBrazilNut");

		blockWoodBreadNut = new BlockTreeWood().setUnlocalizedName("blockWoodBreadNut");
		blockWoodBunyaNut = new BlockTreeWood().setUnlocalizedName("blockWoodBunyaNut");
		blockWoodButternut = new BlockTreeWood().setUnlocalizedName("blockWoodButternut");
		blockWoodCacao = new BlockTreeWood().setUnlocalizedName("blockWoodCacao");
		blockWoodCashew = new BlockTreeWood().setUnlocalizedName("blockWoodCashew");

		GameRegistry.registerBlock(blockWoodBreadNut, "blockWoodBreadNut");
		GameRegistry.registerBlock(blockWoodBunyaNut, "blockWoodBunyaNut");
		GameRegistry.registerBlock(blockWoodButternut, "blockWoodButternut");
		GameRegistry.registerBlock(blockWoodCacao, "blockWoodCacao");
		GameRegistry.registerBlock(blockWoodCashew, "blockWoodCashew");

		blockWoodCherry = new BlockTreeWood().setUnlocalizedName("blockWoodCherry");
		blockWoodChestnut = new BlockTreeWood().setUnlocalizedName("blockWoodChestnut");
		blockWoodCinnamon = new BlockTreeWood().setUnlocalizedName("blockWoodCinnamon");
		blockWoodClementine = new BlockTreeWood().setUnlocalizedName("blockWoodClementine");
		blockWoodClove = new BlockTreeWood().setUnlocalizedName("blockWoodClove");

		GameRegistry.registerBlock(blockWoodCherry, "blockWoodCherry");
		GameRegistry.registerBlock(blockWoodChestnut, "blockWoodChestnut");
		GameRegistry.registerBlock(blockWoodCinnamon, "blockWoodCinnamon");
		GameRegistry.registerBlock(blockWoodClementine, "blockWoodClementine");
		GameRegistry.registerBlock(blockWoodClove, "blockWoodClove");

		blockWoodCoconut = new BlockTreeWood().setUnlocalizedName("blockWoodCoconut");
		blockWoodCurry = new BlockTreeWood().setUnlocalizedName("blockWoodCurry");
		blockWoodDamsonPlum = new BlockTreeWood().setUnlocalizedName("blockWoodDamsonPlum");
		blockWoodDate = new BlockTreeWood().setUnlocalizedName("blockWoodDate");
		blockWoodDragonfruit = new BlockTreeWood().setUnlocalizedName("blockWoodDragonfruit");

		GameRegistry.registerBlock(blockWoodCoconut, "blockWoodCoconut");
		GameRegistry.registerBlock(blockWoodCurry, "blockWoodCurry");
		GameRegistry.registerBlock(blockWoodDamsonPlum, "blockWoodDamsonPlum");
		GameRegistry.registerBlock(blockWoodDate, "blockWoodDate");
		GameRegistry.registerBlock(blockWoodDragonfruit, "blockWoodDragonfruit");

		blockWoodElderberry = new BlockTreeWood().setUnlocalizedName("blockWoodElderberry");
		blockWoodFig = new BlockTreeWood().setUnlocalizedName("blockWoodFig");
		blockWoodGingkoNut = new BlockTreeWood().setUnlocalizedName("blockWoodGingkoNut");
		blockWoodGrapefruitPink = new BlockTreeWood().setUnlocalizedName("blockWoodGrapefruitPink");
		blockWoodGrapefruit = new BlockTreeWood().setUnlocalizedName("blockWoodGrapefruit");

		GameRegistry.registerBlock(blockWoodElderberry, "blockWoodElderberry");
		GameRegistry.registerBlock(blockWoodFig, "blockWoodFig");
		GameRegistry.registerBlock(blockWoodGingkoNut, "blockWoodGingkoNut");
		GameRegistry.registerBlock(blockWoodGrapefruitPink, "blockWoodGrapefruitPink");
		GameRegistry.registerBlock(blockWoodGrapefruit, "blockWoodGrapefruit");

		blockWoodGuava = new BlockTreeWood().setUnlocalizedName("blockWoodGuava");
		blockWoodHuckleberries = new BlockTreeWood().setUnlocalizedName("blockWoodHuckleberries");
		blockWoodJackFruit = new BlockTreeWood().setUnlocalizedName("blockWoodJackFruit");
		blockWoodJujube = new BlockTreeWood().setUnlocalizedName("blockWoodJujube");
		blockWoodKiwi = new BlockTreeWood().setUnlocalizedName("blockWoodKiwi");

		GameRegistry.registerBlock(blockWoodGuava, "blockWoodGuava");
		GameRegistry.registerBlock(blockWoodHuckleberries, "blockWoodHuckleberries");
		GameRegistry.registerBlock(blockWoodJackFruit, "blockWoodJackFruit");
		GameRegistry.registerBlock(blockWoodJujube, "blockWoodJujube");
		GameRegistry.registerBlock(blockWoodKiwi, "blockWoodKiwi");

		blockWoodKumquat = new BlockTreeWood().setUnlocalizedName("blockWoodKumquat");
		blockWoodLaurel = new BlockTreeWood().setUnlocalizedName("blockWoodLaurel");
		blockWoodLemon = new BlockTreeWood().setUnlocalizedName("blockWoodLemon");
		blockWoodLime = new BlockTreeWood().setUnlocalizedName("blockWoodLime");
		blockWoodLongan = new BlockTreeWood().setUnlocalizedName("blockWoodLongan");

		GameRegistry.registerBlock(blockWoodKumquat, "blockWoodKumquat");
		GameRegistry.registerBlock(blockWoodLaurel, "blockWoodLaurel");
		GameRegistry.registerBlock(blockWoodLemon, "blockWoodLemon");
		GameRegistry.registerBlock(blockWoodLime, "blockWoodLime");
		GameRegistry.registerBlock(blockWoodLongan, "blockWoodLongan");

		blockWoodLoquat = new BlockTreeWood().setUnlocalizedName("blockWoodLoquat");
		blockWoodLychee = new BlockTreeWood().setUnlocalizedName("blockWoodLychee");
		blockWoodMacadamia = new BlockTreeWood().setUnlocalizedName("blockWoodMacadamia");
		blockWoodMameySapote = new BlockTreeWood().setUnlocalizedName("blockWoodMameySapote");
		blockWoodMango = new BlockTreeWood().setUnlocalizedName("blockWoodMango");

		GameRegistry.registerBlock(blockWoodLoquat, "blockWoodLoquat");
		GameRegistry.registerBlock(blockWoodLychee, "blockWoodLychee");
		GameRegistry.registerBlock(blockWoodMacadamia, "blockWoodMacadamia");
		GameRegistry.registerBlock(blockWoodMameySapote, "blockWoodMameySapote");
		GameRegistry.registerBlock(blockWoodMango, "blockWoodMango");

		blockWoodMangosteen = new BlockTreeWood().setUnlocalizedName("blockWoodMangosteen");
		blockWoodMaple = new BlockTreeWood().setUnlocalizedName("blockWoodMaple");
		blockWoodMirabelle = new BlockTreeWood().setUnlocalizedName("blockWoodMirabelle");
		blockWoodMorelloCherry = new BlockTreeWood().setUnlocalizedName("blockWoodMorelloCherry");
		blockWoodNectarine = new BlockTreeWood().setUnlocalizedName("blockWoodNectarine");

		GameRegistry.registerBlock(blockWoodMangosteen, "blockWoodMangosteen");
		GameRegistry.registerBlock(blockWoodMaple, "blockWoodMaple");
		GameRegistry.registerBlock(blockWoodMirabelle, "blockWoodMirabelle");
		GameRegistry.registerBlock(blockWoodMorelloCherry, "blockWoodMorelloCherry");
		GameRegistry.registerBlock(blockWoodNectarine, "blockWoodNectarine");

		blockWoodNutmeg = new BlockTreeWood().setUnlocalizedName("blockWoodNutmeg");
		blockWoodNuts = new BlockTreeWood().setUnlocalizedName("blockWoodNuts");
		blockWoodOhiaAi = new BlockTreeWood().setUnlocalizedName("blockWoodOhiaAi");
		blockWoodOlive = new BlockTreeWood().setUnlocalizedName("blockWoodOlive");
		blockWoodOrange = new BlockTreeWood().setUnlocalizedName("blockWoodOrange");

		GameRegistry.registerBlock(blockWoodNutmeg, "blockWoodNutmeg");
		GameRegistry.registerBlock(blockWoodNuts, "blockWoodNuts");
		GameRegistry.registerBlock(blockWoodOhiaAi, "blockWoodOhiaAi");
		GameRegistry.registerBlock(blockWoodOlive, "blockWoodOlive");
		GameRegistry.registerBlock(blockWoodOrange, "blockWoodOrange");

		blockWoodOsageOrange = new BlockTreeWood().setUnlocalizedName("blockWoodOsageOrange");
		blockWoodPapaya = new BlockTreeWood().setUnlocalizedName("blockWoodPapaya");
		blockWoodParadiseNut = new BlockTreeWood().setUnlocalizedName("blockWoodParadiseNut");
		blockWoodPassionfruit = new BlockTreeWood().setUnlocalizedName("blockWoodPassionfruit");
		blockWoodPeach = new BlockTreeWood().setUnlocalizedName("blockWoodPeach");

		GameRegistry.registerBlock(blockWoodOsageOrange, "blockWoodOsageOrange");
		GameRegistry.registerBlock(blockWoodPapaya, "blockWoodPapaya");
		GameRegistry.registerBlock(blockWoodParadiseNut, "blockWoodParadiseNut");
		GameRegistry.registerBlock(blockWoodPassionfruit, "blockWoodPassionfruit");
		GameRegistry.registerBlock(blockWoodPeach, "blockWoodPeach");

		blockWoodPear = new BlockTreeWood().setUnlocalizedName("blockWoodPear");
		blockWoodPersimmon = new BlockTreeWood().setUnlocalizedName("blockWoodPersimmon");
		blockWoodPineNut = new BlockTreeWood().setUnlocalizedName("blockWoodPineNut");
		blockWoodPistachio = new BlockTreeWood().setUnlocalizedName("blockWoodPistachio");
		blockWoodPlane = new BlockTreeWood().setUnlocalizedName("blockWoodPlane");

		GameRegistry.registerBlock(blockWoodPear, "blockWoodPear");
		GameRegistry.registerBlock(blockWoodPersimmon, "blockWoodPersimmon");
		GameRegistry.registerBlock(blockWoodPineNut, "blockWoodPineNut");
		GameRegistry.registerBlock(blockWoodPistachio, "blockWoodPistachio");
		GameRegistry.registerBlock(blockWoodPlane, "blockWoodPlane");

		blockWoodPlantain = new BlockTreeWood().setUnlocalizedName("blockWoodPlantain");
		blockWoodPlum = new BlockTreeWood().setUnlocalizedName("blockWoodPlum");
		blockWoodPomegranate = new BlockTreeWood().setUnlocalizedName("blockWoodPomegranate");
		blockWoodPomelo = new BlockTreeWood().setUnlocalizedName("blockWoodPomelo");
		blockWoodQuince = new BlockTreeWood().setUnlocalizedName("blockWoodQuince");

		GameRegistry.registerBlock(blockWoodPlantain, "blockWoodPlantain");
		GameRegistry.registerBlock(blockWoodPlum, "blockWoodPlum");
		GameRegistry.registerBlock(blockWoodPomegranate, "blockWoodPomegranate");
		GameRegistry.registerBlock(blockWoodPomelo, "blockWoodPomelo");
		GameRegistry.registerBlock(blockWoodQuince, "blockWoodQuince");

		blockWoodRedBanana = new BlockTreeWood().setUnlocalizedName("blockWoodRedBanana");
		blockWoodSapodilla = new BlockTreeWood().setUnlocalizedName("blockWoodSapodilla");
		blockWoodSatsuma = new BlockTreeWood().setUnlocalizedName("blockWoodSatsuma");
		blockWoodSoursop = new BlockTreeWood().setUnlocalizedName("blockWoodSoursop");
		blockWoodStarAnise = new BlockTreeWood().setUnlocalizedName("blockWoodStarAnise");

		GameRegistry.registerBlock(blockWoodRedBanana, "blockWoodRedBanana");
		GameRegistry.registerBlock(blockWoodSapodilla, "blockWoodSapodilla");
		GameRegistry.registerBlock(blockWoodSatsuma, "blockWoodSatsuma");
		GameRegistry.registerBlock(blockWoodSoursop, "blockWoodSoursop");
		GameRegistry.registerBlock(blockWoodStarAnise, "blockWoodStarAnise");

		blockWoodTamarillo = new BlockTreeWood().setUnlocalizedName("blockWoodTamarillo");
		blockWoodTangerine = new BlockTreeWood().setUnlocalizedName("blockWoodTangerine");
		blockWoodTonkaBean = new BlockTreeWood().setUnlocalizedName("blockWoodTonkaBean");
		blockWoodVanilla = new BlockTreeWood().setUnlocalizedName("blockWoodVanilla");
		blockWoodWalnut = new BlockTreeWood().setUnlocalizedName("blockWoodWalnut");

		GameRegistry.registerBlock(blockWoodTamarillo, "blockWoodTamarillo");
		GameRegistry.registerBlock(blockWoodTangerine, "blockWoodTangerine");
		GameRegistry.registerBlock(blockWoodTonkaBean, "blockWoodTonkaBean");
		GameRegistry.registerBlock(blockWoodVanilla, "blockWoodVanilla");
		GameRegistry.registerBlock(blockWoodWalnut, "blockWoodWalnut");

		blockWoodWhitePeach = new BlockTreeWood().setUnlocalizedName("blockWoodWhitePeach");
		blockWoodCinchona = new BlockTreeWood().setUnlocalizedName("blockWoodCinchona");

		GameRegistry.registerBlock(blockWoodWhitePeach, "blockWoodWhitePeach");
		GameRegistry.registerBlock(blockWoodCinchona, "blockWoodCinchona");

		
			//apple
		blockWoodAppleAntares = new BlockTreeWood().setUnlocalizedName("blockWoodAppleAntares");
		blockWoodAppleAriane = new BlockTreeWood().setUnlocalizedName("blockWoodAppleAriane");
		blockWoodAppleBelchardChantecier = new BlockTreeWood().setUnlocalizedName("blockWoodAppleBelchardChantecier");
		blockWoodAppleBelleDeBoskoop = new BlockTreeWood().setUnlocalizedName("blockWoodAppleBelleDeBoskoop");
		blockWoodAppleBraeburn = new BlockTreeWood().setUnlocalizedName("blockWoodAppleBraeburn");

		GameRegistry.registerBlock(blockWoodAppleAntares, "blockWoodAppleAntares");
		GameRegistry.registerBlock(blockWoodAppleAriane, "blockWoodAppleAriane");
		GameRegistry.registerBlock(blockWoodAppleBelchardChantecier, "blockWoodAppleBelchardChantecier");
		GameRegistry.registerBlock(blockWoodAppleBelleDeBoskoop, "blockWoodAppleBelleDeBoskoop");
		GameRegistry.registerBlock(blockWoodAppleBraeburn, "blockWoodAppleBraeburn");

		blockWoodAppleElstar = new BlockTreeWood().setUnlocalizedName("blockWoodAppleElstar");
		blockWoodAppleFuji = new BlockTreeWood().setUnlocalizedName("blockWoodAppleFuji");
		blockWoodAppleGala = new BlockTreeWood().setUnlocalizedName("blockWoodAppleGala");
		blockWoodAppleGolden = new BlockTreeWood().setUnlocalizedName("blockWoodAppleGolden");
		blockWoodAppleGrannySmith = new BlockTreeWood().setUnlocalizedName("blockWoodAppleGrannySmith");

		GameRegistry.registerBlock(blockWoodAppleElstar, "blockWoodAppleElstar");
		GameRegistry.registerBlock(blockWoodAppleFuji, "blockWoodAppleFuji");
		GameRegistry.registerBlock(blockWoodAppleGala, "blockWoodAppleGala");
		GameRegistry.registerBlock(blockWoodAppleGolden, "blockWoodAppleGolden");
		GameRegistry.registerBlock(blockWoodAppleGrannySmith, "blockWoodAppleGrannySmith");

		blockWoodAppleHoneycrunch = new BlockTreeWood().setUnlocalizedName("blockWoodAppleHoneycrunch");
		blockWoodAppleJazz = new BlockTreeWood().setUnlocalizedName("blockWoodAppleJazz");
		blockWoodAppleJonagoldJonagored = new BlockTreeWood().setUnlocalizedName("blockWoodAppleJonagoldJonagored");
		blockWoodAppleLesRouges = new BlockTreeWood().setUnlocalizedName("blockWoodAppleLesRouges");
		blockWoodApplePinkLady = new BlockTreeWood().setUnlocalizedName("blockWoodApplePinkLady");

		GameRegistry.registerBlock(blockWoodAppleHoneycrunch, "blockWoodAppleHoneycrunch");
		GameRegistry.registerBlock(blockWoodAppleJazz, "blockWoodAppleJazz");
		GameRegistry.registerBlock(blockWoodAppleJonagoldJonagored, "blockWoodAppleJonagoldJonagored");
		GameRegistry.registerBlock(blockWoodAppleLesRouges, "blockWoodAppleLesRouges");
		GameRegistry.registerBlock(blockWoodApplePinkLady, "blockWoodApplePinkLady");

		blockWoodApplePommeLimousin = new BlockTreeWood().setUnlocalizedName("blockWoodApplePommeLimousin");
		blockWoodAppleReineDesReinettes = new BlockTreeWood().setUnlocalizedName("blockWoodAppleReineDesReinettes");
		blockWoodAppleReinetteGriseDuCanada = new BlockTreeWood().setUnlocalizedName("blockWoodAppleReinetteGriseDuCanada");
		blockWoodAppleTentation = new BlockTreeWood().setUnlocalizedName("blockWoodAppleTentation");
		blockWoodCrabapple = new BlockTreeWood().setUnlocalizedName("blockWoodCrabapple");

		GameRegistry.registerBlock(blockWoodApplePommeLimousin, "blockWoodApplePommeLimousin");
		GameRegistry.registerBlock(blockWoodAppleReineDesReinettes, "blockWoodAppleReineDesReinettes");
		GameRegistry.registerBlock(blockWoodAppleReinetteGriseDuCanada, "blockWoodAppleReinetteGriseDuCanada");
		GameRegistry.registerBlock(blockWoodAppleTentation, "blockWoodAppleTentation");
		GameRegistry.registerBlock(blockWoodCrabapple, "blockWoodCrabapple");
		
		//leaves
		
		blockLeavesAbiu = new BlockTreeLeaf("abiu", BandbFood.itemFruitAbiu).setUnlocalizedName("blockLeavesAbiu");
		blockLeavesAfrican = new BlockTreeLeaf("african", BandbFood.itemFruitAfrican).setUnlocalizedName("blockLeavesAfrican");
		blockLeavesAllspice = new BlockTreeLeaf("Allspice", BandbFood.itemFruitAllspice).setUnlocalizedName("blockLeavesAllspice");
		blockLeavesAlmond = new BlockTreeLeaf("Almond", BandbFood.itemFruitAlmond).setUnlocalizedName("blockLeavesAlmond");
		blockLeavesAmla = new BlockTreeLeaf("Amla", BandbFood.itemFruitAmla).setUnlocalizedName("blockLeavesAmla");

		GameRegistry.registerBlock(blockLeavesAbiu, "blockLeavesAbiu");
		GameRegistry.registerBlock(blockLeavesAfrican, "blockLeavesAfrican");
		GameRegistry.registerBlock(blockLeavesAllspice, "blockLeavesAllspice");
		GameRegistry.registerBlock(blockLeavesAlmond, "blockLeavesAlmond");
		GameRegistry.registerBlock(blockLeavesAmla, "blockLeavesAmla");

		blockLeavesAnise = new BlockTreeLeaf("Anise",BandbFood.itemFruitAnise).setUnlocalizedName("blockLeavesAnise");
		blockLeavesApricot = new BlockTreeLeaf("Apricot",BandbFood.itemFruitApricot).setUnlocalizedName("blockLeavesApricot");
		blockLeavesAvocado = new BlockTreeLeaf("Avocado",BandbFood.itemVegetableAvocado).setUnlocalizedName("blockLeavesAvocado");
		blockLeavesBael = new BlockTreeLeaf("Bael",BandbFood.itemFruitBael).setUnlocalizedName("blockLeavesBael");
		blockLeavesBanana = new BlockTreeLeaf("Banana",BandbFood.itemFruitBanana).setUnlocalizedName("blockLeavesBanana");

		GameRegistry.registerBlock(blockLeavesAnise, "blockLeavesAnise");
		GameRegistry.registerBlock(blockLeavesApricot, "blockLeavesApricot");
		GameRegistry.registerBlock(blockLeavesAvocado, "blockLeavesAvocado");
		GameRegistry.registerBlock(blockLeavesBael, "blockLeavesBael");
		GameRegistry.registerBlock(blockLeavesBanana, "blockLeavesBanana");

		blockLeavesBer = new BlockTreeLeaf("Ber",BandbFood.itemFruitBer).setUnlocalizedName("blockLeavesBer");
		blockLeavesBlackCherry = new BlockTreeLeaf("BlackCherry",BandbFood.itemFruitBlackCherry).setUnlocalizedName("blockLeavesBlackCherry");
		blockLeavesBlackthorn = new BlockTreeLeaf("Blackthorn",BandbFood.itemFruitBlackthorn).setUnlocalizedName("blockLeavesBlackthorn");
		blockLeavesBloodOrange = new BlockTreeLeaf("BloodOrange",BandbFood.itemFruitBloodOrange).setUnlocalizedName("blockLeavesBloodOrange");
		blockLeavesBrazilNut = new BlockTreeLeaf("BrazilNut",BandbFood.itemFruitBrazilNut).setUnlocalizedName("blockLeavesBrazilNut");

		GameRegistry.registerBlock(blockLeavesBer, "blockLeavesBer");
		GameRegistry.registerBlock(blockLeavesBlackCherry, "blockLeavesBlackCherry");
		GameRegistry.registerBlock(blockLeavesBlackthorn, "blockLeavesBlackthorn");
		GameRegistry.registerBlock(blockLeavesBloodOrange, "blockLeavesBloodOrange");
		GameRegistry.registerBlock(blockLeavesBrazilNut, "blockLeavesBrazilNut");

		blockLeavesBreadNut = new BlockTreeLeaf("BreadNut",BandbFood.itemFruitBreadNut).setUnlocalizedName("blockLeavesBreadNut");
		blockLeavesBunyaNut = new BlockTreeLeaf("BunyaNut",BandbFood.itemFruitBunyaNut).setUnlocalizedName("blockLeavesBunyaNut");
		blockLeavesButternut = new BlockTreeLeaf("Butternut",BandbFood.itemFruitButternut).setUnlocalizedName("blockLeavesButternut");
		blockLeavesCacao = new BlockTreeLeaf("Cacao",BandbFood.itemFruitCacao).setUnlocalizedName("blockLeavesCacao");
		blockLeavesCashew = new BlockTreeLeaf("Cashew",BandbFood.itemVegetableCashew).setUnlocalizedName("blockLeavesCashew");

		GameRegistry.registerBlock(blockLeavesBreadNut, "blockLeavesBreadNut");
		GameRegistry.registerBlock(blockLeavesBunyaNut, "blockLeavesBunyaNut");
		GameRegistry.registerBlock(blockLeavesButternut, "blockLeavesButternut");
		GameRegistry.registerBlock(blockLeavesCacao, "blockLeavesCacao");
		GameRegistry.registerBlock(blockLeavesCashew, "blockLeavesCashew");

		blockLeavesCherry = new BlockTreeLeaf("Cherry",BandbFood.itemFruitCherry).setUnlocalizedName("blockLeavesCherry");
		blockLeavesChestnut = new BlockTreeLeaf("Chestnut",BandbFood.itemFruitChestnut).setUnlocalizedName("blockLeavesChestnut");
		blockLeavesCinchona = new BlockTreeLeaf("Cinchona",BandbItems.itemPlantCinchona).setUnlocalizedName("blockLeavesCinchona");
		blockLeavesCinnamon = new BlockTreeLeaf("Cinnamon",BandbFood.itemFruitCinnamon).setUnlocalizedName("blockLeavesCinnamon");
		blockLeavesClementine = new BlockTreeLeaf("Clementine",BandbFood.itemFruitClementine).setUnlocalizedName("blockLeavesClementine");

		GameRegistry.registerBlock(blockLeavesCherry, "blockLeavesCherry");
		GameRegistry.registerBlock(blockLeavesChestnut, "blockLeavesChestnut");
		GameRegistry.registerBlock(blockLeavesCinchona, "blockLeavesCinchona");
		GameRegistry.registerBlock(blockLeavesCinnamon, "blockLeavesCinnamon");
		GameRegistry.registerBlock(blockLeavesClementine, "blockLeavesClementine");

		blockLeavesClove = new BlockTreeLeaf("Clove",BandbFood.itemFruitClove).setUnlocalizedName("blockLeavesClove");
		blockLeavesCoconut = new BlockTreeLeaf("Coconut",BandbFood.itemFruitCoconut).setUnlocalizedName("blockLeavesCoconut");
		blockLeavesCurry = new BlockTreeLeaf("Curry",BandbFood.itemIngredientCurry).setUnlocalizedName("blockLeavesCurry");
		blockLeavesDamsonPlum = new BlockTreeLeaf("DamsonPlum",BandbFood.itemFruitDamsonPlum).setUnlocalizedName("blockLeavesDamsonPlum");
		blockLeavesDate = new BlockTreeLeaf("Date",BandbFood.itemFruitDate).setUnlocalizedName("blockLeavesDate");

		GameRegistry.registerBlock(blockLeavesClove, "blockLeavesClove");
		GameRegistry.registerBlock(blockLeavesCoconut, "blockLeavesCoconut");
		GameRegistry.registerBlock(blockLeavesCurry, "blockLeavesCurry");
		GameRegistry.registerBlock(blockLeavesDamsonPlum, "blockLeavesDamsonPlum");
		GameRegistry.registerBlock(blockLeavesDate, "blockLeavesDate");

		blockLeavesDragonfruit = new BlockTreeLeaf("Dragonfruit",BandbFood.itemFruitDragonfruit).setUnlocalizedName("blockLeavesDragonfruit");
		blockLeavesElderberry = new BlockTreeLeaf("Elderberry",BandbFood.itemFruitElderberry).setUnlocalizedName("blockLeavesElderberry");
		blockLeavesFig = new BlockTreeLeaf("Fig",BandbFood.itemFruitFig).setUnlocalizedName("blockLeavesFig");
		blockLeavesGingkoNut = new BlockTreeLeaf("GingkoNut",BandbFood.itemFruitGingkoNut).setUnlocalizedName("blockLeavesGingkoNut");
		blockLeavesGrapefruit = new BlockTreeLeaf("Grapefruit",BandbFood.itemFruitGrapefruit).setUnlocalizedName("blockLeavesGrapefruit");

		GameRegistry.registerBlock(blockLeavesDragonfruit, "blockLeavesDragonfruit");
		GameRegistry.registerBlock(blockLeavesElderberry, "blockLeavesElderberry");
		GameRegistry.registerBlock(blockLeavesFig, "blockLeavesFig");
		GameRegistry.registerBlock(blockLeavesGingkoNut, "blockLeavesGingkoNut");
		GameRegistry.registerBlock(blockLeavesGrapefruit, "blockLeavesGrapefruit");

		blockLeavesGrapefruitPink = new BlockTreeLeaf("GrapefruitPink",BandbFood.itemFruitGrapefruitPink).setUnlocalizedName("blockLeavesGrapefruitPink");
		blockLeavesGuava = new BlockTreeLeaf("Guava",BandbFood.itemFruitGuava).setUnlocalizedName("blockLeavesGuava");
		blockLeavesHuckleberries = new BlockTreeLeaf("Huckleberries",BandbFood.itemFruitHuckleberries).setUnlocalizedName("blockLeavesHuckleberries");
		blockLeavesJackFruit = new BlockTreeLeaf("JackFruit",BandbFood.itemFruitJackfruit).setUnlocalizedName("blockLeavesJackFruit");
		blockLeavesJujube = new BlockTreeLeaf("Jujube",BandbFood.itemFruitJujube).setUnlocalizedName("blockLeavesJujube");

		GameRegistry.registerBlock(blockLeavesGrapefruitPink, "blockLeavesGrapefruitPink");
		GameRegistry.registerBlock(blockLeavesGuava, "blockLeavesGuava");
		GameRegistry.registerBlock(blockLeavesHuckleberries, "blockLeavesHuckleberries");
		GameRegistry.registerBlock(blockLeavesJackFruit, "blockLeavesJackFruit");
		GameRegistry.registerBlock(blockLeavesJujube, "blockLeavesJujube");

		blockLeavesKiwi = new BlockTreeLeaf("Kiwi",BandbFood.itemFruitKiwi).setUnlocalizedName("blockLeavesKiwi");
		blockLeavesKumquat = new BlockTreeLeaf("Kumquat",BandbFood.itemFruitKumquat).setUnlocalizedName("blockLeavesKumquat");
		blockLeavesLaurel = new BlockTreeLeaf("Laurel",BandbFood.itemFruitBayLaurel).setUnlocalizedName("blockLeavesLaurel");
		blockLeavesLemon = new BlockTreeLeaf("Lemon",BandbFood.itemFruitLemon).setUnlocalizedName("blockLeavesLemon");
		blockLeavesLime = new BlockTreeLeaf("Lime",BandbFood.itemFruitLime).setUnlocalizedName("blockLeavesLime");

		GameRegistry.registerBlock(blockLeavesKiwi, "blockLeavesKiwi");
		GameRegistry.registerBlock(blockLeavesKumquat, "blockLeavesKumquat");
		GameRegistry.registerBlock(blockLeavesLaurel, "blockLeavesLaurel");
		GameRegistry.registerBlock(blockLeavesLemon, "blockLeavesLemon");
		GameRegistry.registerBlock(blockLeavesLime, "blockLeavesLime");

		blockLeavesLongan = new BlockTreeLeaf("Longan",BandbFood.itemFruitLongan).setUnlocalizedName("blockLeavesLongan");
		blockLeavesLoquat = new BlockTreeLeaf("Loquat",BandbFood.itemFruitLoquat).setUnlocalizedName("blockLeavesLoquat");
		blockLeavesLychee = new BlockTreeLeaf("Lychee",BandbFood.itemFruitLychee).setUnlocalizedName("blockLeavesLychee");
		blockLeavesMacadamia = new BlockTreeLeaf("Macadamia",BandbFood.itemFruitMacadamia).setUnlocalizedName("blockLeavesMacadamia");
		blockLeavesMameySapote = new BlockTreeLeaf("MameySapote",BandbFood.itemFruitMameySapote).setUnlocalizedName("blockLeavesMameySapote");

		GameRegistry.registerBlock(blockLeavesLongan, "blockLeavesLongan");
		GameRegistry.registerBlock(blockLeavesLoquat, "blockLeavesLoquat");
		GameRegistry.registerBlock(blockLeavesLychee, "blockLeavesLychee");
		GameRegistry.registerBlock(blockLeavesMacadamia, "blockLeavesMacadamia");
		GameRegistry.registerBlock(blockLeavesMameySapote, "blockLeavesMameySapote");

		blockLeavesMango = new BlockTreeLeaf("Mango",BandbFood.itemFruitMango).setUnlocalizedName("blockLeavesMango");
		blockLeavesMangosteen = new BlockTreeLeaf("Mangosteen",BandbFood.itemFruitMangosteen).setUnlocalizedName("blockLeavesMangosteen");
		blockLeavesMaple = new BlockTreeLeaf("Maple",BandbFood.itemFruitMaple).setUnlocalizedName("blockLeavesMaple");
		blockLeavesMirabelle = new BlockTreeLeaf("Mirabelle",BandbFood.itemFruitMirabelle).setUnlocalizedName("blockLeavesMirabelle");
		blockLeavesMorelloCherry = new BlockTreeLeaf("MorelloCherry",BandbFood.itemFruitMorelloCherry).setUnlocalizedName("blockLeavesMorelloCherry");

		GameRegistry.registerBlock(blockLeavesMango, "blockLeavesMango");
		GameRegistry.registerBlock(blockLeavesMangosteen, "blockLeavesMangosteen");
		GameRegistry.registerBlock(blockLeavesMaple, "blockLeavesMaple");
		GameRegistry.registerBlock(blockLeavesMirabelle, "blockLeavesMirabelle");
		GameRegistry.registerBlock(blockLeavesMorelloCherry, "blockLeavesMorelloCherry");

		blockLeavesNectarine = new BlockTreeLeaf("Nectarine",BandbFood.itemFruitNectarine).setUnlocalizedName("blockLeavesNectarine");
		blockLeavesNutmeg = new BlockTreeLeaf("Nutmeg",BandbFood.itemFruitNutmeg).setUnlocalizedName("blockLeavesNutmeg");
		blockLeavesNuts = new BlockTreeLeaf("Nuts",BandbFood.itemFruitNuts).setUnlocalizedName("blockLeavesNuts");
		blockLeavesOhiaAi = new BlockTreeLeaf("OhiaAi",BandbFood.itemFruitOhiaAi).setUnlocalizedName("blockLeavesOhiaAi");
		blockLeavesOlive = new BlockTreeLeaf("Olive",BandbFood.itemVegetableOlive).setUnlocalizedName("blockLeavesOlive");

		GameRegistry.registerBlock(blockLeavesNectarine, "blockLeavesNectarine");
		GameRegistry.registerBlock(blockLeavesNutmeg, "blockLeavesNutmeg");
		GameRegistry.registerBlock(blockLeavesNuts, "blockLeavesNuts");
		GameRegistry.registerBlock(blockLeavesOhiaAi, "blockLeavesOhiaAi");
		GameRegistry.registerBlock(blockLeavesOlive, "blockLeavesOlive");

		blockLeavesOrange = new BlockTreeLeaf("Orange",BandbFood.itemFruitOrange).setUnlocalizedName("blockLeavesOrange");
		blockLeavesOsageOrange = new BlockTreeLeaf("OsageOrange",BandbFood.itemFruitOsageOrange).setUnlocalizedName("blockLeavesOsageOrange");
		blockLeavesPapaya = new BlockTreeLeaf("Papaya",BandbFood.itemFruitPapaya).setUnlocalizedName("blockLeavesPapaya");
		blockLeavesParadiseNut = new BlockTreeLeaf("ParadiseNut",BandbFood.itemFruitParadiseNut).setUnlocalizedName("blockLeavesParadiseNut");
		blockLeavesPassionfruit = new BlockTreeLeaf("Passionfruit",BandbFood.itemFruitPassionfruit).setUnlocalizedName("blockLeavesPassionfruit");

		GameRegistry.registerBlock(blockLeavesOrange, "blockLeavesOrange");
		GameRegistry.registerBlock(blockLeavesOsageOrange, "blockLeavesOsageOrange");
		GameRegistry.registerBlock(blockLeavesPapaya, "blockLeavesPapaya");
		GameRegistry.registerBlock(blockLeavesParadiseNut, "blockLeavesParadiseNut");
		GameRegistry.registerBlock(blockLeavesPassionfruit, "blockLeavesPassionfruit");

		blockLeavesPeach = new BlockTreeLeaf("Peach",BandbFood.itemFruitPeach).setUnlocalizedName("blockLeavesPeach");
		blockLeavesPear = new BlockTreeLeaf("Pear",BandbFood.itemFruitPear).setUnlocalizedName("blockLeavesPear");
		blockLeavesPersimmon = new BlockTreeLeaf("Persimmon",BandbFood.itemFruitPersimmon).setUnlocalizedName("blockLeavesPersimmon");
		blockLeavesPineNut = new BlockTreeLeaf("PineNut",BandbFood.itemFruitPineNut).setUnlocalizedName("blockLeavesPineNut");
		blockLeavesPistachio = new BlockTreeLeaf("Pistachio",BandbFood.itemVegetablePistachio).setUnlocalizedName("blockLeavesPistachio");

		GameRegistry.registerBlock(blockLeavesPeach, "blockLeavesPeach");
		GameRegistry.registerBlock(blockLeavesPear, "blockLeavesPear");
		GameRegistry.registerBlock(blockLeavesPersimmon, "blockLeavesPersimmon");
		GameRegistry.registerBlock(blockLeavesPineNut, "blockLeavesPineNut");
		GameRegistry.registerBlock(blockLeavesPistachio, "blockLeavesPistachio");

		blockLeavesPlane = new BlockTreeLeaf("Plane",BandbBlock.blockSaplingPlane).setUnlocalizedName("blockLeavesPlane");
		blockLeavesPlantain = new BlockTreeLeaf("Plantain",BandbFood.itemFruitBananaPlantain).setUnlocalizedName("blockLeavesPlantain");
		blockLeavesPlum = new BlockTreeLeaf("Plum",BandbFood.itemFruitPlum).setUnlocalizedName("blockLeavesPlum");
		blockLeavesPomegranate = new BlockTreeLeaf("Pomegranate",BandbFood.itemFruitPomegranate).setUnlocalizedName("blockLeavesPomegranate");
		blockLeavesPomelo = new BlockTreeLeaf("Pomelo",BandbFood.itemFruitPomelo).setUnlocalizedName("blockLeavesPomelo");

		GameRegistry.registerBlock(blockLeavesPlane, "blockLeavesPlane");
		GameRegistry.registerBlock(blockLeavesPlantain, "blockLeavesPlantain");
		GameRegistry.registerBlock(blockLeavesPlum, "blockLeavesPlum");
		GameRegistry.registerBlock(blockLeavesPomegranate, "blockLeavesPomegranate");
		GameRegistry.registerBlock(blockLeavesPomelo, "blockLeavesPomelo");

		blockLeavesQuince = new BlockTreeLeaf("Quince",BandbFood.itemFruitQuince).setUnlocalizedName("blockLeavesQuince");
		blockLeavesRedBanana = new BlockTreeLeaf("RedBanana",BandbFood.itemFruitRedBanana).setUnlocalizedName("blockLeavesRedBanana");
		blockLeavesSapodilla = new BlockTreeLeaf("Sapodilla",BandbFood.itemFruitSapodilla).setUnlocalizedName("blockLeavesSapodilla");
		blockLeavesSatsuma = new BlockTreeLeaf("Satsuma",BandbFood.itemFruitSatsuma).setUnlocalizedName("blockLeavesSatsuma");
		blockLeavesSoursop = new BlockTreeLeaf("Soursop",BandbFood.itemFruitSoursop).setUnlocalizedName("blockLeavesSoursop");

		GameRegistry.registerBlock(blockLeavesQuince, "blockLeavesQuince");
		GameRegistry.registerBlock(blockLeavesRedBanana, "blockLeavesRedBanana");
		GameRegistry.registerBlock(blockLeavesSapodilla, "blockLeavesSapodilla");
		GameRegistry.registerBlock(blockLeavesSatsuma, "blockLeavesSatsuma");
		GameRegistry.registerBlock(blockLeavesSoursop, "blockLeavesSoursop");

		blockLeavesStarAnise = new BlockTreeLeaf("StarAnise",BandbFood.itemFruitStarAnise).setUnlocalizedName("blockLeavesStarAnise");
		blockLeavesTamarillo = new BlockTreeLeaf("Tamarillo",BandbFood.itemFruitTamarillo).setUnlocalizedName("blockLeavesTamarillo");
		blockLeavesTangerine = new BlockTreeLeaf("Tangerine",BandbFood.itemFruitTangerine).setUnlocalizedName("blockLeavesTangerine");
		blockLeavesTonkaBean = new BlockTreeLeaf("TonkaBean",BandbFood.itemFruitTonkaBean).setUnlocalizedName("blockLeavesTonkaBean");
		blockLeavesVanilla = new BlockTreeLeaf("Vanilla",BandbFood.itemFruitVanilla).setUnlocalizedName("blockLeavesVanilla");

		GameRegistry.registerBlock(blockLeavesStarAnise, "blockLeavesStarAnise");
		GameRegistry.registerBlock(blockLeavesTamarillo, "blockLeavesTamarillo");
		GameRegistry.registerBlock(blockLeavesTangerine, "blockLeavesTangerine");
		GameRegistry.registerBlock(blockLeavesTonkaBean, "blockLeavesTonkaBean");
		GameRegistry.registerBlock(blockLeavesVanilla, "blockLeavesVanilla");

		blockLeavesWalnut = new BlockTreeLeaf("Walnut",BandbFood.itemFruitWalnut).setUnlocalizedName("blockLeavesWalnut");
		blockLeavesWhitePeach = new BlockTreeLeaf("WhitePeach",BandbFood.itemFruitWhitePeach).setUnlocalizedName("blockLeavesWhitePeach");

		GameRegistry.registerBlock(blockLeavesWalnut, "blockLeavesWalnut");
		GameRegistry.registerBlock(blockLeavesWhitePeach, "blockLeavesWhitePeach");
		
		//apple
		blockLeavesAppleAntares = new BlockTreeLeaf("AppleAntares", BandbFood.itemFruitAppleAntares).setUnlocalizedName("blockLeavesAppleAntares");
		blockLeavesAppleAriane = new BlockTreeLeaf("AppleAriane", BandbFood.itemFruitAppleAriane).setUnlocalizedName("blockLeavesAppleAriane");
		blockLeavesAppleBelchardChantecier = new BlockTreeLeaf("AppleBelchardChantecier", BandbFood.itemFruitAppleBelchardChancelier).setUnlocalizedName("blockLeavesAppleBelchardChantecier");
		blockLeavesAppleBelleDeBoskoop = new BlockTreeLeaf("AppleBelleDeBoskoop", BandbFood.itemFruitAppleBelleDeBoskoop).setUnlocalizedName("blockLeavesAppleBelleDeBoskoop");
		blockLeavesAppleBraeburn = new BlockTreeLeaf("AppleBraeburn", BandbFood.itemFruitAppleBraeburn).setUnlocalizedName("blockLeavesAppleBraeburn");
		
		GameRegistry.registerBlock(blockLeavesAppleAntares, "blockLeavesAppleAntares");
		GameRegistry.registerBlock(blockLeavesAppleAriane, "blockLeavesAppleAriane");
		GameRegistry.registerBlock(blockLeavesAppleBelchardChantecier, "blockLeavesAppleBelchardChantecier");
		GameRegistry.registerBlock(blockLeavesAppleBelleDeBoskoop, "blockLeavesAppleBelleDeBoskoop");
		GameRegistry.registerBlock(blockLeavesAppleBraeburn, "blockLeavesAppleBraeburn");
		
		blockLeavesAppleElstar = new BlockTreeLeaf("AppleElstar", BandbFood.itemFruitAppleElstar).setUnlocalizedName("blockLeavesAppleElstar");
		blockLeavesAppleFuji = new BlockTreeLeaf("AppleFuji", BandbFood.itemFruitAppleFuji).setUnlocalizedName("blockLeavesAppleFuji");
		blockLeavesAppleGala = new BlockTreeLeaf("AppleGala", BandbFood.itemFruitAppleGala).setUnlocalizedName("blockLeavesAppleGala");
		blockLeavesAppleGolden = new BlockTreeLeaf("AppleGolden", BandbFood.itemFruitAppleGolden).setUnlocalizedName("blockLeavesAppleGolden");
		blockLeavesAppleGrannySmith = new BlockTreeLeaf("AppleGrannySmith", BandbFood.itemFruitAppleGrannySmith).setUnlocalizedName("blockLeavesAppleGrannySmith");
		
		GameRegistry.registerBlock(blockLeavesAppleElstar, "blockLeavesAppleElstar");
		GameRegistry.registerBlock(blockLeavesAppleFuji, "blockLeavesAppleFuji");
		GameRegistry.registerBlock(blockLeavesAppleGala, "blockLeavesAppleGala");
		GameRegistry.registerBlock(blockLeavesAppleGolden, "blockLeavesAppleGolden");
		GameRegistry.registerBlock(blockLeavesAppleGrannySmith, "blockLeavesAppleGrannySmith");
		
		blockLeavesAppleHoneycrunch = new BlockTreeLeaf("AppleHoneycrunch", BandbFood.itemFruitAppleHoneycrunch).setUnlocalizedName("blockLeavesAppleHoneycrunch");
		blockLeavesAppleJazz = new BlockTreeLeaf("AppleJazz", BandbFood.itemFruitAppleJazz).setUnlocalizedName("blockLeavesAppleJazz");
		blockLeavesAppleJonagoldJonagored = new BlockTreeLeaf("AppleJonagoldJonagored",BandbFood.itemFruitAppleJonagoldJonagored).setUnlocalizedName("blockLeavesAppleJonagoldJonagored");
		blockLeavesAppleLesRouges = new BlockTreeLeaf("AppleLesRouges", BandbFood.itemFruitAppleLesRouges).setUnlocalizedName("blockLeavesAppleLesRouges");
		blockLeavesApplePinkLady = new BlockTreeLeaf("ApplePinkLady", BandbFood.itemFruitApplePinkLady).setUnlocalizedName("blockLeavesApplePinkLady");
		
		GameRegistry.registerBlock(blockLeavesAppleHoneycrunch, "blockLeavesAppleHoneycrunch");
		GameRegistry.registerBlock(blockLeavesAppleJazz, "blockLeavesAppleJazz");
		GameRegistry.registerBlock(blockLeavesAppleJonagoldJonagored, "blockLeavesAppleJonagoldJonagored");
		GameRegistry.registerBlock(blockLeavesAppleLesRouges, "blockLeavesAppleLesRouges");
		GameRegistry.registerBlock(blockLeavesApplePinkLady, "blockLeavesApplePinkLady");
		
		blockLeavesApplePommeLimousin = new BlockTreeLeaf("ApplePommeLimousin", BandbFood.itemFruitApplePommeDuLimousin).setUnlocalizedName("blockLeavesApplePommeLimousin");
		blockLeavesAppleReineDesReinettes = new BlockTreeLeaf("AppleReineDesReinettes", BandbFood.itemFruitAppleReineDesReinettes).setUnlocalizedName("blockLeavesAppleReineDesReinettes");
		blockLeavesAppleReinetteGriseDuCanada = new BlockTreeLeaf("AppleReinetteGriseDuCanada", BandbFood.itemFruitAppleReinetteGriseDuCanada).setUnlocalizedName("blockLeavesAppleReinetteGriseDuCanada");
		blockLeavesAppleTentation = new BlockTreeLeaf("AppleTentation", BandbFood.itemFruitAppleTentation).setUnlocalizedName("blockLeavesAppleTentation");
		blockLeavesCrabapple = new BlockTreeLeaf("Crabapple", BandbFood.itemFruitCrabapple).setUnlocalizedName("blockLeavesCrabapple");
		
		GameRegistry.registerBlock(blockLeavesApplePommeLimousin, "blockLeavesApplePommeLimousin");
		GameRegistry.registerBlock(blockLeavesAppleReineDesReinettes, "blockLeavesAppleReineDesReinettes");
		GameRegistry.registerBlock(blockLeavesAppleReinetteGriseDuCanada, "blockLeavesAppleReinetteGriseDuCanada");
		GameRegistry.registerBlock(blockLeavesAppleTentation, "blockLeavesAppleTentation");
		GameRegistry.registerBlock(blockLeavesCrabapple, "blockLeavesCrabapple");
 
		
		blockSaplingAbiu = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAbiu, BandbBlocks.blockWoodAbiu).setUnlocalizedName("blockSaplingAbiu");
		blockSaplingAfrican = new BlockTreeSaplingPalmTree(BandbBlocks.blockLeavesAfrican, BandbBlocks.blockWoodAfrican).setUnlocalizedName("blockSaplingAfrican");
		blockSaplingAllspice = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAllspice, BandbBlocks.blockWoodAllspice).setUnlocalizedName("blockSaplingAllspice");
		blockSaplingAlmond = new BlockTreeSaplingHight(BandbBlocks.blockLeavesAlmond, BandbBlocks.blockWoodAlmond).setUnlocalizedName("blockSaplingAlmond");
		blockSaplingAmla = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAmla, BandbBlocks.blockWoodAmla).setUnlocalizedName("blockSaplingAmla");

		GameRegistry.registerBlock(blockSaplingAbiu, "blockSaplingAbiu");
		GameRegistry.registerBlock(blockSaplingAfrican, "blockSaplingAfrican");
		GameRegistry.registerBlock(blockSaplingAllspice, "blockSaplingAllspice");
		GameRegistry.registerBlock(blockSaplingAlmond, "blockSaplingAlmond");
		GameRegistry.registerBlock(blockSaplingAmla, "blockSaplingAmla");

		blockSaplingAnise = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAnise, BandbBlocks.blockWoodAnise).setUnlocalizedName("blockSaplingAnise");
		blockSaplingApricot = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesApricot, BandbBlocks.blockWoodApricot).setUnlocalizedName("blockSaplingApricot");
		blockSaplingAvocado = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAvocado, BandbBlocks.blockWoodAvocado).setUnlocalizedName("blockSaplingAvocado");
		blockSaplingBael = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBael, BandbBlocks.blockWoodBael).setUnlocalizedName("blockSaplingBael");
		blockSaplingBanana = new BlockTreeSaplingPalmTree(BandbBlocks.blockLeavesBanana, BandbBlocks.blockWoodBanana).setUnlocalizedName("blockSaplingBanana");

		GameRegistry.registerBlock(blockSaplingAnise, "blockSaplingAnise");
		GameRegistry.registerBlock(blockSaplingApricot, "blockSaplingApricot");
		GameRegistry.registerBlock(blockSaplingAvocado, "blockSaplingAvocado");
		GameRegistry.registerBlock(blockSaplingBael, "blockSaplingBael");
		GameRegistry.registerBlock(blockSaplingBanana, "blockSaplingBanana");

		blockSaplingBananaPlantain = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBanana, BandbBlocks.blockWoodBanana).setUnlocalizedName("blockSaplingBananaPlantain");
		blockSaplingBer = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBer, BandbBlocks.blockWoodBer).setUnlocalizedName("blockSaplingBer");
		blockSaplingBlackCherry = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBlackCherry, BandbBlocks.blockWoodBlackCherry).setUnlocalizedName("blockSaplingBlackCherry");
		blockSaplingBlackthorn = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBlackthorn, BandbBlocks.blockWoodBlackthorn).setUnlocalizedName("blockSaplingBlackthorn");
		blockSaplingBloodOrange = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBloodOrange, BandbBlocks.blockWoodBloodOrange).setUnlocalizedName("blockSaplingBloodOrange");

		GameRegistry.registerBlock(blockSaplingBananaPlantain, "blockSaplingBananaPlantain");
		GameRegistry.registerBlock(blockSaplingBer, "blockSaplingBer");
		GameRegistry.registerBlock(blockSaplingBlackCherry, "blockSaplingBlackCherry");
		GameRegistry.registerBlock(blockSaplingBlackthorn, "blockSaplingBlackthorn");
		GameRegistry.registerBlock(blockSaplingBloodOrange, "blockSaplingBloodOrange");

		blockSaplingBrazilNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBrazilNut, BandbBlocks.blockWoodBrazilNut).setUnlocalizedName("blockSaplingBrazilNut");
		blockSaplingBreadNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBreadNut, BandbBlocks.blockWoodBreadNut).setUnlocalizedName("blockSaplingBreadNut");
		blockSaplingBunyaNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesBunyaNut, BandbBlocks.blockWoodBunyaNut).setUnlocalizedName("blockSaplingBunyaNut");
		blockSaplingButternut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesButternut, BandbBlocks.blockWoodButternut).setUnlocalizedName("blockSaplingButternut");
		blockSaplingCacao = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCacao, BandbBlocks.blockWoodCacao).setUnlocalizedName("blockSaplingCacao");

		GameRegistry.registerBlock(blockSaplingBrazilNut, "blockSaplingBrazilNut");
		GameRegistry.registerBlock(blockSaplingBreadNut, "blockSaplingBreadNut");
		GameRegistry.registerBlock(blockSaplingBunyaNut, "blockSaplingBunyaNut");
		GameRegistry.registerBlock(blockSaplingButternut, "blockSaplingButternut");
		GameRegistry.registerBlock(blockSaplingCacao, "blockSaplingCacao");

		blockSaplingCashew = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCashew, BandbBlocks.blockWoodCashew).setUnlocalizedName("blockSaplingCashew");
		blockSaplingCherry = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCherry, BandbBlocks.blockWoodCherry).setUnlocalizedName("blockSaplingCherry");
		blockSaplingChestnut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesChestnut, BandbBlocks.blockWoodChestnut).setUnlocalizedName("blockSaplingChestnut");
		blockSaplingCinchona = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCinchona, BandbBlocks.blockWoodCinchona).setUnlocalizedName("blockSaplingCinchona");
		blockSaplingCinnamon = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCinnamon, BandbBlocks.blockWoodCinnamon).setUnlocalizedName("blockSaplingCinnamon");

		GameRegistry.registerBlock(blockSaplingCashew, "blockSaplingCashew");
		GameRegistry.registerBlock(blockSaplingCherry, "blockSaplingCherry");
		GameRegistry.registerBlock(blockSaplingChestnut, "blockSaplingChestnut");
		GameRegistry.registerBlock(blockSaplingCinchona, "blockSaplingCinchona");
		GameRegistry.registerBlock(blockSaplingCinnamon, "blockSaplingCinnamon");

		blockSaplingClementine = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesClementine, BandbBlocks.blockWoodClementine).setUnlocalizedName("blockSaplingClementine");
		blockSaplingClove = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesClove, BandbBlocks.blockWoodClove).setUnlocalizedName("blockSaplingClove");
		blockSaplingCoconut = new BlockTreeSaplingPalmTree(BandbBlocks.blockLeavesCoconut, BandbBlocks.blockWoodCoconut).setUnlocalizedName("blockSaplingCoconut");
		blockSaplingCurry = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesCurry, BandbBlocks.blockWoodCurry).setUnlocalizedName("blockSaplingCurry");
		blockSaplingDamsonPlum = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesDamsonPlum, BandbBlocks.blockWoodDamsonPlum).setUnlocalizedName("blockSaplingDamsonPlum");

		GameRegistry.registerBlock(blockSaplingClementine, "blockSaplingClementine");
		GameRegistry.registerBlock(blockSaplingClove, "blockSaplingClove");
		GameRegistry.registerBlock(blockSaplingCoconut, "blockSaplingCoconut");
		GameRegistry.registerBlock(blockSaplingCurry, "blockSaplingCurry");
		GameRegistry.registerBlock(blockSaplingDamsonPlum, "blockSaplingDamsonPlum");

		blockSaplingDate = new BlockTreeSaplingPalmTree(BandbBlocks.blockLeavesDate, BandbBlocks.blockWoodDate).setUnlocalizedName("blockSaplingDate");
		blockSaplingDragonfruit = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesDragonfruit, BandbBlocks.blockWoodDragonfruit).setUnlocalizedName("blockSaplingDragonfruit");
		blockSaplingElderberry = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesElderberry, BandbBlocks.blockWoodElderberry).setUnlocalizedName("blockSaplingElderberry");
		blockSaplingFig = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesFig, BandbBlocks.blockWoodFig).setUnlocalizedName("blockSaplingFig");
		blockSaplingGingkoNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesGingkoNut, BandbBlocks.blockWoodGingkoNut).setUnlocalizedName("blockSaplingGingkoNut");

		GameRegistry.registerBlock(blockSaplingDate, "blockSaplingDate");
		GameRegistry.registerBlock(blockSaplingDragonfruit, "blockSaplingDragonfruit");
		GameRegistry.registerBlock(blockSaplingElderberry, "blockSaplingElderberry");
		GameRegistry.registerBlock(blockSaplingFig, "blockSaplingFig");
		GameRegistry.registerBlock(blockSaplingGingkoNut, "blockSaplingGingkoNut");

		blockSaplingGrapefruit = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesGrapefruit, BandbBlocks.blockWoodGrapefruit).setUnlocalizedName("blockSaplingGrapefruit");
		blockSaplingGrapefruitPink = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesGrapefruitPink, BandbBlocks.blockWoodGrapefruitPink).setUnlocalizedName("blockSaplingGrapefruitPink");
		blockSaplingGuava = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesGuava, BandbBlocks.blockWoodGuava).setUnlocalizedName("blockSaplingGuava");
		blockSaplingHuckleberries = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesHuckleberries, BandbBlocks.blockWoodHuckleberries).setUnlocalizedName("blockSaplingHuckleberries");
		blockSaplingJackFruit = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesJackFruit, BandbBlocks.blockWoodJackFruit).setUnlocalizedName("blockSaplingJackFruit");

		GameRegistry.registerBlock(blockSaplingGrapefruit, "blockSaplingGrapefruit");
		GameRegistry.registerBlock(blockSaplingGrapefruitPink, "blockSaplingGrapefruitPink");
		GameRegistry.registerBlock(blockSaplingGuava, "blockSaplingGuava");
		GameRegistry.registerBlock(blockSaplingHuckleberries, "blockSaplingHuckleberries");
		GameRegistry.registerBlock(blockSaplingJackFruit, "blockSaplingJackFruit");

		blockSaplingJujube = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesJujube, BandbBlocks.blockWoodJujube).setUnlocalizedName("blockSaplingJujube");
		blockSaplingKiwi = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesKiwi, BandbBlocks.blockWoodKiwi).setUnlocalizedName("blockSaplingKiwi");
		blockSaplingKumquat = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesKumquat, BandbBlocks.blockWoodKumquat).setUnlocalizedName("blockSaplingKumquat");
		blockSaplingLaurel = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLaurel, BandbBlocks.blockWoodLaurel).setUnlocalizedName("blockSaplingLaurel");
		blockSaplingLemon = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLemon, BandbBlocks.blockWoodLemon).setUnlocalizedName("blockSaplingLemon");

		GameRegistry.registerBlock(blockSaplingJujube, "blockSaplingJujube");
		GameRegistry.registerBlock(blockSaplingKiwi, "blockSaplingKiwi");
		GameRegistry.registerBlock(blockSaplingKumquat, "blockSaplingKumquat");
		GameRegistry.registerBlock(blockSaplingLaurel, "blockSaplingLaurel");
		GameRegistry.registerBlock(blockSaplingLemon, "blockSaplingLemon");

		blockSaplingLime = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLime, BandbBlocks.blockWoodLime).setUnlocalizedName("blockSaplingLime");
		blockSaplingLongan = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLongan, BandbBlocks.blockWoodLongan).setUnlocalizedName("blockSaplingLongan");
		blockSaplingLoquat = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLoquat, BandbBlocks.blockWoodLoquat).setUnlocalizedName("blockSaplingLoquat");
		blockSaplingLychee = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesLychee, BandbBlocks.blockWoodLychee).setUnlocalizedName("blockSaplingLychee");
		blockSaplingMacadamia = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMacadamia, BandbBlocks.blockWoodMacadamia).setUnlocalizedName("blockSaplingMacadamia");

		GameRegistry.registerBlock(blockSaplingLime, "blockSaplingLime");
		GameRegistry.registerBlock(blockSaplingLongan, "blockSaplingLongan");
		GameRegistry.registerBlock(blockSaplingLoquat, "blockSaplingLoquat");
		GameRegistry.registerBlock(blockSaplingLychee, "blockSaplingLychee");
		GameRegistry.registerBlock(blockSaplingMacadamia, "blockSaplingMacadamia");

		blockSaplingMameySapote = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMameySapote, BandbBlocks.blockWoodMameySapote).setUnlocalizedName("blockSaplingMameySapote");
		blockSaplingMango = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMango, BandbBlocks.blockWoodMango).setUnlocalizedName("blockSaplingMango");
		blockSaplingMangosteen = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMangosteen, BandbBlocks.blockWoodMangosteen).setUnlocalizedName("blockSaplingMangosteen");
		blockSaplingMaple = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMaple, BandbBlocks.blockWoodMaple).setUnlocalizedName("blockSaplingMaple");
		blockSaplingMirabelle = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMirabelle, BandbBlocks.blockWoodMirabelle).setUnlocalizedName("blockSaplingMirabelle");

		GameRegistry.registerBlock(blockSaplingMameySapote, "blockSaplingMameySapote");
		GameRegistry.registerBlock(blockSaplingMango, "blockSaplingMango");
		GameRegistry.registerBlock(blockSaplingMangosteen, "blockSaplingMangosteen");
		GameRegistry.registerBlock(blockSaplingMaple, "blockSaplingMaple");
		GameRegistry.registerBlock(blockSaplingMirabelle, "blockSaplingMirabelle");

		blockSaplingMorelloCherry = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesMorelloCherry, BandbBlocks.blockWoodMorelloCherry).setUnlocalizedName("blockSaplingMorelloCherry");
		blockSaplingNectarine = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesNectarine, BandbBlocks.blockWoodNectarine).setUnlocalizedName("blockSaplingNectarine");
		blockSaplingNutmeg = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesNutmeg, BandbBlocks.blockWoodNutmeg).setUnlocalizedName("blockSaplingNutmeg");
		blockSaplingNuts = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesNuts, BandbBlocks.blockWoodNuts).setUnlocalizedName("blockSaplingNuts");
		blockSaplingOhiaAi = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesOhiaAi, BandbBlocks.blockWoodOhiaAi).setUnlocalizedName("blockSaplingOhiaAi");

		GameRegistry.registerBlock(blockSaplingMorelloCherry, "blockSaplingMorelloCherry");
		GameRegistry.registerBlock(blockSaplingNectarine, "blockSaplingNectarine");
		GameRegistry.registerBlock(blockSaplingNutmeg, "blockSaplingNutmeg");
		GameRegistry.registerBlock(blockSaplingNuts, "blockSaplingNuts");
		GameRegistry.registerBlock(blockSaplingOhiaAi, "blockSaplingOhiaAi");

		blockSaplingOlive = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesOlive, BandbBlocks.blockWoodOlive).setUnlocalizedName("blockSaplingOlive");
		blockSaplingOrange = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesOrange, BandbBlocks.blockWoodOrange).setUnlocalizedName("blockSaplingOrange");
		blockSaplingOsageOrange = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesOsageOrange, BandbBlocks.blockWoodOsageOrange).setUnlocalizedName("blockSaplingOsageOrange");
		blockSaplingPapaya = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPapaya, BandbBlocks.blockWoodPapaya).setUnlocalizedName("blockSaplingPapaya");
		blockSaplingParadiseNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesParadiseNut, BandbBlocks.blockWoodParadiseNut).setUnlocalizedName("blockSaplingParadiseNut");

		GameRegistry.registerBlock(blockSaplingOlive, "blockSaplingOlive");
		GameRegistry.registerBlock(blockSaplingOrange, "blockSaplingOrange");
		GameRegistry.registerBlock(blockSaplingOsageOrange, "blockSaplingOsageOrange");
		GameRegistry.registerBlock(blockSaplingPapaya, "blockSaplingPapaya");
		GameRegistry.registerBlock(blockSaplingParadiseNut, "blockSaplingParadiseNut");

		blockSaplingPassionfruit = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPassionfruit, BandbBlocks.blockWoodPassionfruit).setUnlocalizedName("blockSaplingPassionfruit");
		blockSaplingPeach = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPeach, BandbBlocks.blockWoodPeach).setUnlocalizedName("blockSaplingPeach");
		blockSaplingPear = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPear, BandbBlocks.blockWoodPear).setUnlocalizedName("blockSaplingPear");
		blockSaplingPersimmon = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPersimmon, BandbBlocks.blockWoodPersimmon).setUnlocalizedName("blockSaplingPersimmon");
		blockSaplingPineNut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPineNut, BandbBlocks.blockWoodPineNut).setUnlocalizedName("blockSaplingPineNut");

		GameRegistry.registerBlock(blockSaplingPassionfruit, "blockSaplingPassionfruit");
		GameRegistry.registerBlock(blockSaplingPeach, "blockSaplingPeach");
		GameRegistry.registerBlock(blockSaplingPear, "blockSaplingPear");
		GameRegistry.registerBlock(blockSaplingPersimmon, "blockSaplingPersimmon");
		GameRegistry.registerBlock(blockSaplingPineNut, "blockSaplingPineNut");

		blockSaplingPistachio = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPistachio, BandbBlocks.blockWoodPistachio).setUnlocalizedName("blockSaplingPistachio");
		blockSaplingPlane = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPlane, BandbBlocks.blockWoodPlane).setUnlocalizedName("blockSaplingPlane");
		blockSaplingPlum = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPlum, BandbBlocks.blockWoodPlum).setUnlocalizedName("blockSaplingPlum");
		blockSaplingPomegranate = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPomegranate, BandbBlocks.blockWoodPomegranate).setUnlocalizedName("blockSaplingPomegranate");
		blockSaplingPomelo = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesPomelo, BandbBlocks.blockWoodPomelo).setUnlocalizedName("blockSaplingPomelo");

		GameRegistry.registerBlock(blockSaplingPistachio, "blockSaplingPistachio");
		GameRegistry.registerBlock(blockSaplingPlane, "blockSaplingPlane");
		GameRegistry.registerBlock(blockSaplingPlum, "blockSaplingPlum");
		GameRegistry.registerBlock(blockSaplingPomegranate, "blockSaplingPomegranate");
		GameRegistry.registerBlock(blockSaplingPomelo, "blockSaplingPomelo");

		blockSaplingQuince = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesQuince, BandbBlocks.blockWoodQuince).setUnlocalizedName("blockSaplingQuince");
		blockSaplingRedBanana = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesRedBanana, BandbBlocks.blockWoodRedBanana).setUnlocalizedName("blockSaplingRedBanana");
		blockSaplingSapodilla = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesSapodilla, BandbBlocks.blockWoodSapodilla).setUnlocalizedName("blockSaplingSapodilla");
		blockSaplingSatsuma = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesSatsuma, BandbBlocks.blockWoodSatsuma).setUnlocalizedName("blockSaplingSatsuma");
		blockSaplingSoursop = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesSoursop, BandbBlocks.blockWoodSoursop).setUnlocalizedName("blockSaplingSoursop");

		GameRegistry.registerBlock(blockSaplingQuince, "blockSaplingQuince");
		GameRegistry.registerBlock(blockSaplingRedBanana, "blockSaplingRedBanana");
		GameRegistry.registerBlock(blockSaplingSapodilla, "blockSaplingSapodilla");
		GameRegistry.registerBlock(blockSaplingSatsuma, "blockSaplingSatsuma");
		GameRegistry.registerBlock(blockSaplingSoursop, "blockSaplingSoursop");

		blockSaplingStarAnise = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesStarAnise, BandbBlocks.blockWoodStarAnise).setUnlocalizedName("blockSaplingStarAnise");
		blockSaplingTamarillo = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesTamarillo, BandbBlocks.blockWoodTamarillo).setUnlocalizedName("blockSaplingTamarillo");
		blockSaplingTangerine = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesTangerine, BandbBlocks.blockWoodTangerine).setUnlocalizedName("blockSaplingTangerine");
		blockSaplingTonkaBean = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesTonkaBean, BandbBlocks.blockWoodTonkaBean).setUnlocalizedName("blockSaplingTonkaBean");
		blockSaplingVanilla = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesVanilla, BandbBlocks.blockWoodVanilla).setUnlocalizedName("blockSaplingVanilla");

		GameRegistry.registerBlock(blockSaplingStarAnise, "blockSaplingStarAnise");
		GameRegistry.registerBlock(blockSaplingTamarillo, "blockSaplingTamarillo");
		GameRegistry.registerBlock(blockSaplingTangerine, "blockSaplingTangerine");
		GameRegistry.registerBlock(blockSaplingTonkaBean, "blockSaplingTonkaBean");
		GameRegistry.registerBlock(blockSaplingVanilla, "blockSaplingVanilla");

		blockSaplingWalnut = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesWalnut, BandbBlocks.blockWoodWalnut).setUnlocalizedName("blockSaplingWalnut");
		blockSaplingWhitePeach = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesWhitePeach, BandbBlocks.blockWoodWhitePeach).setUnlocalizedName("blockSaplingWhitePeach");

		GameRegistry.registerBlock(blockSaplingWalnut, "blockSaplingWalnut");
		GameRegistry.registerBlock(blockSaplingWhitePeach, "blockSaplingWhitePeach");
		
		//apple
		blockSaplingAppleAntares = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleAntares, BandbBlocks.blockWoodAppleAntares).setUnlocalizedName("blockSaplingAppleAntares");
		blockSaplingAppleAriane = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleAriane, BandbBlocks.blockWoodAppleAriane).setUnlocalizedName("blockSaplingAppleAriane");
		blockSaplingAppleBelchardChancelier = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleBelchardChantecier, BandbBlocks.blockWoodAppleBelchardChantecier).setUnlocalizedName("blockSaplingAppleBelchardChancelier");
		blockSaplingAppleBelleDeBoskoop = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleBelleDeBoskoop, BandbBlocks.blockWoodAppleBelleDeBoskoop).setUnlocalizedName("blockSaplingAppleBelleDeBoskoop");
		blockSaplingAppleBraeburn = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleBraeburn, BandbBlocks.blockWoodAppleBraeburn).setUnlocalizedName("blockSaplingAppleBraeburn");

		GameRegistry.registerBlock(blockSaplingAppleAntares, "blockSaplingAppleAntares");
		GameRegistry.registerBlock(blockSaplingAppleAriane, "blockSaplingAppleAriane");
		GameRegistry.registerBlock(blockSaplingAppleBelchardChancelier, "blockSaplingAppleBelchardChancelier");
		GameRegistry.registerBlock(blockSaplingAppleBelleDeBoskoop, "blockSaplingAppleBelleDeBoskoop");
		GameRegistry.registerBlock(blockSaplingAppleBraeburn, "blockSaplingAppleBraeburn");

		blockSaplingAppleElstar = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleElstar, BandbBlocks.blockWoodAppleElstar).setUnlocalizedName("blockSaplingAppleElstar");
		blockSaplingAppleFuji = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleFuji, BandbBlocks.blockWoodAppleFuji).setUnlocalizedName("blockSaplingAppleFuji");
		blockSaplingAppleGala = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleGala, BandbBlocks.blockWoodAppleGala).setUnlocalizedName("blockSaplingAppleGala");
		blockSaplingAppleGolden = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleGolden, BandbBlocks.blockWoodAppleGolden).setUnlocalizedName("blockSaplingAppleGolden");
		blockSaplingAppleGrannySmith = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleGrannySmith, BandbBlocks.blockWoodAppleGrannySmith).setUnlocalizedName("blockSaplingAppleGrannySmith");

		GameRegistry.registerBlock(blockSaplingAppleElstar, "blockSaplingAppleElstar");
		GameRegistry.registerBlock(blockSaplingAppleFuji, "blockSaplingAppleFuji");
		GameRegistry.registerBlock(blockSaplingAppleGala, "blockSaplingAppleGala");
		GameRegistry.registerBlock(blockSaplingAppleGolden, "blockSaplingAppleGolden");
		GameRegistry.registerBlock(blockSaplingAppleGrannySmith, "blockSaplingAppleGrannySmith");

		blockSaplingAppleHoneycrunch = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleHoneycrunch, BandbBlocks.blockWoodAppleHoneycrunch).setUnlocalizedName("blockSaplingAppleHoneycrunch");
		blockSaplingAppleJazz = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleJazz, BandbBlocks.blockWoodAppleJazz).setUnlocalizedName("blockSaplingAppleJazz");
		blockSaplingAppleJonagoldJonagored = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleJonagoldJonagored, BandbBlocks.blockWoodAppleJonagoldJonagored).setUnlocalizedName("blockSaplingAppleJonagoldJonagored");
		blockSaplingAppleLesRouges = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleLesRouges, BandbBlocks.blockWoodAppleLesRouges).setUnlocalizedName("blockSaplingAppleLesRouges");
		blockSaplingApplePinkLady = new BlockTreeSaplingApple(BandbBlocks.blockLeavesApplePinkLady, BandbBlocks.blockWoodApplePinkLady).setUnlocalizedName("blockSaplingApplePinkLady");

		GameRegistry.registerBlock(blockSaplingAppleHoneycrunch, "blockSaplingAppleHoneycrunch");
		GameRegistry.registerBlock(blockSaplingAppleJazz, "blockSaplingAppleJazz");
		GameRegistry.registerBlock(blockSaplingAppleJonagoldJonagored, "blockSaplingAppleJonagoldJonagored");
		GameRegistry.registerBlock(blockSaplingAppleLesRouges, "blockSaplingAppleLesRouges");
		GameRegistry.registerBlock(blockSaplingApplePinkLady, "blockSaplingApplePinkLady");

		blockSaplingApplePommeDuLimousin = new BlockTreeSaplingApple(BandbBlocks.blockLeavesApplePommeLimousin, BandbBlocks.blockWoodApplePommeLimousin).setUnlocalizedName("blockSaplingApplePommeDuLimousin");
		blockSaplingAppleReineDesReinettes = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleReineDesReinettes, BandbBlocks.blockWoodAppleReineDesReinettes).setUnlocalizedName("blockSaplingAppleReineDesReinettes");
		blockSaplingAppleReinetteGriseDuCanada = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleReinetteGriseDuCanada, BandbBlocks.blockWoodAppleReinetteGriseDuCanada).setUnlocalizedName("blockSaplingAppleReinetteGriseDuCanada");
		blockSaplingAppleTentation = new BlockTreeSaplingApple(BandbBlocks.blockLeavesAppleTentation, BandbBlocks.blockWoodAppleTentation).setUnlocalizedName("blockSaplingAppleTentation");
		blockSaplingCrabapple = new BlockTreeSaplingApple(BandbBlocks.blockLeavesCrabapple, BandbBlocks.blockWoodCrabapple).setUnlocalizedName("blockSaplingCrabapple");

		GameRegistry.registerBlock(blockSaplingApplePommeDuLimousin, "blockSaplingApplePommeDuLimousin");
		GameRegistry.registerBlock(blockSaplingAppleReineDesReinettes, "blockSaplingAppleReineDesReinettes");
		GameRegistry.registerBlock(blockSaplingAppleReinetteGriseDuCanada, "blockSaplingAppleReinetteGriseDuCanada");
		GameRegistry.registerBlock(blockSaplingAppleTentation, "blockSaplingAppleTentation");
		GameRegistry.registerBlock(blockSaplingCrabapple, "blockSaplingCrabapple");
		
	}
		
	public static void registerRender(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAbiu), 0, new ModelResourceLocation("bandb_mod:blockWoodAbiu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAfrican), 0, new ModelResourceLocation("bandb_mod:blockWoodAfrican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAllspice), 0, new ModelResourceLocation("bandb_mod:blockWoodAllspice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAlmond), 0, new ModelResourceLocation("bandb_mod:blockWoodAlmond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAmla), 0, new ModelResourceLocation("bandb_mod:blockWoodAmla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAnise), 0, new ModelResourceLocation("bandb_mod:blockWoodAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodApricot), 0, new ModelResourceLocation("bandb_mod:blockWoodApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAvocado), 0, new ModelResourceLocation("bandb_mod:blockWoodAvocado", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBael), 0, new ModelResourceLocation("bandb_mod:blockWoodBael", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBanana), 0, new ModelResourceLocation("bandb_mod:blockWoodBanana", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBer), 0, new ModelResourceLocation("bandb_mod:blockWoodBer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBlackCherry), 0, new ModelResourceLocation("bandb_mod:blockWoodBlackCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBlackthorn), 0, new ModelResourceLocation("bandb_mod:blockWoodBlackthorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBloodOrange), 0, new ModelResourceLocation("bandb_mod:blockWoodBloodOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBrazilNut), 0, new ModelResourceLocation("bandb_mod:blockWoodBrazilNut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBreadNut), 0, new ModelResourceLocation("bandb_mod:blockWoodBreadNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodBunyaNut), 0, new ModelResourceLocation("bandb_mod:blockWoodBunyaNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodButternut), 0, new ModelResourceLocation("bandb_mod:blockWoodButternut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCacao), 0, new ModelResourceLocation("bandb_mod:blockWoodCacao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCashew), 0, new ModelResourceLocation("bandb_mod:blockWoodCashew", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCherry), 0, new ModelResourceLocation("bandb_mod:blockWoodCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodChestnut), 0, new ModelResourceLocation("bandb_mod:blockWoodChestnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCinnamon), 0, new ModelResourceLocation("bandb_mod:blockWoodCinnamon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodClementine), 0, new ModelResourceLocation("bandb_mod:blockWoodClementine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodClove), 0, new ModelResourceLocation("bandb_mod:blockWoodClove", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCoconut), 0, new ModelResourceLocation("bandb_mod:blockWoodCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCurry), 0, new ModelResourceLocation("bandb_mod:blockWoodCurry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodDamsonPlum), 0, new ModelResourceLocation("bandb_mod:blockWoodDamsonPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodDate), 0, new ModelResourceLocation("bandb_mod:blockWoodDate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodDragonfruit), 0, new ModelResourceLocation("bandb_mod:blockWoodDragonfruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodElderberry), 0, new ModelResourceLocation("bandb_mod:blockWoodElderberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodFig), 0, new ModelResourceLocation("bandb_mod:blockWoodFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodGingkoNut), 0, new ModelResourceLocation("bandb_mod:blockWoodGingkoNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodGrapefruitPink), 0, new ModelResourceLocation("bandb_mod:blockWoodGrapefruitPink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodGrapefruit), 0, new ModelResourceLocation("bandb_mod:blockWoodGrapefruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodGuava), 0, new ModelResourceLocation("bandb_mod:blockWoodGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodHuckleberries), 0, new ModelResourceLocation("bandb_mod:blockWoodHuckleberries", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodJackFruit), 0, new ModelResourceLocation("bandb_mod:blockWoodJackFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodJujube), 0, new ModelResourceLocation("bandb_mod:blockWoodJujube", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodKiwi), 0, new ModelResourceLocation("bandb_mod:blockWoodKiwi", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodKumquat), 0, new ModelResourceLocation("bandb_mod:blockWoodKumquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLaurel), 0, new ModelResourceLocation("bandb_mod:blockWoodLaurel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLemon), 0, new ModelResourceLocation("bandb_mod:blockWoodLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLime), 0, new ModelResourceLocation("bandb_mod:blockWoodLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLongan), 0, new ModelResourceLocation("bandb_mod:blockWoodLongan", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLoquat), 0, new ModelResourceLocation("bandb_mod:blockWoodLoquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodLychee), 0, new ModelResourceLocation("bandb_mod:blockWoodLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMacadamia), 0, new ModelResourceLocation("bandb_mod:blockWoodMacadamia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMameySapote), 0, new ModelResourceLocation("bandb_mod:blockWoodMameySapote", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMango), 0, new ModelResourceLocation("bandb_mod:blockWoodMango", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMangosteen), 0, new ModelResourceLocation("bandb_mod:blockWoodMangosteen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMaple), 0, new ModelResourceLocation("bandb_mod:blockWoodMaple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMirabelle), 0, new ModelResourceLocation("bandb_mod:blockWoodMirabelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodMorelloCherry), 0, new ModelResourceLocation("bandb_mod:blockWoodMorelloCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodNectarine), 0, new ModelResourceLocation("bandb_mod:blockWoodNectarine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodNutmeg), 0, new ModelResourceLocation("bandb_mod:blockWoodNutmeg", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodNuts), 0, new ModelResourceLocation("bandb_mod:blockWoodNuts", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodOhiaAi), 0, new ModelResourceLocation("bandb_mod:blockWoodOhiaAi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodOlive), 0, new ModelResourceLocation("bandb_mod:blockWoodOlive", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodOrange), 0, new ModelResourceLocation("bandb_mod:blockWoodOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodOsageOrange), 0, new ModelResourceLocation("bandb_mod:blockWoodOsageOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPapaya), 0, new ModelResourceLocation("bandb_mod:blockWoodPapaya", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodParadiseNut), 0, new ModelResourceLocation("bandb_mod:blockWoodParadiseNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPassionfruit), 0, new ModelResourceLocation("bandb_mod:blockWoodPassionfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPeach), 0, new ModelResourceLocation("bandb_mod:blockWoodPeach", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPear), 0, new ModelResourceLocation("bandb_mod:blockWoodPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPersimmon), 0, new ModelResourceLocation("bandb_mod:blockWoodPersimmon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPineNut), 0, new ModelResourceLocation("bandb_mod:blockWoodPineNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPistachio), 0, new ModelResourceLocation("bandb_mod:blockWoodPistachio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPlane), 0, new ModelResourceLocation("bandb_mod:blockWoodPlane", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPlantain), 0, new ModelResourceLocation("bandb_mod:blockWoodPlantain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPlum), 0, new ModelResourceLocation("bandb_mod:blockWoodPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPomegranate), 0, new ModelResourceLocation("bandb_mod:blockWoodPomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodPomelo), 0, new ModelResourceLocation("bandb_mod:blockWoodPomelo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodQuince), 0, new ModelResourceLocation("bandb_mod:blockWoodQuince", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodRedBanana), 0, new ModelResourceLocation("bandb_mod:blockWoodRedBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodSapodilla), 0, new ModelResourceLocation("bandb_mod:blockWoodSapodilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodSatsuma), 0, new ModelResourceLocation("bandb_mod:blockWoodSatsuma", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodSoursop), 0, new ModelResourceLocation("bandb_mod:blockWoodSoursop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodStarAnise), 0, new ModelResourceLocation("bandb_mod:blockWoodStarAnise", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodTamarillo), 0, new ModelResourceLocation("bandb_mod:blockWoodTamarillo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodTangerine), 0, new ModelResourceLocation("bandb_mod:blockWoodTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodTonkaBean), 0, new ModelResourceLocation("bandb_mod:blockWoodTonkaBean", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodVanilla), 0, new ModelResourceLocation("bandb_mod:blockWoodVanilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodWalnut), 0, new ModelResourceLocation("bandb_mod:blockWoodWalnut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodWhitePeach), 0, new ModelResourceLocation("bandb_mod:blockWoodWhitePeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCinchona), 0, new ModelResourceLocation("bandb_mod:blockWoodCinchona", "inventory"));
		
			//apple
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleAntares), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleAntares", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleAriane), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleAriane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleBelchardChantecier), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleBelchardChantecier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleBelleDeBoskoop), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleBelleDeBoskoop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleBraeburn), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleBraeburn", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleElstar), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleElstar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleFuji), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleFuji", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleGala), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleGala", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleGolden), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleGolden", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleGrannySmith), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleGrannySmith", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleHoneycrunch), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleHoneycrunch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleJazz), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleJazz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleJonagoldJonagored), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleJonagoldJonagored", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleLesRouges), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleLesRouges", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodApplePinkLady), 0, new ModelResourceLocation("bandb_mod:blockWoodApplePinkLady", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodApplePommeLimousin), 0, new ModelResourceLocation("bandb_mod:blockWoodApplePommeLimousin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleReineDesReinettes), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleReineDesReinettes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleReinetteGriseDuCanada), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleReinetteGriseDuCanada", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodAppleTentation), 0, new ModelResourceLocation("bandb_mod:blockWoodAppleTentation", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockWoodCrabapple), 0, new ModelResourceLocation("bandb_mod:blockWoodCrabapple", "inventory"));
		
		//leaves
		
		/**
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAbiu), 0, new ModelResourceLocation("bandb_mod:blockLeavesAbiu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAfrican), 0, new ModelResourceLocation("bandb_mod:blockLeavesAfrican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAllspice), 0, new ModelResourceLocation("bandb_mod:blockLeavesAllspice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAlmond), 0, new ModelResourceLocation("bandb_mod:blockLeavesAlmond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAmla), 0, new ModelResourceLocation("bandb_mod:blockLeavesAmla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAnise), 0, new ModelResourceLocation("bandb_mod:blockLeavesAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesApricot), 0, new ModelResourceLocation("bandb_mod:blockLeavesApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAvocado), 0, new ModelResourceLocation("bandb_mod:blockLeavesAvocado", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBael), 0, new ModelResourceLocation("bandb_mod:blockLeavesBael", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBanana), 0, new ModelResourceLocation("bandb_mod:blockLeavesBanana", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBer), 0, new ModelResourceLocation("bandb_mod:blockLeavesBer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBlackCherry), 0, new ModelResourceLocation("bandb_mod:blockLeavesBlackCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBlackthorn), 0, new ModelResourceLocation("bandb_mod:blockLeavesBlackthorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBloodOrange), 0, new ModelResourceLocation("bandb_mod:blockLeavesBloodOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBrazilNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesBrazilNut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBreadNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesBreadNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesBunyaNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesBunyaNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesButternut), 0, new ModelResourceLocation("bandb_mod:blockLeavesButternut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCacao), 0, new ModelResourceLocation("bandb_mod:blockLeavesCacao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCashew), 0, new ModelResourceLocation("bandb_mod:blockLeavesCashew", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCherry), 0, new ModelResourceLocation("bandb_mod:blockLeavesCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesChestnut), 0, new ModelResourceLocation("bandb_mod:blockLeavesChestnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCinchona), 0, new ModelResourceLocation("bandb_mod:blockLeavesCinchona", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCinnamon), 0, new ModelResourceLocation("bandb_mod:blockLeavesCinnamon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesClementine), 0, new ModelResourceLocation("bandb_mod:blockLeavesClementine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesClove), 0, new ModelResourceLocation("bandb_mod:blockLeavesClove", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCoconut), 0, new ModelResourceLocation("bandb_mod:blockLeavesCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCurry), 0, new ModelResourceLocation("bandb_mod:blockLeavesCurry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesDamsonPlum), 0, new ModelResourceLocation("bandb_mod:blockLeavesDamsonPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesDate), 0, new ModelResourceLocation("bandb_mod:blockLeavesDate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesDragonfruit), 0, new ModelResourceLocation("bandb_mod:blockLeavesDragonfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesElderberry), 0, new ModelResourceLocation("bandb_mod:blockLeavesElderberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesFig), 0, new ModelResourceLocation("bandb_mod:blockLeavesFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesGingkoNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesGingkoNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesGrapefruit), 0, new ModelResourceLocation("bandb_mod:blockLeavesGrapefruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesGrapefruitPink), 0, new ModelResourceLocation("bandb_mod:blockLeavesGrapefruitPink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesGuava), 0, new ModelResourceLocation("bandb_mod:blockLeavesGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesHuckleberries), 0, new ModelResourceLocation("bandb_mod:blockLeavesHuckleberries", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesJackFruit), 0, new ModelResourceLocation("bandb_mod:blockLeavesJackFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesJujube), 0, new ModelResourceLocation("bandb_mod:blockLeavesJujube", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesKiwi), 0, new ModelResourceLocation("bandb_mod:blockLeavesKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesKumquat), 0, new ModelResourceLocation("bandb_mod:blockLeavesKumquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLaurel), 0, new ModelResourceLocation("bandb_mod:blockLeavesLaurel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLemon), 0, new ModelResourceLocation("bandb_mod:blockLeavesLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLime), 0, new ModelResourceLocation("bandb_mod:blockLeavesLime", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLongan), 0, new ModelResourceLocation("bandb_mod:blockLeavesLongan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLoquat), 0, new ModelResourceLocation("bandb_mod:blockLeavesLoquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesLychee), 0, new ModelResourceLocation("bandb_mod:blockLeavesLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMacadamia), 0, new ModelResourceLocation("bandb_mod:blockLeavesMacadamia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMameySapote), 0, new ModelResourceLocation("bandb_mod:blockLeavesMameySapote", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMango), 0, new ModelResourceLocation("bandb_mod:blockLeavesMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMangosteen), 0, new ModelResourceLocation("bandb_mod:blockLeavesMangosteen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMaple), 0, new ModelResourceLocation("bandb_mod:blockLeavesMaple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMirabelle), 0, new ModelResourceLocation("bandb_mod:blockLeavesMirabelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesMorelloCherry), 0, new ModelResourceLocation("bandb_mod:blockLeavesMorelloCherry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesNectarine), 0, new ModelResourceLocation("bandb_mod:blockLeavesNectarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesNutmeg), 0, new ModelResourceLocation("bandb_mod:blockLeavesNutmeg", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesNuts), 0, new ModelResourceLocation("bandb_mod:blockLeavesNuts", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesOhiaAi), 0, new ModelResourceLocation("bandb_mod:blockLeavesOhiaAi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesOlive), 0, new ModelResourceLocation("bandb_mod:blockLeavesOlive", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesOrange), 0, new ModelResourceLocation("bandb_mod:blockLeavesOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesOsageOrange), 0, new ModelResourceLocation("bandb_mod:blockLeavesOsageOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPapaya), 0, new ModelResourceLocation("bandb_mod:blockLeavesPapaya", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesParadiseNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesParadiseNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPassionfruit), 0, new ModelResourceLocation("bandb_mod:blockLeavesPassionfruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPeach), 0, new ModelResourceLocation("bandb_mod:blockLeavesPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPear), 0, new ModelResourceLocation("bandb_mod:blockLeavesPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPersimmon), 0, new ModelResourceLocation("bandb_mod:blockLeavesPersimmon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPineNut), 0, new ModelResourceLocation("bandb_mod:blockLeavesPineNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPistachio), 0, new ModelResourceLocation("bandb_mod:blockLeavesPistachio", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPlane), 0, new ModelResourceLocation("bandb_mod:blockLeavesPlane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPlantain), 0, new ModelResourceLocation("bandb_mod:blockLeavesPlantain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPlum), 0, new ModelResourceLocation("bandb_mod:blockLeavesPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPomegranate), 0, new ModelResourceLocation("bandb_mod:blockLeavesPomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesPomelo), 0, new ModelResourceLocation("bandb_mod:blockLeavesPomelo", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesQuince), 0, new ModelResourceLocation("bandb_mod:blockLeavesQuince", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesRedBanana), 0, new ModelResourceLocation("bandb_mod:blockLeavesRedBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesSapodilla), 0, new ModelResourceLocation("bandb_mod:blockLeavesSapodilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesSatsuma), 0, new ModelResourceLocation("bandb_mod:blockLeavesSatsuma", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesSoursop), 0, new ModelResourceLocation("bandb_mod:blockLeavesSoursop", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesStarAnise), 0, new ModelResourceLocation("bandb_mod:blockLeavesStarAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesTamarillo), 0, new ModelResourceLocation("bandb_mod:blockLeavesTamarillo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesTangerine), 0, new ModelResourceLocation("bandb_mod:blockLeavesTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesTonkaBean), 0, new ModelResourceLocation("bandb_mod:blockLeavesTonkaBean", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesVanilla), 0, new ModelResourceLocation("bandb_mod:blockLeavesVanilla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesWalnut), 0, new ModelResourceLocation("bandb_mod:blockLeavesWalnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesWhitePeach), 0, new ModelResourceLocation("bandb_mod:blockLeavesWhitePeach", "inventory"));
		//apple
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleAntares), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleAntares", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleAriane), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleAriane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleBelchardChantecier), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleBelchardChantecier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleBelleDeBoskoop), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleBelleDeBoskoop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleBraeburn), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleBraeburn", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleElstar), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleElstar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleFuji), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleFuji", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleGala), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleGala", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleGolden), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleGolden", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleGrannySmith), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleGrannySmith", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleHoneycrunch), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleHoneycrunch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleJazz), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleJazz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleJonagoldJonagored), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleJonagoldJonagored", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleLesRouges), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleLesRouges", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesApplePinkLady), 0, new ModelResourceLocation("bandb_mod:blockLeavesApplePinkLady", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesApplePommeLimousin), 0, new ModelResourceLocation("bandb_mod:blockLeavesApplePommeLimousin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleReineDesReinettes), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleReineDesReinettes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleReinetteGriseDuCanada), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleReinetteGriseDuCanada", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesAppleTentation), 0, new ModelResourceLocation("bandb_mod:blockLeavesAppleTentation", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockLeavesCrabapple), 0, new ModelResourceLocation("bandb_mod:blockLeavesCrabapple", "inventory"));

		**/
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAbiu), 0, new ModelResourceLocation("bandb_mod:blockSaplingAbiu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAfrican), 0, new ModelResourceLocation("bandb_mod:blockSaplingAfrican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAllspice), 0, new ModelResourceLocation("bandb_mod:blockSaplingAllspice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAlmond), 0, new ModelResourceLocation("bandb_mod:blockSaplingAlmond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAmla), 0, new ModelResourceLocation("bandb_mod:blockSaplingAmla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAnise), 0, new ModelResourceLocation("bandb_mod:blockSaplingAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingApricot), 0, new ModelResourceLocation("bandb_mod:blockSaplingApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAvocado), 0, new ModelResourceLocation("bandb_mod:blockSaplingAvocado", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBael), 0, new ModelResourceLocation("bandb_mod:blockSaplingBael", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBananaPlantain), 0, new ModelResourceLocation("bandb_mod:blockSaplingBananaPlantain", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBanana), 0, new ModelResourceLocation("bandb_mod:blockSaplingBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBer), 0, new ModelResourceLocation("bandb_mod:blockSaplingBer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBlackCherry), 0, new ModelResourceLocation("bandb_mod:blockSaplingBlackCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBlackthorn), 0, new ModelResourceLocation("bandb_mod:blockSaplingBlackthorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBloodOrange), 0, new ModelResourceLocation("bandb_mod:blockSaplingBloodOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBrazilNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingBrazilNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBreadNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingBreadNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingBunyaNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingBunyaNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingButternut), 0, new ModelResourceLocation("bandb_mod:blockSaplingButternut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCacao), 0, new ModelResourceLocation("bandb_mod:blockSaplingCacao", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCashew), 0, new ModelResourceLocation("bandb_mod:blockSaplingCashew", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCherry), 0, new ModelResourceLocation("bandb_mod:blockSaplingCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingChestnut), 0, new ModelResourceLocation("bandb_mod:blockSaplingChestnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCinnamon), 0, new ModelResourceLocation("bandb_mod:blockSaplingCinnamon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingClementine), 0, new ModelResourceLocation("bandb_mod:blockSaplingClementine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingClove), 0, new ModelResourceLocation("bandb_mod:blockSaplingClove", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCoconut), 0, new ModelResourceLocation("bandb_mod:blockSaplingCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCurry), 0, new ModelResourceLocation("bandb_mod:blockSaplingCurry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingDamsonPlum), 0, new ModelResourceLocation("bandb_mod:blockSaplingDamsonPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingDate), 0, new ModelResourceLocation("bandb_mod:blockSaplingDate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingDragonfruit), 0, new ModelResourceLocation("bandb_mod:blockSaplingDragonfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingElderberry), 0, new ModelResourceLocation("bandb_mod:blockSaplingElderberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingFig), 0, new ModelResourceLocation("bandb_mod:blockSaplingFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingGingkoNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingGingkoNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingGrapefruitPink), 0, new ModelResourceLocation("bandb_mod:blockSaplingGrapefruitPink", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingGrapefruit), 0, new ModelResourceLocation("bandb_mod:blockSaplingGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingGuava), 0, new ModelResourceLocation("bandb_mod:blockSaplingGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingHuckleberries), 0, new ModelResourceLocation("bandb_mod:blockSaplingHuckleberries", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingJackFruit), 0, new ModelResourceLocation("bandb_mod:blockSaplingJackFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingJujube), 0, new ModelResourceLocation("bandb_mod:blockSaplingJujube", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingKiwi), 0, new ModelResourceLocation("bandb_mod:blockSaplingKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingKumquat), 0, new ModelResourceLocation("bandb_mod:blockSaplingKumquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLaurel), 0, new ModelResourceLocation("bandb_mod:blockSaplingLaurel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLemon), 0, new ModelResourceLocation("bandb_mod:blockSaplingLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLime), 0, new ModelResourceLocation("bandb_mod:blockSaplingLime", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLongan), 0, new ModelResourceLocation("bandb_mod:blockSaplingLongan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLoquat), 0, new ModelResourceLocation("bandb_mod:blockSaplingLoquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingLychee), 0, new ModelResourceLocation("bandb_mod:blockSaplingLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMacadamia), 0, new ModelResourceLocation("bandb_mod:blockSaplingMacadamia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMameySapote), 0, new ModelResourceLocation("bandb_mod:blockSaplingMameySapote", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMango), 0, new ModelResourceLocation("bandb_mod:blockSaplingMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMangosteen), 0, new ModelResourceLocation("bandb_mod:blockSaplingMangosteen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMirabelle), 0, new ModelResourceLocation("bandb_mod:blockSaplingMirabelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMorelloCherry), 0, new ModelResourceLocation("bandb_mod:blockSaplingMorelloCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingNectarine), 0, new ModelResourceLocation("bandb_mod:blockSaplingNectarine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingNuts), 0, new ModelResourceLocation("bandb_mod:blockSaplingNuts", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingOhiaAi), 0, new ModelResourceLocation("bandb_mod:blockSaplingOhiaAi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingOlive), 0, new ModelResourceLocation("bandb_mod:blockSaplingOlive", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingOrange), 0, new ModelResourceLocation("bandb_mod:blockSaplingOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingOsageOrange), 0, new ModelResourceLocation("bandb_mod:blockSaplingOsageOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPapaya), 0, new ModelResourceLocation("bandb_mod:blockSaplingPapaya", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingParadiseNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingParadiseNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPassionfruit), 0, new ModelResourceLocation("bandb_mod:blockSaplingPassionfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPeach), 0, new ModelResourceLocation("bandb_mod:blockSaplingPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPear), 0, new ModelResourceLocation("bandb_mod:blockSaplingPear", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPersimmon), 0, new ModelResourceLocation("bandb_mod:blockSaplingPersimmon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPineNut), 0, new ModelResourceLocation("bandb_mod:blockSaplingPineNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPistachio), 0, new ModelResourceLocation("bandb_mod:blockSaplingPistachio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPlum), 0, new ModelResourceLocation("bandb_mod:blockSaplingPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPomegranate), 0, new ModelResourceLocation("bandb_mod:blockSaplingPomegranate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPomelo), 0, new ModelResourceLocation("bandb_mod:blockSaplingPomelo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingQuince), 0, new ModelResourceLocation("bandb_mod:blockSaplingQuince", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingRedBanana), 0, new ModelResourceLocation("bandb_mod:blockSaplingRedBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCinchona), 0, new ModelResourceLocation("bandb_mod:blockSaplingCinchona", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingMaple), 0, new ModelResourceLocation("bandb_mod:blockSaplingMaple", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingNutmeg), 0, new ModelResourceLocation("bandb_mod:blockSaplingNutmeg", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingPlane), 0, new ModelResourceLocation("bandb_mod:blockSaplingPlane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingTonkaBean), 0, new ModelResourceLocation("bandb_mod:blockSaplingTonkaBean", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingSapodilla), 0, new ModelResourceLocation("bandb_mod:blockSaplingSapodilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingSatsuma), 0, new ModelResourceLocation("bandb_mod:blockSaplingSatsuma", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingSoursop), 0, new ModelResourceLocation("bandb_mod:blockSaplingSoursop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingStarAnise), 0, new ModelResourceLocation("bandb_mod:blockSaplingStarAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingTamarillo), 0, new ModelResourceLocation("bandb_mod:blockSaplingTamarillo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingTangerine), 0, new ModelResourceLocation("bandb_mod:blockSaplingTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingVanilla), 0, new ModelResourceLocation("bandb_mod:blockSaplingVanilla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingWalnut), 0, new ModelResourceLocation("bandb_mod:blockSaplingWalnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingWhitePeach), 0, new ModelResourceLocation("bandb_mod:blockSaplingWhitePeach", "inventory"));
		
			//apple
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleAntares), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleAntares", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleAriane), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleAriane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleBelchardChancelier), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleBelchardChancelier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleBelleDeBoskoop), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleBelleDeBoskoop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleBraeburn), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleBraeburn", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleElstar), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleElstar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleFuji), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleFuji", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleGala), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleGala", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleGolden), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleGolden", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleGrannySmith), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleGrannySmith", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleHoneycrunch), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleHoneycrunch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleJazz), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleJazz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleJonagoldJonagored), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleJonagoldJonagored", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleLesRouges), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleLesRouges", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingApplePinkLady), 0, new ModelResourceLocation("bandb_mod:blockSaplingApplePinkLady", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingApplePommeDuLimousin), 0, new ModelResourceLocation("bandb_mod:blockSaplingApplePommeDuLimousin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleReineDesReinettes), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleReineDesReinettes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleReinetteGriseDuCanada), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleReinetteGriseDuCanada", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingAppleTentation), 0, new ModelResourceLocation("bandb_mod:blockSaplingAppleTentation", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSaplingCrabapple), 0, new ModelResourceLocation("bandb_mod:blockSaplingCrabapple", "inventory"));


	}
		
   	/***
		public static void loaderBlock(){	    	
			
			blockAfricanLeaves = new BlockTreeLeaf("african",BandbItems.itemAfrican).setBlockTextureName(Bandb_mod.MODID + ":tree/african/blockAfricanLeaves").setBlockName("blockAfricanLeaves");
			GameRegistry.registerBlock(blockAfricanLeaves , "blockAfricanLeaves");
	    					
			blockAlmondLeaves = new BlockTreeLeaf("almond",BandbItems.itemAlmond).setBlockTextureName(Bandb_mod.MODID + ":tree/almond/blockAlmondLeaves").setBlockName("blockAlmondLeaves");
	    	GameRegistry.registerBlock(blockAlmondLeaves , "blockAlmondLeaves");
	    	
	    	blockAmlaLeaves = new BlockTreeLeaf("amia",BandbItems.itemAmla).setBlockTextureName(Bandb_mod.MODID + ":tree/amia/blockAmiaLeaves").setBlockName("blockAmlaLeaves");
			GameRegistry.registerBlock(blockAmlaLeaves , "blockAmlaLeaves");
			
			blockAniseLeaves = new BlockTreeLeaf("anise",BandbItems.itemAnise).setBlockTextureName(Bandb_mod.MODID + ":tree/anise/blockAniseLeaves").setBlockName("blockAniseLeaves"); 
			GameRegistry.registerBlock(blockAniseLeaves , "blockAniseLeaves");
	    	
	    	blockApricotLeaves = new BlockTreeLeaf("apricot",BandbItems.itemApricot).setBlockTextureName(Bandb_mod.MODID + ":tree/apricot/blockApricotLeaves").setBlockName("blockApricotLeaves"); 
	    	GameRegistry.registerBlock(blockApricotLeaves , "blockApricotLeaves");
	    	
	    	blockAvocadoLeaves = new BlockTreeLeaf("avocado",BandbItems.itemAvocado).setBlockTextureName(Bandb_mod.MODID + ":tree/avocado/blockAvocadoLeaves").setBlockName("blockAvocadoLeaves");
			GameRegistry.registerBlock(blockAvocadoLeaves , "blockAvocadoLeaves");
	    	
	    	blockBananaLeaves = new BlockTreeLeaf("banana",BandbItems.itemBanana).setBlockTextureName(Bandb_mod.MODID + ":tree/banana/blockBananaLeaves").setBlockName("blockBananaLeaves");
	    	GameRegistry.registerBlock(blockBananaLeaves , "blockBananaLeaves");

	    	blockBreadNutLeaves = new BlockTreeLeaf("breadnut",BandbItems.itemBreadNut).setBlockTextureName(Bandb_mod.MODID + ":tree/breadnut/blockBreadNutLeaves").setBlockName("blockBreadNutLeaves");
			GameRegistry.registerBlock(blockBreadNutLeaves , "blockBreadNutLeaves");
			
	    	blockCacaoLeaves = new BlockTreeLeaf("cacao",BandbItems.itemCacao).setBlockTextureName(Bandb_mod.MODID + ":tree/cacao/blockCacaoLeaves").setBlockName("blockCacaoLeaves");
			GameRegistry.registerBlock(blockCacaoLeaves , "blockCacaoLeaves");
	    	
			blockCashewLeaves = new BlockTreeLeaf("cashew",BandbItems.itemCashew).setBlockTextureName(Bandb_mod.MODID + ":tree/cashew/blockCashewLeaves").setBlockName("blockCashewLeaves");
			GameRegistry.registerBlock(blockCashewLeaves , "blockCashewLeaves");
	    	
	    	blockCherryLeaves = new BlockTreeLeaf("cherry",BandbItems.itemCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/cherry/blockCherryLeaves").setBlockName("blockCherryLeaves");
	    	GameRegistry.registerBlock(blockCherryLeaves , "blockCherryLeaves");
	    	
	    	blockChestnutLeaves = new BlockTreeLeaf("chestnut",BandbItems.itemChestnut).setBlockTextureName(Bandb_mod.MODID + ":tree/chestnut/blockChestnutLeaves").setBlockName("blockChestnutLeaves");
			GameRegistry.registerBlock(blockChestnutLeaves , "blockChestnutLeaves");
	   
	    	blockClementineLeaves = new BlockTreeLeaf("clementine",BandbItems.itemClementine).setBlockTextureName(Bandb_mod.MODID + ":tree/clementine/blockClementineLeaves").setBlockName("blockClementineLeaves");
	    	GameRegistry.registerBlock(blockClementineLeaves , "blockClementineLeaves");

	    	blockCoconutLeaves = new BlockTreeLeaf("coconut",BandbItems.itemCoconut).setBlockTextureName(Bandb_mod.MODID + ":tree/coconut/blockCoconutLeaves").setBlockName("blockCoconutLeaves"); 
			GameRegistry.registerBlock(blockCoconutLeaves , "blockCoconutLeaves");
	    	
	    	blockDateLeaves = new BlockTreeLeaf("date",BandbItems.itemDate).setBlockTextureName(Bandb_mod.MODID + ":tree/date/blockDateLeaves").setBlockName("blockDateLeaves");
	    	GameRegistry.registerBlock(blockDateLeaves , "blockDateLeaves");
	    			    	
			blockDragonfruitLeaves = new BlockTreeLeaf("dragonfruit",BandbItems.itemDragonfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/dragonfruit/blockDragonfruitLeaves").setBlockName("blockDragonfruitLeaves"); 
			GameRegistry.registerBlock(blockDragonfruitLeaves , "blockDragonfruitLeaves");
	    	
			blockFigLeaves = new BlockTreeLeaf("fig",BandbItems.itemFig).setBlockTextureName(Bandb_mod.MODID + ":tree/fig/blockFigLeaves").setBlockName("blockFigLeaves");
			GameRegistry.registerBlock(blockFigLeaves , "blockFigLeaves");
	    	
	    	blockGrapefruitLeaves = new BlockTreeLeaf("grapefruit",BandbItems.itemGrapefruit).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruit/blockGrapefruitLeaves").setBlockName("blockGrapefruitLeaves");
			GameRegistry.registerBlock(blockGrapefruitLeaves , "blockGrapefruitLeaves");
	    	
	    	blockGuavaLeaves = new BlockTreeLeaf("guava",BandbItems.itemGuava).setBlockTextureName(Bandb_mod.MODID + ":tree/guava/blockGuavaLeaves").setBlockName("blockGuavaLeaves");
	    	GameRegistry.registerBlock(blockGuavaLeaves , "blockGuavaLeaves");
	    	
	    	blockJujubeLeaves = new BlockTreeLeaf("jujube",BandbItems.itemJujube).setBlockTextureName(Bandb_mod.MODID + ":tree/jujube/blockJujubeLeaves").setBlockName("blockJujubeLeaves");
			GameRegistry.registerBlock(blockJujubeLeaves , "blockJujubeLeaves");
			
			blockKiwiLeaves = new BlockTreeLeaf("kiwi",BandbItems.itemKiwi).setBlockTextureName(Bandb_mod.MODID + ":tree/kiwi/blockKiwiLeaves").setBlockName("blockKiwiLeaves");
			GameRegistry.registerBlock(blockKiwiLeaves , "blockKiwiLeaves");
			
			blockKumquatLeaves = new BlockTreeLeaf("kumquat",BandbItems.itemKumquat).setBlockTextureName(Bandb_mod.MODID + ":tree/kumquat/blockKumquatLeaves").setBlockName("blockKumquatLeaves");
			GameRegistry.registerBlock(blockKumquatLeaves , "blockKumquatLeaves");
	    	
			blockLemonLeaves = new BlockTreeLeaf("lemon",BandbItems.itemLemon).setBlockTextureName(Bandb_mod.MODID + ":tree/lemon/blockLemonLeaves").setBlockName("blockLemonLeaves");
	    	GameRegistry.registerBlock(blockLemonLeaves , "blockLemonLeaves");
	    
			blockLimeLeaves = new BlockTreeLeaf("lime",BandbItems.itemLime).setBlockTextureName(Bandb_mod.MODID + ":tree/lime/blockLimeLeaves").setBlockName("blockLimeLeaves");
			GameRegistry.registerBlock(blockLimeLeaves , "blockLimeLeaves");
	    	
	    	blockLycheeLeaves = new BlockTreeLeaf("lychee",BandbItems.itemLychee).setBlockTextureName(Bandb_mod.MODID + ":tree/lychee/blockLycheeLeaves").setBlockName("blockLycheeLeaves"); 
			GameRegistry.registerBlock(blockLycheeLeaves , "blockLycheeLeaves");
	    	
	    	blockMangoLeaves = new BlockTreeLeaf("mango",BandbItems.itemMango).setBlockTextureName(Bandb_mod.MODID + ":tree/mango/blockMangoLeaves").setBlockName("blockMangoLeaves");
			GameRegistry.registerBlock(blockMangoLeaves , "blockMangoLeaves");
	    	
	    	blockMirabelleLeaves = new BlockTreeLeaf("mirabelle",BandbItems.itemMirabelle).setBlockTextureName(Bandb_mod.MODID + ":tree/mirabelle/blockMirabelleLeaves").setBlockName("blockMirabelleLeaves");
			GameRegistry.registerBlock(blockMirabelleLeaves , "blockMirabelleLeaves");
	    	
	    	blockNectarineLeaves = new BlockTreeLeaf("nectarine",BandbItems.itemNectarine).setBlockTextureName(Bandb_mod.MODID + ":tree/nectarine/blockNectarineLeaves").setBlockName("blockNectarineLeaves");
			GameRegistry.registerBlock(blockNectarineLeaves , "blockNectarineLeaves");
		
			blockNutsLeaves = new BlockTreeLeaf("nuts",BandbItems.itemNuts).setBlockTextureName(Bandb_mod.MODID + ":tree/nuts/blockNutsLeaves").setBlockName("blockNutsLeaves"); 
			GameRegistry.registerBlock(blockNutsLeaves , "blockNutsLeaves");
	    	
	    	blockOliveLeaves = new BlockTreeLeaf("olive",BandbItems.itemOlive).setBlockTextureName(Bandb_mod.MODID + ":tree/olive/blockOliveLeaves").setBlockName("blockOliveLeaves");
			GameRegistry.registerBlock(blockOliveLeaves , "blockOliveLeaves");
	    	
	    	blockOrangeLeaves = new BlockTreeLeaf("orange",BandbItems.itemOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/orange/blockOrangeLeaves").setBlockName("blockOrangeLeaves");
			GameRegistry.registerBlock(blockOrangeLeaves , "blockOrangeLeaves");

	    	blockPapayaLeaves = new BlockTreeLeaf("papaya",BandbItems.itemPapaya).setBlockTextureName(Bandb_mod.MODID + ":tree/papaya/blockPapayaLeaves").setBlockName("blockPapayaLeaves"); 
			GameRegistry.registerBlock(blockPapayaLeaves , "blockPapayaLeaves");
	    	
	    	blockPassionfruitLeaves = new BlockTreeLeaf("passionfruit",BandbItems.itemPassionfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/passionfruit/blockPassionfruitLeaves").setBlockName("blockPassionfruitLeaves");
			GameRegistry.registerBlock(blockPassionfruitLeaves , "blockPassionfruitLeaves");
	    	
	    	blockPeachLeaves = new BlockTreeLeaf("peach",BandbItems.itemPeach).setBlockTextureName(Bandb_mod.MODID + ":tree/peach/blockPeachLeaves").setBlockName("blockPeachLeaves");
			GameRegistry.registerBlock(blockPeachLeaves , "blockPeachLeaves");
	    	
	    	blockPearLeaves = new BlockTreeLeaf("pear",BandbItems.itemPear).setBlockTextureName(Bandb_mod.MODID + ":tree/pear/blockPearLeaves").setBlockName("blockPearLeaves");
			GameRegistry.registerBlock(blockPearLeaves , "blockPearLeaves");
	    	
	    	blockPersimmonLeaves = new BlockTreeLeaf("persimmon",BandbItems.itemPersimmon).setBlockTextureName(Bandb_mod.MODID + ":tree/persimmon/blockPersimmonLeaves").setBlockName("blockPersimmonLeaves");
			GameRegistry.registerBlock(blockPersimmonLeaves , "blockPersimmonLeaves");
			
			blockPistachioLeaves = new BlockTreeLeaf("pistachio",BandbItems.itemPistachio).setBlockTextureName(Bandb_mod.MODID + ":tree/pistachio/blockPistachioLeaves").setBlockName("blockPistachioLeaves");
			GameRegistry.registerBlock(blockPistachioLeaves , "blockPistachioLeaves");
			
			blockPlumLeaves = new BlockTreeLeaf("plum",BandbItems.itemPlum).setBlockTextureName(Bandb_mod.MODID + ":tree/plum/blockPlumLeaves").setBlockName("blockPlumLeaves");
	    	GameRegistry.registerBlock(blockPlumLeaves , "blockPlumLeaves");
	    	
	    	blockPomegranateLeaves = new BlockTreeLeaf("pomegranate",BandbItems.itemPomegranate).setBlockTextureName(Bandb_mod.MODID + ":tree/pomegranate/blockPomegranateLeaves").setBlockName("blockPomegranateLeaves");
			GameRegistry.registerBlock(blockPomegranateLeaves , "blockPomegranateLeaves");
	    	
	    	blockQuinceLeaves = new BlockTreeLeaf("quince",BandbItems.itemQuince).setBlockTextureName(Bandb_mod.MODID + ":tree/quince/blockQuinceLeaves").setBlockName("blockQuinceLeaves");
			GameRegistry.registerBlock(blockQuinceLeaves , "blockQuinceLeaves");
			
	    	blockStarAniseLeaves = new BlockTreeLeaf("staranise",BandbItems.itemStarAnise).setBlockTextureName(Bandb_mod.MODID + ":tree/anisestar/blockStarAniseLeaves").setBlockName("blockStarAniseLeaves");
			GameRegistry.registerBlock(blockStarAniseLeaves , "blockStarAniseLeaves");
	    	
			blockTangerineLeaves = new BlockTreeLeaf("tangerine",BandbItems.itemTangerine).setBlockTextureName(Bandb_mod.MODID + ":tree/tangerine/blockTangerineLeaves").setBlockName("blockTangerineLeaves");
			GameRegistry.registerBlock(blockTangerineLeaves , "blockTangerineLeaves");
	    	
	    	blockVanillaLeaves = new BlockTreeLeaf("vanilla",BandbItems.itemVanilla).setBlockTextureName(Bandb_mod.MODID + ":tree/vanilla/blockVanillaLeaves").setBlockName("blockVanillaLeaves");
			GameRegistry.registerBlock(blockVanillaLeaves , "blockVanillaLeaves");
			
			blockWalnutLeaves = new BlockTreeLeaf("walnut",BandbItems.itemWalnut).setBlockTextureName(Bandb_mod.MODID + ":tree/walnut/blockWalnutLeaves").setBlockName("blockWalnutLeaves");
			GameRegistry.registerBlock(blockWalnutLeaves , "blockWalnutLeaves");
			
			blockAllspiceLeaves = new BlockTreeLeaf("allspice",BandbItems.itemAllspice).setBlockTextureName(Bandb_mod.MODID + ":tree/allspice/blockAllspiceLeaves").setBlockName("blockAllspiceLeaves");
			GameRegistry.registerBlock(blockAllspiceLeaves , "blockAllspiceLeaves");
			
			blockBaelLeaves = new BlockTreeLeaf("bael",BandbItems.itemBael).setBlockTextureName(Bandb_mod.MODID + ":tree/bael/blockBaelLeaves").setBlockName("blockBaelLeaves");
			GameRegistry.registerBlock(blockBaelLeaves , "blockBaelLeaves");
			
			blockPlantainLeaves = new BlockTreeLeaf("bananaplantain",BandbItems.itemBananaPlantain).setBlockTextureName(Bandb_mod.MODID + ":tree/bananaplantain/blockPlantainLeaves").setBlockName("blockPlantainLeaves");
			GameRegistry.registerBlock(blockPlantainLeaves , "blockPlantainLeaves");
			
			blockBlackCherryLeaves = new BlockTreeLeaf("blackcherry",BandbItems.itemBlackCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/blackcherry/blockBlackCherryLeaves").setBlockName("blockBlackCherryLeaves");
			GameRegistry.registerBlock(blockBlackCherryLeaves , "blockBlackCherryLeaves");
			
			blockBlackthornLeaves = new BlockTreeLeaf("blackthorn",BandbItems.itemBlackthorn).setBlockTextureName(Bandb_mod.MODID + ":tree/blackthorn/blockBlackthornLeaves").setBlockName("blockBlackthornLeaves");
			GameRegistry.registerBlock(blockBlackthornLeaves , "blockBlackthornLeaves");
			
			blockBrazilNutLeaves = new BlockTreeLeaf("brazilnut",BandbItems.itemBrazilNut).setBlockTextureName(Bandb_mod.MODID + ":tree/brazilnut/blockBrazilNutLeaves").setBlockName("blockBrazilNutLeaves");
			GameRegistry.registerBlock(blockBrazilNutLeaves , "blockBrazilNutLeaves");
			
			blockButternutLeaves = new BlockTreeLeaf("butternut",BandbItems.itemButternut).setBlockTextureName(Bandb_mod.MODID + ":tree/butternut/blockButternutLeaves").setBlockName("blockButternutLeaves");
			GameRegistry.registerBlock(blockButternutLeaves , "blockButternutLeaves");
			
			blockCinnamonLeaves = new BlockTreeLeaf("cinnamon",BandbItems.itemCinnamon).setBlockTextureName(Bandb_mod.MODID + ":tree/cinnamon/blockCinnamonLeaves").setBlockName("blockCinnamonLeaves");
			GameRegistry.registerBlock(blockCinnamonLeaves , "blockCinnamonLeaves");
			
			blockCloveLeaves = new BlockTreeLeaf("clove",BandbItems.itemClove).setBlockTextureName(Bandb_mod.MODID + ":tree/clove/blockCloveLeaves").setBlockName("blockCloveLeaves");
			GameRegistry.registerBlock(blockCloveLeaves , "blockCloveLeaves");
			
			blockDamsonPlumLeaves = new BlockTreeLeaf("damsonplum",BandbItems.itemDamsonPlum).setBlockTextureName(Bandb_mod.MODID + ":tree/damsonplum/blockDamsonPlumLeaves").setBlockName("blockDamsonPlumLeaves");
			GameRegistry.registerBlock(blockDamsonPlumLeaves , "blockDamsonPlumLeaves");
			
			blockElderberryLeaves = new BlockTreeLeaf("elderberry",BandbItems.itemElderberry).setBlockTextureName(Bandb_mod.MODID + ":tree/elderberry/blockElderberryLeaves").setBlockName("blockElderberryLeaves");
			GameRegistry.registerBlock(blockElderberryLeaves , "blockElderberryLeaves");
			
			blockLaurelLeaves = new BlockTreeLeaf("laurel",BandbItems.itemBayLaurel).setBlockTextureName(Bandb_mod.MODID + ":tree/laurel/blockLaurelLeaves").setBlockName("blockLaurelLeaves");
			GameRegistry.registerBlock(blockLaurelLeaves , "blockLaurelLeaves");
			
			blockMacadamiaLeaves = new BlockTreeLeaf("macadamia",BandbItems.itemMacadamia).setBlockTextureName(Bandb_mod.MODID + ":tree/macadamia/blockMacadamiaLeaves").setBlockName("blockMacadamiaLeaves");
			GameRegistry.registerBlock(blockMacadamiaLeaves , "blockMacadamiaLeaves");
			
			blockPomeloLeaves = new BlockTreeLeaf("pomelo",BandbItems.itemPomelo).setBlockTextureName(Bandb_mod.MODID + ":tree/pomelo/blockPomeloLeaves").setBlockName("blockPomeloLeaves");
			GameRegistry.registerBlock(blockPomeloLeaves , "blockPomeloLeaves");
			
			blockSatsumaLeaves = new BlockTreeLeaf("satsuma",BandbItems.itemSatsuma).setBlockTextureName(Bandb_mod.MODID + ":tree/satsuma/blockSatsumaLeaves").setBlockName("blockSatsumaLeaves");
			GameRegistry.registerBlock(blockSatsumaLeaves , "blockSatsumaLeaves");
			
			blockBloodOrangeLeaves = new BlockTreeLeaf("bloodorange",BandbItems.itemBloodOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/bloodorange/blockBloodOrangeLeaves").setBlockName("blockBloodOrangeLeaves");
			GameRegistry.registerBlock(blockBloodOrangeLeaves , "blockBloodOrangeLeaves");
			
			blockMorelloCherryLeaves = new BlockTreeLeaf("morellocherry",BandbItems.itemMorelloCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/morellocherry/blockMorelloCherryLeaves").setBlockName("blockMorelloCherryLeaves");
			GameRegistry.registerBlock(blockMorelloCherryLeaves , "blockMorelloCherryLeaves");
			
			blockWhitePeachLeaves = new BlockTreeLeaf("whitepeach",BandbItems.itemWhitePeach).setBlockTextureName(Bandb_mod.MODID + ":tree/whitepeach/blockWhitePeachLeaves").setBlockName("blockWhitePeachLeaves");
			GameRegistry.registerBlock(blockWhitePeachLeaves , "blockWhitePeachLeaves");
			
			
			blockLeavesAbiu = new BlockTreeLeaf("abiu",BandbItems.itemAbiu).setBlockTextureName(Bandb_mod.MODID + ":tree/abiu/blockLeavesAbiu").setBlockName("blockLeavesAbiu");
			GameRegistry.registerBlock(blockLeavesAbiu , "blockLeavesAbiu");
		
			blockLonganLeaves = new BlockTreeLeaf("longan",BandbItems.itemLongan).setBlockTextureName(Bandb_mod.MODID + ":tree/longan/blockLonganLeaves").setBlockName("blockLonganLeaves");
			GameRegistry.registerBlock(blockLonganLeaves , "blockLonganLeaves");
		
			blockLoquatLeaves = new BlockTreeLeaf("loquat",BandbItems.itemLoquat).setBlockTextureName(Bandb_mod.MODID + ":tree/loquat/blockLoquatLeaves").setBlockName("blockLoquatLeaves");
			GameRegistry.registerBlock(blockLoquatLeaves , "blockLoquatLeaves");
			
			blockNutmegLeaves = new BlockTreeLeaf("nutmeg",BandbItems.itemNutmeg).setBlockTextureName(Bandb_mod.MODID + ":tree/nutmeg/blockNutmegLeaves").setBlockName("blockNutmegLeaves");
			GameRegistry.registerBlock(blockNutmegLeaves , "blockNutmegLeaves");
			
			blockPlaneLeaves = new BlockTreeLeaf("plane",null).setBlockTextureName(Bandb_mod.MODID + ":tree/plane/blockPlaneLeaves").setBlockName("blockPlaneLeaves");
			GameRegistry.registerBlock(blockPlaneLeaves , "blockPlaneLeaves");
		
			blockTonkaBeanLeaves = new BlockTreeLeaf("tonkabean",BandbItems.itemTonkaBean).setBlockTextureName(Bandb_mod.MODID + ":tree/tonkabean/blockTonkaBeanLeaves").setBlockName("blockTonkaBeanLeaves");
			GameRegistry.registerBlock(blockTonkaBeanLeaves , "blockTonkaBeanLeaves");
			
			blockGrapefruitPinkLeaves = new BlockTreeLeaf("grapefruitpink",BandbItems.itemGrapefruitPink).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruitpink/blockGrapefruitPinkLeaves").setBlockName("blockGrapefruitPinkLeaves");
			GameRegistry.registerBlock(blockGrapefruitPinkLeaves , "blockGrapefruitPinkLeaves");
			
			blockMapleLeaves = new BlockTreeLeaf("maple",null).setBlockTextureName(Bandb_mod.MODID + ":tree/maple/blockMapleLeaves").setBlockName("blockMapleLeaves");
			GameRegistry.registerBlock(blockMapleLeaves , "blockMapleLeaves");
			
			blockBerLeaves = new BlockTreeLeaf("ber",BandbItems.itemBer).setBlockTextureName(Bandb_mod.MODID + ":tree/ber/blockBerLeaves").setBlockName("blockBerLeaves");
			GameRegistry.registerBlock(blockBerLeaves , "blockBerLeaves");
			
			blockCurryLeaves = new BlockTreeLeaf("curry",BandbItems.itemCurryLeaf).setBlockTextureName(Bandb_mod.MODID + ":tree/curry/blockCurryLeaves").setBlockName("blockCurryLeaves");
			GameRegistry.registerBlock(blockCurryLeaves , "blockCurryLeaves");
			
			blockRedBananaLeaves = new BlockTreeLeaf("redbanana",BandbItems.itemRedBanana).setBlockTextureName(Bandb_mod.MODID + ":tree/redbanana/blockRedBananaLeaves").setBlockName("blockRedBananaLeaves");
			GameRegistry.registerBlock(blockRedBananaLeaves , "blockRedBananaLeaves");

			blockBunyaNutLeaves = new BlockTreeLeaf("bunyanut",BandbItems.itemBunyaNut).setBlockTextureName(Bandb_mod.MODID + ":tree/bunyanut/blockBunyaNutLeaves").setBlockName("blockBunyaNutLeaves");
			GameRegistry.registerBlock(blockBunyaNutLeaves , "blockBunyaNutLeaves");
			
			blockGingkoNutLeaves = new BlockTreeLeaf("gingkonut",BandbItems.itemGingkoNut).setBlockTextureName(Bandb_mod.MODID + ":tree/gingkonut/blockGingkoNutLeaves").setBlockName("blockGingkoNutLeaves");
			GameRegistry.registerBlock(blockGingkoNutLeaves , "blockGingkoNutLeaves");
			
			blockHuckleberriesLeaves = new BlockTreeLeaf("huckleberries",BandbItems.itemHuckleberries).setBlockTextureName(Bandb_mod.MODID + ":tree/huckleberries/blockHuckleberriesLeaves").setBlockName("blockHuckleberriesLeaves");
			GameRegistry.registerBlock(blockHuckleberriesLeaves , "blockHuckleberriesLeaves");
			
			blockJackFruitLeaves = new BlockTreeLeaf("jackfruit",BandbItems.itemJackfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/jackfruit/blockJackFruitLeaves").setBlockName("blockJackFruitLeaves");
			GameRegistry.registerBlock(blockJackFruitLeaves , "blockJackFruitLeaves");
			
			blockMameySapoteLeaves = new BlockTreeLeaf("mameysapote",BandbItems.itemMameySapote).setBlockTextureName(Bandb_mod.MODID + ":tree/mameysapote/blockMameySapoteLeaves").setBlockName("blockMameySapoteLeaves");
			GameRegistry.registerBlock(blockMameySapoteLeaves , "blockMameySapoteLeaves");

			blockMangosteenLeaves = new BlockTreeLeaf("mangosteen",BandbItems.itemMangosteen).setBlockTextureName(Bandb_mod.MODID + ":tree/mangosteen/blockMangosteenLeaves").setBlockName("blockMangosteenLeaves");
			GameRegistry.registerBlock(blockMangosteenLeaves , "blockMangosteenLeaves");
			
			blockOhiaAiLeaves = new BlockTreeLeaf("ohiaai",BandbItems.itemOhiaAi).setBlockTextureName(Bandb_mod.MODID + ":tree/ohiaai/blockOhiaAiLeaves").setBlockName("blockOhiaAiLeaves");
			GameRegistry.registerBlock(blockOhiaAiLeaves , "blockOhiaAiLeaves");
			
			blockOsageOrangeLeaves = new BlockTreeLeaf("osageorange",BandbItems.itemOsageOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/osageorange/blockOsageOrangeLeaves").setBlockName("blockOsageOrangeLeaves");
			GameRegistry.registerBlock(blockOsageOrangeLeaves , "blockOsageOrangeLeaves");
			
			
			
			
			blockParadiseNutLeaves = new BlockTreeLeaf("paradisenut",BandbItems.itemParadiseNut).setBlockTextureName(Bandb_mod.MODID + ":tree/paradisenut/blockParadiseNutLeaves").setBlockName("blockParadiseNutLeaves");
			GameRegistry.registerBlock(blockParadiseNutLeaves , "blockParadiseNutLeaves");
			
			blockPineNutLeaves = new BlockTreeLeaf("pinenut",BandbItems.itemPineNut).setBlockTextureName(Bandb_mod.MODID + ":tree/pinenut/blockPineNutLeaves").setBlockName("blockPineNutLeaves");
			GameRegistry.registerBlock(blockPineNutLeaves , "blockPineNutLeaves");
			
			blockSapodillaLeaves = new BlockTreeLeaf("sapodilla",BandbItems.itemSapodilla).setBlockTextureName(Bandb_mod.MODID + ":tree/sapodilla/blockSapodillaLeaves").setBlockName("blockSapodillaLeaves");
			GameRegistry.registerBlock(blockSapodillaLeaves , "blockSapodillaLeaves");
			
			blockSoursopLeaves = new BlockTreeLeaf("soursop",BandbItems.itemSoursop).setBlockTextureName(Bandb_mod.MODID + ":tree/soursop/blockSoursopLeaves").setBlockName("blockSoursopLeaves");
			GameRegistry.registerBlock(blockSoursopLeaves , "blockSoursopLeaves");
			
			blockTamarilloLeaves = new BlockTreeLeaf("tamarillo",BandbItems.itemTamarillo).setBlockTextureName(Bandb_mod.MODID + ":tree/tamarillo/blockTamarilloLeaves").setBlockName("blockTamarilloLeaves");
			GameRegistry.registerBlock(blockTamarilloLeaves , "blockTamarilloLeaves");
			
			blockLeavesCinchona = new BlockTreeLeaf("cinchona",BandbItems.itemCinchona).setBlockTextureName(Bandb_mod.MODID + ":tree/cinchona/blockLeavesCinchona").setBlockName("blockLeavesCinchona");
			GameRegistry.registerBlock(blockLeavesCinchona , "blockLeavesCinchona");
			
			
			//apple
	    	blockCrabappleLeaves = new BlockTreeLeaf("crabapple",BandbItems.itemCrabapple).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/crabapple/blockCrabappleLeaves").setBlockName("blockCrabappleLeaves");
	    	blockAppleAntaresLeaves = new BlockTreeLeaf("antares",BandbItems.itemAppleAntares).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/antares/blockAppleAntaresLeaves").setBlockName("blockAppleAntaresLeaves");
	    	blockAppleArianeLeaves = new BlockTreeLeaf("ariane",BandbItems.itemAppleAriane).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/ariane/blockAppleArianeLeaves").setBlockName("blockAppleArianeLeaves");
	    	blockAppleBelchardChantecierLeaves = new BlockTreeLeaf("belchardchantecier",BandbItems.itemAppleBelchardChancelier).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belchardchantecier/blockAppleBelchardChantecierLeaves").setBlockName("blockAppleBelchardChantecierLeaves");
	    	blockAppleBelleDeBoskoopLeaves = new BlockTreeLeaf("belledeboskoop",BandbItems.itemAppleBelleDeBoskoop).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belledeboskoop/blockAppleBelleDeBoskoopLeaves").setBlockName("blockAppleBelleDeBoskoopLeaves");
		
	    	blockAppleBraeburnLeaves = new BlockTreeLeaf("braeburn",BandbItems.itemAppleBraeburn).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/braeburn/blockAppleBraeburnLeaves").setBlockName("blockAppleBraeburnLeaves");
	    	blockAppleElstarLeaves = new BlockTreeLeaf("elstar",BandbItems.itemAppleElstar).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/elstar/blockAppleElstarLeaves").setBlockName("blockAppleElstarLeaves");
	    	blockAppleFujiLeaves = new BlockTreeLeaf("fuji",BandbItems.itemAppleFuji).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/fuji/blockAppleFujiLeaves").setBlockName("blockAppleFujiLeaves");
	    	blockAppleGalaLeaves = new BlockTreeLeaf("gala",BandbItems.itemAppleGala).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/gala/blockAppleGalaLeaves").setBlockName("blockAppleGalaLeaves");
	    	blockAppleGoldenLeaves = new BlockTreeLeaf("golden",BandbItems.itemAppleGolden).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/golden/blockAppleGoldenLeaves").setBlockName("blockAppleGoldenLeaves");
		
			GameRegistry.registerBlock(blockCrabappleLeaves , "blockCrabappleLeaves");
	    	GameRegistry.registerBlock(blockAppleAntaresLeaves , "blockAppleAntaresLeaves");
	    	GameRegistry.registerBlock(blockAppleArianeLeaves , "blockAppleArianeLeaves");
	    	GameRegistry.registerBlock(blockAppleBelchardChantecierLeaves , "blockAppleBelchardChantecierLeaves");
	    	GameRegistry.registerBlock(blockAppleBelleDeBoskoopLeaves , "blockAppleBelleDeBoskoopLeaves");
	    
	    	GameRegistry.registerBlock(blockAppleBraeburnLeaves , "blockAppleBraeburnLeaves");
	    	GameRegistry.registerBlock(blockAppleElstarLeaves , "blockAppleElstarLeaves");
	    	GameRegistry.registerBlock(blockAppleFujiLeaves , "blockAppleFujiLeaves");
	    	GameRegistry.registerBlock(blockAppleGalaLeaves , "blockAppleGalaLeaves");
	    	GameRegistry.registerBlock(blockAppleGoldenLeaves , "blockAppleGoldenLeaves");
	    	
			blockAppleGrannySmithLeaves = new BlockTreeLeaf("grannysmith",BandbItems.itemAppleGrannySmith).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/grannysmith/blockAppleGrannySmithLeaves").setBlockName("blockAppleGrannySmithLeaves");
			blockAppleHoneycrunchLeaves = new BlockTreeLeaf("honeycrunch",BandbItems.itemAppleHoneycrunch).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/honeycrunch/blockAppleHoneycrunchLeaves").setBlockName("blockAppleHoneycrunchLeaves");
			blockAppleJazzLeaves = new BlockTreeLeaf("jazz",BandbItems.itemAppleJazz).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jazz/blockAppleJazzLeaves").setBlockName("blockAppleJazzLeaves");
			blockAppleJonagoldJonagoredLeaves = new BlockTreeLeaf("jonagoldjonagored",BandbItems.itemAppleJonagoldJonagored).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jonagoldjonagored/blockAppleJonagoldJonagoredLeaves").setBlockName("blockAppleJonagoldJonagoredLeaves");
			blockAppleLesRougesLeaves = new BlockTreeLeaf("lesrouges",BandbItems.itemAppleLesRouges).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/lesrouges/blockAppleLesRougesLeaves").setBlockName("blockAppleLesRougesLeaves");
		
			blockApplePinkLadyLeaves = new BlockTreeLeaf("pinklady",BandbItems.itemApplePinkLady).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pinklady/blockApplePinkLadyLeaves").setBlockName("blockApplePinkLadyLeaves");
			blockApplePommeLimousinLeaves = new BlockTreeLeaf("pommedulimousin",BandbItems.itemApplePommeDuLimousin).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pommedulimousin/blockApplePommeLimousinLeaves").setBlockName("blockApplePommeLimousinLeaves");
			blockAppleReineDesReinettesLeaves = new BlockTreeLeaf("reinedesreinettes",BandbItems.itemAppleReineDesReinettes).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinedesreinettes/blockAppleReineDesReinettesLeaves").setBlockName("blockAppleReineDesReinettesLeaves");
			blockAppleReinetteGriseDuCanadaLeaves = new BlockTreeLeaf("reinettegriseducanada",BandbItems.itemAppleReinetteGriseDuCanada).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinettegriseducanada/blockAppleReinetteGriseDuCanadaLeaves").setBlockName("blockAppleReinetteGriseDuCanadaLeaves");
			blockAppleTentationLeaves = new BlockTreeLeaf("tentation",BandbItems.itemAppleTentation).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/tentation/blockAppleTentationLeaves").setBlockName("blockAppleTentationLeaves");
		
			GameRegistry.registerBlock(blockAppleGrannySmithLeaves , "blockAppleGrannySmithLeaves");
	    	GameRegistry.registerBlock(blockAppleHoneycrunchLeaves , "blockAppleHoneycrunchLeaves");
	    	GameRegistry.registerBlock(blockAppleJazzLeaves , "blockAppleJazzLeaves");
	    	GameRegistry.registerBlock(blockAppleJonagoldJonagoredLeaves , "blockAppleJonagoldJonagoredLeaves");
	    	GameRegistry.registerBlock(blockAppleLesRougesLeaves , "blockAppleLesRougesLeaves");
	    
	    	GameRegistry.registerBlock(blockApplePinkLadyLeaves , "blockApplePinkLadyLeaves");
	    	GameRegistry.registerBlock(blockApplePommeLimousinLeaves , "blockApplePommeLimousinLeaves");
	    	GameRegistry.registerBlock(blockAppleReineDesReinettesLeaves , "blockAppleReineDesReinettesLeaves");
	    	GameRegistry.registerBlock(blockAppleReinetteGriseDuCanadaLeaves , "blockAppleReinetteGriseDuCanadaLeaves");
	    	GameRegistry.registerBlock(blockAppleTentationLeaves , "blockAppleTentationLeaves");
		
	    	
	    	
	    	
	    	
	    	
	    	// Apple
	    	blockCrabappleSapling = new BlockTreeSaplingApple(BandbBlocks.blockCrabappleLeaves,BandbBlocks.blockCrabappleWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCrabappleSapling").setBlockName("blockCrabappleSapling");
	    	blockAppleAntaresSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleAntaresLeaves,  BandbBlocks.blockAppleAntaresWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleAntaresSapling").setBlockName("blockAppleAntaresSapling");
	    	blockAppleArianeSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleArianeLeaves,  BandbBlocks.blockAppleArianeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleArianeSapling").setBlockName("blockAppleArianeSapling");
	    	blockAppleBelchardChancelierSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBelchardChantecierLeaves,   BandbBlocks.blockAppleBelchardChantecierWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBelchardChancelierSapling").setBlockName("blockAppleBelchardChancelierSapling");
	    	blockAppleBelleDeBoskoopSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBelleDeBoskoopLeaves,   BandbBlocks.blockAppleBelleDeBoskoopWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBelleDeBoskoopSapling").setBlockName("blockAppleBelleDeBoskoopSapling");

	    	blockAppleBraeburnSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBraeburnLeaves,   BandbBlocks.blockAppleBraeburnWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBraeburnSapling").setBlockName("blockAppleBraeburnSapling");
	    	blockAppleElstarSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleElstarLeaves,  BandbBlocks.blockAppleElstarWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleElstarSapling").setBlockName("blockAppleElstarSapling");
	    	blockAppleFujiSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleFujiLeaves,   BandbBlocks.blockAppleFujiWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleFujiSapling").setBlockName("blockAppleFujiSapling");
	    	blockAppleGalaSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGalaLeaves,   BandbBlocks.blockAppleGalaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGalaSapling").setBlockName("blockAppleGalaSapling");
	    	blockAppleGoldenSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGoldenLeaves,   BandbBlocks.blockAppleGoldenWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGoldenSapling").setBlockName("blockAppleGoldenSapling");

	    	GameRegistry.registerBlock(blockCrabappleSapling , "blockCrabappleSapling");
	    	GameRegistry.registerBlock(blockAppleAntaresSapling , "blockAppleAntaresSapling");
	    	GameRegistry.registerBlock(blockAppleArianeSapling , "blockAppleArianeSapling");
	    	GameRegistry.registerBlock(blockAppleBelchardChancelierSapling , "blockAppleBelchardChancelierSapling");
	    	GameRegistry.registerBlock(blockAppleBelleDeBoskoopSapling , "blockAppleBelleDeBoskoopSapling");

	    	GameRegistry.registerBlock(blockAppleBraeburnSapling , "blockAppleBraeburnSapling");
	    	GameRegistry.registerBlock(blockAppleElstarSapling , "blockAppleElstarSapling");
	    	GameRegistry.registerBlock(blockAppleFujiSapling , "blockAppleFujiSapling");
	    	GameRegistry.registerBlock(blockAppleGalaSapling , "blockAppleGalaSapling");
	    	GameRegistry.registerBlock(blockAppleGoldenSapling , "blockAppleGoldenSapling");
	    	
	    	blockAppleGrannySmithSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGrannySmithLeaves,   BandbBlocks.blockAppleGrannySmithWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGrannySmithSapling").setBlockName("blockAppleGrannySmithSapling");
	    	blockAppleHoneycrunchSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleHoneycrunchLeaves,   BandbBlocks.blockAppleHoneycrunchWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleHoneycrunchSapling").setBlockName("blockAppleHoneycrunchSapling");
	    	blockAppleJazzSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleJazzLeaves,   BandbBlocks.blockAppleJazzWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleJazzSapling").setBlockName("blockAppleJazzSapling");
	    	blockAppleJonagoldJonagoredSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleJonagoldJonagoredLeaves,   BandbBlocks.blockAppleJonagoldJonagoredWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleJonagoldJonagoredSapling").setBlockName("blockAppleJonagoldJonagoredSapling");
	    	blockAppleLesRougesSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleLesRougesLeaves,   BandbBlocks.blockAppleLesRougesWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleLesRougesSapling").setBlockName("blockAppleLesRougesSapling");

	    	blockApplePinkLadySapling = new BlockTreeSaplingApple(BandbBlocks.blockApplePinkLadyLeaves,   BandbBlocks.blockApplePinkLadyWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockApplePinkLadySapling").setBlockName("blockApplePinkLadySapling");
	    	blockApplePommeDuLimousinSapling = new BlockTreeSaplingApple(BandbBlocks.blockApplePommeLimousinLeaves,  BandbBlocks.blockApplePommeLimousinWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockApplePommeDuLimousinSapling").setBlockName("blockApplePommeDuLimousinSapling");
	    	blockAppleReineDesReinettesSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleReineDesReinettesLeaves,   BandbBlocks.blockAppleReineDesReinettesWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleReineDesReinettesSapling").setBlockName("blockAppleReineDesReinettesSapling");
	    	blockAppleReinetteGriseDuCanadaSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleReinetteGriseDuCanadaLeaves,  BandbBlocks.blockAppleReinetteGriseDuCanadaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleReinetteGriseDuCanadaSapling").setBlockName("blockAppleReinetteGriseDuCanadaSapling");
	    	blockAppleTentationSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleTentationLeaves,   BandbBlocks.blockAppleTentationWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleTentationSapling").setBlockName("blockAppleTentationSapling");

	    	GameRegistry.registerBlock(blockAppleGrannySmithSapling , "blockAppleGrannySmithSapling");
	    	GameRegistry.registerBlock(blockAppleHoneycrunchSapling , "blockAppleHoneycrunchSapling");
	    	GameRegistry.registerBlock(blockAppleJazzSapling , "blockAppleJazzSapling");
	    	GameRegistry.registerBlock(blockAppleJonagoldJonagoredSapling , "blockAppleJonagoldJonagoredSapling");
	    	GameRegistry.registerBlock(blockAppleLesRougesSapling , "blockAppleLesRougesSapling");

	    	GameRegistry.registerBlock(blockApplePinkLadySapling , "blockApplePinkLadySapling");
	    	GameRegistry.registerBlock(blockApplePommeDuLimousinSapling , "blockApplePommeDuLimousinSapling");
	    	GameRegistry.registerBlock(blockAppleReineDesReinettesSapling , "blockAppleReineDesReinettesSapling");
	    	GameRegistry.registerBlock(blockAppleReinetteGriseDuCanadaSapling , "blockAppleReinetteGriseDuCanadaSapling");
	    	GameRegistry.registerBlock(blockAppleTentationSapling , "blockAppleTentationSapling");		    			   

			
	    	blockPlankAfrican = new BlockTreePlank().setBlockName("blockPlankAfrican");
	    	blockPlankAlmond = new BlockTreePlank().setBlockName("blockPlankAlmond");
			blockPlankAmla = new BlockTreePlank().setBlockName("blockPlankAmla");
			blockPlankAnise = new BlockTreePlank().setBlockName("blockPlankAnise");
			blockPlankApricot = new BlockTreePlank().setBlockName("blockPlankApricot");

			GameRegistry.registerBlock(blockPlankAfrican,"block_Plank_African");
	    	GameRegistry.registerBlock(blockPlankAlmond,"block_Plank_Almond");
			GameRegistry.registerBlock(blockPlankAmla,"block_Plank_Amla");
			GameRegistry.registerBlock(blockPlankAnise,"block_Plank_Anise");
			GameRegistry.registerBlock(blockPlankApricot,"block_Plank_Apricot");

	    	blockPlankAvocado = new BlockTreePlank().setBlockName("blockPlankAvocado");
	    	blockPlankBanana = new BlockTreePlank().setBlockName("blockPlankBanana");
	    	blockPlankBreadnut = new BlockTreePlank().setBlockName("blockPlankBreadnut");
	    	blockPlankCacao = new BlockTreePlank().setBlockName("blockPlankCacao");
	    	blockPlankCashew = new BlockTreePlank().setBlockName("blockPlankCashew");

			GameRegistry.registerBlock(blockPlankAvocado,"blockPlankAvocado");
	    	GameRegistry.registerBlock(blockPlankBanana,"blockPlankBanana");
			GameRegistry.registerBlock(blockPlankBreadnut,"blockPlankBreadnut");
			GameRegistry.registerBlock(blockPlankCacao,"blockPlankCacao");
			GameRegistry.registerBlock(blockPlankCashew,"blockPlankCashew");

	    	blockPlankCherry = new BlockTreePlank().setBlockName("blockPlankCherry");
			blockPlankMirabelle = new BlockTreePlank().setBlockName("blockPlankMirabelle");
	    	blockPlankChestnut = new BlockTreePlank().setBlockName("blockPlankChestnut");
	    	blockPlankClementine = new BlockTreePlank().setBlockName("blockPlankClementine");
			blockPlankCoconut = new BlockTreePlank().setBlockName("blockPlankCoconut");

	    	GameRegistry.registerBlock(blockPlankCherry,"blockPlankCherry");
			GameRegistry.registerBlock(blockPlankMirabelle,"blockPlankMirabelle");
	    	GameRegistry.registerBlock(blockPlankChestnut,"blockPlankChestnut");
	    	GameRegistry.registerBlock(blockPlankClementine,"blockPlankClementine");
			GameRegistry.registerBlock(blockPlankCoconut,"blockPlankCoconut");

			blockPlankCrabapple = new BlockTreePlank().setBlockName("blockPlankCrabapple");
	    	blockPlankDate = new BlockTreePlank().setBlockName("blockPlankDate");
	    	blockPlankDragonfruit = new BlockTreePlank().setBlockName("blockPlankDragonfruit");
	    	blockPlankFig = new BlockTreePlank().setBlockName("blockPlankFig");
	    	blockPlankGrapefruit = new BlockTreePlank().setBlockName("blockPlankGrapefruit");

			GameRegistry.registerBlock(blockPlankCrabapple,"blockPlankCrabapple");
	    	GameRegistry.registerBlock(blockPlankDate,"blockPlankDate");
	    	GameRegistry.registerBlock(blockPlankDragonfruit,"blockPlankDragonfruit");
	    	GameRegistry.registerBlock(blockPlankFig,"blockPlankFig");
	    	GameRegistry.registerBlock(blockPlankGrapefruit,"blockPlankGrapefruit");

			blockPlankGuava = new BlockTreePlank().setBlockName("blockPlankGuava");
			blockPlankJujube = new BlockTreePlank().setBlockName("blockPlankJujube");
	    	blockPlankKiwi = new BlockTreePlank().setBlockName("blockPlankKiwi");
			blockPlankKumquat = new BlockTreePlank().setBlockName("blockPlankKumquat");
			blockPlankLemon = new BlockTreePlank().setBlockName("blockPlankLemon");

			GameRegistry.registerBlock(blockPlankGuava,"blockPlankGuava");
			GameRegistry.registerBlock(blockPlankJujube,"blockPlankJujube");
			GameRegistry.registerBlock(blockPlankKiwi,"blockPlankKiwi");
			GameRegistry.registerBlock(blockPlankKumquat,"blockPlankKumquat");
			GameRegistry.registerBlock(blockPlankLemon,"blockPlankLemon");

			blockPlankLime = new BlockTreePlank().setBlockName("blockPlankLime");
			blockPlankLychee = new BlockTreePlank().setBlockName("blockPlankLychee");
			blockPlankMango = new BlockTreePlank().setBlockName("blockPlankMango");
			blockPlankNectarine = new BlockTreePlank().setBlockName("blockPlankNectarine");
			blockPlankNuts = new BlockTreePlank().setBlockName("blockPlankNuts");

			GameRegistry.registerBlock(blockPlankLime,"blockPlankLime");
			GameRegistry.registerBlock(blockPlankLychee,"blockPlankLychee");
			GameRegistry.registerBlock(blockPlankMango,"blockPlankMango");
			GameRegistry.registerBlock(blockPlankNectarine,"blockPlankNectarine");
			GameRegistry.registerBlock(blockPlankNuts,"blockPlankNuts");

			blockPlankOlive = new BlockTreePlank().setBlockName("blockPlankOlive");
			blockPlankOrange = new BlockTreePlank().setBlockName("blockPlankOrange");
			blockPlankPapaya = new BlockTreePlank().setBlockName("blockPlankPapaya");
			blockPlankPassionfruit = new BlockTreePlank().setBlockName("blockPlankPassionfruit");
			blockPlankPeach = new BlockTreePlank().setBlockName("blockPlankPeach");

			GameRegistry.registerBlock(blockPlankOlive,"blockPlankOlive");
			GameRegistry.registerBlock(blockPlankOrange,"blockPlankOrange");
			GameRegistry.registerBlock(blockPlankPapaya,"blockPlankPapaya");
			GameRegistry.registerBlock(blockPlankPassionfruit,"blockPlankPassionfruit");
			GameRegistry.registerBlock(blockPlankPeach,"blockPlankPeach");

			blockPlankPear = new BlockTreePlank().setBlockName("blockPlankPear");
			blockPlankPersimmon = new BlockTreePlank().setBlockName("blockPlankPersimmon");
	    	blockPlankPistachio = new BlockTreePlank().setBlockName("blockPlankPistachio");
			blockPlankPlum = new BlockTreePlank().setBlockName("blockPlankPlum");
			blockPlankPomegranate = new BlockTreePlank().setBlockName("blockPlankPomegranate");

			GameRegistry.registerBlock(blockPlankPear,"blockPlankPear");
			GameRegistry.registerBlock(blockPlankPersimmon,"blockPlankPersimmon");
			GameRegistry.registerBlock(blockPlankPistachio,"blockPlankPistachio");
			GameRegistry.registerBlock(blockPlankPlum,"blockPlankPlum");
			GameRegistry.registerBlock(blockPlankPomegranate,"blockPlankPomegranate");

			blockPlankQuince = new BlockTreePlank().setBlockName("blockPlankQuince");
	    	blockPlankStarAnise = new BlockTreePlank().setBlockName("blockPlankStarAnise");
			blockPlankTangerine = new BlockTreePlank().setBlockName("blockPlankTangerine");
	    	blockPlankVanilla = new BlockTreePlank().setBlockName("blockPlankVanilla");
			blockPlankWalnut = new BlockTreePlank().setBlockName("blockPlankWalnut");

			GameRegistry.registerBlock(blockPlankQuince,"blockPlankQuince");
			GameRegistry.registerBlock(blockPlankStarAnise,"blockPlankStarAnise");
			GameRegistry.registerBlock(blockPlankTangerine,"blockPlankTangerine");
			GameRegistry.registerBlock(blockPlankVanilla,"blockPlankVanilla");
			GameRegistry.registerBlock(blockPlankWalnut,"blockPlankWalnut");
						
			blockPlankAbiu = new BlockTreePlank().setBlockName("blockPlankAbiu");
			blockPlankAllspice = new BlockTreePlank().setBlockName("blockPlankAllspice");
			blockPlankBael = new BlockTreePlank().setBlockName("blockPlankBael");
			blockPlankBlackCherry = new BlockTreePlank().setBlockName("blockPlankBlackCherry");
			blockPlankBlackthorn = new BlockTreePlank().setBlockName("blockPlankBlackthorn");

			GameRegistry.registerBlock(blockPlankAbiu,"blockPlankAbiu");
			GameRegistry.registerBlock(blockPlankAllspice,"blockPlankAllspice");
			GameRegistry.registerBlock(blockPlankBael,"blockPlankBael");
			GameRegistry.registerBlock(blockPlankBlackCherry,"blockPlankBlackCherry");
			GameRegistry.registerBlock(blockPlankBlackthorn,"blockPlankBlackthorn");
			
			blockPlankBloodOrange = new BlockTreePlank().setBlockName("blockPlankBloodOrange");
			blockPlankBrazilNut = new BlockTreePlank().setBlockName("blockPlankBrazilNut");
			blockPlankButternut = new BlockTreePlank().setBlockName("blockPlankButternut");
			blockPlankCinnamon = new BlockTreePlank().setBlockName("blockPlankCinnamon");
			blockPlankClove = new BlockTreePlank().setBlockName("blockPlankClove");

			GameRegistry.registerBlock(blockPlankBloodOrange,"blockPlankBloodOrange");
			GameRegistry.registerBlock(blockPlankBrazilNut,"blockPlankBrazilNut");
			GameRegistry.registerBlock(blockPlankButternut,"blockPlankButternut");
			GameRegistry.registerBlock(blockPlankCinnamon,"blockPlankCinnamon");
			GameRegistry.registerBlock(blockPlankClove,"blockPlankClove");
			
			blockPlankDamsonPlum = new BlockTreePlank().setBlockName("blockPlankDamsonPlum");
			blockPlankElderberry = new BlockTreePlank().setBlockName("blockPlankElderberry");
			blockPlankLaurel = new BlockTreePlank().setBlockName("blockPlankLaurel");
			blockPlankLongan = new BlockTreePlank().setBlockName("blockPlankLongan");
			blockPlankLoquat = new BlockTreePlank().setBlockName("blockPlankLoquat");

			GameRegistry.registerBlock(blockPlankDamsonPlum,"blockPlankDamsonPlum");
			GameRegistry.registerBlock(blockPlankElderberry,"blockPlankElderberry");
			GameRegistry.registerBlock(blockPlankLaurel,"blockPlankLaurel");
			GameRegistry.registerBlock(blockPlankLongan,"blockPlankLongan");
			GameRegistry.registerBlock(blockPlankLoquat,"blockPlankLoquat");
			
			blockPlankMacadamia = new BlockTreePlank().setBlockName("blockPlankMacadamia");
			blockPlankMorelloCherry = new BlockTreePlank().setBlockName("blockPlankMorelloCherry");
			blockPlankNutmeg = new BlockTreePlank().setBlockName("blockPlankNutmeg");
			blockPlankPlane = new BlockTreePlank().setBlockName("blockPlankPlane");
			blockPlankPlantain = new BlockTreePlank().setBlockName("blockPlankPlantain");

			GameRegistry.registerBlock(blockPlankMacadamia,"blockPlankMacadamia");
			GameRegistry.registerBlock(blockPlankMorelloCherry,"blockPlankMorelloCherry");
			GameRegistry.registerBlock(blockPlankNutmeg,"blockPlankNutmeg");
			GameRegistry.registerBlock(blockPlankPlane,"blockPlankPlane");
			GameRegistry.registerBlock(blockPlankPlantain,"blockPlankPlantain");
			
			blockplankPomelo = new BlockTreePlank().setBlockName("blockplankPomelo");
			blockPlankSatsuma = new BlockTreePlank().setBlockName("blockPlankSatsuma");
			blockPlankTonkaBean = new BlockTreePlank().setBlockName("blockPlankTonkaBean");
			blockPlankWhitePeach = new BlockTreePlank().setBlockName("blockPlankWhitePeach");
			blockPlankGrapefruitPink = new BlockTreePlank().setBlockName("blockPlankGrapefruitPink");
			blockPlankMaple = new BlockTreePlank().setBlockName("blockPlankMaple");

			GameRegistry.registerBlock(blockplankPomelo,"blockplankPomelo");
			GameRegistry.registerBlock(blockPlankSatsuma,"blockPlankSatsuma");
			GameRegistry.registerBlock(blockPlankTonkaBean,"blockPlankTonkaBean");
			GameRegistry.registerBlock(blockPlankWhitePeach,"blockPlankWhitePeach");
			GameRegistry.registerBlock(blockPlankGrapefruitPink,"blockPlankGrapefruitPink");
			GameRegistry.registerBlock(blockPlankMaple,"blockPlankMaple");
			
			blockPlankBer = new BlockTreePlank().setBlockName("blockPlankBer");
			blockPlankCurry = new BlockTreePlank().setBlockName("blockPlankCurry");
			blockPlankRedBanana = new BlockTreePlank().setBlockName("blockPlankRedBanana");

			GameRegistry.registerBlock(blockPlankBer,"blockPlankBer");
			GameRegistry.registerBlock(blockPlankCurry,"blockPlankCurry");
			GameRegistry.registerBlock(blockPlankRedBanana,"blockPlankRedBanana");
			
			blockPlankBunyaNut = new BlockTreePlank().setBlockName("blockPlankBunyaNut");
			blockPlankGingkoNut = new BlockTreePlank().setBlockName("blockPlankGingkoNut");
			blockPlankHuckleberries = new BlockTreePlank().setBlockName("blockPlankHuckleberries");
			blockPlankJackFruit = new BlockTreePlank().setBlockName("blockPlankJackFruit");
			blockPlankMameySapote = new BlockTreePlank().setBlockName("blockPlankMameySapote");

			GameRegistry.registerBlock(blockPlankBunyaNut,"blockPlankBunyaNut");
			GameRegistry.registerBlock(blockPlankGingkoNut,"blockPlankGingkoNut");
			GameRegistry.registerBlock(blockPlankHuckleberries,"blockPlankHuckleberries");
			GameRegistry.registerBlock(blockPlankJackFruit,"blockPlankJackFruit");
			GameRegistry.registerBlock(blockPlankMameySapote,"blockPlankMameySapote");
				
			blockPlankMangosteen = new BlockTreePlank().setBlockName("blockPlankMangosteen");
			blockPlankOhiaAi = new BlockTreePlank().setBlockName("blockPlankOhiaAi");
			blockPlankOsageOrange = new BlockTreePlank().setBlockName("blockPlankOsageOrange");
			blockPlankParadiseNut = new BlockTreePlank().setBlockName("blockPlankParadiseNut");
			blockPlankPineNut = new BlockTreePlank().setBlockName("blockPlankPineNut");

			GameRegistry.registerBlock(blockPlankMangosteen,"blockPlankMangosteen");
			GameRegistry.registerBlock(blockPlankOhiaAi,"blockPlankOhiaAi");
			GameRegistry.registerBlock(blockPlankOsageOrange,"blockPlankOsageOrange");
			GameRegistry.registerBlock(blockPlankParadiseNut,"blockPlankParadiseNut");
			GameRegistry.registerBlock(blockPlankPineNut,"blockPlankPineNut");
			
			blockPlankSapodilla = new BlockTreePlank().setBlockName("blockPlankSapodilla");
			blockPlankSoursop = new BlockTreePlank().setBlockName("blockPlankSoursop");
			blockPlankTamarillo = new BlockTreePlank().setBlockName("blockPlankTamarillo");
			blockPlankCinchona = new BlockTreePlank().setBlockName("blockPlankCinchona");

			GameRegistry.registerBlock(blockPlankSapodilla,"blockPlankSapodilla");
			GameRegistry.registerBlock(blockPlankSoursop,"blockPlankSoursop");
			GameRegistry.registerBlock(blockPlankTamarillo,"blockPlankTamarillo");
			GameRegistry.registerBlock(blockPlankCinchona,"blockPlankCinchona");


			
			
			//apple
	    	blockPlankAppleAntares = new BlockTreePlank().setBlockName("blockPlankAppleAntares");
			blockPlankAppleAriane = new BlockTreePlank().setBlockName("blockPlankAppleAriane");
			blockPlankAppleBelchardChancelier = new BlockTreePlank().setBlockName("blockPlankAppleBelchardChancelier");
			blockPlankAppleBelleDeBoskoop = new BlockTreePlank().setBlockName("blockPlankAppleBelleDeBoskoop");
	    	blockPlankAppleBraeburn = new BlockTreePlank().setBlockName("blockPlankAppleBraeburn");
	    	
	    	GameRegistry.registerBlock(blockPlankAppleAntares,"blockPlankAppleAntares");
			GameRegistry.registerBlock(blockPlankAppleAriane,"blockPlankAppleAriane");
			GameRegistry.registerBlock(blockPlankAppleBelchardChancelier,"blockPlankAppleBelchardChancelier");
			GameRegistry.registerBlock(blockPlankAppleBelleDeBoskoop,"blockPlankAppleBelleDeBoskoop");
	    	GameRegistry.registerBlock(blockPlankAppleBraeburn,"blockPlankAppleBraeburn");

	    	blockPlankAppleElstar = new BlockTreePlank().setBlockName("blockPlankAppleElstar");
	    	blockPlankAppleFuji = new BlockTreePlank().setBlockName("blockPlankAppleFuji");
	    	blockPlankAppleGala = new BlockTreePlank().setBlockName("blockPlankAppleGala");
	    	blockPlankAppleGolden = new BlockTreePlank().setBlockName("blockPlankAppleGolden");
	    	blockPlankAppleGrannySmith = new BlockTreePlank().setBlockName("blockPlankAppleGrannySmith");

	    	GameRegistry.registerBlock(blockPlankAppleElstar,"blockPlankAppleElstar");
	    	GameRegistry.registerBlock(blockPlankAppleFuji,"blockPlankAppleFuji");
	    	GameRegistry.registerBlock(blockPlankAppleGala,"blockPlankAppleGala");
	    	GameRegistry.registerBlock(blockPlankAppleGolden,"blockPlankAppleGolden");
	    	GameRegistry.registerBlock(blockPlankAppleGrannySmith,"blockPlankAppleGrannySmith");

			blockPlankAppleHoneyCrunch = new BlockTreePlank().setBlockName("blockPlankAppleHoneyCrunch");
			blockPlankAppleJazz = new BlockTreePlank().setBlockName("blockPlankAppleJazz");
			blockPlankAppleJonagoldJonagored = new BlockTreePlank().setBlockName("blockPlankAppleJonagoldJonagored");
			blockPlankAppleLesRouges = new BlockTreePlank().setBlockName("blockPlankAppleLesRouges");
			blockPlankApplePinkLady = new BlockTreePlank().setBlockName("blockPlankApplePinkLady");

			GameRegistry.registerBlock(blockPlankAppleHoneyCrunch,"blockPlankAppleHoneyCrunch");
			GameRegistry.registerBlock(blockPlankAppleJazz,"blockPlankAppleJazz");
			GameRegistry.registerBlock(blockPlankAppleJonagoldJonagored,"blockPlankAppleJonagoldJonagored");
			GameRegistry.registerBlock(blockPlankAppleLesRouges,"blockPlankAppleLesRouges");
		 	GameRegistry.registerBlock(blockPlankApplePinkLady,"blockPlankApplePinkLady");

			
			blockPlankApplePommeLimousin = new BlockTreePlank().setBlockName("blockPlankApplePommeLimousin");
			BlockPlankAppleReineDesReinettes = new BlockTreePlank().setBlockName("BlockPlankAppleReineDesReinettes");
			blockPlankAppleReinetteGriseDuCanada = new BlockTreePlank().setBlockName("blockPlankAppleReinetteGriseDuCanada");
			blockPlankAppleTentation = new BlockTreePlank().setBlockName("blockPlankAppleTentation");

			GameRegistry.registerBlock(blockPlankApplePommeLimousin,"blockPlankApplePommeLimousin");
			GameRegistry.registerBlock(BlockPlankAppleReineDesReinettes,"BlockPlankAppleReineDesReinettes");
			GameRegistry.registerBlock(blockPlankAppleReinetteGriseDuCanada,"blockPlankAppleReinetteGriseDuCanada");
			GameRegistry.registerBlock(blockPlankAppleTentation,"blockPlankAppleTentation");		    			    	
		
			 //blocks plants
	    	blockMint = new BlockPlant(BandbItems.itemMint, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 1.50F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockMint").setBlockName("blockMint");
	    	blockRape = new BlockPlant(BandbItems.itemRape, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockRape").setBlockName("blockRape");
	    	blockBetterCactus = new BlockPlantDesert(BandbItems.itemBetterCactus, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBetterCactus").setBlockName("blockBetterCactus");
	    	blockDaisy = new BlockPlant(BandbItems.itemDaisy, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockDaisy").setBlockName("blockDaisy");
	    	blockOrchid = new BlockPlant(BandbItems.itemOrchid, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockOrchid").setBlockName("blockOrchid");

	    	GameRegistry.registerBlock(blockMint,"blockMint");
	    	GameRegistry.registerBlock(blockRape,"blockRape");
	    	GameRegistry.registerBlock(blockBetterCactus,"blockBetterCactus");
	    	GameRegistry.registerBlock(blockDaisy,"blockDaisy");
	    	GameRegistry.registerBlock(blockOrchid,"blockOrchid");
	    			    	
	    	blockSesame = new BlockPlant(BandbItems.itemSesame, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSesame").setBlockName("blockSesame");
	    	blockLicorice = new BlockPlant(BandbItems.itemLicorice, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLicorice").setBlockName("blockLicorice");
	    	blockHibiscus = new BlockPlant(BandbItems.itemHibiscus, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockHibiscus").setBlockName("blockHibiscus");
	    	blockJasmine = new BlockPlant(BandbItems.itemJasmine, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockJasmine").setBlockName("blockJasmine");
	    	blockLavender = new BlockPlant(BandbItems.itemLavender, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLavender").setBlockName("blockLavender");

	    	GameRegistry.registerBlock(blockSesame,"blockSesame");
	    	GameRegistry.registerBlock(blockLicorice,"blockLicorice");
	    	GameRegistry.registerBlock(blockHibiscus,"blockHibiscus");
	    	GameRegistry.registerBlock(blockJasmine,"blockJasmine");
	    	GameRegistry.registerBlock(blockLavender,"blockLavender");
	    	
	    	blockRosmary = new BlockPlant(BandbItems.itemRosmary, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockRosmary").setBlockName("blockRosmary");
	    	blockTarragon = new BlockPlant(BandbItems.itemTarragon, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockTarragon").setBlockName("blockTarragon");
	    	blockAgave = new BlockPlantDesert(BandbItems.itemAgave, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAgave").setBlockName("blockAgave");
	    	blockAmaryllisPink = new BlockPlant(BandbItems.itemAmaryllisPink, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisPink").setBlockName("blockAmaryllisPink");
	    	blockAmaryllisRed = new BlockPlant(BandbItems.itemAmaryllisRed, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisRed").setBlockName("blockAmaryllisRed");
	    	
	    	GameRegistry.registerBlock(blockRosmary,"blockRosmary");
	    	GameRegistry.registerBlock(blockTarragon,"blockTarragon");
	    	GameRegistry.registerBlock(blockAgave,"blockAgave");
	    	GameRegistry.registerBlock(blockAmaryllisPink,"blockAmaryllisPink");
	    	GameRegistry.registerBlock(blockAmaryllisRed,"blockAmaryllisRed");
	    	
	    	blockAmaryllisWhite = new BlockPlant(BandbItems.itemAmaryllisWhite, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisWhite").setBlockName("blockAmaryllisWhite");
	    	blockBachelorsButtonBlue = new BlockPlant(BandbItems.itemBachelorsButtonBlue, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBachelorsButtonBlue").setBlockName("blockBachelorsButtonBlue");
	    	blockBelladonna = new BlockPlant(BandbItems.itemBelladonna, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBelladonna").setBlockName("blockBelladonna");
	    	blockBlowball = new BlockPlant(BandbItems.itemBlowball, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBlowball").setBlockName("blockBlowball");
	    	blockButtercup = new BlockPlant(BandbItems.itemButtercup, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockButtercup").setBlockName("blockButtercup");
	    	
	    	GameRegistry.registerBlock(blockAmaryllisWhite,"blockAmaryllisWhite");
	    	GameRegistry.registerBlock(blockBachelorsButtonBlue,"blockBachelorsButtonBlue");
	    	GameRegistry.registerBlock(blockBelladonna,"blockBelladonna");
	    	GameRegistry.registerBlock(blockBlowball,"blockBlowball");
	    	GameRegistry.registerBlock(blockButtercup,"blockButtercup");
	    	
	    	blockCallaBlack = new BlockPlant(BandbItems.itemCallaBlack, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCallaBlack").setBlockName("blockCallaBlack");
	    	blockCallaWhite = new BlockPlant(BandbItems.itemCallaWhite, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCallaWhite").setBlockName("blockCallaWhite");
	    	blockChrysantheme = new BlockPlant(BandbItems.itemChrysantheme, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChrysantheme").setBlockName("blockChrysantheme");
	    	blockEnzian = new BlockPlant(BandbItems.itemEnzian, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockEnzian").setBlockName("blockEnzian");
	    	blockFoxglove = new BlockPlant(BandbItems.itemFoxglove, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockFoxglove").setBlockName("blockFoxglove");
	    	
	    	GameRegistry.registerBlock(blockCallaBlack,"blockCallaBlack");
	    	GameRegistry.registerBlock(blockCallaWhite,"blockCallaWhite");
	    	GameRegistry.registerBlock(blockChrysantheme,"blockChrysantheme");
	    	GameRegistry.registerBlock(blockEnzian,"blockEnzian");
	    	GameRegistry.registerBlock(blockFoxglove,"blockFoxglove");
	    	
	    	blockHeather = new BlockPlant(BandbItems.itemHeather, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockHeather").setBlockName("blockHeather");
	    	blockIrisBlue = new BlockPlant(BandbItems.itemIrisBlue, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockIrisBlue").setBlockName("blockIrisBlue");
	    	blockIrisPurple = new BlockPlant(BandbItems.itemIrisPurple, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockIrisPurple").setBlockName("blockIrisPurple");
	    	blockLily = new BlockPlant(BandbItems.itemLily, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLily").setBlockName("blockLily");
	    	blockMarshMarigold = new BlockPlant(BandbItems.itemMarshMarigold, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockMarshMarigold").setBlockName("blockMarshMarigold");
	    	
	    	GameRegistry.registerBlock(blockHeather,"blockHeather");
	    	GameRegistry.registerBlock(blockIrisBlue,"blockIrisBlue");
	    	GameRegistry.registerBlock(blockIrisPurple,"blockIrisPurple");
	    	GameRegistry.registerBlock(blockLily,"blockLily");
	    	GameRegistry.registerBlock(blockMarshMarigold,"blockMarshMarigold");
	    	
	    	blockPansy = new BlockPlant(BandbItems.itemPansy, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPansy").setBlockName("blockPansy");
	    	blockPeony = new BlockPlant(BandbItems.itemPeony, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPeony").setBlockName("blockPeony");
	    	blockSyringa = new BlockPlant(BandbItems.itemSyringa, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSyringa").setBlockName("blockSyringa");
	    	blockViolet = new BlockPlant(BandbItems.itemViolet, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockViolet").setBlockName("blockViolet");
	    	blockLemonGrass = new BlockPlant(BandbItems.itemLemonGrass, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLemonGrass").setBlockName("blockLemonGrass");
	    	blockPeyote = new BlockPlantDesert(BandbItems.itemPeyote, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPeyote").setBlockName("blockPeyote");
	    	
	    	blockBluebell = new BlockPlant(BandbItems.itemBluebell, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBluebell").setBlockName("blockBluebell");
	    	blockDill = new BlockPlant(BandbItems.itemDill, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockDill").setBlockName("blockDill");
	    	blockGardenia = new BlockPlant(BandbItems.itemGardenia, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockGardenia").setBlockName("blockGardenia");
	    	blockNettle = new BlockPlant(BandbItems.itemNettle, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockNettle").setBlockName("blockNettle");
	    	blockThistle = new BlockPlant(BandbItems.itemThistle, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockThistle").setBlockName("blockThistle");
	    	
			GameRegistry.registerBlock(blockPansy,"blockPansy");
	    	GameRegistry.registerBlock(blockPeony,"blockPeony");
	    	GameRegistry.registerBlock(blockSyringa,"blockSyringa");
	    	GameRegistry.registerBlock(blockViolet,"blockViolet");
	    	GameRegistry.registerBlock(blockLemonGrass,"blockLemonGrass");
	    	GameRegistry.registerBlock(blockPeyote,"blockPeyote");
	    	
	    	GameRegistry.registerBlock(blockBluebell,"blockBluebell");
	    	GameRegistry.registerBlock(blockDill,"blockDill");
	    	GameRegistry.registerBlock(blockGardenia,"blockGardenia");
	    	GameRegistry.registerBlock(blockNettle,"blockNettle");
	    	GameRegistry.registerBlock(blockThistle,"blockThistle");
	    	
			blockWormwood = new BlockPlant(BandbItems.itemWormwood, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockWormwood").setBlockName("blockWormwood");
			blockCinchona = new BlockPlant(BandbItems.itemCinchona, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCinchona").setBlockName("blockCinchona");
			blockChives = new BlockPlant(BandbItems.itemChives, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChives").setBlockName("blockChives");
			blockChervil = new BlockPlant(BandbItems.itemChervil, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChervil").setBlockName("blockChervil");
			blockWatercress = new BlockPlant(BandbItems.itemWatercress, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockWatercress").setBlockName("blockWatercress");
	    	
	    	GameRegistry.registerBlock(blockWormwood,"blockWormwood");
	    	GameRegistry.registerBlock(blockCinchona,"blockCinchona");
	    	GameRegistry.registerBlock(blockChives,"blockChives");
	    	GameRegistry.registerBlock(blockChervil,"blockChervil");
	    	GameRegistry.registerBlock(blockWatercress,"blockWatercress");
	    	   
			blockThyme = new BlockPlant(BandbItems.itemThyme, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockThyme").setBlockName("blockThyme");
			blockSage = new BlockPlant(BandbItems.itemSage, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSage").setBlockName("blockSage");
			blockOregano = new BlockPlant(BandbItems.itemOregano, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockOregano").setBlockName("blockOregano");
			blockFennel = new BlockPlant(BandbItems.itemFennel, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockFennel").setBlockName("blockFennel");
			blockGentian = new BlockPlant(BandbItems.itemGentian, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockGentian").setBlockName("blockGentian");
	    	
	    	GameRegistry.registerBlock(blockThyme,"blockThyme");
	    	GameRegistry.registerBlock(blockSage,"blockSage");
	    	GameRegistry.registerBlock(blockOregano,"blockOregano");
	    	GameRegistry.registerBlock(blockFennel,"blockFennel");
	    	GameRegistry.registerBlock(blockGentian,"blockGentian");
	    	
	    //mushrooms
	    	blockTruffle = new BlockMushroomOre(BandbItems.itemTruffle).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockTruffle").setBlockName("blockTruffle");
	    	blockMorel = new BlockMushroom(BandbItems.itemMorel, 0.4F, 0.65F, 0.0F, 0.65F, 0.35F, 1.8F, 0.35F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockMorel").setBlockName("blockMorel");
	    	blockHornOfPlenty = new BlockMushroom(BandbItems.itemHornOfPlenty, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.85F, 0.40F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockHornOfPlenty").setBlockName("blockHornOfPlenty");
	    	blockCep = new BlockMushroom(BandbItems.itemCep,0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.25F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockCep").setBlockName("blockCep");
	    	blockHydnumRepandum = new BlockMushroom(BandbItems.itemHydnumRepandum, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.85F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockHydnumRepandum").setBlockName("blockHydnumRepandum");

	    	blockAmanitaMuscaria = new BlockMushroom(BandbItems.itemAmanitaMuscaria, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockAmanitaMuscaria").setBlockName("blockAmanitaMuscaria");

	    	GameRegistry.registerBlock(blockTruffle,"blockTruffle");
	    	GameRegistry.registerBlock(blockMorel,"blockMorel");
	    	GameRegistry.registerBlock(blockHornOfPlenty,"blockHornOfPlenty");
	    	GameRegistry.registerBlock(blockCep,"blockCep");
	    	GameRegistry.registerBlock(blockHydnumRepandum,"blockHydnumRepandum");

	    	GameRegistry.registerBlock(blockAmanitaMuscaria,"blockAmanitaMuscaria");				
		
			//ore
	    		//drop block
	    	blockOreAluminium = new BlockOreDropOre(Material.rock, 5.0F, 2).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreAluminium").setBlockName("blockOreAluminium");
	    	blockOrePlatinum = new BlockOreDropOre(Material.rock, 15.0F, 3).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOrePlatinum").setBlockName("blockOrePlatinum");
	    	blockOreTitan = new BlockOreDropOre(Material.rock, 15.0F, 3).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreTitan").setBlockName("blockOreTitan");

	    	GameRegistry.registerBlock(blockOreAluminium, "blockOreAluminium");
	    	GameRegistry.registerBlock(blockOrePlatinum, "blockOrePlatinum");
	    	GameRegistry.registerBlock(blockOreTitan, "blockOreTitan");
	    	
	    	//drop gem
	    	blockOreAmethyst = new BlockOreDropGem(Material.rock, 5.0F, 2, BandbItems.itemAmethyst, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreAmethyst").setBlockName("blockOreAmethyst");
			blockOreJade = new BlockOreDropGem(Material.rock, 5.0F, 2, BandbItems.itemJade, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreJade").setBlockName("blockOreJade");
	    	blockOreOnyx = new BlockOreDropGem(Material.rock, 6.0F, 2, BandbItems.itemOnyx, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreOnyx").setBlockName("blockOreOnyx");
	    	
	    	blockOreOpal = new BlockOreDropGem(Material.rock, 6.0F, 1, BandbItems.itemOpal, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreOpal").setBlockName("blockOreOpal");
	    	blockOreRuby = new BlockOreDropGem(Material.rock, 5.0F,	2, BandbItems.itemRuby, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreRuby").setBlockName("blockOreRuby");
	    	blockOreSalt = new BlockOreDropGem(Material.rock, 4.0F, 1, BandbItems.itemSalt, 9).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreSalt").setBlockName("blockOreSalt");
	    	blockOreSapphire = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemSapphire, 2).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreSapphire").setBlockName("blockOreSapphire");

	    	GameRegistry.registerBlock(blockOreAmethyst, "blockOreAmethyst");
	    	GameRegistry.registerBlock(blockOreJade, "blockOreJade");
	    	GameRegistry.registerBlock(blockOreOnyx, "blockOreOnyx");
 	
	    	GameRegistry.registerBlock(blockOreOpal, "blockOreOpal");
	    	GameRegistry.registerBlock(blockOreRuby, "blockOreRuby");
	    	GameRegistry.registerBlock(blockOreSalt, "blockOreSalt");
	    	GameRegistry.registerBlock(blockOreSapphire, "blockOreSapphire");
	    	
	    	blockOreTopaz = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemTopaz, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreTopaz").setBlockName("blockOreTopaz");
	    	blockOrePainite = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemPainite, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOrePainite").setBlockName("blockOrePainite");

	    	GameRegistry.registerBlock(blockOreTopaz, "blockOreTopaz");			
	    	GameRegistry.registerBlock(blockOrePainite, "blockOrePainite");
			
	    		//block ingot 	    	
			blockAluminium = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockAluminium").setBlockName("blockAluminium");
			blockAmethyst = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockAmethyst").setBlockName("blockAmethyst");
			blockJade = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockJade").setBlockName("blockJade");
			blockPainite = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockPainite").setBlockName("blockPainite");
			
			blockOnyx = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockOnyx").setBlockName("blockOnyx");
			blockOpal = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockOpal").setBlockName("blockOpal");

			
			GameRegistry.registerBlock(blockAluminium, "blockAluminium");
	    	GameRegistry.registerBlock(blockAmethyst, "blockAmethyst");
	    	GameRegistry.registerBlock(blockJade, "blockJade");
	    	GameRegistry.registerBlock(blockPainite, "blockPainite");

	    	GameRegistry.registerBlock(blockOnyx, "blockOnyx");
	    	GameRegistry.registerBlock(blockOpal, "blockOpal");

			blockPlatinum = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockPlatinum").setBlockName("blockPlatinum");

			GameRegistry.registerBlock(blockPlatinum, "blockPlatinum");
	    	
	    	blockRuby = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockRuby").setBlockName("blockRuby");
	    	blockSapphire = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockSapphire").setBlockName("blockSapphire");
	    	blockSteel = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockSteel").setBlockName("blockSteel");
	    	blockTitan = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTitan").setBlockName("blockTitan");
	    	blockTopaz = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTopaz").setBlockName("blockTopaz");
	    	
			GameRegistry.registerBlock(blockRuby, "blockRuby");
	    	GameRegistry.registerBlock(blockSapphire, "blockSapphire");
	    	GameRegistry.registerBlock(blockSteel, "blockSteel");

			GameRegistry.registerBlock(blockTitan, "blockTitan");
	    	GameRegistry.registerBlock(blockTopaz, "blockTopaz");
	    					    	
	    	//Other
	    	blockCobblestoneMilka = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockCobblestoneMilka").setBlockName("blockCobblestoneMilka");
	    	blockDirtMilka_top = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockDirtMilka_top").setBlockName("blockDirtMilka_top");
	    	blockStoneMilka = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockStoneMilka").setBlockName("blockStoneMilka");

	    	GameRegistry.registerBlock(blockCobblestoneMilka, "blockCobblestoneMilka");			
	    	GameRegistry.registerBlock(blockDirtMilka_top, "blockDirtMilka_top");			
	    	GameRegistry.registerBlock(blockStoneMilka, "blockStoneMilka");			
							   			
			//furniture 
			blockFurnitureKitchenWorktopA = new BlockFurnitureKitchenWorktopA(new TileEntityFurnitureKitchenWorktopA(), 0).setBlockName("blockFurnitureKitchenWortopA");
			
			GameRegistry.registerBlock(blockFurnitureKitchenWorktopA, "blockFurnitureKitchenWortopA");

		}			
			***/
	}