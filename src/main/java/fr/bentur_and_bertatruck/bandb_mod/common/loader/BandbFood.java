package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemFruit;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemIngredient;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemMeatCooked;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemMeatRaw;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemProcessedFood;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemVegetable;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandbFood {
	
	//ingredients
	public static Item itemIngredientBlackPepper, itemIngredientButter, itemIngredientCacaoPowder, itemIngredientCaramel, itemIngredientCelerySalt;
	public static Item itemIngredientChocolate, itemIngredientCottonCandySugar, itemIngredientCurry, itemIngredientCurryLeafDried, itemIngredientDarkChocolate;
	public static Item itemIngredientFlourBarley, itemIngredientFlourBuckwheat, itemIngredientFlourCorn, itemIngredientFlourFonio, itemIngredientFlourHemp;
	public static Item itemIngredientFlourHop, itemIngredientFlourMalt, itemIngredientFlourMillet, itemIngredientFlourOats, itemIngredientFlourRye;
	public static Item itemIngredientFlourSorghum, itemIngredientFlourSpelt, itemIngredientHoney, itemIngredientIceCube, itemIngredientKetchup;
	public static Item itemIngredientLeaveCocaDried, itemIngredientMayonnaise, itemIngredientMustardSauce, itemIngredientSaltedCaramel, itemIngredientSliverCheese;
	public static Item itemIngredientSliverOnion, itemIngredientSliverTomato, itemIngredientTobaccoDried, itemIngredientWhiteChocolate, itemIngredientWhiteSauce;
	
	/** To do **/
	public static Item itemIngredientSalt, itemIngredientPollen;
	/** end To do **/
	
	//processed food
	public static Item itemFoodApplePie, itemFoodBlackForest, itemFoodBounty, itemFoodBubbleGum, itemFoodCandyCane;
	public static Item itemFoodCandyStrawberry, itemFoodCotonCandy, itemFoodCremeBrulee, itemFoodGum;
	public static Item itemFoodIceCreamVanilla, itemFoodJamCurrant, itemFoodJamOrange, itemFoodKinderSurprise, itemFoodLemonPie;
	public static Item itemFoodMacaron, itemFoodMallow, itemFoodMars, itemFoodPretzel, itemFoodReastedHazelnut;
	public static Item itemFoodSpeculoos, itemFoodSunflowerSeedRoasted, itemFoodTiramisu, itemFoodToffeeApple, itemFoodToffeeNut;
	
		//Lu 
	public static Item itemFoodLuBarquetteAbricot, itemFoodLuBarreGranny, itemFoodLuCoquelineChocolat, itemFoodLuGateauCoteDOr, itemFoodLuGranola;
	public static Item itemFoodLuLuluOurson, itemFoodLuLuluOursonChoco, itemFoodLuLuluOursonChocolat, itemFoodLuMikadoChocoNoisette, itemFoodLuMikadoChocolatLait;
	public static Item itemFoodLuMikadoChocolatNoir, itemFoodLuMikadoDaim, itemFoodLuMikadoKingChoco, itemFoodLuNapolitain, itemFoodLuNapolitain3Choco;
	public static Item itemFoodLuNapolitainCaramel, itemFoodLuNapolitainChoco, itemFoodLuNapolitainClassicIndi, itemFoodLuNapolitainCoco, itemFoodLuNapolitainFramboise;
	public static Item itemFoodLuNapolitainMousse, itemFoodLuNapolitainPartage, itemFoodLuNapolitainPraline, itemFoodLuPepito, itemFoodLuPetitBeurre;
	public static Item itemFoodLuPetitCoeur, itemFoodLuPetitEcolier, itemFoodLuPetitLuBeurre, itemFoodLuPetitLuChocolat, itemFoodLuPockitosCrousti;
	public static Item itemFoodLuPockitosNoir, itemFoodLuPrince;

		//Milka
	public static Item itemFoodMilka, itemFoodMilkaCakeChoc, itemFoodMilkaCaramel, itemFoodMilkaChocoBiscuit, itemFoodMilkaChocoJelly;
	public static Item itemFoodMilkaChocoMooo, itemFoodMilkaChocoSupreme, itemFoodMilkaChocoTutti, itemFoodMilkaChocoTwist, itemFoodMilkaChocolatBlanc;
	public static Item itemFoodMilkaCrispello, itemFoodMilkaCrispelloPopcorn, itemFoodMilkaCrispelloVanille, itemFoodMilkaCrispySnax, itemFoodMilkaCrispySnaxDaim;
	public static Item itemFoodMilkaDaim, itemFoodMilkaDaimCrack, itemFoodMilkaGranola, itemFoodMilkaGrosMorceau, itemFoodMilkaGrosMorceauCaramel;
	public static Item itemFoodMilkaGrosMorceauNoistte, itemFoodMilkaGrosMorceauPraline, itemFoodMilkaInColors, itemFoodMilkaLilaStars, itemFoodMilkaLu;
	public static Item itemFoodMilkaMJoy, itemFoodMilkaMJoyCacahuete, itemFoodMilkaMJoyNoisette, itemFoodMilkaMeloCakes, itemFoodMilkaNoisettesEntieres;
	public static Item itemFoodMilkaOreo, itemFoodMilkaPullChoco, itemFoodMilkaPullChocoBarre, itemFoodMilkaPullDaim, itemFoodMilkaPullDaimBarre;
	public static Item itemFoodMilkaPullNoisette, itemFoodMilkaPullNoisetteBarre, itemFoodMilkaRizCroustillant, itemFoodMilkaTendreLait, itemFoodMilkaTendresMomentMousse;
	public static Item itemFoodMilkaTendresMomentMoussePraline, itemFoodMilkaTuc;
	
	//fruit
	public static Item itemFruitAbiu, itemFruitAfrican, itemFruitAllspice, itemFruitAlmond, itemFruitAmla;
	public static Item itemFruitAnise, itemFruitApricot, itemFruitBael, itemFruitBanana, itemFruitBananaPlantain;
	public static Item itemFruitBayLaurel, itemFruitBer, itemFruitBlackBerry, itemFruitBlackCherry, itemFruitBlackcurrant;
	public static Item itemFruitBlackthorn, itemFruitBloodOrange, itemFruitBlueBerry, itemFruitBrazilNut, itemFruitBreadNut;
	public static Item itemFruitBunyaNut, itemFruitButternut, itemFruitCacao, itemFruitCherry, itemFruitChestnut;
	public static Item itemFruitCinnamon, itemFruitClementine, itemFruitClove, itemFruitCoconut, itemFruitCranberry;
	public static Item itemFruitCurrant, itemFruitDamsonPlum, itemFruitDate, itemFruitDragonfruit, itemFruitElderberry;
	public static Item itemFruitFig, itemFruitGingkoNut, itemFruitGrapefruit, itemFruitGrapefruitPink, itemFruitGuava;
	public static Item itemFruitHuckleberries, itemFruitJackfruit, itemFruitJujube, itemFruitKiwi, itemFruitKumquat;
	public static Item itemFruitLemon, itemFruitLime, itemFruitLongan, itemFruitLoquat, itemFruitLychee;
	public static Item itemFruitMacadamia, itemFruitMameySapote, itemFruitMango, itemFruitMangosteen, itemFruitMirabelle;
	public static Item itemFruitMorelloCherry, itemFruitNectarine, itemFruitNutmeg, itemFruitNuts, itemFruitOhiaAi;
	public static Item itemFruitOrange, itemFruitOsageOrange, itemFruitPapaya, itemFruitParadiseNut, itemFruitPassionfruit;
	public static Item itemFruitPeach, itemFruitPear, itemFruitPersimmon, itemFruitPineNut, itemFruitPineappleCayenne;
	public static Item itemFruitPineappleVictoria, itemFruitPlum, itemFruitPomegranate, itemFruitPomelo, itemFruitPricklyPear;
	public static Item itemFruitQuince, itemFruitRaspberry, itemFruitRedBanana, itemFruitRhubarb, itemFruitSapodilla;
	public static Item itemFruitSatsuma, itemFruitSoursop, itemFruitStarAnise, itemFruitStrawberry, itemFruitTamarillo;
	public static Item itemFruitTangerine, itemFruitTonkaBean, itemFruitVanilla, itemFruitWalnut, itemFruitWhitePeach;
	public static Item itemFruitWildStrawberry;
		//apple
	public static Item itemFruitAppleAntares, itemFruitAppleAriane, itemFruitAppleBelchardChancelier, itemFruitAppleBelleDeBoskoop, itemFruitAppleBraeburn;
	public static Item itemFruitAppleElstar, itemFruitAppleFuji, itemFruitAppleGala, itemFruitAppleGolden, itemFruitAppleGrannySmith;
	public static Item itemFruitAppleHoneycrunch, itemFruitAppleJazz, itemFruitAppleJonagoldJonagored, itemFruitAppleLesRouges, itemFruitApplePinkLady;
	public static Item itemFruitApplePommeDuLimousin, itemFruitAppleReineDesReinettes, itemFruitAppleReinetteGriseDuCanada, itemFruitAppleTentation, itemFruitCrabapple;
		//Grape
	public static Item itemGrapeAbouriou, itemGrapeAleaticu, itemGrapeAligote, itemGrapeAltesse, itemGrapeAramon;
	public static Item itemGrapeArbois, itemGrapeArrufiac, itemGrapeAubinVert, itemGrapeBarbarossa, itemGrapeBergeron;
	public static Item itemGrapeBiancone, itemGrapeBiancuGentile, itemGrapeBourboulenc, itemGrapeBraquet, itemGrapeCabernetFranc;
	public static Item itemGrapeCabernetSauvignon, itemGrapeCamarese, itemGrapeCarcaghjoluBiancu, itemGrapeCarcaghjoluNeru, itemGrapeCarignan;
	public static Item itemGrapeCesar, itemGrapeChardonnay, itemGrapeChenin, itemGrapeCinsault, itemGrapeClairette;
	public static Item itemGrapeColombard, itemGrapeCot, itemGrapeCounoise, itemGrapeCourbu, itemGrapeCudiverta;
	public static Item itemGrapeDuras, itemGrapeFerServadou, itemGrapeFolleBlanche, itemGrapeGamay, itemGrapeGewurztraminer;
	public static Item itemGrapeGrenache, itemGrapeGrenacheBlanc, itemGrapeGrolleau, itemGrapeGrosMenseng, itemGrapeJacquere;
	public static Item itemGrapeLenDeLEl, itemGrapeListan, itemGrapeMaccabeu, itemGrapeMalbec, itemGrapeMalvoisie;
	public static Item itemGrapeMarsanne, itemGrapeMarselan, itemGrapeMauzac, itemGrapeMelon, itemGrapeMelonDeBourgogne;
	public static Item itemGrapeMerlot, itemGrapeMolette, itemGrapeMollard, itemGrapeMondeuse, itemGrapeMondeuseBlanche;
	public static Item itemGrapeMourvedre, itemGrapeMuscadelle, itemGrapeMuscardin, itemGrapeMuscatBlancAPetitsGrains, itemGrapeMuscatDAlexandrie;
	public static Item itemGrapeNegrette, itemGrapeNielluccio, itemGrapePagaDebiti, itemGrapePetitCourbu, itemGrapePetitMenseng;
	public static Item itemGrapePetitVerdot, itemGrapePineauDAunis, itemGrapePinotBlanc, itemGrapePinotMeunier, itemGrapePinotNoir;
	public static Item itemGrapePiquepoul, itemGrapePoulsard, itemGrapeRiesling, itemGrapeRomorantin, itemGrapeRossulaBianca;
	public static Item itemGrapeSacy, itemGrapeSauvignon, itemGrapeSavagnin, itemGrapeSemillon, itemGrapeSylvaner;
	public static Item itemGrapeSyrah, itemGrapeTannat, itemGrapeTeoulier, itemGrapeTerretNoir, itemGrapeTibouren;
	public static Item itemGrapeTressalier, itemGrapeUgniBlanc, itemGrapeVaccarese, itemGrapeVermentinu, itemGrapeViognier;
	
	//vegetable
	public static Item itemVegetableAsparagus, itemVegetableAvocado, itemVegetableBasil, itemVegetableBeet, itemVegetableBroccoli;
	public static Item itemVegetableBrusselsSprout, itemVegetableCabbage, itemVegetableCardamom, itemVegetableCarrotTouchon, itemVegetableCashew;
	public static Item itemVegetableCauliflower, itemVegetableCelery, itemVegetableCherryTomato, itemVegetableChickpea, itemVegetableChicory;
	public static Item itemVegetableChili, itemVegetableCucumber, itemVegetableEggplant, itemVegetableFlageolet, itemVegetableFrenchBeans;
	public static Item itemVegetableGarlic, itemVegetableGherkin, itemVegetableGinger, itemVegetableLeek, itemVegetableLens;
	public static Item itemVegetableOlive, itemVegetableOnion, itemVegetableParsley, itemVegetableParsnip, itemVegetablePea;
	public static Item itemVegetablePeanut, itemVegetablePistachio, itemVegetableRadish, itemVegetableRedCabbage, itemVegetableRutabaga;
	public static Item itemVegetableSalat, itemVegetableShallots, itemVegetableSpinach, itemVegetableSweetGreenPepper, itemVegetableSweetRedPepper;
	public static Item itemVegetableSweetYellowPepper, itemVegetableTomato, itemVegetableTurnip, itemVegetableZucchini;
	
	//meat 
		//raw
	public static Item itemKebabRaw, itemMeatChickenFleshRaw, itemMeatChickenFullRaw, itemMeatChickenLegRaw, itemMeatChickenNuggetRaw;
	public static Item itemMeatCowForeRibRaw, itemMeatCowRumpsteakRaw, itemMeatGoatRaw, itemMeatMuttonBrain, itemMeatMuttonLegRaw;
	public static Item itemMeatMuttonSaddleRaw, itemMeatMuttonShoulderRaw, itemMeatPorkForeLoinRaw, itemMeatPorkHamRaw, itemMeatPorkLoinChopsRaw;
	public static Item itemMeatZebraRaw, itemMeatZombieArm, itemMeatZombieFeet;

		//cooked	
	public static Item itemMeatBloodSausage, itemMeatHotDogSausageCooked, itemMeatHotDogSausageRaw, itemMeatKnack, itemMeatSaveloy;
	public static Item itemMeatChickenFleshCooked, itemMeatChickenFullCooked, itemMeatChickenLegCooked, itemMeatChickenNuggetCooked, itemMeatCowForeRibCooked;
	public static Item itemMeatCowRumpsteakCooked, itemMeatGoatCooked, itemMeatKebabCooked, itemMeatMuttonCookedBrain, itemMeatMuttonLegCooked;
	public static Item itemMeatMuttonSaddleCooked, itemMeatMuttonShoulderCooked, itemMeatPorkForeLoinCooked, itemMeatPorkHamCooked, itemMeatPorkLoinChopsCooked;
	public static Item itemMeatZebraCooked;
	
	/**To do **/
	//Cheese
	public static Item itemCheeseBleuDeCausses,itemCheeseBrie,itemCheeseGrater,itemCheeseGorgonzola,itemCheeseGruyeres;
	public static Item itemCheeseRoquefort;	
	//bread
	public static Item ItemBreadBaguette, itemBreadBurger, itemBreadGingerBread, itemBreadHotDog, itemBreadKebab, itemBreadTaco;
	//junk
	public static Item itemLogoMcDo,itemFoodBurgerCut,itemFoodBurgerCheese,itemFoodBurgerChicken;
	public static Item itemFoodBurgerBeef,iteFoodmBurgerFish,itemFoodBurgerLamb,itemFoodBurgerPork,itemFoodBurgerZombie;
	public static Item itemFoodHotDog,ItemFoodSandwichHamButter,itemFoodTaco,itemFoodWrapBeef,itemFoodWrapPork;
	public static Item itemFoodFrenchFries, itemFoodKebab;
	/** end To do **/

	public static void register(){
		//ingredient
		itemIngredientBlackPepper = new ItemIngredient().setUnlocalizedName("itemIngredientBlackPepper");
		itemIngredientButter = new ItemIngredient().setUnlocalizedName("itemIngredientButter");
		itemIngredientCacaoPowder = new ItemIngredient().setUnlocalizedName("itemIngredientCacaoPowder");
		itemIngredientCaramel = new ItemIngredient().setUnlocalizedName("itemIngredientCaramel");
		itemIngredientCelerySalt = new ItemIngredient().setUnlocalizedName("itemIngredientCelerySalt");

		GameRegistry.registerItem(itemIngredientBlackPepper, "itemIngredientBlackPepper");
		GameRegistry.registerItem(itemIngredientButter, "itemIngredientButter");
		GameRegistry.registerItem(itemIngredientCacaoPowder, "itemIngredientCacaoPowder");
		GameRegistry.registerItem(itemIngredientCaramel, "itemIngredientCaramel");
		GameRegistry.registerItem(itemIngredientCelerySalt, "itemIngredientCelerySalt");

		itemIngredientChocolate = new ItemIngredient().setUnlocalizedName("itemIngredientChocolate");
		itemIngredientCottonCandySugar = new ItemIngredient().setUnlocalizedName("itemIngredientCottonCandySugar");
		itemIngredientCurry = new ItemIngredient().setUnlocalizedName("itemIngredientCurry");
		itemIngredientCurryLeafDried = new ItemIngredient().setUnlocalizedName("itemIngredientCurryLeafDried");
		itemIngredientDarkChocolate = new ItemIngredient().setUnlocalizedName("itemIngredientDarkChocolate");

		GameRegistry.registerItem(itemIngredientChocolate, "itemIngredientChocolate");
		GameRegistry.registerItem(itemIngredientCottonCandySugar, "itemIngredientCottonCandySugar");
		GameRegistry.registerItem(itemIngredientCurry, "itemIngredientCurry");
		GameRegistry.registerItem(itemIngredientCurryLeafDried, "itemIngredientCurryLeafDried");
		GameRegistry.registerItem(itemIngredientDarkChocolate, "itemIngredientDarkChocolate");

		itemIngredientFlourBarley = new ItemIngredient().setUnlocalizedName("itemIngredientFlourBarley");
		itemIngredientFlourBuckwheat = new ItemIngredient().setUnlocalizedName("itemIngredientFlourBuckwheat");
		itemIngredientFlourCorn = new ItemIngredient().setUnlocalizedName("itemIngredientFlourCorn");
		itemIngredientFlourFonio = new ItemIngredient().setUnlocalizedName("itemIngredientFlourFonio");
		itemIngredientFlourHemp = new ItemIngredient().setUnlocalizedName("itemIngredientFlourHemp");

		GameRegistry.registerItem(itemIngredientFlourBarley, "itemIngredientFlourBarley");
		GameRegistry.registerItem(itemIngredientFlourBuckwheat, "itemIngredientFlourBuckwheat");
		GameRegistry.registerItem(itemIngredientFlourCorn, "itemIngredientFlourCorn");
		GameRegistry.registerItem(itemIngredientFlourFonio, "itemIngredientFlourFonio");
		GameRegistry.registerItem(itemIngredientFlourHemp, "itemIngredientFlourHemp");

		itemIngredientFlourHop = new ItemIngredient().setUnlocalizedName("itemIngredientFlourHop");
		itemIngredientFlourMalt = new ItemIngredient().setUnlocalizedName("itemIngredientFlourMalt");
		itemIngredientFlourMillet = new ItemIngredient().setUnlocalizedName("itemIngredientFlourMillet");
		itemIngredientFlourOats = new ItemIngredient().setUnlocalizedName("itemIngredientFlourOats");
		itemIngredientFlourRye = new ItemIngredient().setUnlocalizedName("itemIngredientFlourRye");

		GameRegistry.registerItem(itemIngredientFlourHop, "itemIngredientFlourHop");
		GameRegistry.registerItem(itemIngredientFlourMalt, "itemIngredientFlourMalt");
		GameRegistry.registerItem(itemIngredientFlourMillet, "itemIngredientFlourMillet");
		GameRegistry.registerItem(itemIngredientFlourOats, "itemIngredientFlourOats");
		GameRegistry.registerItem(itemIngredientFlourRye, "itemIngredientFlourRye");

		itemIngredientFlourSorghum = new ItemIngredient().setUnlocalizedName("itemIngredientFlourSorghum");
		itemIngredientFlourSpelt = new ItemIngredient().setUnlocalizedName("itemIngredientFlourSpelt");
		itemIngredientHoney = new ItemIngredient().setUnlocalizedName("itemIngredientHoney");
		itemIngredientIceCube = new ItemIngredient().setUnlocalizedName("itemIngredientIceCube");
		itemIngredientKetchup = new ItemIngredient().setUnlocalizedName("itemIngredientKetchup");

		GameRegistry.registerItem(itemIngredientFlourSorghum, "itemIngredientFlourSorghum");
		GameRegistry.registerItem(itemIngredientFlourSpelt, "itemIngredientFlourSpelt");
		GameRegistry.registerItem(itemIngredientHoney, "itemIngredientHoney");
		GameRegistry.registerItem(itemIngredientIceCube, "itemIngredientIceCube");
		GameRegistry.registerItem(itemIngredientKetchup, "itemIngredientKetchup");

		itemIngredientLeaveCocaDried = new ItemIngredient().setUnlocalizedName("itemIngredientLeaveCocaDried");
		itemIngredientMayonnaise = new ItemIngredient().setUnlocalizedName("itemIngredientMayonnaise");
		itemIngredientMustardSauce = new ItemIngredient().setUnlocalizedName("itemIngredientMustardSauce");
		itemIngredientSaltedCaramel = new ItemIngredient().setUnlocalizedName("itemIngredientSaltedCaramel");
		itemIngredientSliverCheese = new ItemIngredient().setUnlocalizedName("itemIngredientSliverCheese");

		GameRegistry.registerItem(itemIngredientLeaveCocaDried, "itemIngredientLeaveCocaDried");
		GameRegistry.registerItem(itemIngredientMayonnaise, "itemIngredientMayonnaise");
		GameRegistry.registerItem(itemIngredientMustardSauce, "itemIngredientMustardSauce");
		GameRegistry.registerItem(itemIngredientSaltedCaramel, "itemIngredientSaltedCaramel");
		GameRegistry.registerItem(itemIngredientSliverCheese, "itemIngredientSliverCheese");

		itemIngredientSliverOnion = new ItemIngredient().setUnlocalizedName("itemIngredientSliverOnion");
		itemIngredientSliverTomato = new ItemIngredient().setUnlocalizedName("itemIngredientSliverTomato");
		itemIngredientTobaccoDried = new ItemIngredient().setUnlocalizedName("itemIngredientTobaccoDried");
		itemIngredientWhiteChocolate = new ItemIngredient().setUnlocalizedName("itemIngredientWhiteChocolate");
		itemIngredientWhiteSauce = new ItemIngredient().setUnlocalizedName("itemIngredientWhiteSauce");

		GameRegistry.registerItem(itemIngredientSliverOnion, "itemIngredientSliverOnion");
		GameRegistry.registerItem(itemIngredientSliverTomato, "itemIngredientSliverTomato");
		GameRegistry.registerItem(itemIngredientTobaccoDried, "itemIngredientTobaccoDried");
		GameRegistry.registerItem(itemIngredientWhiteChocolate, "itemIngredientWhiteChocolate");
		GameRegistry.registerItem(itemIngredientWhiteSauce, "itemIngredientWhiteSauce");
		
	//processed food
		itemFoodApplePie = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodApplePie");
		itemFoodBlackForest = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodBlackForest");
		itemFoodBounty = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodBounty");
		itemFoodBubbleGum = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodBubbleGum");
		itemFoodCandyCane = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodCandyCane");

		GameRegistry.registerItem(itemFoodApplePie, "itemFoodApplePie");
		GameRegistry.registerItem(itemFoodBlackForest, "itemFoodBlackForest");
		GameRegistry.registerItem(itemFoodBounty, "itemFoodBounty");
		GameRegistry.registerItem(itemFoodBubbleGum, "itemFoodBubbleGum");
		GameRegistry.registerItem(itemFoodCandyCane, "itemFoodCandyCane");

		itemFoodCandyStrawberry = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodCandyStrawberry");
		itemFoodCotonCandy = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodCotonCandy");
		itemFoodCremeBrulee = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodCremeBrulee");
		itemFoodGum = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodGum");

		GameRegistry.registerItem(itemFoodCandyStrawberry, "itemFoodCandyStrawberry");
		GameRegistry.registerItem(itemFoodCotonCandy, "itemFoodCotonCandy");
		GameRegistry.registerItem(itemFoodCremeBrulee, "itemFoodCremeBrulee");
		GameRegistry.registerItem(itemFoodGum, "itemFoodGum");

		itemFoodIceCreamVanilla = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodIceCreamVanilla");
		itemFoodJamCurrant = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodJamCurrant");
		itemFoodJamOrange = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodJamOrange");
		itemFoodKinderSurprise = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodKinderSurprise");
		itemFoodLemonPie = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLemonPie");

		GameRegistry.registerItem(itemFoodIceCreamVanilla, "itemFoodIceCreamVanilla");
		GameRegistry.registerItem(itemFoodJamCurrant, "itemFoodJamCurrant");
		GameRegistry.registerItem(itemFoodJamOrange, "itemFoodJamOrange");
		GameRegistry.registerItem(itemFoodKinderSurprise, "itemFoodKinderSurprise");
		GameRegistry.registerItem(itemFoodLemonPie, "itemFoodLemonPie");

		itemFoodMacaron = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMacaron");
		itemFoodMallow = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMallow");
		itemFoodMars = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMars");
		itemFoodPretzel = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodPretzel");
		itemFoodReastedHazelnut = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodReastedHazelnut");

		GameRegistry.registerItem(itemFoodMacaron, "itemFoodMacaron");
		GameRegistry.registerItem(itemFoodMallow, "itemFoodMallow");
		GameRegistry.registerItem(itemFoodMars, "itemFoodMars");
		GameRegistry.registerItem(itemFoodPretzel, "itemFoodPretzel");
		GameRegistry.registerItem(itemFoodReastedHazelnut, "itemFoodReastedHazelnut");

		itemFoodSpeculoos = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodSpeculoos");
		itemFoodSunflowerSeedRoasted = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodSunflowerSeedRoasted");
		itemFoodTiramisu = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodTiramisu");
		itemFoodToffeeApple = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodToffeeApple");
		itemFoodToffeeNut = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodToffeeNut");

		GameRegistry.registerItem(itemFoodSpeculoos, "itemFoodSpeculoos");
		GameRegistry.registerItem(itemFoodSunflowerSeedRoasted, "itemFoodSunflowerSeedRoasted");
		GameRegistry.registerItem(itemFoodTiramisu, "itemFoodTiramisu");
		GameRegistry.registerItem(itemFoodToffeeApple, "itemFoodToffeeApple");
		GameRegistry.registerItem(itemFoodToffeeNut, "itemFoodToffeeNut");

		//Lu 
		itemFoodLuBarquetteAbricot = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuBarquetteAbricot");
		itemFoodLuBarreGranny = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuBarreGranny");
		itemFoodLuCoquelineChocolat = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuCoquelineChocolat");
		itemFoodLuGateauCoteDOr = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuGateauCoteDOr");
		itemFoodLuGranola = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuGranola");

		GameRegistry.registerItem(itemFoodLuBarquetteAbricot, "itemFoodLuBarquetteAbricot");
		GameRegistry.registerItem(itemFoodLuBarreGranny, "itemFoodLuBarreGranny");
		GameRegistry.registerItem(itemFoodLuCoquelineChocolat, "itemFoodLuCoquelineChocolat");
		GameRegistry.registerItem(itemFoodLuGateauCoteDOr, "itemFoodLuGateauCoteDOr");
		GameRegistry.registerItem(itemFoodLuGranola, "itemFoodLuGranola");

		itemFoodLuLuluOurson = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuLuluOurson");
		itemFoodLuLuluOursonChoco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuLuluOursonChoco");
		itemFoodLuLuluOursonChocolat = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuLuluOursonChocolat");
		itemFoodLuMikadoChocoNoisette = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuMikadoChocoNoisette");
		itemFoodLuMikadoChocolatLait = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuMikadoChocolatLait");

		GameRegistry.registerItem(itemFoodLuLuluOurson, "itemFoodLuLuluOurson");
		GameRegistry.registerItem(itemFoodLuLuluOursonChoco, "itemFoodLuLuluOursonChoco");
		GameRegistry.registerItem(itemFoodLuLuluOursonChocolat, "itemFoodLuLuluOursonChocolat");
		GameRegistry.registerItem(itemFoodLuMikadoChocoNoisette, "itemFoodLuMikadoChocoNoisette");
		GameRegistry.registerItem(itemFoodLuMikadoChocolatLait, "itemFoodLuMikadoChocolatLait");

		itemFoodLuMikadoChocolatNoir = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuMikadoChocolatNoir");
		itemFoodLuMikadoDaim = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuMikadoDaim");
		itemFoodLuMikadoKingChoco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuMikadoKingChoco");
		itemFoodLuNapolitain = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitain");
		itemFoodLuNapolitain3Choco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitain3Choco");

		GameRegistry.registerItem(itemFoodLuMikadoChocolatNoir, "itemFoodLuMikadoChocolatNoir");
		GameRegistry.registerItem(itemFoodLuMikadoDaim, "itemFoodLuMikadoDaim");
		GameRegistry.registerItem(itemFoodLuMikadoKingChoco, "itemFoodLuMikadoKingChoco");
		GameRegistry.registerItem(itemFoodLuNapolitain, "itemFoodLuNapolitain");
		GameRegistry.registerItem(itemFoodLuNapolitain3Choco, "itemFoodLuNapolitain3Choco");

		itemFoodLuNapolitainCaramel = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainCaramel");
		itemFoodLuNapolitainChoco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainChoco");
		itemFoodLuNapolitainClassicIndi = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainClassicIndi");
		itemFoodLuNapolitainCoco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainCoco");
		itemFoodLuNapolitainFramboise = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainFramboise");

		GameRegistry.registerItem(itemFoodLuNapolitainCaramel, "itemFoodLuNapolitainCaramel");
		GameRegistry.registerItem(itemFoodLuNapolitainChoco, "itemFoodLuNapolitainChoco");
		GameRegistry.registerItem(itemFoodLuNapolitainClassicIndi, "itemFoodLuNapolitainClassicIndi");
		GameRegistry.registerItem(itemFoodLuNapolitainCoco, "itemFoodLuNapolitainCoco");
		GameRegistry.registerItem(itemFoodLuNapolitainFramboise, "itemFoodLuNapolitainFramboise");

		itemFoodLuNapolitainMousse = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainMousse");
		itemFoodLuNapolitainPartage = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainPartage");
		itemFoodLuNapolitainPraline = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuNapolitainPraline");
		itemFoodLuPepito = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPepito");
		itemFoodLuPetitBeurre = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPetitBeurre");

		GameRegistry.registerItem(itemFoodLuNapolitainMousse, "itemFoodLuNapolitainMousse");
		GameRegistry.registerItem(itemFoodLuNapolitainPartage, "itemFoodLuNapolitainPartage");
		GameRegistry.registerItem(itemFoodLuNapolitainPraline, "itemFoodLuNapolitainPraline");
		GameRegistry.registerItem(itemFoodLuPepito, "itemFoodLuPepito");
		GameRegistry.registerItem(itemFoodLuPetitBeurre, "itemFoodLuPetitBeurre");

		itemFoodLuPetitCoeur = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPetitCoeur");
		itemFoodLuPetitEcolier = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPetitEcolier");
		itemFoodLuPetitLuBeurre = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPetitLuBeurre");
		itemFoodLuPetitLuChocolat = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPetitLuChocolat");
		itemFoodLuPockitosCrousti = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPockitosCrousti");

		GameRegistry.registerItem(itemFoodLuPetitCoeur, "itemFoodLuPetitCoeur");
		GameRegistry.registerItem(itemFoodLuPetitEcolier, "itemFoodLuPetitEcolier");
		GameRegistry.registerItem(itemFoodLuPetitLuBeurre, "itemFoodLuPetitLuBeurre");
		GameRegistry.registerItem(itemFoodLuPetitLuChocolat, "itemFoodLuPetitLuChocolat");
		GameRegistry.registerItem(itemFoodLuPockitosCrousti, "itemFoodLuPockitosCrousti");

		itemFoodLuPockitosNoir = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPockitosNoir");
		itemFoodLuPrince = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodLuPrince");

		GameRegistry.registerItem(itemFoodLuPockitosNoir, "itemFoodLuPockitosNoir");
		GameRegistry.registerItem(itemFoodLuPrince, "itemFoodLuPrince");

		//Milka
		itemFoodMilka = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilka");
		itemFoodMilkaCakeChoc = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCakeChoc");
		itemFoodMilkaCaramel = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCaramel");
		itemFoodMilkaChocoBiscuit = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoBiscuit");
		itemFoodMilkaChocoJelly = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoJelly");

		GameRegistry.registerItem(itemFoodMilka, "itemFoodMilka");
		GameRegistry.registerItem(itemFoodMilkaCakeChoc, "itemFoodMilkaCakeChoc");
		GameRegistry.registerItem(itemFoodMilkaCaramel, "itemFoodMilkaCaramel");
		GameRegistry.registerItem(itemFoodMilkaChocoBiscuit, "itemFoodMilkaChocoBiscuit");
		GameRegistry.registerItem(itemFoodMilkaChocoJelly, "itemFoodMilkaChocoJelly");

		itemFoodMilkaChocoMooo = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoMooo");
		itemFoodMilkaChocoSupreme = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoSupreme");
		itemFoodMilkaChocoTutti = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoTutti");
		itemFoodMilkaChocoTwist = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocoTwist");
		itemFoodMilkaChocolatBlanc = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaChocolatBlanc");

		GameRegistry.registerItem(itemFoodMilkaChocoMooo, "itemFoodMilkaChocoMooo");
		GameRegistry.registerItem(itemFoodMilkaChocoSupreme, "itemFoodMilkaChocoSupreme");
		GameRegistry.registerItem(itemFoodMilkaChocoTutti, "itemFoodMilkaChocoTutti");
		GameRegistry.registerItem(itemFoodMilkaChocoTwist, "itemFoodMilkaChocoTwist");
		GameRegistry.registerItem(itemFoodMilkaChocolatBlanc, "itemFoodMilkaChocolatBlanc");

		itemFoodMilkaCrispello = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCrispello");
		itemFoodMilkaCrispelloPopcorn = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCrispelloPopcorn");
		itemFoodMilkaCrispelloVanille = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCrispelloVanille");
		itemFoodMilkaCrispySnax = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCrispySnax");
		itemFoodMilkaCrispySnaxDaim = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaCrispySnaxDaim");

		GameRegistry.registerItem(itemFoodMilkaCrispello, "itemFoodMilkaCrispello");
		GameRegistry.registerItem(itemFoodMilkaCrispelloPopcorn, "itemFoodMilkaCrispelloPopcorn");
		GameRegistry.registerItem(itemFoodMilkaCrispelloVanille, "itemFoodMilkaCrispelloVanille");
		GameRegistry.registerItem(itemFoodMilkaCrispySnax, "itemFoodMilkaCrispySnax");
		GameRegistry.registerItem(itemFoodMilkaCrispySnaxDaim, "itemFoodMilkaCrispySnaxDaim");

		itemFoodMilkaDaim = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaDaim");
		itemFoodMilkaDaimCrack = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaDaimCrack");
		itemFoodMilkaGranola = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaGranola");
		itemFoodMilkaGrosMorceau = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaGrosMorceau");
		itemFoodMilkaGrosMorceauCaramel = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaGrosMorceauCaramel");

		GameRegistry.registerItem(itemFoodMilkaDaim, "itemFoodMilkaDaim");
		GameRegistry.registerItem(itemFoodMilkaDaimCrack, "itemFoodMilkaDaimCrack");
		GameRegistry.registerItem(itemFoodMilkaGranola, "itemFoodMilkaGranola");
		GameRegistry.registerItem(itemFoodMilkaGrosMorceau, "itemFoodMilkaGrosMorceau");
		GameRegistry.registerItem(itemFoodMilkaGrosMorceauCaramel, "itemFoodMilkaGrosMorceauCaramel");

		itemFoodMilkaGrosMorceauNoistte = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaGrosMorceauNoistte");
		itemFoodMilkaGrosMorceauPraline = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaGrosMorceauPraline");
		itemFoodMilkaInColors = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaInColors");
		itemFoodMilkaLilaStars = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaLilaStars");
		itemFoodMilkaLu = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaLu");

		GameRegistry.registerItem(itemFoodMilkaGrosMorceauNoistte, "itemFoodMilkaGrosMorceauNoistte");
		GameRegistry.registerItem(itemFoodMilkaGrosMorceauPraline, "itemFoodMilkaGrosMorceauPraline");
		GameRegistry.registerItem(itemFoodMilkaInColors, "itemFoodMilkaInColors");
		GameRegistry.registerItem(itemFoodMilkaLilaStars, "itemFoodMilkaLilaStars");
		GameRegistry.registerItem(itemFoodMilkaLu, "itemFoodMilkaLu");

		itemFoodMilkaMJoy = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaMJoy");
		itemFoodMilkaMJoyCacahuete = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaMJoyCacahuete");
		itemFoodMilkaMJoyNoisette = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaMJoyNoisette");
		itemFoodMilkaMeloCakes = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaMeloCakes");
		itemFoodMilkaNoisettesEntieres = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaNoisettesEntieres");

		GameRegistry.registerItem(itemFoodMilkaMJoy, "itemFoodMilkaMJoy");
		GameRegistry.registerItem(itemFoodMilkaMJoyCacahuete, "itemFoodMilkaMJoyCacahuete");
		GameRegistry.registerItem(itemFoodMilkaMJoyNoisette, "itemFoodMilkaMJoyNoisette");
		GameRegistry.registerItem(itemFoodMilkaMeloCakes, "itemFoodMilkaMeloCakes");
		GameRegistry.registerItem(itemFoodMilkaNoisettesEntieres, "itemFoodMilkaNoisettesEntieres");

		itemFoodMilkaOreo = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaOreo");
		itemFoodMilkaPullChoco = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullChoco");
		itemFoodMilkaPullChocoBarre = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullChocoBarre");
		itemFoodMilkaPullDaim = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullDaim");
		itemFoodMilkaPullDaimBarre = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullDaimBarre");

		GameRegistry.registerItem(itemFoodMilkaOreo, "itemFoodMilkaOreo");
		GameRegistry.registerItem(itemFoodMilkaPullChoco, "itemFoodMilkaPullChoco");
		GameRegistry.registerItem(itemFoodMilkaPullChocoBarre, "itemFoodMilkaPullChocoBarre");
		GameRegistry.registerItem(itemFoodMilkaPullDaim, "itemFoodMilkaPullDaim");
		GameRegistry.registerItem(itemFoodMilkaPullDaimBarre, "itemFoodMilkaPullDaimBarre");

		itemFoodMilkaPullNoisette = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullNoisette");
		itemFoodMilkaPullNoisetteBarre = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaPullNoisetteBarre");
		itemFoodMilkaRizCroustillant = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaRizCroustillant");
		itemFoodMilkaTendreLait = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaTendreLait");
		itemFoodMilkaTendresMomentMousse = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaTendresMomentMousse");

		GameRegistry.registerItem(itemFoodMilkaPullNoisette, "itemFoodMilkaPullNoisette");
		GameRegistry.registerItem(itemFoodMilkaPullNoisetteBarre, "itemFoodMilkaPullNoisetteBarre");
		GameRegistry.registerItem(itemFoodMilkaRizCroustillant, "itemFoodMilkaRizCroustillant");
		GameRegistry.registerItem(itemFoodMilkaTendreLait, "itemFoodMilkaTendreLait");
		GameRegistry.registerItem(itemFoodMilkaTendresMomentMousse, "itemFoodMilkaTendresMomentMousse");

		itemFoodMilkaTendresMomentMoussePraline = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaTendresMomentMoussePraline");
		itemFoodMilkaTuc = new ItemProcessedFood(5, 1.0F, false).setUnlocalizedName("itemFoodMilkaTuc");

		GameRegistry.registerItem(itemFoodMilkaTendresMomentMoussePraline, "itemFoodMilkaTendresMomentMoussePraline");
		GameRegistry.registerItem(itemFoodMilkaTuc, "itemFoodMilkaTuc");

		//Mc Donald's
	
	//fruit
		itemFruitAbiu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAbiu");
		itemFruitAfrican = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAfrican");
		itemFruitAllspice = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAllspice");
		itemFruitAlmond = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAlmond");
		itemFruitAmla = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAmla");

		GameRegistry.registerItem(itemFruitAbiu, "itemFruitAbiu");
		GameRegistry.registerItem(itemFruitAfrican, "itemFruitAfrican");
		GameRegistry.registerItem(itemFruitAllspice, "itemFruitAllspice");
		GameRegistry.registerItem(itemFruitAlmond, "itemFruitAlmond");
		GameRegistry.registerItem(itemFruitAmla, "itemFruitAmla");

		itemFruitAnise = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAnise");
		itemFruitApricot = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitApricot");
		itemFruitBael = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBael");
		itemFruitBanana = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBanana");
		itemFruitBananaPlantain = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBananaPlantain");

		GameRegistry.registerItem(itemFruitAnise, "itemFruitAnise");
		GameRegistry.registerItem(itemFruitApricot, "itemFruitApricot");
		GameRegistry.registerItem(itemFruitBael, "itemFruitBael");
		GameRegistry.registerItem(itemFruitBanana, "itemFruitBanana");
		GameRegistry.registerItem(itemFruitBananaPlantain, "itemFruitBananaPlantain");

		itemFruitBayLaurel = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBayLaurel");
		itemFruitBer = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBer");
		itemFruitBlackBerry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBlackBerry");
		itemFruitBlackCherry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBlackCherry");
		itemFruitBlackcurrant = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBlackcurrant");

		GameRegistry.registerItem(itemFruitBayLaurel, "itemFruitBayLaurel");
		GameRegistry.registerItem(itemFruitBer, "itemFruitBer");
		GameRegistry.registerItem(itemFruitBlackBerry, "itemFruitBlackBerry");
		GameRegistry.registerItem(itemFruitBlackCherry, "itemFruitBlackCherry");
		GameRegistry.registerItem(itemFruitBlackcurrant, "itemFruitBlackcurrant");

		itemFruitBlackthorn = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBlackthorn");
		itemFruitBloodOrange = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBloodOrange");
		itemFruitBlueBerry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBlueBerry");
		itemFruitBrazilNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBrazilNut");
		itemFruitBreadNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBreadNut");

		GameRegistry.registerItem(itemFruitBlackthorn, "itemFruitBlackthorn");
		GameRegistry.registerItem(itemFruitBloodOrange, "itemFruitBloodOrange");
		GameRegistry.registerItem(itemFruitBlueBerry, "itemFruitBlueBerry");
		GameRegistry.registerItem(itemFruitBrazilNut, "itemFruitBrazilNut");
		GameRegistry.registerItem(itemFruitBreadNut, "itemFruitBreadNut");

		itemFruitBunyaNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitBunyaNut");
		itemFruitButternut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitButternut");
		itemFruitCacao = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCacao");
		itemFruitCherry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCherry");
		itemFruitChestnut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitChestnut");

		GameRegistry.registerItem(itemFruitBunyaNut, "itemFruitBunyaNut");
		GameRegistry.registerItem(itemFruitButternut, "itemFruitButternut");
		GameRegistry.registerItem(itemFruitCacao, "itemFruitCacao");
		GameRegistry.registerItem(itemFruitCherry, "itemFruitCherry");
		GameRegistry.registerItem(itemFruitChestnut, "itemFruitChestnut");

		itemFruitCinnamon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCinnamon");
		itemFruitClementine = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitClementine");
		itemFruitClove = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitClove");
		itemFruitCoconut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCoconut");
		itemFruitCranberry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCranberry");

		GameRegistry.registerItem(itemFruitCinnamon, "itemFruitCinnamon");
		GameRegistry.registerItem(itemFruitClementine, "itemFruitClementine");
		GameRegistry.registerItem(itemFruitClove, "itemFruitClove");
		GameRegistry.registerItem(itemFruitCoconut, "itemFruitCoconut");
		GameRegistry.registerItem(itemFruitCranberry, "itemFruitCranberry");

		itemFruitCurrant = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCurrant");
		itemFruitDamsonPlum = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitDamsonPlum");
		itemFruitDate = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitDate");
		itemFruitDragonfruit = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitDragonfruit");
		itemFruitElderberry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitElderberry");

		GameRegistry.registerItem(itemFruitCurrant, "itemFruitCurrant");
		GameRegistry.registerItem(itemFruitDamsonPlum, "itemFruitDamsonPlum");
		GameRegistry.registerItem(itemFruitDate, "itemFruitDate");
		GameRegistry.registerItem(itemFruitDragonfruit, "itemFruitDragonfruit");
		GameRegistry.registerItem(itemFruitElderberry, "itemFruitElderberry");

		itemFruitFig = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitFig");
		itemFruitGingkoNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitGingkoNut");
		itemFruitGrapefruit = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitGrapefruit");
		itemFruitGrapefruitPink = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitGrapefruitPink");
		itemFruitGuava = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitGuava");

		GameRegistry.registerItem(itemFruitFig, "itemFruitFig");
		GameRegistry.registerItem(itemFruitGingkoNut, "itemFruitGingkoNut");
		GameRegistry.registerItem(itemFruitGrapefruit, "itemFruitGrapefruit");
		GameRegistry.registerItem(itemFruitGrapefruitPink, "itemFruitGrapefruitPink");
		GameRegistry.registerItem(itemFruitGuava, "itemFruitGuava");

		itemFruitHuckleberries = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitHuckleberries");
		itemFruitJackfruit = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitJackfruit");
		itemFruitJujube = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitJujube");
		itemFruitKiwi = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitKiwi");
		itemFruitKumquat = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitKumquat");

		GameRegistry.registerItem(itemFruitHuckleberries, "itemFruitHuckleberries");
		GameRegistry.registerItem(itemFruitJackfruit, "itemFruitJackfruit");
		GameRegistry.registerItem(itemFruitJujube, "itemFruitJujube");
		GameRegistry.registerItem(itemFruitKiwi, "itemFruitKiwi");
		GameRegistry.registerItem(itemFruitKumquat, "itemFruitKumquat");

		itemFruitLemon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitLemon");
		itemFruitLime = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitLime");
		itemFruitLongan = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitLongan");
		itemFruitLoquat = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitLoquat");
		itemFruitLychee = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitLychee");

		GameRegistry.registerItem(itemFruitLemon, "itemFruitLemon");
		GameRegistry.registerItem(itemFruitLime, "itemFruitLime");
		GameRegistry.registerItem(itemFruitLongan, "itemFruitLongan");
		GameRegistry.registerItem(itemFruitLoquat, "itemFruitLoquat");
		GameRegistry.registerItem(itemFruitLychee, "itemFruitLychee");

		itemFruitMacadamia = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMacadamia");
		itemFruitMameySapote = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMameySapote");
		itemFruitMango = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMango");
		itemFruitMangosteen = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMangosteen");
		itemFruitMirabelle = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMirabelle");

		GameRegistry.registerItem(itemFruitMacadamia, "itemFruitMacadamia");
		GameRegistry.registerItem(itemFruitMameySapote, "itemFruitMameySapote");
		GameRegistry.registerItem(itemFruitMango, "itemFruitMango");
		GameRegistry.registerItem(itemFruitMangosteen, "itemFruitMangosteen");
		GameRegistry.registerItem(itemFruitMirabelle, "itemFruitMirabelle");

		itemFruitMorelloCherry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitMorelloCherry");
		itemFruitNectarine = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitNectarine");
		itemFruitNutmeg = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitNutmeg");
		itemFruitNuts = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitNuts");
		itemFruitOhiaAi = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitOhiaAi");

		GameRegistry.registerItem(itemFruitMorelloCherry, "itemFruitMorelloCherry");
		GameRegistry.registerItem(itemFruitNectarine, "itemFruitNectarine");
		GameRegistry.registerItem(itemFruitNutmeg, "itemFruitNutmeg");
		GameRegistry.registerItem(itemFruitNuts, "itemFruitNuts");
		GameRegistry.registerItem(itemFruitOhiaAi, "itemFruitOhiaAi");

		itemFruitOrange = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitOrange");
		itemFruitOsageOrange = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitOsageOrange");
		itemFruitPapaya = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPapaya");
		itemFruitParadiseNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitParadiseNut");
		itemFruitPassionfruit = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPassionfruit");

		GameRegistry.registerItem(itemFruitOrange, "itemFruitOrange");
		GameRegistry.registerItem(itemFruitOsageOrange, "itemFruitOsageOrange");
		GameRegistry.registerItem(itemFruitPapaya, "itemFruitPapaya");
		GameRegistry.registerItem(itemFruitParadiseNut, "itemFruitParadiseNut");
		GameRegistry.registerItem(itemFruitPassionfruit, "itemFruitPassionfruit");

		itemFruitPeach = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPeach");
		itemFruitPear = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPear");
		itemFruitPersimmon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPersimmon");
		itemFruitPineNut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPineNut");
		itemFruitPineappleCayenne = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPineappleCayenne");

		GameRegistry.registerItem(itemFruitPeach, "itemFruitPeach");
		GameRegistry.registerItem(itemFruitPear, "itemFruitPear");
		GameRegistry.registerItem(itemFruitPersimmon, "itemFruitPersimmon");
		GameRegistry.registerItem(itemFruitPineNut, "itemFruitPineNut");
		GameRegistry.registerItem(itemFruitPineappleCayenne, "itemFruitPineappleCayenne");

		itemFruitPineappleVictoria = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPineappleVictoria");
		itemFruitPlum = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPlum");
		itemFruitPomegranate = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPomegranate");
		itemFruitPomelo = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPomelo");
		itemFruitPricklyPear = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitPricklyPear");

		GameRegistry.registerItem(itemFruitPineappleVictoria, "itemFruitPineappleVictoria");
		GameRegistry.registerItem(itemFruitPlum, "itemFruitPlum");
		GameRegistry.registerItem(itemFruitPomegranate, "itemFruitPomegranate");
		GameRegistry.registerItem(itemFruitPomelo, "itemFruitPomelo");
		GameRegistry.registerItem(itemFruitPricklyPear, "itemFruitPricklyPear");

		itemFruitQuince = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitQuince");
		itemFruitRaspberry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitRaspberry");
		itemFruitRedBanana = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitRedBanana");
		itemFruitRhubarb = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitRhubarb");
		itemFruitSapodilla = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitSapodilla");

		GameRegistry.registerItem(itemFruitQuince, "itemFruitQuince");
		GameRegistry.registerItem(itemFruitRaspberry, "itemFruitRaspberry");
		GameRegistry.registerItem(itemFruitRedBanana, "itemFruitRedBanana");
		GameRegistry.registerItem(itemFruitRhubarb, "itemFruitRhubarb");
		GameRegistry.registerItem(itemFruitSapodilla, "itemFruitSapodilla");

		itemFruitSatsuma = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitSatsuma");
		itemFruitSoursop = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitSoursop");
		itemFruitStarAnise = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitStarAnise");
		itemFruitStrawberry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitStrawberry");
		itemFruitTamarillo = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitTamarillo");

		GameRegistry.registerItem(itemFruitSatsuma, "itemFruitSatsuma");
		GameRegistry.registerItem(itemFruitSoursop, "itemFruitSoursop");
		GameRegistry.registerItem(itemFruitStarAnise, "itemFruitStarAnise");
		GameRegistry.registerItem(itemFruitStrawberry, "itemFruitStrawberry");
		GameRegistry.registerItem(itemFruitTamarillo, "itemFruitTamarillo");

		itemFruitTangerine = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitTangerine");
		itemFruitTonkaBean = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitTonkaBean");
		itemFruitVanilla = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitVanilla");
		itemFruitWalnut = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitWalnut");
		itemFruitWhitePeach = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitWhitePeach");

		GameRegistry.registerItem(itemFruitTangerine, "itemFruitTangerine");
		GameRegistry.registerItem(itemFruitTonkaBean, "itemFruitTonkaBean");
		GameRegistry.registerItem(itemFruitVanilla, "itemFruitVanilla");
		GameRegistry.registerItem(itemFruitWalnut, "itemFruitWalnut");
		GameRegistry.registerItem(itemFruitWhitePeach, "itemFruitWhitePeach");

		itemFruitWildStrawberry = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitWildStrawberry");

		GameRegistry.registerItem(itemFruitWildStrawberry, "itemFruitWildStrawberry");

		//apple
		itemFruitAppleAntares = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleAntares");
		itemFruitAppleAriane = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleAriane");
		itemFruitAppleBelchardChancelier = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleBelchardChancelier");
		itemFruitAppleBelleDeBoskoop = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleBelleDeBoskoop");
		itemFruitAppleBraeburn = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleBraeburn");

		GameRegistry.registerItem(itemFruitAppleAntares, "itemFruitAppleAntares");
		GameRegistry.registerItem(itemFruitAppleAriane, "itemFruitAppleAriane");
		GameRegistry.registerItem(itemFruitAppleBelchardChancelier, "itemFruitAppleBelchardChancelier");
		GameRegistry.registerItem(itemFruitAppleBelleDeBoskoop, "itemFruitAppleBelleDeBoskoop");
		GameRegistry.registerItem(itemFruitAppleBraeburn, "itemFruitAppleBraeburn");

		itemFruitAppleElstar = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleElstar");
		itemFruitAppleFuji = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleFuji");
		itemFruitAppleGala = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleGala");
		itemFruitAppleGolden = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleGolden");
		itemFruitAppleGrannySmith = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleGrannySmith");

		GameRegistry.registerItem(itemFruitAppleElstar, "itemFruitAppleElstar");
		GameRegistry.registerItem(itemFruitAppleFuji, "itemFruitAppleFuji");
		GameRegistry.registerItem(itemFruitAppleGala, "itemFruitAppleGala");
		GameRegistry.registerItem(itemFruitAppleGolden, "itemFruitAppleGolden");
		GameRegistry.registerItem(itemFruitAppleGrannySmith, "itemFruitAppleGrannySmith");

		itemFruitAppleHoneycrunch = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleHoneycrunch");
		itemFruitAppleJazz = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleJazz");
		itemFruitAppleJonagoldJonagored = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleJonagoldJonagored");
		itemFruitAppleLesRouges = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleLesRouges");
		itemFruitApplePinkLady = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitApplePinkLady");

		GameRegistry.registerItem(itemFruitAppleHoneycrunch, "itemFruitAppleHoneycrunch");
		GameRegistry.registerItem(itemFruitAppleJazz, "itemFruitAppleJazz");
		GameRegistry.registerItem(itemFruitAppleJonagoldJonagored, "itemFruitAppleJonagoldJonagored");
		GameRegistry.registerItem(itemFruitAppleLesRouges, "itemFruitAppleLesRouges");
		GameRegistry.registerItem(itemFruitApplePinkLady, "itemFruitApplePinkLady");

		itemFruitApplePommeDuLimousin = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitApplePommeDuLimousin");
		itemFruitAppleReineDesReinettes = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleReineDesReinettes");
		itemFruitAppleReinetteGriseDuCanada = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleReinetteGriseDuCanada");
		itemFruitAppleTentation = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitAppleTentation");
		itemFruitCrabapple = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemFruitCrabapple");

		GameRegistry.registerItem(itemFruitApplePommeDuLimousin, "itemFruitApplePommeDuLimousin");
		GameRegistry.registerItem(itemFruitAppleReineDesReinettes, "itemFruitAppleReineDesReinettes");
		GameRegistry.registerItem(itemFruitAppleReinetteGriseDuCanada, "itemFruitAppleReinetteGriseDuCanada");
		GameRegistry.registerItem(itemFruitAppleTentation, "itemFruitAppleTentation");
		GameRegistry.registerItem(itemFruitCrabapple, "itemFruitCrabapple");

		//Grape
		
		itemGrapeAbouriou = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAbouriou");
		itemGrapeAleaticu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAleaticu");
		itemGrapeAligote = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAligote");
		itemGrapeAltesse = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAltesse");
		itemGrapeAramon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAramon");

		GameRegistry.registerItem(itemGrapeAbouriou, "itemGrapeAbouriou");
		GameRegistry.registerItem(itemGrapeAleaticu, "itemGrapeAleaticu");
		GameRegistry.registerItem(itemGrapeAligote, "itemGrapeAligote");
		GameRegistry.registerItem(itemGrapeAltesse, "itemGrapeAltesse");
		GameRegistry.registerItem(itemGrapeAramon, "itemGrapeAramon");

		itemGrapeArbois = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeArbois");
		itemGrapeArrufiac = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeArrufiac");
		itemGrapeAubinVert = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeAubinVert");
		itemGrapeBarbarossa = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBarbarossa");
		itemGrapeBergeron = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBergeron");

		GameRegistry.registerItem(itemGrapeArbois, "itemGrapeArbois");
		GameRegistry.registerItem(itemGrapeArrufiac, "itemGrapeArrufiac");
		GameRegistry.registerItem(itemGrapeAubinVert, "itemGrapeAubinVert");
		GameRegistry.registerItem(itemGrapeBarbarossa, "itemGrapeBarbarossa");
		GameRegistry.registerItem(itemGrapeBergeron, "itemGrapeBergeron");

		itemGrapeBiancone = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBiancone");
		itemGrapeBiancuGentile = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBiancuGentile");
		itemGrapeBourboulenc = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBourboulenc");
		itemGrapeBraquet = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeBraquet");
		itemGrapeCabernetFranc = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCabernetFranc");

		GameRegistry.registerItem(itemGrapeBiancone, "itemGrapeBiancone");
		GameRegistry.registerItem(itemGrapeBiancuGentile, "itemGrapeBiancuGentile");
		GameRegistry.registerItem(itemGrapeBourboulenc, "itemGrapeBourboulenc");
		GameRegistry.registerItem(itemGrapeBraquet, "itemGrapeBraquet");
		GameRegistry.registerItem(itemGrapeCabernetFranc, "itemGrapeCabernetFranc");

		itemGrapeCabernetSauvignon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCabernetSauvignon");
		itemGrapeCamarese = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCamarese");
		itemGrapeCarcaghjoluBiancu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCarcaghjoluBiancu");
		itemGrapeCarcaghjoluNeru = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCarcaghjoluNeru");
		itemGrapeCarignan = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCarignan");

		GameRegistry.registerItem(itemGrapeCabernetSauvignon, "itemGrapeCabernetSauvignon");
		GameRegistry.registerItem(itemGrapeCamarese, "itemGrapeCamarese");
		GameRegistry.registerItem(itemGrapeCarcaghjoluBiancu, "itemGrapeCarcaghjoluBiancu");
		GameRegistry.registerItem(itemGrapeCarcaghjoluNeru, "itemGrapeCarcaghjoluNeru");
		GameRegistry.registerItem(itemGrapeCarignan, "itemGrapeCarignan");

		itemGrapeCesar = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCesar");
		itemGrapeChardonnay = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeChardonnay");
		itemGrapeChenin = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeChenin");
		itemGrapeCinsault = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCinsault");
		itemGrapeClairette = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeClairette");

		GameRegistry.registerItem(itemGrapeCesar, "itemGrapeCesar");
		GameRegistry.registerItem(itemGrapeChardonnay, "itemGrapeChardonnay");
		GameRegistry.registerItem(itemGrapeChenin, "itemGrapeChenin");
		GameRegistry.registerItem(itemGrapeCinsault, "itemGrapeCinsault");
		GameRegistry.registerItem(itemGrapeClairette, "itemGrapeClairette");

		itemGrapeColombard = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeColombard");
		itemGrapeCot = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCot");
		itemGrapeCounoise = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCounoise");
		itemGrapeCourbu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCourbu");
		itemGrapeCudiverta = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeCudiverta");

		GameRegistry.registerItem(itemGrapeColombard, "itemGrapeColombard");
		GameRegistry.registerItem(itemGrapeCot, "itemGrapeCot");
		GameRegistry.registerItem(itemGrapeCounoise, "itemGrapeCounoise");
		GameRegistry.registerItem(itemGrapeCourbu, "itemGrapeCourbu");
		GameRegistry.registerItem(itemGrapeCudiverta, "itemGrapeCudiverta");

		itemGrapeDuras = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeDuras");
		itemGrapeFerServadou = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeFerServadou");
		itemGrapeFolleBlanche = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeFolleBlanche");
		itemGrapeGamay = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGamay");
		itemGrapeGewurztraminer = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGewurztraminer");

		GameRegistry.registerItem(itemGrapeDuras, "itemGrapeDuras");
		GameRegistry.registerItem(itemGrapeFerServadou, "itemGrapeFerServadou");
		GameRegistry.registerItem(itemGrapeFolleBlanche, "itemGrapeFolleBlanche");
		GameRegistry.registerItem(itemGrapeGamay, "itemGrapeGamay");
		GameRegistry.registerItem(itemGrapeGewurztraminer, "itemGrapeGewurztraminer");

		itemGrapeGrenache = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGrenache");
		itemGrapeGrenacheBlanc = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGrenacheBlanc");
		itemGrapeGrolleau = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGrolleau");
		itemGrapeGrosMenseng = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeGrosMenseng");
		itemGrapeJacquere = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeJacquere");

		GameRegistry.registerItem(itemGrapeGrenache, "itemGrapeGrenache");
		GameRegistry.registerItem(itemGrapeGrenacheBlanc, "itemGrapeGrenacheBlanc");
		GameRegistry.registerItem(itemGrapeGrolleau, "itemGrapeGrolleau");
		GameRegistry.registerItem(itemGrapeGrosMenseng, "itemGrapeGrosMenseng");
		GameRegistry.registerItem(itemGrapeJacquere, "itemGrapeJacquere");

		itemGrapeLenDeLEl = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeLenDeLEl");
		itemGrapeListan = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeListan");
		itemGrapeMaccabeu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMaccabeu");
		itemGrapeMalbec = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMalbec");
		itemGrapeMalvoisie = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMalvoisie");

		GameRegistry.registerItem(itemGrapeLenDeLEl, "itemGrapeLenDeLEl");
		GameRegistry.registerItem(itemGrapeListan, "itemGrapeListan");
		GameRegistry.registerItem(itemGrapeMaccabeu, "itemGrapeMaccabeu");
		GameRegistry.registerItem(itemGrapeMalbec, "itemGrapeMalbec");
		GameRegistry.registerItem(itemGrapeMalvoisie, "itemGrapeMalvoisie");

		itemGrapeMarsanne = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMarsanne");
		itemGrapeMarselan = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMarselan");
		itemGrapeMauzac = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMauzac");
		itemGrapeMelon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMelon");
		itemGrapeMelonDeBourgogne = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMelonDeBourgogne");

		GameRegistry.registerItem(itemGrapeMarsanne, "itemGrapeMarsanne");
		GameRegistry.registerItem(itemGrapeMarselan, "itemGrapeMarselan");
		GameRegistry.registerItem(itemGrapeMauzac, "itemGrapeMauzac");
		GameRegistry.registerItem(itemGrapeMelon, "itemGrapeMelon");
		GameRegistry.registerItem(itemGrapeMelonDeBourgogne, "itemGrapeMelonDeBourgogne");

		itemGrapeMerlot = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMerlot");
		itemGrapeMolette = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMolette");
		itemGrapeMollard = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMollard");
		itemGrapeMondeuse = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMondeuse");
		itemGrapeMondeuseBlanche = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMondeuseBlanche");

		GameRegistry.registerItem(itemGrapeMerlot, "itemGrapeMerlot");
		GameRegistry.registerItem(itemGrapeMolette, "itemGrapeMolette");
		GameRegistry.registerItem(itemGrapeMollard, "itemGrapeMollard");
		GameRegistry.registerItem(itemGrapeMondeuse, "itemGrapeMondeuse");
		GameRegistry.registerItem(itemGrapeMondeuseBlanche, "itemGrapeMondeuseBlanche");

		itemGrapeMourvedre = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMourvedre");
		itemGrapeMuscadelle = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscadelle");
		itemGrapeMuscardin = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscardin");
		itemGrapeMuscatBlancAPetitsGrains = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscatBlancAPetitsGrains");
		itemGrapeMuscatDAlexandrie = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscatDAlexandrie");

		GameRegistry.registerItem(itemGrapeMourvedre, "itemGrapeMourvedre");
		GameRegistry.registerItem(itemGrapeMuscadelle, "itemGrapeMuscadelle");
		GameRegistry.registerItem(itemGrapeMuscardin, "itemGrapeMuscardin");
		GameRegistry.registerItem(itemGrapeMuscatBlancAPetitsGrains, "itemGrapeMuscatBlancAPetitsGrains");
		GameRegistry.registerItem(itemGrapeMuscatDAlexandrie, "itemGrapeMuscatDAlexandrie");

		itemGrapeNegrette = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeNegrette");
		itemGrapeNielluccio = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeNielluccio");
		itemGrapePagaDebiti = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePagaDebiti");
		itemGrapePetitCourbu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePetitCourbu");
		itemGrapePetitMenseng = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePetitMenseng");

		GameRegistry.registerItem(itemGrapeNegrette, "itemGrapeNegrette");
		GameRegistry.registerItem(itemGrapeNielluccio, "itemGrapeNielluccio");
		GameRegistry.registerItem(itemGrapePagaDebiti, "itemGrapePagaDebiti");
		GameRegistry.registerItem(itemGrapePetitCourbu, "itemGrapePetitCourbu");
		GameRegistry.registerItem(itemGrapePetitMenseng, "itemGrapePetitMenseng");

		itemGrapePetitVerdot = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePetitVerdot");
		itemGrapePineauDAunis = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePineauDAunis");
		itemGrapePinotBlanc = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePinotBlanc");
		itemGrapePinotMeunier = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePinotMeunier");
		itemGrapePinotNoir = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePinotNoir");

		GameRegistry.registerItem(itemGrapePetitVerdot, "itemGrapePetitVerdot");
		GameRegistry.registerItem(itemGrapePineauDAunis, "itemGrapePineauDAunis");
		GameRegistry.registerItem(itemGrapePinotBlanc, "itemGrapePinotBlanc");
		GameRegistry.registerItem(itemGrapePinotMeunier, "itemGrapePinotMeunier");
		GameRegistry.registerItem(itemGrapePinotNoir, "itemGrapePinotNoir");

		itemGrapePiquepoul = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePiquepoul");
		itemGrapePoulsard = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapePoulsard");
		itemGrapeRiesling = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeRiesling");
		itemGrapeRomorantin = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeRomorantin");
		itemGrapeRossulaBianca = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeRossulaBianca");

		GameRegistry.registerItem(itemGrapePiquepoul, "itemGrapePiquepoul");
		GameRegistry.registerItem(itemGrapePoulsard, "itemGrapePoulsard");
		GameRegistry.registerItem(itemGrapeRiesling, "itemGrapeRiesling");
		GameRegistry.registerItem(itemGrapeRomorantin, "itemGrapeRomorantin");
		GameRegistry.registerItem(itemGrapeRossulaBianca, "itemGrapeRossulaBianca");

		itemGrapeSacy = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSacy");
		itemGrapeSauvignon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSauvignon");
		itemGrapeSavagnin = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSavagnin");
		itemGrapeSemillon = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSemillon");
		itemGrapeSylvaner = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSylvaner");

		GameRegistry.registerItem(itemGrapeSacy, "itemGrapeSacy");
		GameRegistry.registerItem(itemGrapeSauvignon, "itemGrapeSauvignon");
		GameRegistry.registerItem(itemGrapeSavagnin, "itemGrapeSavagnin");
		GameRegistry.registerItem(itemGrapeSemillon, "itemGrapeSemillon");
		GameRegistry.registerItem(itemGrapeSylvaner, "itemGrapeSylvaner");

		itemGrapeSyrah = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeSyrah");
		itemGrapeTannat = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeTannat");
		itemGrapeTeoulier = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeTeoulier");
		itemGrapeTerretNoir = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeTerretNoir");
		itemGrapeTibouren = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeTibouren");

		GameRegistry.registerItem(itemGrapeSyrah, "itemGrapeSyrah");
		GameRegistry.registerItem(itemGrapeTannat, "itemGrapeTannat");
		GameRegistry.registerItem(itemGrapeTeoulier, "itemGrapeTeoulier");
		GameRegistry.registerItem(itemGrapeTerretNoir, "itemGrapeTerretNoir");
		GameRegistry.registerItem(itemGrapeTibouren, "itemGrapeTibouren");

		itemGrapeTressalier = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeTressalier");
		itemGrapeUgniBlanc = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeUgniBlanc");
		itemGrapeVaccarese = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeVaccarese");
		itemGrapeVermentinu = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeVermentinu");
		itemGrapeViognier = new ItemFruit(1, 1.0F, false).setUnlocalizedName("itemGrapeViognier");

		GameRegistry.registerItem(itemGrapeTressalier, "itemGrapeTressalier");
		GameRegistry.registerItem(itemGrapeUgniBlanc, "itemGrapeUgniBlanc");
		GameRegistry.registerItem(itemGrapeVaccarese, "itemGrapeVaccarese");
		GameRegistry.registerItem(itemGrapeVermentinu, "itemGrapeVermentinu");
		GameRegistry.registerItem(itemGrapeViognier, "itemGrapeViognier");
	
	//vegetable
		itemVegetableAsparagus = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableAsparagus");
		itemVegetableAvocado = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableAvocado");
		itemVegetableBasil = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableBasil");
		itemVegetableBeet = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableBeet");
		itemVegetableBroccoli = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableBroccoli");

		GameRegistry.registerItem(itemVegetableAsparagus, "itemVegetableAsparagus");
		GameRegistry.registerItem(itemVegetableAvocado, "itemVegetableAvocado");
		GameRegistry.registerItem(itemVegetableBasil, "itemVegetableBasil");
		GameRegistry.registerItem(itemVegetableBeet, "itemVegetableBeet");
		GameRegistry.registerItem(itemVegetableBroccoli, "itemVegetableBroccoli");

		itemVegetableBrusselsSprout = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableBrusselsSprout");
		itemVegetableCabbage = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCabbage");
		itemVegetableCardamom = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCardamom");
		itemVegetableCarrotTouchon = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCarrotTouchon");
		itemVegetableCashew = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCashew");

		GameRegistry.registerItem(itemVegetableBrusselsSprout, "itemVegetableBrusselsSprout");
		GameRegistry.registerItem(itemVegetableCabbage, "itemVegetableCabbage");
		GameRegistry.registerItem(itemVegetableCardamom, "itemVegetableCardamom");
		GameRegistry.registerItem(itemVegetableCarrotTouchon, "itemVegetableCarrotTouchon");
		GameRegistry.registerItem(itemVegetableCashew, "itemVegetableCashew");

		itemVegetableCauliflower = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCauliflower");
		itemVegetableCelery = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCelery");
		itemVegetableCherryTomato = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCherryTomato");
		itemVegetableChickpea = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableChickpea");
		itemVegetableChicory = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableChicory");

		GameRegistry.registerItem(itemVegetableCauliflower, "itemVegetableCauliflower");
		GameRegistry.registerItem(itemVegetableCelery, "itemVegetableCelery");
		GameRegistry.registerItem(itemVegetableCherryTomato, "itemVegetableCherryTomato");
		GameRegistry.registerItem(itemVegetableChickpea, "itemVegetableChickpea");
		GameRegistry.registerItem(itemVegetableChicory, "itemVegetableChicory");

		itemVegetableChili = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableChili");
		itemVegetableCucumber = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableCucumber");
		itemVegetableEggplant = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableEggplant");
		itemVegetableFlageolet = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableFlageolet");
		itemVegetableFrenchBeans = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableFrenchBeans");

		GameRegistry.registerItem(itemVegetableChili, "itemVegetableChili");
		GameRegistry.registerItem(itemVegetableCucumber, "itemVegetableCucumber");
		GameRegistry.registerItem(itemVegetableEggplant, "itemVegetableEggplant");
		GameRegistry.registerItem(itemVegetableFlageolet, "itemVegetableFlageolet");
		GameRegistry.registerItem(itemVegetableFrenchBeans, "itemVegetableFrenchBeans");

		itemVegetableGarlic = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableGarlic");
		itemVegetableGherkin = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableGherkin");
		itemVegetableGinger = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableGinger");
		itemVegetableLeek = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableLeek");
		itemVegetableLens = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableLens");

		GameRegistry.registerItem(itemVegetableGarlic, "itemVegetableGarlic");
		GameRegistry.registerItem(itemVegetableGherkin, "itemVegetableGherkin");
		GameRegistry.registerItem(itemVegetableGinger, "itemVegetableGinger");
		GameRegistry.registerItem(itemVegetableLeek, "itemVegetableLeek");
		GameRegistry.registerItem(itemVegetableLens, "itemVegetableLens");

		itemVegetableOlive = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableOlive");
		itemVegetableOnion = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableOnion");
		itemVegetableParsley = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableParsley");
		itemVegetableParsnip = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableParsnip");
		itemVegetablePea = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetablePea");

		GameRegistry.registerItem(itemVegetableOlive, "itemVegetableOlive");
		GameRegistry.registerItem(itemVegetableOnion, "itemVegetableOnion");
		GameRegistry.registerItem(itemVegetableParsley, "itemVegetableParsley");
		GameRegistry.registerItem(itemVegetableParsnip, "itemVegetableParsnip");
		GameRegistry.registerItem(itemVegetablePea, "itemVegetablePea");

		itemVegetablePeanut = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetablePeanut");
		itemVegetablePistachio = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetablePistachio");
		itemVegetableRadish = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableRadish");
		itemVegetableRedCabbage = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableRedCabbage");
		itemVegetableRutabaga = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableRutabaga");

		GameRegistry.registerItem(itemVegetablePeanut, "itemVegetablePeanut");
		GameRegistry.registerItem(itemVegetablePistachio, "itemVegetablePistachio");
		GameRegistry.registerItem(itemVegetableRadish, "itemVegetableRadish");
		GameRegistry.registerItem(itemVegetableRedCabbage, "itemVegetableRedCabbage");
		GameRegistry.registerItem(itemVegetableRutabaga, "itemVegetableRutabaga");

		itemVegetableSalat = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableSalat");
		itemVegetableShallots = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableShallots");
		itemVegetableSpinach = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableSpinach");
		itemVegetableSweetGreenPepper = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableSweetGreenPepper");
		itemVegetableSweetRedPepper = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableSweetRedPepper");

		GameRegistry.registerItem(itemVegetableSalat, "itemVegetableSalat");
		GameRegistry.registerItem(itemVegetableShallots, "itemVegetableShallots");
		GameRegistry.registerItem(itemVegetableSpinach, "itemVegetableSpinach");
		GameRegistry.registerItem(itemVegetableSweetGreenPepper, "itemVegetableSweetGreenPepper");
		GameRegistry.registerItem(itemVegetableSweetRedPepper, "itemVegetableSweetRedPepper");

		itemVegetableSweetYellowPepper = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableSweetYellowPepper");
		itemVegetableTomato = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableTomato");
		itemVegetableTurnip = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableTurnip");
		itemVegetableZucchini = new ItemVegetable(1, 1.0F, false).setUnlocalizedName("itemVegetableZucchini");
	
	//Bread

	//meat 
		//raw
		itemKebabRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemKebabRaw");
		itemMeatChickenFleshRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatChickenFleshRaw");
		itemMeatChickenFullRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatChickenFullRaw");
		itemMeatChickenLegRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatChickenLegRaw");
		itemMeatChickenNuggetRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatChickenNuggetRaw");

		GameRegistry.registerItem(itemKebabRaw, "itemKebabRaw");
		GameRegistry.registerItem(itemMeatChickenFleshRaw, "itemMeatChickenFleshRaw");
		GameRegistry.registerItem(itemMeatChickenFullRaw, "itemMeatChickenFullRaw");
		GameRegistry.registerItem(itemMeatChickenLegRaw, "itemMeatChickenLegRaw");
		GameRegistry.registerItem(itemMeatChickenNuggetRaw, "itemMeatChickenNuggetRaw");

		itemMeatCowForeRibRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatCowForeRibRaw");
		itemMeatCowRumpsteakRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatCowRumpsteakRaw");
		itemMeatGoatRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatGoatRaw");
		itemMeatMuttonBrain = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatMuttonBrain");
		itemMeatMuttonLegRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatMuttonLegRaw");

		GameRegistry.registerItem(itemMeatCowForeRibRaw, "itemMeatCowForeRibRaw");
		GameRegistry.registerItem(itemMeatCowRumpsteakRaw, "itemMeatCowRumpsteakRaw");
		GameRegistry.registerItem(itemMeatGoatRaw, "itemMeatGoatRaw");
		GameRegistry.registerItem(itemMeatMuttonBrain, "itemMeatMuttonBrain");
		GameRegistry.registerItem(itemMeatMuttonLegRaw, "itemMeatMuttonLegRaw");

		itemMeatMuttonSaddleRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatMuttonSaddleRaw");
		itemMeatMuttonShoulderRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatMuttonShoulderRaw");
		itemMeatPorkForeLoinRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatPorkForeLoinRaw");
		itemMeatPorkHamRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatPorkHamRaw");
		itemMeatPorkLoinChopsRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatPorkLoinChopsRaw");

		GameRegistry.registerItem(itemMeatMuttonSaddleRaw, "itemMeatMuttonSaddleRaw");
		GameRegistry.registerItem(itemMeatMuttonShoulderRaw, "itemMeatMuttonShoulderRaw");
		GameRegistry.registerItem(itemMeatPorkForeLoinRaw, "itemMeatPorkForeLoinRaw");
		GameRegistry.registerItem(itemMeatPorkHamRaw, "itemMeatPorkHamRaw");
		GameRegistry.registerItem(itemMeatPorkLoinChopsRaw, "itemMeatPorkLoinChopsRaw");

		itemMeatZebraRaw = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatZebraRaw");
		itemMeatZombieArm = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatZombieArm");
		itemMeatZombieFeet = new ItemMeatRaw(1, 1.0F, false).setUnlocalizedName("itemMeatZombieFeet");

		GameRegistry.registerItem(itemMeatZebraRaw, "itemMeatZebraRaw");
		GameRegistry.registerItem(itemMeatZombieArm, "itemMeatZombieArm");
		GameRegistry.registerItem(itemMeatZombieFeet, "itemMeatZombieFeet");
	
		//cooked
		itemMeatBloodSausage = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatBloodSausage");
		itemMeatHotDogSausageCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatHotDogSausageCooked");
		itemMeatHotDogSausageRaw = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatHotDogSausageRaw");
		itemMeatKnack = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatKnack");
		itemMeatSaveloy = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatSaveloy");

		GameRegistry.registerItem(itemMeatBloodSausage, "itemMeatBloodSausage");
		GameRegistry.registerItem(itemMeatHotDogSausageCooked, "itemMeatHotDogSausageCooked");
		GameRegistry.registerItem(itemMeatHotDogSausageRaw, "itemMeatHotDogSausageRaw");
		GameRegistry.registerItem(itemMeatKnack, "itemMeatKnack");
		GameRegistry.registerItem(itemMeatSaveloy, "itemMeatSaveloy");

		itemMeatChickenFleshCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatChickenFleshCooked");
		itemMeatChickenFullCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatChickenFullCooked");
		itemMeatChickenLegCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatChickenLegCooked");
		itemMeatChickenNuggetCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatChickenNuggetCooked");
		itemMeatCowForeRibCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatCowForeRibCooked");

		GameRegistry.registerItem(itemMeatChickenFleshCooked, "itemMeatChickenFleshCooked");
		GameRegistry.registerItem(itemMeatChickenFullCooked, "itemMeatChickenFullCooked");
		GameRegistry.registerItem(itemMeatChickenLegCooked, "itemMeatChickenLegCooked");
		GameRegistry.registerItem(itemMeatChickenNuggetCooked, "itemMeatChickenNuggetCooked");
		GameRegistry.registerItem(itemMeatCowForeRibCooked, "itemMeatCowForeRibCooked");

		itemMeatCowRumpsteakCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatCowRumpsteakCooked");
		itemMeatGoatCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatGoatCooked");
		itemMeatKebabCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatKebabCooked");
		itemMeatMuttonCookedBrain = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatMuttonCookedBrain");
		itemMeatMuttonLegCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatMuttonLegCooked");

		GameRegistry.registerItem(itemMeatCowRumpsteakCooked, "itemMeatCowRumpsteakCooked");
		GameRegistry.registerItem(itemMeatGoatCooked, "itemMeatGoatCooked");
		GameRegistry.registerItem(itemMeatKebabCooked, "itemMeatKebabCooked");
		GameRegistry.registerItem(itemMeatMuttonCookedBrain, "itemMeatMuttonCookedBrain");
		GameRegistry.registerItem(itemMeatMuttonLegCooked, "itemMeatMuttonLegCooked");

		itemMeatMuttonSaddleCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatMuttonSaddleCooked");
		itemMeatMuttonShoulderCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatMuttonShoulderCooked");
		itemMeatPorkForeLoinCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatPorkForeLoinCooked");
		itemMeatPorkHamCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatPorkHamCooked");
		itemMeatPorkLoinChopsCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatPorkLoinChopsCooked");

		GameRegistry.registerItem(itemMeatMuttonSaddleCooked, "itemMeatMuttonSaddleCooked");
		GameRegistry.registerItem(itemMeatMuttonShoulderCooked, "itemMeatMuttonShoulderCooked");
		GameRegistry.registerItem(itemMeatPorkForeLoinCooked, "itemMeatPorkForeLoinCooked");
		GameRegistry.registerItem(itemMeatPorkHamCooked, "itemMeatPorkHamCooked");
		GameRegistry.registerItem(itemMeatPorkLoinChopsCooked, "itemMeatPorkLoinChopsCooked");

		itemMeatZebraCooked = new ItemMeatCooked(3, 3.0F, false).setUnlocalizedName("itemMeatZebraCooked");

		GameRegistry.registerItem(itemMeatZebraCooked, "itemMeatZebraCooked");



		//Cheese
		
	}
	
	public static void registerRender(){
		//ingredients
		ModelLoader.setCustomModelResourceLocation(itemIngredientBlackPepper, 0, new ModelResourceLocation("bandb_mod:itemIngredientBlackPepper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientButter, 0, new ModelResourceLocation("bandb_mod:itemIngredientButter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCacaoPowder, 0, new ModelResourceLocation("bandb_mod:itemIngredientCacaoPowder", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCaramel, 0, new ModelResourceLocation("bandb_mod:itemIngredientCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCelerySalt, 0, new ModelResourceLocation("bandb_mod:itemIngredientCelerySalt", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientChocolate, 0, new ModelResourceLocation("bandb_mod:itemIngredientChocolate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCottonCandySugar, 0, new ModelResourceLocation("bandb_mod:itemIngredientCottonCandySugar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCurry, 0, new ModelResourceLocation("bandb_mod:itemIngredientCurry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientCurryLeafDried, 0, new ModelResourceLocation("bandb_mod:itemIngredientCurryLeafDried", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientDarkChocolate, 0, new ModelResourceLocation("bandb_mod:itemIngredientDarkChocolate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourBarley, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourBarley", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourBuckwheat, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourBuckwheat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourCorn, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourCorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourFonio, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourFonio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourHemp, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourHemp", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourHop, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourHop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourMalt, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourMalt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourMillet, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourMillet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourOats, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourOats", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourRye, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourRye", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourSorghum, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourSorghum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientFlourSpelt, 0, new ModelResourceLocation("bandb_mod:itemIngredientFlourSpelt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientHoney, 0, new ModelResourceLocation("bandb_mod:itemIngredientHoney", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientIceCube, 0, new ModelResourceLocation("bandb_mod:itemIngredientIceCube", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientKetchup, 0, new ModelResourceLocation("bandb_mod:itemIngredientKetchup", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientLeaveCocaDried, 0, new ModelResourceLocation("bandb_mod:itemIngredientLeaveCocaDried", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientMayonnaise, 0, new ModelResourceLocation("bandb_mod:itemIngredientMayonnaise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientMustardSauce, 0, new ModelResourceLocation("bandb_mod:itemIngredientMustardSauce", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientSaltedCaramel, 0, new ModelResourceLocation("bandb_mod:itemIngredientSaltedCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientSliverCheese, 0, new ModelResourceLocation("bandb_mod:itemIngredientSliverCheese", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngredientSliverOnion, 0, new ModelResourceLocation("bandb_mod:itemIngredientSliverOnion", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientSliverTomato, 0, new ModelResourceLocation("bandb_mod:itemIngredientSliverTomato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientTobaccoDried, 0, new ModelResourceLocation("bandb_mod:itemIngredientTobaccoDried", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientWhiteChocolate, 0, new ModelResourceLocation("bandb_mod:itemIngredientWhiteChocolate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngredientWhiteSauce, 0, new ModelResourceLocation("bandb_mod:itemIngredientWhiteSauce", "inventory"));


	//processed food
		ModelLoader.setCustomModelResourceLocation(itemFoodApplePie, 0, new ModelResourceLocation("bandb_mod:itemFoodApplePie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodBlackForest, 0, new ModelResourceLocation("bandb_mod:itemFoodBlackForest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodBounty, 0, new ModelResourceLocation("bandb_mod:itemFoodBounty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodBubbleGum, 0, new ModelResourceLocation("bandb_mod:itemFoodBubbleGum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodCandyCane, 0, new ModelResourceLocation("bandb_mod:itemFoodCandyCane", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodCandyStrawberry, 0, new ModelResourceLocation("bandb_mod:itemFoodCandyStrawberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodCotonCandy, 0, new ModelResourceLocation("bandb_mod:itemFoodCotonCandy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodCremeBrulee, 0, new ModelResourceLocation("bandb_mod:itemFoodCremeBrulee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodGum, 0, new ModelResourceLocation("bandb_mod:itemFoodGum", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodIceCreamVanilla, 0, new ModelResourceLocation("bandb_mod:itemFoodIceCreamVanilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodJamCurrant, 0, new ModelResourceLocation("bandb_mod:itemFoodJamCurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodJamOrange, 0, new ModelResourceLocation("bandb_mod:itemFoodJamOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodKinderSurprise, 0, new ModelResourceLocation("bandb_mod:itemFoodKinderSurprise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLemonPie, 0, new ModelResourceLocation("bandb_mod:itemFoodLemonPie", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMacaron, 0, new ModelResourceLocation("bandb_mod:itemFoodMacaron", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMallow, 0, new ModelResourceLocation("bandb_mod:itemFoodMallow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMars, 0, new ModelResourceLocation("bandb_mod:itemFoodMars", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodPretzel, 0, new ModelResourceLocation("bandb_mod:itemFoodPretzel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodReastedHazelnut, 0, new ModelResourceLocation("bandb_mod:itemFoodReastedHazelnut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodSpeculoos, 0, new ModelResourceLocation("bandb_mod:itemFoodSpeculoos", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodSunflowerSeedRoasted, 0, new ModelResourceLocation("bandb_mod:itemFoodSunflowerSeedRoasted", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodTiramisu, 0, new ModelResourceLocation("bandb_mod:itemFoodTiramisu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodToffeeApple, 0, new ModelResourceLocation("bandb_mod:itemFoodToffeeApple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodToffeeNut, 0, new ModelResourceLocation("bandb_mod:itemFoodToffeeNut", "inventory"));
	
		//Lu 
		ModelLoader.setCustomModelResourceLocation(itemFoodLuBarquetteAbricot, 0, new ModelResourceLocation("bandb_mod:itemFoodLuBarquetteAbricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuBarreGranny, 0, new ModelResourceLocation("bandb_mod:itemFoodLuBarreGranny", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuCoquelineChocolat, 0, new ModelResourceLocation("bandb_mod:itemFoodLuCoquelineChocolat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuGateauCoteDOr, 0, new ModelResourceLocation("bandb_mod:itemFoodLuGateauCoteDOr", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuGranola, 0, new ModelResourceLocation("bandb_mod:itemFoodLuGranola", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuLuluOurson, 0, new ModelResourceLocation("bandb_mod:itemFoodLuLuluOurson", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuLuluOursonChoco, 0, new ModelResourceLocation("bandb_mod:itemFoodLuLuluOursonChoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuLuluOursonChocolat, 0, new ModelResourceLocation("bandb_mod:itemFoodLuLuluOursonChocolat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuMikadoChocoNoisette, 0, new ModelResourceLocation("bandb_mod:itemFoodLuMikadoChocoNoisette", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuMikadoChocolatLait, 0, new ModelResourceLocation("bandb_mod:itemFoodLuMikadoChocolatLait", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuMikadoChocolatNoir, 0, new ModelResourceLocation("bandb_mod:itemFoodLuMikadoChocolatNoir", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuMikadoDaim, 0, new ModelResourceLocation("bandb_mod:itemFoodLuMikadoDaim", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuMikadoKingChoco, 0, new ModelResourceLocation("bandb_mod:itemFoodLuMikadoKingChoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitain, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitain3Choco, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitain3Choco", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainCaramel, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainChoco, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainChoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainClassicIndi, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainClassicIndi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainCoco, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainCoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainFramboise, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainFramboise", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainMousse, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainMousse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainPartage, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainPartage", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuNapolitainPraline, 0, new ModelResourceLocation("bandb_mod:itemFoodLuNapolitainPraline", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPepito, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPepito", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPetitBeurre, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPetitBeurre", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuPetitCoeur, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPetitCoeur", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPetitEcolier, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPetitEcolier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPetitLuBeurre, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPetitLuBeurre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPetitLuChocolat, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPetitLuChocolat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPockitosCrousti, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPockitosCrousti", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodLuPockitosNoir, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPockitosNoir", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodLuPrince, 0, new ModelResourceLocation("bandb_mod:itemFoodLuPrince", "inventory"));

		//Milka
		ModelLoader.setCustomModelResourceLocation(itemFoodMilka, 0, new ModelResourceLocation("bandb_mod:itemFoodMilka", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCakeChoc, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCakeChoc", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCaramel, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoBiscuit, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoBiscuit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoJelly, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoJelly", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoMooo, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoMooo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoSupreme, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoSupreme", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoTutti, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoTutti", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocoTwist, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocoTwist", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaChocolatBlanc, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaChocolatBlanc", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCrispello, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCrispello", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCrispelloPopcorn, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCrispelloPopcorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCrispelloVanille, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCrispelloVanille", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCrispySnax, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCrispySnax", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaCrispySnaxDaim, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaCrispySnaxDaim", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaDaim, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaDaim", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaDaimCrack, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaDaimCrack", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaGranola, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaGranola", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaGrosMorceau, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaGrosMorceau", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaGrosMorceauCaramel, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaGrosMorceauCaramel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaGrosMorceauNoistte, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaGrosMorceauNoistte", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaGrosMorceauPraline, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaGrosMorceauPraline", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaInColors, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaInColors", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaLilaStars, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaLilaStars", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaLu, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaLu", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaMJoy, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaMJoy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaMJoyCacahuete, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaMJoyCacahuete", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaMJoyNoisette, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaMJoyNoisette", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaMeloCakes, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaMeloCakes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaNoisettesEntieres, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaNoisettesEntieres", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaOreo, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaOreo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullChoco, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullChoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullChocoBarre, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullChocoBarre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullDaim, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullDaim", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullDaimBarre, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullDaimBarre", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullNoisette, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullNoisette", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaPullNoisetteBarre, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaPullNoisetteBarre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaRizCroustillant, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaRizCroustillant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaTendreLait, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaTendreLait", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaTendresMomentMousse, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaTendresMomentMousse", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaTendresMomentMoussePraline, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaTendresMomentMoussePraline", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFoodMilkaTuc, 0, new ModelResourceLocation("bandb_mod:itemFoodMilkaTuc", "inventory"));

		//Mc Donald's
	
	//fruit
		ModelLoader.setCustomModelResourceLocation(itemFruitAbiu, 0, new ModelResourceLocation("bandb_mod:itemFruitAbiu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAfrican, 0, new ModelResourceLocation("bandb_mod:itemFruitAfrican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAllspice, 0, new ModelResourceLocation("bandb_mod:itemFruitAllspice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAlmond, 0, new ModelResourceLocation("bandb_mod:itemFruitAlmond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAmla, 0, new ModelResourceLocation("bandb_mod:itemFruitAmla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitAnise, 0, new ModelResourceLocation("bandb_mod:itemFruitAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitApricot, 0, new ModelResourceLocation("bandb_mod:itemFruitApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBael, 0, new ModelResourceLocation("bandb_mod:itemFruitBael", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBanana, 0, new ModelResourceLocation("bandb_mod:itemFruitBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBananaPlantain, 0, new ModelResourceLocation("bandb_mod:itemFruitBananaPlantain", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitBayLaurel, 0, new ModelResourceLocation("bandb_mod:itemFruitBayLaurel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBer, 0, new ModelResourceLocation("bandb_mod:itemFruitBer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBlackBerry, 0, new ModelResourceLocation("bandb_mod:itemFruitBlackBerry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBlackCherry, 0, new ModelResourceLocation("bandb_mod:itemFruitBlackCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBlackcurrant, 0, new ModelResourceLocation("bandb_mod:itemFruitBlackcurrant", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitBlackthorn, 0, new ModelResourceLocation("bandb_mod:itemFruitBlackthorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBloodOrange, 0, new ModelResourceLocation("bandb_mod:itemFruitBloodOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBlueBerry, 0, new ModelResourceLocation("bandb_mod:itemFruitBlueBerry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBrazilNut, 0, new ModelResourceLocation("bandb_mod:itemFruitBrazilNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitBreadNut, 0, new ModelResourceLocation("bandb_mod:itemFruitBreadNut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitBunyaNut, 0, new ModelResourceLocation("bandb_mod:itemFruitBunyaNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitButternut, 0, new ModelResourceLocation("bandb_mod:itemFruitButternut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitCacao, 0, new ModelResourceLocation("bandb_mod:itemFruitCacao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitCherry, 0, new ModelResourceLocation("bandb_mod:itemFruitCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitChestnut, 0, new ModelResourceLocation("bandb_mod:itemFruitChestnut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitCinnamon, 0, new ModelResourceLocation("bandb_mod:itemFruitCinnamon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitClementine, 0, new ModelResourceLocation("bandb_mod:itemFruitClementine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitClove, 0, new ModelResourceLocation("bandb_mod:itemFruitClove", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitCoconut, 0, new ModelResourceLocation("bandb_mod:itemFruitCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitCranberry, 0, new ModelResourceLocation("bandb_mod:itemFruitCranberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitCurrant, 0, new ModelResourceLocation("bandb_mod:itemFruitCurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitDamsonPlum, 0, new ModelResourceLocation("bandb_mod:itemFruitDamsonPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitDate, 0, new ModelResourceLocation("bandb_mod:itemFruitDate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitDragonfruit, 0, new ModelResourceLocation("bandb_mod:itemFruitDragonfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitElderberry, 0, new ModelResourceLocation("bandb_mod:itemFruitElderberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitFig, 0, new ModelResourceLocation("bandb_mod:itemFruitFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitGingkoNut, 0, new ModelResourceLocation("bandb_mod:itemFruitGingkoNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemFruitGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitGrapefruitPink, 0, new ModelResourceLocation("bandb_mod:itemFruitGrapefruitPink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitGuava, 0, new ModelResourceLocation("bandb_mod:itemFruitGuava", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitHuckleberries, 0, new ModelResourceLocation("bandb_mod:itemFruitHuckleberries", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitJackfruit, 0, new ModelResourceLocation("bandb_mod:itemFruitJackfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitJujube, 0, new ModelResourceLocation("bandb_mod:itemFruitJujube", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitKiwi, 0, new ModelResourceLocation("bandb_mod:itemFruitKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitKumquat, 0, new ModelResourceLocation("bandb_mod:itemFruitKumquat", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitLemon, 0, new ModelResourceLocation("bandb_mod:itemFruitLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitLime, 0, new ModelResourceLocation("bandb_mod:itemFruitLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitLongan, 0, new ModelResourceLocation("bandb_mod:itemFruitLongan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitLoquat, 0, new ModelResourceLocation("bandb_mod:itemFruitLoquat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitLychee, 0, new ModelResourceLocation("bandb_mod:itemFruitLychee", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitMacadamia, 0, new ModelResourceLocation("bandb_mod:itemFruitMacadamia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitMameySapote, 0, new ModelResourceLocation("bandb_mod:itemFruitMameySapote", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitMango, 0, new ModelResourceLocation("bandb_mod:itemFruitMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitMangosteen, 0, new ModelResourceLocation("bandb_mod:itemFruitMangosteen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitMirabelle, 0, new ModelResourceLocation("bandb_mod:itemFruitMirabelle", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitMorelloCherry, 0, new ModelResourceLocation("bandb_mod:itemFruitMorelloCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitNectarine, 0, new ModelResourceLocation("bandb_mod:itemFruitNectarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitNutmeg, 0, new ModelResourceLocation("bandb_mod:itemFruitNutmeg", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitNuts, 0, new ModelResourceLocation("bandb_mod:itemFruitNuts", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitOhiaAi, 0, new ModelResourceLocation("bandb_mod:itemFruitOhiaAi", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitOrange, 0, new ModelResourceLocation("bandb_mod:itemFruitOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitOsageOrange, 0, new ModelResourceLocation("bandb_mod:itemFruitOsageOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPapaya, 0, new ModelResourceLocation("bandb_mod:itemFruitPapaya", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitParadiseNut, 0, new ModelResourceLocation("bandb_mod:itemFruitParadiseNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPassionfruit, 0, new ModelResourceLocation("bandb_mod:itemFruitPassionfruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitPeach, 0, new ModelResourceLocation("bandb_mod:itemFruitPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPear, 0, new ModelResourceLocation("bandb_mod:itemFruitPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPersimmon, 0, new ModelResourceLocation("bandb_mod:itemFruitPersimmon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPineNut, 0, new ModelResourceLocation("bandb_mod:itemFruitPineNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPineappleCayenne, 0, new ModelResourceLocation("bandb_mod:itemFruitPineappleCayenne", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitPineappleVictoria, 0, new ModelResourceLocation("bandb_mod:itemFruitPineappleVictoria", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPlum, 0, new ModelResourceLocation("bandb_mod:itemFruitPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPomegranate, 0, new ModelResourceLocation("bandb_mod:itemFruitPomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPomelo, 0, new ModelResourceLocation("bandb_mod:itemFruitPomelo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitPricklyPear, 0, new ModelResourceLocation("bandb_mod:itemFruitPricklyPear", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitQuince, 0, new ModelResourceLocation("bandb_mod:itemFruitQuince", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitRaspberry, 0, new ModelResourceLocation("bandb_mod:itemFruitRaspberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitRedBanana, 0, new ModelResourceLocation("bandb_mod:itemFruitRedBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitRhubarb, 0, new ModelResourceLocation("bandb_mod:itemFruitRhubarb", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitSapodilla, 0, new ModelResourceLocation("bandb_mod:itemFruitSapodilla", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitSatsuma, 0, new ModelResourceLocation("bandb_mod:itemFruitSatsuma", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitSoursop, 0, new ModelResourceLocation("bandb_mod:itemFruitSoursop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitStarAnise, 0, new ModelResourceLocation("bandb_mod:itemFruitStarAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitStrawberry, 0, new ModelResourceLocation("bandb_mod:itemFruitStrawberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitTamarillo, 0, new ModelResourceLocation("bandb_mod:itemFruitTamarillo", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitTangerine, 0, new ModelResourceLocation("bandb_mod:itemFruitTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitTonkaBean, 0, new ModelResourceLocation("bandb_mod:itemFruitTonkaBean", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitVanilla, 0, new ModelResourceLocation("bandb_mod:itemFruitVanilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitWalnut, 0, new ModelResourceLocation("bandb_mod:itemFruitWalnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitWhitePeach, 0, new ModelResourceLocation("bandb_mod:itemFruitWhitePeach", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitWildStrawberry, 0, new ModelResourceLocation("bandb_mod:itemFruitWildStrawberry", "inventory"));

		//apple
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleAntares, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleAntares", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleAriane, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleAriane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleBelchardChancelier, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleBelchardChancelier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleBelleDeBoskoop, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleBelleDeBoskoop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleBraeburn, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleBraeburn", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitAppleElstar, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleElstar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleFuji, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleFuji", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleGala, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleGala", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleGolden, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleGolden", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleGrannySmith, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleGrannySmith", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitAppleHoneycrunch, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleHoneycrunch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleJazz, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleJazz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleJonagoldJonagored, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleJonagoldJonagored", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleLesRouges, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleLesRouges", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitApplePinkLady, 0, new ModelResourceLocation("bandb_mod:itemFruitApplePinkLady", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFruitApplePommeDuLimousin, 0, new ModelResourceLocation("bandb_mod:itemFruitApplePommeDuLimousin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleReineDesReinettes, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleReineDesReinettes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleReinetteGriseDuCanada, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleReinetteGriseDuCanada", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitAppleTentation, 0, new ModelResourceLocation("bandb_mod:itemFruitAppleTentation", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFruitCrabapple, 0, new ModelResourceLocation("bandb_mod:itemFruitCrabapple", "inventory"));
		
		//Grape
		ModelLoader.setCustomModelResourceLocation(itemGrapeAbouriou, 0, new ModelResourceLocation("bandb_mod:itemGrapeAbouriou", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAleaticu, 0, new ModelResourceLocation("bandb_mod:itemGrapeAleaticu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAligote, 0, new ModelResourceLocation("bandb_mod:itemGrapeAligote", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAltesse, 0, new ModelResourceLocation("bandb_mod:itemGrapeAltesse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAramon, 0, new ModelResourceLocation("bandb_mod:itemGrapeAramon", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeArbois, 0, new ModelResourceLocation("bandb_mod:itemGrapeArbois", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeArrufiac, 0, new ModelResourceLocation("bandb_mod:itemGrapeArrufiac", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAubinVert, 0, new ModelResourceLocation("bandb_mod:itemGrapeAubinVert", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBarbarossa, 0, new ModelResourceLocation("bandb_mod:itemGrapeBarbarossa", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBergeron, 0, new ModelResourceLocation("bandb_mod:itemGrapeBergeron", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeBiancone, 0, new ModelResourceLocation("bandb_mod:itemGrapeBiancone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBiancuGentile, 0, new ModelResourceLocation("bandb_mod:itemGrapeBiancuGentile", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBourboulenc, 0, new ModelResourceLocation("bandb_mod:itemGrapeBourboulenc", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBraquet, 0, new ModelResourceLocation("bandb_mod:itemGrapeBraquet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCabernetFranc, 0, new ModelResourceLocation("bandb_mod:itemGrapeCabernetFranc", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeCabernetSauvignon, 0, new ModelResourceLocation("bandb_mod:itemGrapeCabernetSauvignon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCamarese, 0, new ModelResourceLocation("bandb_mod:itemGrapeCamarese", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarcaghjoluBiancu, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarcaghjoluBiancu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarcaghjoluNeru, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarcaghjoluNeru", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarignan, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarignan", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeCesar, 0, new ModelResourceLocation("bandb_mod:itemGrapeCesar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeChardonnay, 0, new ModelResourceLocation("bandb_mod:itemGrapeChardonnay", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeChenin, 0, new ModelResourceLocation("bandb_mod:itemGrapeChenin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCinsault, 0, new ModelResourceLocation("bandb_mod:itemGrapeCinsault", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeClairette, 0, new ModelResourceLocation("bandb_mod:itemGrapeClairette", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeColombard, 0, new ModelResourceLocation("bandb_mod:itemGrapeColombard", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCot, 0, new ModelResourceLocation("bandb_mod:itemGrapeCot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCounoise, 0, new ModelResourceLocation("bandb_mod:itemGrapeCounoise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCourbu, 0, new ModelResourceLocation("bandb_mod:itemGrapeCourbu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCudiverta, 0, new ModelResourceLocation("bandb_mod:itemGrapeCudiverta", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeDuras, 0, new ModelResourceLocation("bandb_mod:itemGrapeDuras", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeFerServadou, 0, new ModelResourceLocation("bandb_mod:itemGrapeFerServadou", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeFolleBlanche, 0, new ModelResourceLocation("bandb_mod:itemGrapeFolleBlanche", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGamay, 0, new ModelResourceLocation("bandb_mod:itemGrapeGamay", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGewurztraminer, 0, new ModelResourceLocation("bandb_mod:itemGrapeGewurztraminer", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeGrenache, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrenache", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrenacheBlanc, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrenacheBlanc", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrolleau, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrolleau", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrosMenseng, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrosMenseng", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeJacquere, 0, new ModelResourceLocation("bandb_mod:itemGrapeJacquere", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeLenDeLEl, 0, new ModelResourceLocation("bandb_mod:itemGrapeLenDeLEl", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeListan, 0, new ModelResourceLocation("bandb_mod:itemGrapeListan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMaccabeu, 0, new ModelResourceLocation("bandb_mod:itemGrapeMaccabeu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMalbec, 0, new ModelResourceLocation("bandb_mod:itemGrapeMalbec", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMalvoisie, 0, new ModelResourceLocation("bandb_mod:itemGrapeMalvoisie", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMarsanne, 0, new ModelResourceLocation("bandb_mod:itemGrapeMarsanne", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMarselan, 0, new ModelResourceLocation("bandb_mod:itemGrapeMarselan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMauzac, 0, new ModelResourceLocation("bandb_mod:itemGrapeMauzac", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMelon, 0, new ModelResourceLocation("bandb_mod:itemGrapeMelon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMelonDeBourgogne, 0, new ModelResourceLocation("bandb_mod:itemGrapeMelonDeBourgogne", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMerlot, 0, new ModelResourceLocation("bandb_mod:itemGrapeMerlot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMolette, 0, new ModelResourceLocation("bandb_mod:itemGrapeMolette", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMollard, 0, new ModelResourceLocation("bandb_mod:itemGrapeMollard", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMondeuse, 0, new ModelResourceLocation("bandb_mod:itemGrapeMondeuse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMondeuseBlanche, 0, new ModelResourceLocation("bandb_mod:itemGrapeMondeuseBlanche", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMourvedre, 0, new ModelResourceLocation("bandb_mod:itemGrapeMourvedre", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscadelle, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscadelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscardin, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscardin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscatBlancAPetitsGrains, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscatBlancAPetitsGrains", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscatDAlexandrie, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscatDAlexandrie", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeNegrette, 0, new ModelResourceLocation("bandb_mod:itemGrapeNegrette", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeNielluccio, 0, new ModelResourceLocation("bandb_mod:itemGrapeNielluccio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePagaDebiti, 0, new ModelResourceLocation("bandb_mod:itemGrapePagaDebiti", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePetitCourbu, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitCourbu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePetitMenseng, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitMenseng", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapePetitVerdot, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitVerdot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePineauDAunis, 0, new ModelResourceLocation("bandb_mod:itemGrapePineauDAunis", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotBlanc, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotBlanc", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotMeunier, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotMeunier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotNoir, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotNoir", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapePiquepoul, 0, new ModelResourceLocation("bandb_mod:itemGrapePiquepoul", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePoulsard, 0, new ModelResourceLocation("bandb_mod:itemGrapePoulsard", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRiesling, 0, new ModelResourceLocation("bandb_mod:itemGrapeRiesling", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRomorantin, 0, new ModelResourceLocation("bandb_mod:itemGrapeRomorantin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRossulaBianca, 0, new ModelResourceLocation("bandb_mod:itemGrapeRossulaBianca", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeSacy, 0, new ModelResourceLocation("bandb_mod:itemGrapeSacy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSauvignon, 0, new ModelResourceLocation("bandb_mod:itemGrapeSauvignon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSavagnin, 0, new ModelResourceLocation("bandb_mod:itemGrapeSavagnin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSemillon, 0, new ModelResourceLocation("bandb_mod:itemGrapeSemillon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSylvaner, 0, new ModelResourceLocation("bandb_mod:itemGrapeSylvaner", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeSyrah, 0, new ModelResourceLocation("bandb_mod:itemGrapeSyrah", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTannat, 0, new ModelResourceLocation("bandb_mod:itemGrapeTannat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTeoulier, 0, new ModelResourceLocation("bandb_mod:itemGrapeTeoulier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTerretNoir, 0, new ModelResourceLocation("bandb_mod:itemGrapeTerretNoir", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTibouren, 0, new ModelResourceLocation("bandb_mod:itemGrapeTibouren", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeTressalier, 0, new ModelResourceLocation("bandb_mod:itemGrapeTressalier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeUgniBlanc, 0, new ModelResourceLocation("bandb_mod:itemGrapeUgniBlanc", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeVaccarese, 0, new ModelResourceLocation("bandb_mod:itemGrapeVaccarese", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeVermentinu, 0, new ModelResourceLocation("bandb_mod:itemGrapeVermentinu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeViognier, 0, new ModelResourceLocation("bandb_mod:itemGrapeViognier", "inventory"));
	
	//vegetable
		ModelLoader.setCustomModelResourceLocation(itemVegetableAsparagus, 0, new ModelResourceLocation("bandb_mod:itemVegetableAsparagus", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableAvocado, 0, new ModelResourceLocation("bandb_mod:itemVegetableAvocado", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableBasil, 0, new ModelResourceLocation("bandb_mod:itemVegetableBasil", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableBeet, 0, new ModelResourceLocation("bandb_mod:itemVegetableBeet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableBroccoli, 0, new ModelResourceLocation("bandb_mod:itemVegetableBroccoli", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableBrusselsSprout, 0, new ModelResourceLocation("bandb_mod:itemVegetableBrusselsSprout", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCabbage, 0, new ModelResourceLocation("bandb_mod:itemVegetableCabbage", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCardamom, 0, new ModelResourceLocation("bandb_mod:itemVegetableCardamom", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCarrotTouchon, 0, new ModelResourceLocation("bandb_mod:itemVegetableCarrotTouchon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCashew, 0, new ModelResourceLocation("bandb_mod:itemVegetableCashew", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableCauliflower, 0, new ModelResourceLocation("bandb_mod:itemVegetableCauliflower", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCelery, 0, new ModelResourceLocation("bandb_mod:itemVegetableCelery", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCherryTomato, 0, new ModelResourceLocation("bandb_mod:itemVegetableCherryTomato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableChickpea, 0, new ModelResourceLocation("bandb_mod:itemVegetableChickpea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableChicory, 0, new ModelResourceLocation("bandb_mod:itemVegetableChicory", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableChili, 0, new ModelResourceLocation("bandb_mod:itemVegetableChili", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableCucumber, 0, new ModelResourceLocation("bandb_mod:itemVegetableCucumber", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableEggplant, 0, new ModelResourceLocation("bandb_mod:itemVegetableEggplant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableFlageolet, 0, new ModelResourceLocation("bandb_mod:itemVegetableFlageolet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableFrenchBeans, 0, new ModelResourceLocation("bandb_mod:itemVegetableFrenchBeans", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableGarlic, 0, new ModelResourceLocation("bandb_mod:itemVegetableGarlic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableGherkin, 0, new ModelResourceLocation("bandb_mod:itemVegetableGherkin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableGinger, 0, new ModelResourceLocation("bandb_mod:itemVegetableGinger", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableLeek, 0, new ModelResourceLocation("bandb_mod:itemVegetableLeek", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableLens, 0, new ModelResourceLocation("bandb_mod:itemVegetableLens", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableOlive, 0, new ModelResourceLocation("bandb_mod:itemVegetableOlive", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableOnion, 0, new ModelResourceLocation("bandb_mod:itemVegetableOnion", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableParsley, 0, new ModelResourceLocation("bandb_mod:itemVegetableParsley", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableParsnip, 0, new ModelResourceLocation("bandb_mod:itemVegetableParsnip", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetablePea, 0, new ModelResourceLocation("bandb_mod:itemVegetablePea", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetablePeanut, 0, new ModelResourceLocation("bandb_mod:itemVegetablePeanut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetablePistachio, 0, new ModelResourceLocation("bandb_mod:itemVegetablePistachio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableRadish, 0, new ModelResourceLocation("bandb_mod:itemVegetableRadish", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableRedCabbage, 0, new ModelResourceLocation("bandb_mod:itemVegetableRedCabbage", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableRutabaga, 0, new ModelResourceLocation("bandb_mod:itemVegetableRutabaga", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableSalat, 0, new ModelResourceLocation("bandb_mod:itemVegetableSalat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableShallots, 0, new ModelResourceLocation("bandb_mod:itemVegetableShallots", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableSpinach, 0, new ModelResourceLocation("bandb_mod:itemVegetableSpinach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableSweetGreenPepper, 0, new ModelResourceLocation("bandb_mod:itemVegetableSweetGreenPepper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableSweetRedPepper, 0, new ModelResourceLocation("bandb_mod:itemVegetableSweetRedPepper", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemVegetableSweetYellowPepper, 0, new ModelResourceLocation("bandb_mod:itemVegetableSweetYellowPepper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableTomato, 0, new ModelResourceLocation("bandb_mod:itemVegetableTomato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableTurnip, 0, new ModelResourceLocation("bandb_mod:itemVegetableTurnip", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemVegetableZucchini, 0, new ModelResourceLocation("bandb_mod:itemVegetableZucchini", "inventory"));
	

	//meat 
		//raw
		ModelLoader.setCustomModelResourceLocation(itemKebabRaw, 0, new ModelResourceLocation("bandb_mod:itemKebabRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenFleshRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenFleshRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenFullRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenFullRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenLegRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenLegRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenNuggetRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenNuggetRaw", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatCowForeRibRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatCowForeRibRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatCowRumpsteakRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatCowRumpsteakRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatGoatRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatGoatRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonBrain, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonBrain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonLegRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonLegRaw", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonSaddleRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonSaddleRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonShoulderRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonShoulderRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkForeLoinRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkForeLoinRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkHamRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkHamRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkLoinChopsRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkLoinChopsRaw", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatZebraRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatZebraRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatZombieArm, 0, new ModelResourceLocation("bandb_mod:itemMeatZombieArm", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatZombieFeet, 0, new ModelResourceLocation("bandb_mod:itemMeatZombieFeet", "inventory"));

		//cooked
		
		ModelLoader.setCustomModelResourceLocation(itemMeatBloodSausage, 0, new ModelResourceLocation("bandb_mod:itemMeatBloodSausage", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatHotDogSausageCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatHotDogSausageCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatHotDogSausageRaw, 0, new ModelResourceLocation("bandb_mod:itemMeatHotDogSausageRaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatKnack, 0, new ModelResourceLocation("bandb_mod:itemMeatKnack", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatSaveloy, 0, new ModelResourceLocation("bandb_mod:itemMeatSaveloy", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatChickenFleshCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenFleshCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenFullCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenFullCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenLegCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenLegCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatChickenNuggetCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatChickenNuggetCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatCowForeRibCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatCowForeRibCooked", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatCowRumpsteakCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatCowRumpsteakCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatGoatCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatGoatCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatKebabCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatKebabCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonCookedBrain, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonCookedBrain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonLegCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonLegCooked", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonSaddleCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonSaddleCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatMuttonShoulderCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatMuttonShoulderCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkForeLoinCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkForeLoinCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkHamCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkHamCooked", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMeatPorkLoinChopsCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatPorkLoinChopsCooked", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMeatZebraCooked, 0, new ModelResourceLocation("bandb_mod:itemMeatZebraCooked", "inventory"));
		
	//Cheese
		
	//Bread

		
	}

}
