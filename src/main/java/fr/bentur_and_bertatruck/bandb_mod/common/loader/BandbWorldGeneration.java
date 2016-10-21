package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestMushroom;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeApple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeHigh;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJunglePalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJungleTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationPlainPlant;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationDesert;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationForest;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationJungle;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationPlains;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobaleWorldGeneration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandbWorldGeneration {
	
	public BandbWorldGeneration(){
		
	}
	
	public static void init(){
		
		//desert tree
		ListGenerationDesertPalmTree.add(BandbBlocks.blockLeavesDate, BandbBlocks.blockWoodDate);
		ListGenerationDesertPalmTree.add(BandbBlocks.blockLeavesCoconut, BandbBlocks.blockWoodCoconut);
		
		//desert plant
		ListGenerationDesertPlant.add(BandbBlocks.blockBetterCactus);
		ListGenerationDesertPlant.add(BandbBlocks.blockPeyote);
		ListGenerationDesertPlant.add(BandbBlocks.blockAgave);
		
		//forest tree apple
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesCrabapple, BandbBlocks.blockWoodCrabapple);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleAntares, BandbBlocks.blockWoodAppleAntares);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleAriane, BandbBlocks.blockWoodAppleAriane);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleBelchardChantecier, BandbBlocks.blockWoodAppleBelchardChantecier);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleBelleDeBoskoop, BandbBlocks.blockWoodAppleBelleDeBoskoop);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleBelleDeBoskoop, BandbBlocks.blockWoodAppleBelleDeBoskoop);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleBraeburn, BandbBlocks.blockWoodAppleBraeburn);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleElstar, BandbBlocks.blockWoodAppleElstar);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleFuji, BandbBlocks.blockWoodAppleFuji);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleGala, BandbBlocks.blockWoodAppleGala);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleGolden, BandbBlocks.blockWoodAppleGolden);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleGrannySmith, BandbBlocks.blockWoodAppleGrannySmith);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleHoneycrunch, BandbBlocks.blockWoodAppleHoneycrunch);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleJazz, BandbBlocks.blockWoodAppleJazz);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleJonagoldJonagored, BandbBlocks.blockWoodAppleJonagoldJonagored);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleLesRouges, BandbBlocks.blockWoodAppleLesRouges);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesApplePinkLady, BandbBlocks.blockWoodApplePinkLady);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesApplePommeLimousin, BandbBlocks.blockWoodApplePommeLimousin);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleReineDesReinettes, BandbBlocks.blockWoodAppleReineDesReinettes);
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleReinetteGriseDuCanada, BandbBlocks.blockWoodAppleReinetteGriseDuCanada);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockLeavesAppleTentation, BandbBlocks.blockWoodAppleTentation);
		
		//forest tree
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAlmond, BandbBlocks.blockWoodAlmond);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAmla, BandbBlocks.blockWoodAmla);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAnise, BandbBlocks.blockWoodAnise);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesApricot, BandbBlocks.blockWoodApricot);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAvocado, BandbBlocks.blockWoodAvocado);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesBreadNut, BandbBlocks.blockWoodBreadNut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesCashew, BandbBlocks.blockWoodCashew);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesCherry, BandbBlocks.blockWoodCherry);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesChestnut, BandbBlocks.blockWoodChestnut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesClementine, BandbBlocks.blockWoodClementine);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesFig, BandbBlocks.blockWoodFig);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesGrapefruit, BandbBlocks.blockWoodGrapefruit);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesJujube, BandbBlocks.blockWoodJujube);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesKiwi, BandbBlocks.blockWoodKiwi);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesLemon, BandbBlocks.blockWoodLemon);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesLime, BandbBlocks.blockWoodLime);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesMirabelle, BandbBlocks.blockWoodMirabelle);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesNectarine, BandbBlocks.blockWoodNectarine);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesNuts, BandbBlocks.blockWoodNuts);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesOlive, BandbBlocks.blockWoodOlive);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesOrange, BandbBlocks.blockWoodOrange);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesPeach, BandbBlocks.blockWoodPeach);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesPear, BandbBlocks.blockWoodPear);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesPersimmon, BandbBlocks.blockWoodPersimmon);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesPistachio, BandbBlocks.blockWoodPistachio);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesPlum, BandbBlocks.blockWoodPlum);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesStarAnise, BandbBlocks.blockWoodStarAnise);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesTangerine, BandbBlocks.blockWoodTangerine);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesVanilla, BandbBlocks.blockWoodVanilla);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesWalnut, BandbBlocks.blockWoodWalnut);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesAllspice, BandbBlocks.blockWoodAllspice);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBael, BandbBlocks.blockWoodBael);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBlackCherry, BandbBlocks.blockWoodBlackCherry);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBlackthorn, BandbBlocks.blockWoodBlackthorn);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBrazilNut, BandbBlocks.blockWoodBrazilNut);
		
		ListGenerationForestTree.add(BandbBlocks.blockLeavesButternut, BandbBlocks.blockWoodButternut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesCinnamon, BandbBlocks.blockWoodCinnamon);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesClove, BandbBlocks.blockWoodClove);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesDamsonPlum, BandbBlocks.blockWoodDamsonPlum);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesElderberry, BandbBlocks.blockWoodElderberry);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesLaurel, BandbBlocks.blockWoodLaurel);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesMacadamia, BandbBlocks.blockWoodMacadamia);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesSatsuma, BandbBlocks.blockWoodSatsuma);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBloodOrange, BandbBlocks.blockWoodBloodOrange);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesWhitePeach, BandbBlocks.blockWoodWhitePeach);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesMorelloCherry, BandbBlocks.blockWoodMorelloCherry);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesGrapefruitPink, BandbBlocks.blockWoodGrapefruitPink);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAbiu, BandbBlocks.blockWoodAbiu);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesLongan, BandbBlocks.blockWoodLongan);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesLoquat, BandbBlocks.blockWoodLoquat);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesNutmeg, BandbBlocks.blockWoodNutmeg);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesTonkaBean, BandbBlocks.blockWoodTonkaBean);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesMaple, BandbBlocks.blockWoodMaple);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesPlane, BandbBlocks.blockWoodPlane);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBer, BandbBlocks.blockWoodBer);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesCurry, BandbBlocks.blockWoodCurry);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesBunyaNut, BandbBlocks.blockWoodBunyaNut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesGingkoNut, BandbBlocks.blockWoodGingkoNut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesHuckleberries, BandbBlocks.blockWoodHuckleberries);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesJackFruit, BandbBlocks.blockWoodJackFruit);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesMameySapote, BandbBlocks.blockWoodMameySapote);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesMangosteen, BandbBlocks.blockWoodMangosteen);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesOhiaAi, BandbBlocks.blockWoodOhiaAi);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesOsageOrange, BandbBlocks.blockWoodOsageOrange);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesParadiseNut, BandbBlocks.blockWoodParadiseNut);

		ListGenerationForestTree.add(BandbBlocks.blockLeavesPineNut, BandbBlocks.blockWoodPineNut);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesSapodilla, BandbBlocks.blockWoodSapodilla);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesSoursop, BandbBlocks.blockWoodSoursop);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesTamarillo, BandbBlocks.blockWoodTamarillo);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesCinchona, BandbBlocks.blockWoodCinchona);
		
		//forest tree high
		ListGenerationForestTreeHigh.add(BandbBlocks.blockLeavesAlmond, BandbBlocks.blockWoodAlmond);

		//forest mushroom
		ListGenerationForestMushroom.add(BandbBlocks.blockAmanitaMuscaria);
		ListGenerationForestMushroom.add(BandbBlocks.blockCep);
		ListGenerationForestMushroom.add(BandbBlocks.blockHornOfPlenty);
		ListGenerationForestMushroom.add(BandbBlocks.blockHydnumRepandum);
		ListGenerationForestMushroom.add(BandbBlocks.blockMorel);
		
		//forest plant
		ListGenerationForestPlant.add(BandbBlocks.blockMint);
		
		//plain plant
		ListGenerationPlainPlant.add(BandbBlocks.blockRape);
		ListGenerationPlainPlant.add(BandbBlocks.blockMint);
		ListGenerationPlainPlant.add(BandbBlocks.blockDaisy);
		ListGenerationPlainPlant.add(BandbBlocks.blockSesame);
		ListGenerationPlainPlant.add(BandbBlocks.blockOrchid);

		ListGenerationPlainPlant.add(BandbBlocks.blockLicorice);
		ListGenerationPlainPlant.add(BandbBlocks.blockHibiscus);
		ListGenerationPlainPlant.add(BandbBlocks.blockJasmine);
		ListGenerationPlainPlant.add(BandbBlocks.blockLavender);
		ListGenerationPlainPlant.add(BandbBlocks.blockRosmary);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockTarragon);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisPink);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisRed);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisWhite);
		ListGenerationPlainPlant.add(BandbBlocks.blockBachelorsButtonBlue);

		ListGenerationPlainPlant.add(BandbBlocks.blockBelladonna);
		ListGenerationPlainPlant.add(BandbBlocks.blockBlowball);
		ListGenerationPlainPlant.add(BandbBlocks.blockButtercup);
		ListGenerationPlainPlant.add(BandbBlocks.blockCallaBlack);
		ListGenerationPlainPlant.add(BandbBlocks.blockCallaWhite);

		ListGenerationPlainPlant.add(BandbBlocks.blockChrysantheme);
		ListGenerationPlainPlant.add(BandbBlocks.blockEnzian);
		ListGenerationPlainPlant.add(BandbBlocks.blockFoxglove);
		ListGenerationPlainPlant.add(BandbBlocks.blockHeather);
		ListGenerationPlainPlant.add(BandbBlocks.blockIrisBlue);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockIrisPurple);
		ListGenerationPlainPlant.add(BandbBlocks.blockLily);
		ListGenerationPlainPlant.add(BandbBlocks.blockMarshMarigold);
		ListGenerationPlainPlant.add(BandbBlocks.blockPansy);
		ListGenerationPlainPlant.add(BandbBlocks.blockPeony);
	
		ListGenerationPlainPlant.add(BandbBlocks.blockSyringa);
		ListGenerationPlainPlant.add(BandbBlocks.blockViolet);
		ListGenerationPlainPlant.add(BandbBlocks.blockBluebell);
		ListGenerationPlainPlant.add(BandbBlocks.blockNettle);
		ListGenerationPlainPlant.add(BandbBlocks.blockGardenia);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockDill);
		ListGenerationPlainPlant.add(BandbBlocks.blockThistle);
		ListGenerationPlainPlant.add(BandbBlocks.blockChervil);
		ListGenerationPlainPlant.add(BandbBlocks.blockChives);
		ListGenerationPlainPlant.add(BandbBlocks.blockFennel);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockGentian);
		ListGenerationPlainPlant.add(BandbBlocks.blockOregano);
		ListGenerationPlainPlant.add(BandbBlocks.blockSage);
		ListGenerationPlainPlant.add(BandbBlocks.blockThyme);
		ListGenerationPlainPlant.add(BandbBlocks.blockWatercress);

		ListGenerationPlainPlant.add(BandbBlocks.blockWormwood);

		//jungle palm tree
		ListGenerationJunglePalmTree.add(BandbBlocks.blockLeavesAfrican, BandbBlocks.blockWoodAfrican);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockLeavesBanana, BandbBlocks.blockWoodBanana);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockLeavesPlantain, BandbBlocks.blockWoodPlantain);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockLeavesRedBanana, BandbBlocks.blockWoodRedBanana);

		//jungle tree
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesCacao, BandbBlocks.blockWoodCacao);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesDragonfruit, BandbBlocks.blockWoodDragonfruit);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesGuava, BandbBlocks.blockWoodGuava);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesKumquat, BandbBlocks.blockWoodKumquat);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesLychee, BandbBlocks.blockWoodLychee);

		ListGenerationJungleTree.add(BandbBlocks.blockLeavesMango, BandbBlocks.blockWoodMango);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesPapaya, BandbBlocks.blockWoodPapaya);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesPassionfruit, BandbBlocks.blockWoodPassionfruit);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesPomegranate, BandbBlocks.blockWoodPomegranate);
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesQuince, BandbBlocks.blockWoodQuince);
		
		ListGenerationJungleTree.add(BandbBlocks.blockLeavesPomelo, BandbBlocks.blockWoodPomelo);
		
		
		
		GlobalWorldGenerationDesert generationDesert = new GlobalWorldGenerationDesert();
		GlobalWorldGenerationForest generationForest = new GlobalWorldGenerationForest();
		GlobalWorldGenerationJungle generationJungle = new GlobalWorldGenerationJungle();
		GlobalWorldGenerationPlains generationPlains = new GlobalWorldGenerationPlains();
		GlobaleWorldGeneration generationWorld = new GlobaleWorldGeneration();
		
		GameRegistry.registerWorldGenerator(generationDesert, 0);
		GameRegistry.registerWorldGenerator(generationForest, 0);
		GameRegistry.registerWorldGenerator(generationJungle, 0);
		GameRegistry.registerWorldGenerator(generationPlains, 0);
		GameRegistry.registerWorldGenerator(generationWorld, 0);
	}

}
