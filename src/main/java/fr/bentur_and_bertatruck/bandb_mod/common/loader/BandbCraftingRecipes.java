package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandbCraftingRecipes {
	
	public static void loaderRecipe(){
		
		//Shapeless crafting recipes
		//beverage empty
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleBenturCola), new ItemStack(BandbBeverages.itemBenturColaWOLabel), new ItemStack(BandbBeverages.itemBottleBenturColaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCapCorse), new ItemStack(BandbBeverages.itemBottleCapCorseWOLabel), new ItemStack(BandbBeverages.itemBottleCapCorseLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleBrandy), new ItemStack(BandbBeverages.itemBottleBrandyWOLabel), new ItemStack(BandbBeverages.itemBottleBrandyLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCalvados), new ItemStack(BandbBeverages.itemBottleCalvadosWOLabel), new ItemStack(BandbBeverages.itemBottleCalvadosLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleVinegar), new ItemStack(BandbBeverages.itemBottleVinegarWOLabel), new ItemStack(BandbBeverages.itemBottleVinegarLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCiderKerne), new ItemStack(BandbBeverages.itemBottleCiderKerneWOLabel), new ItemStack(BandbBeverages.itemBottleCiderLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCognac), new ItemStack(BandbBeverages.itemBottleCognacWOLabel), new ItemStack(BandbBeverages.itemBottleCognacLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleGin), new ItemStack(BandbBeverages.itemBottleGinWOLabel), new ItemStack(BandbBeverages.itemBottleGinLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleLambig), new ItemStack(BandbBeverages.itemBottleLambigWOLabel), new ItemStack(BandbBeverages.itemBottleLambigLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePastis51), new ItemStack(BandbBeverages.itemBottleWhiteMartiniWOLabel), new ItemStack(BandbBeverages.itemBottlePastis51Label));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleChouchen), new ItemStack(BandbBeverages.itemBottleWhiteMartiniWOLabel), new ItemStack(BandbBeverages.itemBottleChouchenLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePerrier), new ItemStack(BandbBeverages.itemPerrierWOLabel), new ItemStack(BandbBeverages.itemBottlePerrierLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePommeau), new ItemStack(BandbBeverages.itemBottlePommeauWOLabel), new ItemStack(BandbBeverages.itemBottlePommeauLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRedMartini), new ItemStack(BandbBeverages.itemBottleRedMartiniWOLabel), new ItemStack(BandbBeverages.itemBottleRedMartiniLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRedPort), new ItemStack(BandbBeverages.itemBottleRedPortWOLabel), new ItemStack(BandbBeverages.itemBottleRedPortLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRum), new ItemStack(BandbBeverages.itemBottleRumWOLabel), new ItemStack(BandbBeverages.itemBottleRumLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleTequila), new ItemStack(BandbBeverages.itemBottleTequilaWOLabel), new ItemStack(BandbBeverages.itemBottleTequilaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleVodka), new ItemStack(BandbBeverages.itemBottleVodkaWOLabel), new ItemStack(BandbBeverages.itemBottleVodkaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhiskey), new ItemStack(BandbBeverages.itemBottleVinegarWOLabel), new ItemStack(BandbBeverages.itemBottleWhiskeyLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhiteMartini), new ItemStack(BandbBeverages.itemBottleWhiteMartiniWOLabel), new ItemStack(BandbBeverages.itemBottleWhiteMartiniLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhitePort), new ItemStack(BandbBeverages.itemBottleWhitePortWOLabel), new ItemStack(BandbBeverages.itemBottleWhitePortLabel));
		
		//wood to plank 
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAfrican ,4), new ItemStack(BandbBlocks.blockAfricanWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAlmond,4), new ItemStack(BandbBlocks.blockAlmondWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAmla ,4), new ItemStack(BandbBlocks.blockAmlaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAnise ,4), new ItemStack(BandbBlocks.blockAniseWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApricot ,4), new ItemStack(BandbBlocks.blockApricotWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAvocado ,4), new ItemStack(BandbBlocks.blockAvocadoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBanana ,4), new ItemStack(BandbBlocks.blockBananaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBreadnut ,4), new ItemStack(BandbBlocks.blockBreadNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCacao ,4), new ItemStack(BandbBlocks.blockCacaoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCashew ,4), new ItemStack(BandbBlocks.blockCashewWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCherry ,4), new ItemStack(BandbBlocks.blockCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankChestnut ,4), new ItemStack(BandbBlocks.blockChestnutWood));						
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankClementine ,4), new ItemStack(BandbBlocks.blockClementineWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCoconut ,4), new ItemStack(BandbBlocks.blockCoconutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDate ,4), new ItemStack(BandbBlocks.blockDateWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDragonfruit ,4), new ItemStack(BandbBlocks.blockDragonfruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankFig ,4), new ItemStack(BandbBlocks.blockFigWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGrapefruit ,4), new ItemStack(BandbBlocks.blockGrapefruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGuava ,4), new ItemStack(BandbBlocks.blockGuavaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankJujube ,4), new ItemStack(BandbBlocks.blockJujubeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankKiwi ,4), new ItemStack(BandbBlocks.blockKiwiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankKumquat ,4), new ItemStack(BandbBlocks.blockKumquatWood));			
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLemon ,4), new ItemStack(BandbBlocks.blockLemonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLime ,4), new ItemStack(BandbBlocks.blockLimeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLychee ,4), new ItemStack(BandbBlocks.blockLycheeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMango ,4), new ItemStack(BandbBlocks.blockMangoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMirabelle ,4), new ItemStack(BandbBlocks.blockMirabelleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNectarine ,4), new ItemStack(BandbBlocks.blockNectarineWood));			
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNuts ,4), new ItemStack(BandbBlocks.blockNutsWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOlive ,4), new ItemStack(BandbBlocks.blockOliveWood));	
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOrange ,4), new ItemStack(BandbBlocks.blockOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPapaya ,4), new ItemStack(BandbBlocks.blockPapayaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPassionfruit ,4), new ItemStack(BandbBlocks.blockPassionfruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPeach ,4), new ItemStack(BandbBlocks.blockPeachWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPear ,4), new ItemStack(BandbBlocks.blockPearWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPersimmon ,4), new ItemStack(BandbBlocks.blockPersimmonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPistachio ,4), new ItemStack(BandbBlocks.blockPistachioWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlum ,4), new ItemStack(BandbBlocks.blockPlumWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPomegranate ,4), new ItemStack(BandbBlocks.blockPomegranateWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankQuince ,4), new ItemStack(BandbBlocks.blockQuinceWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankStarAnise ,4), new ItemStack(BandbBlocks.blockStarAniseWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTangerine ,4), new ItemStack(BandbBlocks.blockTangerineWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankVanilla ,4), new ItemStack(BandbBlocks.blockVanillaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankWalnut ,4), new ItemStack(BandbBlocks.blockWalnutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAbiu ,4), new ItemStack(BandbBlocks.blockAbiuWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAllspice ,4), new ItemStack(BandbBlocks.blockAllspiceWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBael ,4), new ItemStack(BandbBlocks.blockBaelWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBlackCherry ,4), new ItemStack(BandbBlocks.blockBlackCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBlackthorn ,4), new ItemStack(BandbBlocks.blockBlackthornWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBloodOrange ,4), new ItemStack(BandbBlocks.blockBloodOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBrazilNut ,4), new ItemStack(BandbBlocks.blockBrazilNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankButternut ,4), new ItemStack(BandbBlocks.blockButternutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCinnamon ,4), new ItemStack(BandbBlocks.blockCinnamonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankClove ,4), new ItemStack(BandbBlocks.blockCloveWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDamsonPlum ,4), new ItemStack(BandbBlocks.blockDamsonPlumWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankElderberry ,4), new ItemStack(BandbBlocks.blockElderberryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLaurel ,4), new ItemStack(BandbBlocks.blockLaurelWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLongan ,4), new ItemStack(BandbBlocks.blockLonganWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLoquat ,4), new ItemStack(BandbBlocks.blockLoquatWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMacadamia ,4), new ItemStack(BandbBlocks.blockMacadamiaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMorelloCherry ,4), new ItemStack(BandbBlocks.blockMorelloCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNutmeg ,4), new ItemStack(BandbBlocks.blockNutmegWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlane ,4), new ItemStack(BandbBlocks.blockPlaneWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlantain ,4), new ItemStack(BandbBlocks.blockPlantainWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockplankPomelo ,4), new ItemStack(BandbBlocks.blockPomeloWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSatsuma ,4), new ItemStack(BandbBlocks.blockSatsumaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTonkaBean ,4), new ItemStack(BandbBlocks.blockTonkaBeanWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankWhitePeach ,4), new ItemStack(BandbBlocks.blockWhitePeachWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGrapefruitPink ,4), new ItemStack(BandbBlocks.blockGrapefruitPinkWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMaple ,4), new ItemStack(BandbBlocks.blockMapleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBer ,4), new ItemStack(BandbBlocks.blockBerWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCurry ,4), new ItemStack(BandbBlocks.blockCurryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankRedBanana ,4), new ItemStack(BandbBlocks.blockRedBananaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBunyaNut ,4), new ItemStack(BandbBlocks.blockBunyaNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGingkoNut ,4), new ItemStack(BandbBlocks.blockGingkoNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankHuckleberries ,4), new ItemStack(BandbBlocks.blockHuckleberriesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankJackFruit ,4), new ItemStack(BandbBlocks.blockJackFruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMameySapote ,4), new ItemStack(BandbBlocks.blockMameySapoteWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMangosteen ,4), new ItemStack(BandbBlocks.blockMangosteenWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOhiaAi ,4), new ItemStack(BandbBlocks.blockOhiaAiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOsageOrange ,4), new ItemStack(BandbBlocks.blockOsageOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankParadiseNut ,4), new ItemStack(BandbBlocks.blockParadiseNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPineNut ,4), new ItemStack(BandbBlocks.blockPineNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSapodilla ,4), new ItemStack(BandbBlocks.blockSapodillaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSoursop ,4), new ItemStack(BandbBlocks.blockSoursopWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTamarillo ,4), new ItemStack(BandbBlocks.blockTamarilloWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCinchona ,4), new ItemStack(BandbBlocks.blockWoodCinchona));
		//apple
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCrabapple ,4), new ItemStack(BandbBlocks.blockCrabappleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleAntares ,4), new ItemStack(BandbBlocks.blockAppleAntaresWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleAriane ,4), new ItemStack(BandbBlocks.blockAppleArianeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBelchardChancelier ,4), new ItemStack(BandbBlocks.blockAppleBelchardChantecierWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBelleDeBoskoop ,4), new ItemStack(BandbBlocks.blockAppleBelleDeBoskoopWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBraeburn ,4), new ItemStack(BandbBlocks.blockAppleBraeburnWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleElstar ,4), new ItemStack(BandbBlocks.blockAppleElstarWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleFuji ,4), new ItemStack(BandbBlocks.blockAppleFujiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGala ,4), new ItemStack(BandbBlocks.blockAppleGalaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGolden ,4), new ItemStack(BandbBlocks.blockAppleGoldenWood));		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGrannySmith ,4), new ItemStack(BandbBlocks.blockAppleGrannySmithWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleHoneyCrunch ,4), new ItemStack(BandbBlocks.blockAppleHoneycrunchWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleJazz ,4), new ItemStack(BandbBlocks.blockAppleJazzWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleJonagoldJonagored ,4), new ItemStack(BandbBlocks.blockAppleJonagoldJonagoredWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleLesRouges ,4), new ItemStack(BandbBlocks.blockAppleLesRougesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApplePinkLady ,4), new ItemStack(BandbBlocks.blockApplePinkLadyWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApplePommeLimousin ,4), new ItemStack(BandbBlocks.blockApplePommeLimousinWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.BlockPlankAppleReineDesReinettes ,4), new ItemStack(BandbBlocks.blockAppleReineDesReinettesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleReinetteGriseDuCanada ,4), new ItemStack(BandbBlocks.blockAppleReinetteGriseDuCanadaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleTentation ,4), new ItemStack(BandbBlocks.blockAppleTentationWood));		
		
	
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemMeatChickenLegRaw ,2), new ItemStack(BandbFood.itemMeatChickenFullRaw));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetAluminium ,9), new ItemStack(BandbItems.itemIngotAluminium));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetAmethyst ,9), new ItemStack(BandbItems.itemGemAmethyst));																								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetOnyx ,9), new ItemStack(BandbItems.itemGemOnyx));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetPlatinum ,9), new ItemStack(BandbItems.itemIngotPlatinum));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetRuby ,9), new ItemStack(BandbItems.itemGemRuby));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetSapphire ,9), new ItemStack(BandbItems.itemGemSapphire));										
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientCurry ,1), new ItemStack(BandbFood.itemIngredientCurryLeafDried));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourBuckwheat ,1), new ItemStack(BandbItems.itemPlantBuckwheat));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourHemp ,1), new ItemStack(BandbItems.itemPlantHemp));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourSpelt ,1), new ItemStack(BandbItems.itemPlantSpelt));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourFonio ,1), new ItemStack(BandbItems.itemPlantFonio));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourHop ,1), new ItemStack(BandbItems.itemPlantHop));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourOats ,1), new ItemStack(BandbItems.itemPlantOats));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourMalt ,1), new ItemStack(BandbItems.itemPlantMalt));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourMillet ,1), new ItemStack(BandbItems.itemPlantMillet));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourRye ,1), new ItemStack(BandbItems.itemPlantRye));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourSorghum ,1), new ItemStack(BandbItems.itemPlantSorghum));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourCorn ,1), new ItemStack(BandbItems.itemPlantCorn));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientFlourBarley ,1), new ItemStack(BandbItems.itemPlantBarley));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemIngredientCacaoPowder ,1), new ItemStack(BandbFood.itemFruitCacao));
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemToolBucketCream ,1), new ItemStack(Items.milk_bucket));
	
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemPlantSesameSeed ,2), new ItemStack(BandbItems.itemPlantSesame));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemPlantSesameSeed ,2), new ItemStack(BandbBlocks.blockSesame));
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbFood.itemFoodGum, 2), new ItemStack(Blocks.spruce_stairs));
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockRape ,1), new ItemStack(BandbItems.itemRape));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBetterCactus ,1), new ItemStack(BandbItems.itemBetterCactus));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockDaisy ,1), new ItemStack(BandbItems.itemDaisy));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockOrchid ,1), new ItemStack(BandbItems.itemOrchid));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSesame ,1), new ItemStack(BandbItems.itemSesame));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLicorice ,1), new ItemStack(BandbItems.itemLicorice));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockHibiscus ,1), new ItemStack(BandbItems.itemHibiscus));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockJasmine ,1), new ItemStack(BandbItems.itemJasmine));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLavender ,1), new ItemStack(BandbItems.itemLavender));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockRosmary ,1), new ItemStack(BandbItems.itemRosmary));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockTarragon ,1), new ItemStack(BandbItems.itemTarragon));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAgave ,1), new ItemStack(BandbItems.itemAgave));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisPink ,1), new ItemStack(BandbItems.itemAmaryllisPink));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisRed ,1), new ItemStack(BandbItems.itemAmaryllisRed));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisWhite ,1), new ItemStack(BandbItems.itemAmaryllisWhite));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBachelorsButtonBlue ,1), new ItemStack(BandbItems.itemBachelorsButtonBlue));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBelladonna ,1), new ItemStack(BandbItems.itemBelladonna));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBlowball ,1), new ItemStack(BandbItems.itemBlowball));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockButtercup ,1), new ItemStack(BandbItems.itemButtercup));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockCallaBlack ,1), new ItemStack(BandbItems.itemCallaBlack));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockCallaWhite ,1), new ItemStack(BandbItems.itemCallaWhite));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChrysantheme ,1), new ItemStack(BandbItems.itemChrysantheme));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockEnzian ,1), new ItemStack(BandbItems.itemEnzian));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockFoxglove ,1), new ItemStack(BandbItems.itemFoxglove));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockHeather ,1), new ItemStack(BandbItems.itemHeather));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockIrisBlue ,1), new ItemStack(BandbItems.itemIrisBlue));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockIrisPurple ,1), new ItemStack(BandbItems.itemIrisPurple));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLily ,1), new ItemStack(BandbItems.itemLily));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockMarshMarigold ,1), new ItemStack(BandbItems.itemMarshMarigold));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPansy ,1), new ItemStack(BandbItems.itemPansy));
	//	GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPeony ,1), new ItemStack(BandbItems.itemPeony));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSyringa ,1), new ItemStack(BandbItems.itemSyringa));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockViolet ,1), new ItemStack(BandbItems.itemViolet));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBluebell ,1), new ItemStack(BandbItems.itemBluebell));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockDill ,1), new ItemStack(BandbItems.itemDill));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockGardenia ,1), new ItemStack(BandbItems.itemGardenia));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockNettle ,1), new ItemStack(BandbItems.itemNettle));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockThistle ,1), new ItemStack(BandbItems.itemThistle));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChervil ,1), new ItemStack(BandbItems.itemChervil));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChives ,1), new ItemStack(BandbItems.itemChives));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockFennel ,1), new ItemStack(BandbItems.itemFennel));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockGentian ,1), new ItemStack(BandbItems.itemGentian));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockOregano ,1), new ItemStack(BandbItems.itemOregano));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSage ,1), new ItemStack(BandbItems.itemSage));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockThyme ,1), new ItemStack(BandbItems.itemThyme));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockWatercress ,1), new ItemStack(BandbItems.itemWatercress));
		//GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockWormwood ,1), new ItemStack(BandbItems.itemWormwood));
	
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemPlantRape));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 2), new ItemStack(BandbItems.itemPlantBetterCactus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeWhite), new ItemStack(BandbItems.itemPlantDaisy));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new ItemStack(BandbItems.itemPlantOrchid));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new ItemStack(BandbItems.itemPlantHibiscus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeWhite), new ItemStack(BandbItems.itemPlantJasmine));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeWhite), new ItemStack(BandbItems.itemPlantBlowball));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemPlantViolet));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new ItemStack(BandbItems.itemPlantBachelorsButtonBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemPlantPeony));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeBlue), new ItemStack(BandbItems.itemPlantIrisBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new ItemStack(BandbItems.itemPlantLavender));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new ItemStack(BandbItems.itemPlantLily));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemPlantChrysantheme));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeWhite), new ItemStack(BandbItems.itemPlantAmaryllisWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemPlantHeather));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemPlantSyringa));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeBlack), new ItemStack(BandbItems.itemPlantCallaBlack));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeBlue), new ItemStack(BandbItems.itemPlantEnzian));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new ItemStack(BandbItems.itemPlantFoxglove));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeWhite), new ItemStack(BandbItems.itemPlantCallaWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeBlue), new ItemStack(BandbItems.itemPlantBelladonna));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemPlantAmaryllisPink));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemPlantIrisPurple));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new ItemStack(BandbItems.itemPlantAmaryllisRed));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemMiscDyeBlack), new ItemStack(BandbItems.itemPlantPansy));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemPlantMarshMarigold));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemPlantButtercup));
		
		
	//Crafting recipe
			
		//Block
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockAluminium), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockAmethyst), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockOnyx), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockPlatinum), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockRuby), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockSapphire), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockTitan), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockTopaz), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemTopaz));
		
		//Ingot
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemIngotAluminium), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemNuggetAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemIngotPlatinum), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemNuggetPlatinum));
			
		// Miscellaneous
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscSurprise), " Y ", "ZXZ", " Y ",'X', new ItemStack(BandbFood.itemFruitApplePommeDuLimousin),'Y', new ItemStack (BandbBeverages.itemJuiceAppleTentation), 'Z', new ItemStack (BandbFood.itemFruitAppleGrannySmith));
		//GameRegistry.addRecipe(new ItemStack(BandbItem.itemMac), " Y ", "ZXZ", " Y ",'X', new ItemStack(Items.redstone),'Y', new ItemStack (BandbItem.itemIngotZinc), 'Z', new ItemStack(Item.getItemFromBlock(Blocks.glass)));
		//GameRegistry.addRecipe(new ItemStack(BandbItem.itemiPad), " Y ", "ZXZ", " Y ",'X', new ItemStack(Items.redstone),'Y', new ItemStack (BandbItem.itemIngotZinc), 'Z', new ItemStack(Item.getItemFromBlock(Blocks.glass)));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscBookCocktailGlass), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemToolCocktailGlass));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscBookCocktails), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemMiscBookCocktailGlass));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscBookOldFashioned), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemToolOldFashoned));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscBookShaker), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemToolShaker));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscBookTumbler), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemToolTumbler));
		
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscInkCartridgeBlack), "XXX", "XYX", "XZX",'X', new ItemStack(BandbItems.itemMiscDyeBlack),'Y', new ItemStack (BandbItems.itemMiscInkCartridgeEmpty),'Z', new ItemStack (Items.water_bucket));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscInkCartridgeCyan), "XXX", "XYX", "XZX",'X', new ItemStack(BandbItems.itemMiscDyeBlack),'Y', new ItemStack (BandbItems.itemMiscInkCartridgeEmpty),'Z', new ItemStack (Items.water_bucket));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscInkCartridgeMagenta), "XXX", "XYX", "XZX",'X', new ItemStack(Items.dye, 2, 13),'Y', new ItemStack (BandbItems.itemMiscInkCartridgeEmpty),'Z', new ItemStack (Items.water_bucket));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscInkCartridgeYellow), "XXX", "XYX", "XZX",'X', new ItemStack(Items.dye, 2, 11),'Y', new ItemStack (BandbItems.itemMiscInkCartridgeEmpty),'Z', new ItemStack (Items.water_bucket));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMiscInkCartridgeEmpty), "XXX", "XYX", "XXX",'X', new ItemStack(Items.iron_ingot),'Y', new ItemStack (Items.bucket));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "XXX", "   ", "   ",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "   ", "XXX", "   ",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "   ", "   ", "XXX",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "X  ", "X  ", "X  ",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), " X ", " X ", " X ",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "  X", "  X", "  X",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "X  ", " X ", "  X",'X', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKebabSpit, 2), "  X", " X ", "X  ",'X', new ItemStack(Items.iron_ingot));
		
					// Tea bag Empty
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), " Y ", " X ", "   ",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), "Y  ", "X  ", "   ",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), "  Y", "  X", "   ",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), "   ", "Y  ", "X  ",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), "   ", " Y ", " X ",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEmpty, 6), "   ", "  Y", "  X",'X', new ItemStack(Items.paper),'Y', new ItemStack (Items.string));
					// Tea bag Raspberry
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRaspberry, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRaspberry, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRaspberry, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Peach
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagPeach, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbFood.itemFruitPeach),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagPeach, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbFood.itemFruitPeach),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagPeach, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbFood.itemFruitPeach),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Caramel
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagCaramel, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbFood.itemIngredientCaramel),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagCaramel, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbFood.itemIngredientCaramel),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagCaramel, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbFood.itemIngredientCaramel),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Chai
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagChai, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbItems.itemTeaLeaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagChai, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbItems.itemTeaLeaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagChai, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbItems.itemTeaLeaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Earl Grey
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEarlGrey, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbFood.itemFruitLime),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEarlGrey, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbFood.itemFruitLime),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagEarlGrey, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbFood.itemFruitLime),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Lemon
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagLemon, 1), " Y ", " X ", " Z ",'X', new ItemStack(BandbFood.itemFruitLemon),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagLemon, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(BandbFood.itemFruitLemon),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagLemon, 1), "  Y", "  X", "  Z",'X', new ItemStack(BandbFood.itemFruitLemon),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Matcha Green
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagMatchaGreen, 1), " Y ", " X ", " Z ",'X', new ItemStack(Blocks.leaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagMatchaGreen, 1), "Y  ", "X  ", "Z  ",'X', new ItemStack(Blocks.leaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagMatchaGreen, 1), "  Y", "  X", "  Z",'X', new ItemStack(Blocks.leaves),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
					// Tea bag Red Fruit
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRedFruit, 1), " Y ", "VXW", " Z ",'V', new ItemStack(BandbFood.itemFruitStrawberry),'W', new ItemStack(BandbFood.itemFruitBlueBerry),'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRedFruit, 1), "Y  ", "VXW", "Z  ",'V', new ItemStack(BandbFood.itemFruitStrawberry),'W', new ItemStack(BandbFood.itemFruitBlueBerry),'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeaBagRedFruit, 1), "  Y", "VXW", "  Z",'V', new ItemStack(BandbFood.itemFruitStrawberry),'W', new ItemStack(BandbFood.itemFruitBlueBerry),'X', new ItemStack(BandbFood.itemFruitRaspberry),'Y', new ItemStack (BandbBeverages.itemTeaBagEmpty),'Z', new ItemStack (BandbBeverages.itemDriedTeaLeaves));
				
		
		//Food
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientButter), "   ", "XXX", "   ",'X', new ItemStack(BandbItems.itemToolBucketCream));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientKetchup), "XXX", "YZY", "XXX",'X', new ItemStack(BandbFood.itemVegetableTomato),'Y', new ItemStack (Items.sugar),'Z', new ItemStack (BandbBeverages.itemBottleKetchup));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientCelerySalt), "XXX", "YYY", "XXX",'X', new ItemStack(BandbFood.itemIngredientSalt),'Y', new ItemStack (BandbFood.itemVegetableCelery));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientHoney), "XXX", "XYX", "XXX",'X', new ItemStack(BandbFood.itemIngredientPollen),'Y', new ItemStack (BandbBeverages.itemBottleHoney));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodToffeeNut, 6), "XXX", "XYX", "XXX",'X', new ItemStack(BandbFood.itemIngredientCaramel),'Y', new ItemStack (BandbFood.itemFoodReastedHazelnut));
		
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientDarkChocolate), "XXX", "XXX", "   ",'X', new ItemStack(BandbFood.itemIngredientCacaoPowder));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientDarkChocolate), "   ", "XXX", "XXX",'X', new ItemStack(BandbFood.itemIngredientCacaoPowder));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientChocolate), "XXX", "XYX", "XXX",'X', new ItemStack(BandbFood.itemIngredientCacaoPowder),'Y', new ItemStack (Items.milk_bucket));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientWhiteChocolate), "XXX", "ZYZ", "XXX",'X', new ItemStack(BandbFood.itemIngredientCacaoPowder),'Y', new ItemStack (Items.milk_bucket),'Z', new ItemStack (BandbFood.itemIngredientButter));
		
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodCandyStrawberry), "XXX", "XYX", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (BandbFood.itemFruitStrawberry));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodBubbleGum), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbFood.itemFruitStrawberry));
		
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemKebabRaw), "RST", "UVW", "XYZ",'R', new ItemStack(Items.chicken),'S', new ItemStack (Items.porkchop),'T', new ItemStack (Items.beef),'U', new ItemStack (BandbFood.itemMeatGoatRaw),'V', new ItemStack (BandbFood.itemMeatZebraRaw),'W', new ItemStack (BandbFood.itemMeatPorkHamRaw),'X', new ItemStack (BandbFood.itemMeatMuttonLegRaw),'Y', new ItemStack (BandbFood.itemMeatCowRumpsteakRaw),'Z', new ItemStack (BandbFood.itemMeatCowForeRibRaw));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemIngredientWhiteSauce),'X', new ItemStack (BandbFood.itemVegetableTomato),'Y', new ItemStack (BandbFood.itemVegetableSalat),'Z', new ItemStack (BandbFood.itemBreadKebab));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemVegetableSalat),'X', new ItemStack (BandbFood.itemIngredientWhiteSauce),'Y', new ItemStack (BandbFood.itemVegetableTomato),'Z', new ItemStack (BandbFood.itemBreadKebab));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemVegetableTomato),'X', new ItemStack (BandbFood.itemVegetableSalat),'Y', new ItemStack (BandbFood.itemIngredientWhiteSauce),'Z', new ItemStack (BandbFood.itemBreadKebab));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemVegetableTomato),'X', new ItemStack (BandbFood.itemIngredientWhiteSauce),'Y', new ItemStack (BandbFood.itemVegetableSalat),'Z', new ItemStack (BandbFood.itemBreadKebab));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemVegetableSalat),'X', new ItemStack (BandbFood.itemVegetableTomato),'Y', new ItemStack (BandbFood.itemIngredientWhiteSauce),'Z', new ItemStack (BandbFood.itemBreadKebab));
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemFoodKebab), "VVV", "WXY", " Z ",'V', new ItemStack(BandbFood.itemMeatKebabCooked),'W', new ItemStack (BandbFood.itemIngredientWhiteSauce),'X', new ItemStack (BandbFood.itemVegetableSalat),'Y', new ItemStack (BandbFood.itemVegetableTomato),'Z', new ItemStack (BandbFood.itemBreadKebab));
			
		
		//Machine
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockBarrelApple), "XXX", "YYY", "XXX",'X', new ItemStack(item.sugar),'Y', new ItemStack (Items.bucket));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockBarrelOak), "XXX", "ZYZ", "XXX",'X', new ItemStack(Blocks.),'Y', new ItemStack (Items.bucket));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockBottleCaster), "XXX", "ZYZ", "XXX",'X', new ItemStack(Blocks.iron_block),'Y', new ItemStack (Blocks.redstone_block),'Z', new ItemStack (TFItems.ingotEnderium));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockCocktailBar), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockCoffeeMaker), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockCottonCandyMachine), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockDrier), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockKebabStand), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockLabelMachine), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockPress), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockPrinter), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
		
	//	GameRegistry.addRecipe(new ItemStack(BandbMachines.blockSyrupMachine), "XXX", "ZYZ", "XXX",'X', new ItemStack(Items.sugar),'Y', new ItemStack (Items.slime_ball),'Z', new ItemStack (BandbItems.itemStrawberry));
	
		
		
		
		
		
		
		
		//aluminium
			//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAluminium), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAluminium), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateAluminium), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsAluminium), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAluminium), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAluminium), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));
		
		//amethyst
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAmethyst), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemGemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAmethyst), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemGemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateAmethyst), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsAmethyst), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemGemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAmethyst), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemGemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAmethyst), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemGemAmethyst));			
		
		//emerald
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetEmerald), "XXX", "X X", "   ",'X', new ItemStack(Items.emerald));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetEmerald), "   ", "XXX", "X X",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateEmerald), "X X", "XXX", "XXX",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsEmerald), "XXX", "X X", "X X",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsEmerald), "X X", "X X", "   ",'X', new ItemStack(Items.emerald));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsEmerald), "   ", "X X", "X X",'X', new ItemStack(Items.emerald));
						
		//onyx
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetOnyx), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemGemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetOnyx), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemGemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateOnyx), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsOnyx), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemGemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsOnyx), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemGemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsOnyx), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemGemOnyx));
		
		//platinum
			//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPlatinum), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPlatinum), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplatePlatinum), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsPlatinum), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPlatinum), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPlatinum), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
					
		//ruby
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetRuby), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemGemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetRuby), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemGemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateRuby), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsRuby), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemGemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsRuby), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemGemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsRuby), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemGemRuby));
			
		//sapphire
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetSapphire), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemGemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetSapphire), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemGemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateSapphire), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemGemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsSapphire), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemGemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsSapphire), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemGemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsSapphire), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemGemSapphire));
		
	
		//titan
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetTitan), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetTitan), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateTitan), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsTitan), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsTitan), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsTitan), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
				
					
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemPlantAmanitaMuscaria), "   ", "   ", "  Y", 'Y', new ItemStack(BandbItems.itemToolKnifeIron));
		
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolGodeBlue), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemGemSapphire), 'X', new ItemStack (BandbItems.itemPlantOrchid));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolGodePink), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemGemRuby, 2), 'X', new ItemStack (BandbItems.itemPlantAmaryllisPink));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolGodePurple), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemGemAmethyst), 'X', new ItemStack (BandbItems.itemPlantSyringa));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolGodeRed), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemGemRuby), 'X', new ItemStack (BandbItems.itemPlantAmaryllisRed));
		
		//Kitchen Tools
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolFlyingPan), " XX", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolCheeseGrater), "X X", " X ", "X X", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolCheeseKnife), "  X", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolCleaverIron), "XXX", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolCookieCutterCircle), " X ", "X X", " X ", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolCookieCutterSquare), " XXX", "X X", "XXX", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolFoforkStone), "X X", " Y ", "XYX", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemToolKnifeIron), "   ", " X ", " Y ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockFurnitureKitchenWorktopA), "YYY", "XXX", "XXX", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Blocks.stone));
		
		//Mug and Teapot
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), "   ", " XY", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), " XY", "   ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), "   ", "   ", "XY ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), "   ", "   ", " XY", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), "   ", "XY ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCupCoffeeEmpty ,2), "XY ", "   ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemTeapot), "X  ", " XX", " XX", 'X', new ItemStack (Items.iron_ingot));
		//Capsules
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleArpeggioEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,5),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleBukeelaKaEthiopiaEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeWhite));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleCapriccioEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeBlack));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleCosiEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'X', new ItemStack (Items.dye,1,2));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinatoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinatoLungoEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeWhite));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinatoIntensoEmpty, 32), "XXX", "XYX", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeBlack));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDharkanEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,6),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDulsaoDoBrasilEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,11),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeWhite));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleFortissioLungoEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeWhite));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleIndriyaFromIndiaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleKazaarEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (BandbItems.itemMiscDyeBlue),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleLinizioLungoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleLivantoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemMiscDyeBlack));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRistrettoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (BandbItems.itemMiscDyeBlack),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRomaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,7),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRosabayaDeColombiaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,9),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleVivaltoLungoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,12),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleVollutoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,11),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleArpeggio, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeArabicasGround),'Y', new ItemStack (BandbBeverages.itemCapsuleArpeggioEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleBukeelaKaEthiopia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeBlueMountainGround),'Y', new ItemStack (BandbBeverages.itemCapsuleBukeelaKaEthiopiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleCapriccio, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeBourbonPointuGround),'Y', new ItemStack (BandbBeverages.itemCapsuleCapriccioEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleCosi, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeCatturaGround),'Y', new ItemStack (BandbBeverages.itemCapsuleCosiEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinato, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeHarrarGround),'Y', new ItemStack (BandbBeverages.itemCapsuleDecaffeinatoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinatoIntenso, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeHuehuetenangoGround),'Y', new ItemStack (BandbBeverages.itemCapsuleDecaffeinatoIntensoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDecaffeinatoLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeJavaGround),'Y', new ItemStack (BandbBeverages.itemCapsuleDecaffeinatoLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDharkan, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeKenyaAAGround),'Y', new ItemStack (BandbBeverages.itemCapsuleDharkanEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleDulsaoDoBrasil, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeKonaGround),'Y', new ItemStack (BandbBeverages.itemCapsuleDulsaoDoBrasilEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleFortissioLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeKontirWildForestGround),'Y', new ItemStack (BandbBeverages.itemCapsuleFortissioLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleIndriyaFromIndia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeKopiLuwakGround),'Y', new ItemStack (BandbBeverages.itemCapsuleIndriyaFromIndiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleKazaar, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeKupeAlamidGround),'Y', new ItemStack (BandbBeverages.itemCapsuleKazaarEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleLinizioLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeMokaGround),'Y', new ItemStack (BandbBeverages.itemCapsuleLinizioLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleLivanto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeMundoNovoGround),'Y', new ItemStack (BandbBeverages.itemCapsuleLivantoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRistretto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeMuragogypeGround),'Y', new ItemStack (BandbBeverages.itemCapsuleRistrettoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRoma, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeePeaberryGround),'Y', new ItemStack (BandbBeverages.itemCapsuleRomaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleRosabayaDeColombia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeTarrazuGround),'Y', new ItemStack (BandbBeverages.itemCapsuleRosabayaDeColombiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleVivaltoLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeTorajaKalossiGround),'Y', new ItemStack (BandbBeverages.itemCapsuleVivaltoLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbBeverages.itemCapsuleVolluto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbBeverages.itemCoffeeYirgacheffeGround),'Y', new ItemStack (BandbBeverages.itemCapsuleVollutoEmpty));
		
		
		//Guy
		
		/*
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemTeapot), 
				new Object[] {"STT", "UVW", "XYZ",
				'S', TFItems.ingotCopper,
				'T', TFItems.ingotLead,
				'U', new ItemStack (BandbItems.itemPowerCoilMithril),
				'V', BandbItems.itemTeapot,
				'W', new ItemStack (Blocks.iron_block),
				'X', new ItemStack (BandbItems.itemPneumaticServoPainite),
				'Y', new ItemStack (Items.redstone),
				'Z', new ItemStack (BandbItems.itemBattery)});
		/*
		GameRegistry.addRecipe(new ItemStack(BandbItem.itemTeapot), new Object[] { "AAH", "BGF","CDE" 
				, 'A' , TFItems.ingotCopper
				, 'B' , TFItems.ingotLead
				, 'C' , new ItemStack (BandbItem.itemPowerCoilMithril)
				, 'D' , new ItemStack (BandbItem.itemPneumaticServoPainite)
				, 'E' , new ItemStack (Blocks.iron_block)
				, 'F' , new ItemStack (Items.redstone)
				, 'G' , new ItemStack (BandbItem.itemBattery)


		});
		/*
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockPrinter), "STT", "UVW", "XYZ",'S', (Items.gold_ingot),'T', (Items.diamond),'U', new ItemStack (BandbItem.itemPowerCoilAmethyst),'V', (TFBlocks.blockFluidAerotheum),'W', new ItemStack (BandbBlock.blockOpal),'X', new ItemStack (BandbItem.itemPneumaticServoZinc),'Y', new ItemStack (Items.redstone),'Z', new ItemStack (BandbItem.itemGearNatrium));
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockPress), "STT", "UVW", "XYZ",'S', (TFItems.ingotTin),'T', (TFItems.ingotSilver),'U', new ItemStack (BandbItem.itemPowerCoilAluminium),'V', (TFBlocks.blockFluidCoal),'W', new ItemStack (BandbBlock.blockPlatinum),'X', new ItemStack (BandbItem.itemPneumaticServoRuby),'Y', new ItemStack (Items.redstone),'Z', new ItemStack (BandbItem.itemGearSteel));
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockOvenIdle), "STT", "UVW", "XYZ",'S', (TFItems.ingotElectrum),'T', (TFItems.ingotBronze),'U', new ItemStack (BandbItem.itemPowerCoilNickel),'V', (TFBlocks.blockFluidCryotheum),'W', new ItemStack (BandbBlock.blockTopaz),'X', new ItemStack (BandbItem.itemPneumaticServoTopaz),'Y', new ItemStack (Items.glowstone_dust),'Z', new ItemStack (BandbItem.itemGearTungsten));
		 */
		//Other
		GameRegistry.addRecipe(new ItemStack(BandbFood.itemIngredientCottonCandySugar, 3), "XXX", "XYX", "XXX", 'X', new ItemStack(Items.dye,1,13),'Y', new ItemStack (Items.sugar));
		
	}
	
	public static void loaderFurnaceRecipe(){
		GameRegistry.addSmelting(BandbFood.itemMeatZebraRaw, new ItemStack(BandbFood.itemMeatZebraCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemMeatGoatRaw, new ItemStack(BandbFood.itemMeatGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemMeatPorkForeLoinRaw, new ItemStack(BandbFood.itemMeatPorkForeLoinCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemMeatPorkHamRaw, new ItemStack(BandbFood.itemMeatPorkHamCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemMeatPorkLoinChopsRaw, new ItemStack(BandbFood.itemMeatPorkLoinChopsCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemMeatGoatRaw, new ItemStack(BandbFood.itemMeatGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbFood.itemFruitNuts, new ItemStack(BandbFood.itemFoodReastedHazelnut, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemPlantSunflowerSeed, new ItemStack(BandbFood.itemFoodSunflowerSeedRoasted, 1), 0.5F);
		
	}


}
