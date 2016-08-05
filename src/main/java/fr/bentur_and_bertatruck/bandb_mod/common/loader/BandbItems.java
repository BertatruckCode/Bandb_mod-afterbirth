package fr.bentur_and_bertatruck.bandb_mod.common.loader;
	
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemMiscellaneous;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemOre;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemPlant;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
	
public class BandbItems {
	
	//items ore
		//ingot
	public static Item itemGemAmethyst, itemGemOnyx, itemGemRuby, itemGemSapphire, itemGemTopaz;
	public static Item itemIngotAluminium, itemIngotCopper, itemIngotLead, itemIngotPlatinum, itemIngotSilver;
	public static Item itemIngotSteel, itemIngotTin, itemIngotTitan, itemIngotTungsten;	
		//dust
	public static Item itemDustAluminium, itemDustAmethyst, itemDustCopper, itemDustEmerald, itemDustLead;
	public static Item itemDustOnyx, itemDustPlatinum, itemDustRuby, itemDustSapphire, itemDustSilver;
	public static Item itemDustSteel, itemDustTin, itemDustTitan, itemDustTopaz, itemDustTungsten;
		//nugget
	public static Item itemNuggetAluminium, itemNuggetAmethyst, itemNuggetCopper, itemNuggetEmerald, itemNuggetLead;
	public static Item itemNuggetOnyx, itemNuggetPlatinum, itemNuggetRuby, itemNuggetSapphire, itemNuggetSilver;
	public static Item itemNuggetSteel, itemNuggetTin, itemNuggetTitan, itemNuggetTopaz, itemNuggetTungsten;	
	
	//plants
	public static Item itemPlantAgave, itemPlantAmaryllisPink, itemPlantAmaryllisRed, itemPlantAmaryllisWhite, itemPlantBachelorsButtonBlue;
	public static Item itemPlantBelladonna, itemPlantBetterCactus, itemPlantBlowball, itemPlantBluebell, itemPlantButtercup;
	public static Item itemPlantCallaBlack, itemPlantCallaWhite, itemPlantCannabis, itemPlantChervil, itemPlantChives;
	public static Item itemPlantChrysantheme, itemPlantCinchona, itemPlantCotton, itemPlantCurryLeaf, itemPlantDaisy;
	public static Item itemPlantDill, itemPlantEnzian, itemPlantFennel, itemPlantFoxglove, itemPlantGardenia;
	public static Item itemPlantGentian, itemPlantHeather, itemPlantHibiscus, itemPlantIrisBlue, itemPlantIrisPurple;
	public static Item itemPlantJasmine, itemPlantLavender, itemPlantLeafCoca, itemPlantLemonGrass, itemPlantLicorice;
	public static Item itemPlantLily, itemPlantMarshMarigold, itemPlantMint, itemPlantMustard, itemPlantNettle;
	public static Item itemPlantOrchid, itemPlantOregano, itemPlantPansy, itemPlantPeony, itemPlantPeyote;
	public static Item itemPlantRape, itemPlantRosmary, itemPlantSage, itemPlantSesame, itemPlantSyringa;
	public static Item itemPlantTarragon, itemPlantThistle, itemPlantThyme, itemPlantTobacco, itemPlantViolet;
	public static Item itemPlantWatercress, itemPlantWormwood;
		//mushrooms
	public static Item itemPlantHornOfPlenty, itemPlantAmanitaMuscaria, itemPlantCep, itemPlantHydnumRepandum, itemPlantMorel;
	public static Item itemPlantTruffle, itemPlantWhiteMushroom;
		//coffee
	public static Item itemCoffeeArabicas, itemCoffeeBlueMountain, itemCoffeeBourbonPointu, itemCoffeeCattura, itemCoffeeHarrar;
	public static Item itemCoffeeHuehuetenango, itemCoffeeJava, itemCoffeeKenyaAA, itemCoffeeKona, itemCoffeeKontirWildForest;
	public static Item itemCoffeeKopiLuwak, itemCoffeeKupeAlamid, itemCoffeeMoka, itemCoffeeMundoNovo, itemCoffeeMuragogype;
	public static Item itemCoffeePeaberry, itemCoffeeTarrazu, itemCoffeeTorajaKalossi, itemCoffeeYirgacheffe, itemTeaLeaves;
		//grains
	public static Item itemPlantBarley, itemPlantBuckwheat, itemPlantCorn, itemPlantFonio, itemPlantHemp;
	public static Item itemPlantHop, itemPlantMalt, itemPlantMillet, itemPlantOats, itemPlantPollen;
	public static Item itemPlantRice, itemPlantRye, itemPlantSesameSeed, itemPlantSorghum, itemPlantSpelt;
	public static Item itemPlantSunflowerSeed;

	//miscellaneous
	public static Item itemMiscBleach, itemMiscBookCocktailGlass, itemMiscBookCocktails, itemMiscBookOldFashioned, itemMiscBookShaker;
	public static Item itemMiscBookTumbler, itemMiscDyeBlack, itemMiscDyeBlue, itemMiscDyeWhite, itemMiscIPad;
	public static Item itemMiscIPhone, itemMiscInkCartridgeBlack, itemMiscInkCartridgeCyan, itemMiscInkCartridgeEmpty, itemMiscInkCartridgeMagenta;
	public static Item itemMiscInkCartridgeYellow, itemMiscJoint, itemMiscMac, itemMiscMinecraftForDummies, itemMiscPieceOfGlass;
	public static Item itemMiscSurprise, itemMiscSurpriseKinderRed, itemMiscSurpriseKinderYellow, itemMiscWorm;
		//leather
	public static Item itemLeatherCowBel, itemLeatherCowCharolais, itemLeatherCowGasconne, itemLeatherCowKerry, itemLeatherCowMilka;
	public static Item itemLeatherCowMontbeliarde, itemLeatherGoat;
		//egg and feather
	public static Item itemEggCassowary, itemEggDuck, itemEggGouldianFinch, itemEggGull, itemEggHummingbird;
	public static Item itemEggKingfisher, itemEggKiwi, itemEggLyrebird, itemEggMagpie, itemEggOstrich;
	public static Item itemEggParrot, itemEggPelican, itemEggPigeon, itemEggRoadrunner, itemEggSeagull;
	public static Item itemFeatherCassowary, itemFeatherDuckFemale, itemFeatherDuckMale, itemFeatherGouldianFinch1, itemFeatherGouldianFinch2;
	public static Item itemFeatherGouldianFinch3, itemFeatherGouldianFinch4, itemFeatherGouldianFinch5, itemFeatherGouldianFinch6, itemFeatherGull;
	public static Item itemFeatherHummingbirdCanvasPrint, itemFeatherHummingbirdCrimsonTopaz, itemFeatherHummingbirdFieryThroatedHummingbird, itemFeatherHummingbirdFlyingLavenderBlueHummingbird, itemFeatherHummingbirdSwordBilledHummingbird;
	public static Item itemFeatherKingfisher, itemFeatherKiwi, itemFeatherLyrebird, itemFeatherMagpie, itemFeatherOstrich;
	public static Item itemFeatherParrotAfricanGreyParrot, itemFeatherParrotBlueAndYellowMacaw, itemFeatherParrotCockatoo, itemFeatherParrotGreatGreenMacaw, itemFeatherParrotHyacinthMacaw;
	public static Item itemFeatherParrotRedAndGreenMacaw, itemFeatherPelican, itemFeatherPigeon, itemFeatherRoadrunner, itemFeatherSeagull;
			
	/** To do **/
	// tools
		//Tools Material
	public static ToolMaterial toolGode = EnumHelper.addToolMaterial("toolGode", 0, 16, 12.0F, 12.0F, 1);	
	public static ToolMaterial toolKitchen = EnumHelper.addToolMaterial("toolKitchen", 0, 128, 1.0F, 10.0F, 5);		

	public static Item itemToolGodePink,itemToolGodePurple,itemToolGodeGreen,itemToolGodeBlue,itemToolGodeRed;
		
	//kitchen tools
		//crafting tools
	public static Item itemToolBucketGoatMilk,itemToolBucketCream, itemToolKebabSpit;
	public static Item itemToolCocktailGlassDirty,itemToolFluteDirty,itemToolGlassCupDirty,itemToolOldFashonnedDirty,itemToolTumblerDirty;
	public static Item itemToolCocktailGlass,itemToolFlute,itemToolOldFashoned,itemToolTumbler,itemToolGlassCup;
	public static Item itemToolBucketBelMilk,itemToolBucketMilkaMilk;
		//durable tools
	public static Item itemToolFlyingPan,itemToolCheeseKnife,itemToolCleaverIron,itemToolKnifeIron,itemToolShaker;
	public static Item itemToolPizzaWheel,itemToolFoforkStone,itemToolCookieCutterStar,itemToolCookieCutterSquare,itemToolCookieCutterMan;
	public static Item itemToolCookieCutterCircle,itemToolCheeseGraterMachine,itemToolScrewdriver, itemToolCheeseGrater;
				
	//Butterfly
	public static Item itemButterflyAcmonBlue,itemButterflyAfricanCloudedYellow,itemButterflyAfricanMapWing,itemButterflyAfricanPeachMoth,itemButterflyAlcidesAgathyrsus;
	public static Item itemButterflyAmerilaastreus,itemButterflyApolloButterfly,itemButterflyAshButterfly,itemButterflyAtlasMoth,itemButterflyAmberPhantom;
	public static Item itemButterflyAura,itemButterflyBandedBluePierrot,itemButterflyBirchButterfly,itemButterflyBloodRedGlider,itemButterflyBlueAdmiral;
	public static Item itemButterflyBlueArgus,itemButterflyBlueEyedSailor,itemButterflyBlueMetalmare,itemButterflyBluePansy,itemButterflyBlueTigerMoth;
	public static Item itemButterflyBlushingPhantom,itemButterflyBraccaRotundata,itemButterflyBraccaSubfumosa,itemButterflyCactiButterfy,itemButterflyCardinalApollo;
	public static Item itemButterflyCinderella,itemButterflyCinnabarMoth,itemButterflyCloudButterfly,itemButterflyCloudedApollo;
	public static Item itemButterflyColombianAdmiral,itemButterflyComma,itemButterflyCommonBrimstone,itemButterflyCommonGreenBirdwing,itemButterflyCommonGreenCharaxes;
	public static Item itemButterflyCommonMestra,itemButterflyCrimsonSpottedForester,itemButterflyCrimsonTip,itemButterflyCrystalButterfly,itemButterflyDalmatianRinglet;
	public static Item itemButterflyDarkCaveButterfly,itemButterflyDarkwoodButterfly,itemButterflyDawnCloudedButterfly,itemButterflyDeathsHeadHawkmoth,itemButterflyDiadem;
	public static Item itemButterflyDiamondButterfly,itemButterflyDottedGlory,itemButterflyEasternTigerSwallowtail,itemButterflyEdwardsForester,itemButterflyEmeraldButterfly;
	public static Item itemButterflyEmeraldSwallowtail,itemButterflyEndButterfly,itemButterflyFallenBarkLooper,itemButterflyFalseCrocusGeometer,itemButterflyFrozenButterfly;
	public static Item itemButterflyGardenTigerMoth,itemButterflyGaudyCommodoreIntermediateForm,itemButterflyGaudyCommodoreSummerForm,itemButterflyGaudyCommodoreWinterForm,itemButterflyGiantNorthernSulfur;
	public static Item itemButterflyGodartsNumberwing,itemButterflyGoldBandedForester,itemButterflyGoldenBirdwing,itemButterflyGoldenJezebel,itemButterflyGoliathBirdwing;
	public static Item itemButterflyGrapevineEpimenis,itemButterflyGrayPansy,itemButterflyHewitsonsPigmy,itemButterflyHuebnersMetalmark,itemButterflyIndianRedAdmiral;
	public static Item itemButterflyIreniaMetalmark,itemButterflyIridescentForester,itemButterflyJuttaArctic,itemButterflyLargeBlue,itemButterflyLavaButterfly;
	public static Item itemButterflyLeafButterfly,itemButterflyLightCaveButterfly,itemButterflyLittleMetalmark,itemButterflyLuminescentButterflyGuardian,itemButterflyLunaMoth;
	public static Item itemButterflyLustrousButterfly,itemButterflyMacrocosmaMoth,itemButterflyMadagascanSunsetMoth,itemButterflyMagmaButterfly,itemButterflyMalachiteButterfly;
	public static Item itemButterflyMesosemiaLoruhamaCandara,itemButterflyMesosemiaPacifica,itemButterflyMilbertsTortoiseshell,itemButterflyMonarch,itemButterflyMooButterfly;
	public static Item itemButterflyMountainApollo,itemButterflyMourningCloak,itemButterflyMylittaGreenwing,itemButterflyNessusLeafwing,itemButterflyNetherrackButterfly;
	public static Item itemButterflyNetherSkullButterfly,itemButterflyNewZealandRedAdmiral,itemButterflyNorthernBrownArgus,itemButterflyNyctemeraKinabaluensis,itemButterflyNyx;
	public static Item itemButterflyOceanBlue,itemButterflyOceanBlueAbSchmidtii,itemButterflyOrangeEmigrant,itemButterflyOrangeSpottedSkipper,itemButterflyOrangeTiger;
	public static Item itemButterflyOrangeTippedAngleSulfur,itemButterflyOrnithopteraPriamusMiokensis,itemButterflyPaintedBeauty,itemButterflyPandoraPinemoth,itemButterflyPandoraSphinxMoth;
	public static Item itemButterflyPartiallyFrozenPumpkinButterfly,itemButterflyPasiphae,itemButterflyPeacock,itemButterflyPeacockJewelMoth,itemButterflyPeacockPansy;
	public static Item itemButterflyPearlCharaxes,itemButterflyPentheaMetalmark,itemButterflyPumpkinButterfly,itemButterflyPuririMoth,itemButterflyPurpleEdgedCopper;
	public static Item itemButterflyQueenVictoriasBirdwing,itemButterflyRedAdmiral,itemButterflyRedBorderedPixie,itemButterflyReedButterfly,itemButterflyRockGrayling;
	public static Item itemButterflyRoseateEmperorMoth,itemButterflyRubySpottedSwallowtail,itemButterflyRustic,itemButterflySagebrushGirdleMoth,itemButterflySaltMarshMoth;
	public static Item itemButterflySilkyOwl,itemButterflySilveryBlue,itemButterflySmallCopper,itemButterflySmallTortoiseshell,itemButterflySmallWhite;
	public static Item itemButterflySpawnerButterfly,itemButterflySturnulaMetalmark,itemButterflySwampButterfly,itemButterflySwissBrassyRinglet,itemButterflySyngraphaOrophila;
	public static Item itemButterflyTawnyCoster,itemButterflyTelegoneEyemark,itemButterflyThalainaChionoptila,itemButterflyTheanoAlpine,itemButterflyTheWanderer;
	public static Item itemButterflyTropicalCheckeredSkipper,itemButterflyTwoBarredFlasher,itemButterflyVariableBurnet,itemButterflyVoidButterfly,itemButterflyWallacesGoldenBirdwing;
	public static Item itemButterflyYellowPansy,itemButterflyZodiacMoth;				
							
	public static void register(){
		//ore
			//ingot and gem
		itemGemAmethyst = new ItemOre().setUnlocalizedName("itemGemAmethyst");
		itemGemOnyx = new ItemOre().setUnlocalizedName("itemGemOnyx");
		itemGemRuby = new ItemOre().setUnlocalizedName("itemGemRuby");
		itemGemSapphire = new ItemOre().setUnlocalizedName("itemGemSapphire");
		itemGemTopaz = new ItemOre().setUnlocalizedName("itemGemTopaz");

		GameRegistry.registerItem(itemGemAmethyst, "itemGemAmethyst");
		GameRegistry.registerItem(itemGemOnyx, "itemGemOnyx");
		GameRegistry.registerItem(itemGemRuby, "itemGemRuby");
		GameRegistry.registerItem(itemGemSapphire, "itemGemSapphire");
		GameRegistry.registerItem(itemGemTopaz, "itemGemTopaz");

		itemIngotAluminium = new ItemOre().setUnlocalizedName("itemIngotAluminium");
		itemIngotCopper = new ItemOre().setUnlocalizedName("itemIngotCopper");
		itemIngotLead = new ItemOre().setUnlocalizedName("itemIngotLead");
		itemIngotPlatinum = new ItemOre().setUnlocalizedName("itemIngotPlatinum");
		itemIngotSilver = new ItemOre().setUnlocalizedName("itemIngotSilver");

		GameRegistry.registerItem(itemIngotAluminium, "itemIngotAluminium");
		GameRegistry.registerItem(itemIngotCopper, "itemIngotCopper");
		GameRegistry.registerItem(itemIngotLead, "itemIngotLead");
		GameRegistry.registerItem(itemIngotPlatinum, "itemIngotPlatinum");
		GameRegistry.registerItem(itemIngotSilver, "itemIngotSilver");

		itemIngotSteel = new ItemOre().setUnlocalizedName("itemIngotSteel");
		itemIngotTin = new ItemOre().setUnlocalizedName("itemIngotTin");
		itemIngotTitan = new ItemOre().setUnlocalizedName("itemIngotTitan");
		itemIngotTungsten = new ItemOre().setUnlocalizedName("itemIngotTungsten");
		
		GameRegistry.registerItem(itemIngotSteel, "itemIngotSteel");
		GameRegistry.registerItem(itemIngotTin, "itemIngotTin");
		GameRegistry.registerItem(itemIngotTitan, "itemIngotTitan");
		GameRegistry.registerItem(itemIngotTungsten, "itemIngotTungsten");		
			//dust
		itemDustAluminium = new ItemOre().setUnlocalizedName("itemDustAluminium");
		itemDustAmethyst = new ItemOre().setUnlocalizedName("itemDustAmethyst");
		itemDustCopper = new ItemOre().setUnlocalizedName("itemDustCopper");
		itemDustEmerald = new ItemOre().setUnlocalizedName("itemDustEmerald");
		itemDustLead = new ItemOre().setUnlocalizedName("itemDustLead");

		GameRegistry.registerItem(itemDustAluminium, "itemDustAluminium");
		GameRegistry.registerItem(itemDustAmethyst, "itemDustAmethyst");
		GameRegistry.registerItem(itemDustCopper, "itemDustCopper");
		GameRegistry.registerItem(itemDustEmerald, "itemDustEmerald");
		GameRegistry.registerItem(itemDustLead, "itemDustLead");

		itemDustOnyx = new ItemOre().setUnlocalizedName("itemDustOnyx");
		itemDustPlatinum = new ItemOre().setUnlocalizedName("itemDustPlatinum");
		itemDustRuby = new ItemOre().setUnlocalizedName("itemDustRuby");
		itemDustSapphire = new ItemOre().setUnlocalizedName("itemDustSapphire");
		itemDustSilver = new ItemOre().setUnlocalizedName("itemDustSilver");

		GameRegistry.registerItem(itemDustOnyx, "itemDustOnyx");
		GameRegistry.registerItem(itemDustPlatinum, "itemDustPlatinum");
		GameRegistry.registerItem(itemDustRuby, "itemDustRuby");
		GameRegistry.registerItem(itemDustSapphire, "itemDustSapphire");
		GameRegistry.registerItem(itemDustSilver, "itemDustSilver");

		itemDustSteel = new ItemOre().setUnlocalizedName("itemDustSteel");
		itemDustTin = new ItemOre().setUnlocalizedName("itemDustTin");
		itemDustTitan = new ItemOre().setUnlocalizedName("itemDustTitan");
		itemDustTopaz = new ItemOre().setUnlocalizedName("itemDustTopaz");
		itemDustTungsten = new ItemOre().setUnlocalizedName("itemDustTungsten");

		GameRegistry.registerItem(itemDustSteel, "itemDustSteel");
		GameRegistry.registerItem(itemDustTin, "itemDustTin");
		GameRegistry.registerItem(itemDustTitan, "itemDustTitan");
		GameRegistry.registerItem(itemDustTopaz, "itemDustTopaz");
		GameRegistry.registerItem(itemDustTungsten, "itemDustTungsten");
			//nugget
		itemNuggetAluminium = new ItemOre().setUnlocalizedName("itemNuggetAluminium");
		itemNuggetAmethyst = new ItemOre().setUnlocalizedName("itemNuggetAmethyst");
		itemNuggetCopper = new ItemOre().setUnlocalizedName("itemNuggetCopper");
		itemNuggetEmerald = new ItemOre().setUnlocalizedName("itemNuggetEmerald");
		itemNuggetLead = new ItemOre().setUnlocalizedName("itemNuggetLead");

		GameRegistry.registerItem(itemNuggetAluminium, "itemNuggetAluminium");
		GameRegistry.registerItem(itemNuggetAmethyst, "itemNuggetAmethyst");
		GameRegistry.registerItem(itemNuggetCopper, "itemNuggetCopper");
		GameRegistry.registerItem(itemNuggetEmerald, "itemNuggetEmerald");
		GameRegistry.registerItem(itemNuggetLead, "itemNuggetLead");

		itemNuggetOnyx = new ItemOre().setUnlocalizedName("itemNuggetOnyx");
		itemNuggetPlatinum = new ItemOre().setUnlocalizedName("itemNuggetPlatinum");
		itemNuggetRuby = new ItemOre().setUnlocalizedName("itemNuggetRuby");
		itemNuggetSapphire = new ItemOre().setUnlocalizedName("itemNuggetSapphire");
		itemNuggetSilver = new ItemOre().setUnlocalizedName("itemNuggetSilver");

		GameRegistry.registerItem(itemNuggetOnyx, "itemNuggetOnyx");
		GameRegistry.registerItem(itemNuggetPlatinum, "itemNuggetPlatinum");
		GameRegistry.registerItem(itemNuggetRuby, "itemNuggetRuby");
		GameRegistry.registerItem(itemNuggetSapphire, "itemNuggetSapphire");
		GameRegistry.registerItem(itemNuggetSilver, "itemNuggetSilver");

		itemNuggetSteel = new ItemOre().setUnlocalizedName("itemNuggetSteel");
		itemNuggetTin = new ItemOre().setUnlocalizedName("itemNuggetTin");
		itemNuggetTitan = new ItemOre().setUnlocalizedName("itemNuggetTitan");
		itemNuggetTopaz = new ItemOre().setUnlocalizedName("itemNuggetTopaz");
		itemNuggetTungsten = new ItemOre().setUnlocalizedName("itemNuggetTungsten");

		GameRegistry.registerItem(itemNuggetSteel, "itemNuggetSteel");
		GameRegistry.registerItem(itemNuggetTin, "itemNuggetTin");
		GameRegistry.registerItem(itemNuggetTitan, "itemNuggetTitan");
		GameRegistry.registerItem(itemNuggetTopaz, "itemNuggetTopaz");
		GameRegistry.registerItem(itemNuggetTungsten, "itemNuggetTungsten");
		
		//plant
		itemPlantAgave = new ItemPlant().setUnlocalizedName("itemPlantAgave");
		itemPlantAmaryllisPink = new ItemPlant().setUnlocalizedName("itemPlantAmaryllisPink");
		itemPlantAmaryllisRed = new ItemPlant().setUnlocalizedName("itemPlantAmaryllisRed");
		itemPlantAmaryllisWhite = new ItemPlant().setUnlocalizedName("itemPlantAmaryllisWhite");
		itemPlantBachelorsButtonBlue = new ItemPlant().setUnlocalizedName("itemPlantBachelorsButtonBlue");

		GameRegistry.registerItem(itemPlantAgave, "itemPlantAgave");
		GameRegistry.registerItem(itemPlantAmaryllisPink, "itemPlantAmaryllisPink");
		GameRegistry.registerItem(itemPlantAmaryllisRed, "itemPlantAmaryllisRed");
		GameRegistry.registerItem(itemPlantAmaryllisWhite, "itemPlantAmaryllisWhite");
		GameRegistry.registerItem(itemPlantBachelorsButtonBlue, "itemPlantBachelorsButtonBlue");

		itemPlantBelladonna = new ItemPlant().setUnlocalizedName("itemPlantBelladonna");
		itemPlantBetterCactus = new ItemPlant().setUnlocalizedName("itemPlantBetterCactus");
		itemPlantBlowball = new ItemPlant().setUnlocalizedName("itemPlantBlowball");
		itemPlantBluebell = new ItemPlant().setUnlocalizedName("itemPlantBluebell");
		itemPlantButtercup = new ItemPlant().setUnlocalizedName("itemPlantButtercup");

		GameRegistry.registerItem(itemPlantBelladonna, "itemPlantBelladonna");
		GameRegistry.registerItem(itemPlantBetterCactus, "itemPlantBetterCactus");
		GameRegistry.registerItem(itemPlantBlowball, "itemPlantBlowball");
		GameRegistry.registerItem(itemPlantBluebell, "itemPlantBluebell");
		GameRegistry.registerItem(itemPlantButtercup, "itemPlantButtercup");

		itemPlantCallaBlack = new ItemPlant().setUnlocalizedName("itemPlantCallaBlack");
		itemPlantCallaWhite = new ItemPlant().setUnlocalizedName("itemPlantCallaWhite");
		itemPlantCannabis = new ItemPlant().setUnlocalizedName("itemPlantCannabis");
		itemPlantChervil = new ItemPlant().setUnlocalizedName("itemPlantChervil");
		itemPlantChives = new ItemPlant().setUnlocalizedName("itemPlantChives");

		GameRegistry.registerItem(itemPlantCallaBlack, "itemPlantCallaBlack");
		GameRegistry.registerItem(itemPlantCallaWhite, "itemPlantCallaWhite");
		GameRegistry.registerItem(itemPlantCannabis, "itemPlantCannabis");
		GameRegistry.registerItem(itemPlantChervil, "itemPlantChervil");
		GameRegistry.registerItem(itemPlantChives, "itemPlantChives");

		itemPlantChrysantheme = new ItemPlant().setUnlocalizedName("itemPlantChrysantheme");
		itemPlantCinchona = new ItemPlant().setUnlocalizedName("itemPlantCinchona");
		itemPlantCotton = new ItemPlant().setUnlocalizedName("itemPlantCotton");
		itemPlantCurryLeaf = new ItemPlant().setUnlocalizedName("itemPlantCurryLeaf");
		itemPlantDaisy = new ItemPlant().setUnlocalizedName("itemPlantDaisy");

		GameRegistry.registerItem(itemPlantChrysantheme, "itemPlantChrysantheme");
		GameRegistry.registerItem(itemPlantCinchona, "itemPlantCinchona");
		GameRegistry.registerItem(itemPlantCotton, "itemPlantCotton");
		GameRegistry.registerItem(itemPlantCurryLeaf, "itemPlantCurryLeaf");
		GameRegistry.registerItem(itemPlantDaisy, "itemPlantDaisy");

		itemPlantDill = new ItemPlant().setUnlocalizedName("itemPlantDill");
		itemPlantEnzian = new ItemPlant().setUnlocalizedName("itemPlantEnzian");
		itemPlantFennel = new ItemPlant().setUnlocalizedName("itemPlantFennel");
		itemPlantFoxglove = new ItemPlant().setUnlocalizedName("itemPlantFoxglove");
		itemPlantGardenia = new ItemPlant().setUnlocalizedName("itemPlantGardenia");

		GameRegistry.registerItem(itemPlantDill, "itemPlantDill");
		GameRegistry.registerItem(itemPlantEnzian, "itemPlantEnzian");
		GameRegistry.registerItem(itemPlantFennel, "itemPlantFennel");
		GameRegistry.registerItem(itemPlantFoxglove, "itemPlantFoxglove");
		GameRegistry.registerItem(itemPlantGardenia, "itemPlantGardenia");

		itemPlantGentian = new ItemPlant().setUnlocalizedName("itemPlantGentian");
		itemPlantHeather = new ItemPlant().setUnlocalizedName("itemPlantHeather");
		itemPlantHibiscus = new ItemPlant().setUnlocalizedName("itemPlantHibiscus");
		itemPlantIrisBlue = new ItemPlant().setUnlocalizedName("itemPlantIrisBlue");
		itemPlantIrisPurple = new ItemPlant().setUnlocalizedName("itemPlantIrisPurple");

		GameRegistry.registerItem(itemPlantGentian, "itemPlantGentian");
		GameRegistry.registerItem(itemPlantHeather, "itemPlantHeather");
		GameRegistry.registerItem(itemPlantHibiscus, "itemPlantHibiscus");
		GameRegistry.registerItem(itemPlantIrisBlue, "itemPlantIrisBlue");
		GameRegistry.registerItem(itemPlantIrisPurple, "itemPlantIrisPurple");

		itemPlantJasmine = new ItemPlant().setUnlocalizedName("itemPlantJasmine");
		itemPlantLavender = new ItemPlant().setUnlocalizedName("itemPlantLavender");
		itemPlantLeafCoca = new ItemPlant().setUnlocalizedName("itemPlantLeafCoca");
		itemPlantLemonGrass = new ItemPlant().setUnlocalizedName("itemPlantLemonGrass");
		itemPlantLicorice = new ItemPlant().setUnlocalizedName("itemPlantLicorice");

		GameRegistry.registerItem(itemPlantJasmine, "itemPlantJasmine");
		GameRegistry.registerItem(itemPlantLavender, "itemPlantLavender");
		GameRegistry.registerItem(itemPlantLeafCoca, "itemPlantLeafCoca");
		GameRegistry.registerItem(itemPlantLemonGrass, "itemPlantLemonGrass");
		GameRegistry.registerItem(itemPlantLicorice, "itemPlantLicorice");

		itemPlantLily = new ItemPlant().setUnlocalizedName("itemPlantLily");
		itemPlantMarshMarigold = new ItemPlant().setUnlocalizedName("itemPlantMarshMarigold");
		itemPlantMint = new ItemPlant().setUnlocalizedName("itemPlantMint");
		itemPlantMustard = new ItemPlant().setUnlocalizedName("itemPlantMustard");
		itemPlantNettle = new ItemPlant().setUnlocalizedName("itemPlantNettle");

		GameRegistry.registerItem(itemPlantLily, "itemPlantLily");
		GameRegistry.registerItem(itemPlantMarshMarigold, "itemPlantMarshMarigold");
		GameRegistry.registerItem(itemPlantMint, "itemPlantMint");
		GameRegistry.registerItem(itemPlantMustard, "itemPlantMustard");
		GameRegistry.registerItem(itemPlantNettle, "itemPlantNettle");

		itemPlantOrchid = new ItemPlant().setUnlocalizedName("itemPlantOrchid");
		itemPlantOregano = new ItemPlant().setUnlocalizedName("itemPlantOregano");
		itemPlantPansy = new ItemPlant().setUnlocalizedName("itemPlantPansy");
		itemPlantPeony = new ItemPlant().setUnlocalizedName("itemPlantPeony");
		itemPlantPeyote = new ItemPlant().setUnlocalizedName("itemPlantPeyote");

		GameRegistry.registerItem(itemPlantOrchid, "itemPlantOrchid");
		GameRegistry.registerItem(itemPlantOregano, "itemPlantOregano");
		GameRegistry.registerItem(itemPlantPansy, "itemPlantPansy");
		GameRegistry.registerItem(itemPlantPeony, "itemPlantPeony");
		GameRegistry.registerItem(itemPlantPeyote, "itemPlantPeyote");

		itemPlantRape = new ItemPlant().setUnlocalizedName("itemPlantRape");
		itemPlantRosmary = new ItemPlant().setUnlocalizedName("itemPlantRosmary");
		itemPlantSage = new ItemPlant().setUnlocalizedName("itemPlantSage");
		itemPlantSesame = new ItemPlant().setUnlocalizedName("itemPlantSesame");
		itemPlantSyringa = new ItemPlant().setUnlocalizedName("itemPlantSyringa");

		GameRegistry.registerItem(itemPlantRape, "itemPlantRape");
		GameRegistry.registerItem(itemPlantRosmary, "itemPlantRosmary");
		GameRegistry.registerItem(itemPlantSage, "itemPlantSage");
		GameRegistry.registerItem(itemPlantSesame, "itemPlantSesame");
		GameRegistry.registerItem(itemPlantSyringa, "itemPlantSyringa");

		itemPlantTarragon = new ItemPlant().setUnlocalizedName("itemPlantTarragon");
		itemPlantThistle = new ItemPlant().setUnlocalizedName("itemPlantThistle");
		itemPlantThyme = new ItemPlant().setUnlocalizedName("itemPlantThyme");
		itemPlantTobacco = new ItemPlant().setUnlocalizedName("itemPlantTobacco");
		itemPlantViolet = new ItemPlant().setUnlocalizedName("itemPlantViolet");

		GameRegistry.registerItem(itemPlantTarragon, "itemPlantTarragon");
		GameRegistry.registerItem(itemPlantThistle, "itemPlantThistle");
		GameRegistry.registerItem(itemPlantThyme, "itemPlantThyme");
		GameRegistry.registerItem(itemPlantTobacco, "itemPlantTobacco");
		GameRegistry.registerItem(itemPlantViolet, "itemPlantViolet");

		itemPlantWatercress = new ItemPlant().setUnlocalizedName("itemPlantWatercress");
		itemPlantWormwood = new ItemPlant().setUnlocalizedName("itemPlantWormwood");

		GameRegistry.registerItem(itemPlantWatercress, "itemPlantWatercress");
		GameRegistry.registerItem(itemPlantWormwood, "itemPlantWormwood");
			//mushroom
		itemPlantHornOfPlenty = new ItemPlant().setUnlocalizedName("itemPlantHornOfPlenty");
		itemPlantAmanitaMuscaria = new ItemPlant().setUnlocalizedName("itemPlantAmanitaMuscaria");
		itemPlantCep = new ItemPlant().setUnlocalizedName("itemPlantCep");
		itemPlantHydnumRepandum = new ItemPlant().setUnlocalizedName("itemPlantHydnumRepandum");
		itemPlantMorel = new ItemPlant().setUnlocalizedName("itemPlantMorel");

		GameRegistry.registerItem(itemPlantHornOfPlenty, "itemPlantHornOfPlenty");
		GameRegistry.registerItem(itemPlantAmanitaMuscaria, "itemPlantAmanitaMuscaria");
		GameRegistry.registerItem(itemPlantCep, "itemPlantCep");
		GameRegistry.registerItem(itemPlantHydnumRepandum, "itemPlantHydnumRepandum");
		GameRegistry.registerItem(itemPlantMorel, "itemPlantMorel");

		itemPlantTruffle = new ItemPlant().setUnlocalizedName("itemPlantTruffle");
		itemPlantWhiteMushroom = new ItemPlant().setUnlocalizedName("itemPlantWhiteMushroom");

		GameRegistry.registerItem(itemPlantTruffle, "itemPlantTruffle");
		GameRegistry.registerItem(itemPlantWhiteMushroom, "itemPlantWhiteMushroom");
			//coffee
		itemCoffeeArabicas = new ItemPlant().setUnlocalizedName("itemCoffeeArabicas");
		itemCoffeeBlueMountain = new ItemPlant().setUnlocalizedName("itemCoffeeBlueMountain");
		itemCoffeeBourbonPointu = new ItemPlant().setUnlocalizedName("itemCoffeeBourbonPointu");
		itemCoffeeCattura = new ItemPlant().setUnlocalizedName("itemCoffeeCattura");
		itemCoffeeHarrar = new ItemPlant().setUnlocalizedName("itemCoffeeHarrar");

		GameRegistry.registerItem(itemCoffeeArabicas, "itemCoffeeArabicas");
		GameRegistry.registerItem(itemCoffeeBlueMountain, "itemCoffeeBlueMountain");
		GameRegistry.registerItem(itemCoffeeBourbonPointu, "itemCoffeeBourbonPointu");
		GameRegistry.registerItem(itemCoffeeCattura, "itemCoffeeCattura");
		GameRegistry.registerItem(itemCoffeeHarrar, "itemCoffeeHarrar");

		itemCoffeeHuehuetenango = new ItemPlant().setUnlocalizedName("itemCoffeeHuehuetenango");
		itemCoffeeJava = new ItemPlant().setUnlocalizedName("itemCoffeeJava");
		itemCoffeeKenyaAA = new ItemPlant().setUnlocalizedName("itemCoffeeKenyaAA");
		itemCoffeeKona = new ItemPlant().setUnlocalizedName("itemCoffeeKona");
		itemCoffeeKontirWildForest = new ItemPlant().setUnlocalizedName("itemCoffeeKontirWildForest");

		GameRegistry.registerItem(itemCoffeeHuehuetenango, "itemCoffeeHuehuetenango");
		GameRegistry.registerItem(itemCoffeeJava, "itemCoffeeJava");
		GameRegistry.registerItem(itemCoffeeKenyaAA, "itemCoffeeKenyaAA");
		GameRegistry.registerItem(itemCoffeeKona, "itemCoffeeKona");
		GameRegistry.registerItem(itemCoffeeKontirWildForest, "itemCoffeeKontirWildForest");

		itemCoffeeKopiLuwak = new ItemPlant().setUnlocalizedName("itemCoffeeKopiLuwak");
		itemCoffeeKupeAlamid = new ItemPlant().setUnlocalizedName("itemCoffeeKupeAlamid");
		itemCoffeeMoka = new ItemPlant().setUnlocalizedName("itemCoffeeMoka");
		itemCoffeeMundoNovo = new ItemPlant().setUnlocalizedName("itemCoffeeMundoNovo");
		itemCoffeeMuragogype = new ItemPlant().setUnlocalizedName("itemCoffeeMuragogype");

		GameRegistry.registerItem(itemCoffeeKopiLuwak, "itemCoffeeKopiLuwak");
		GameRegistry.registerItem(itemCoffeeKupeAlamid, "itemCoffeeKupeAlamid");
		GameRegistry.registerItem(itemCoffeeMoka, "itemCoffeeMoka");
		GameRegistry.registerItem(itemCoffeeMundoNovo, "itemCoffeeMundoNovo");
		GameRegistry.registerItem(itemCoffeeMuragogype, "itemCoffeeMuragogype");

		itemCoffeePeaberry = new ItemPlant().setUnlocalizedName("itemCoffeePeaberry");
		itemCoffeeTarrazu = new ItemPlant().setUnlocalizedName("itemCoffeeTarrazu");
		itemCoffeeTorajaKalossi = new ItemPlant().setUnlocalizedName("itemCoffeeTorajaKalossi");
		itemCoffeeYirgacheffe = new ItemPlant().setUnlocalizedName("itemCoffeeYirgacheffe");
		itemTeaLeaves = new ItemPlant().setUnlocalizedName("itemTeaLeaves");

		GameRegistry.registerItem(itemCoffeePeaberry, "itemCoffeePeaberry");
		GameRegistry.registerItem(itemCoffeeTarrazu, "itemCoffeeTarrazu");
		GameRegistry.registerItem(itemCoffeeTorajaKalossi, "itemCoffeeTorajaKalossi");
		GameRegistry.registerItem(itemCoffeeYirgacheffe, "itemCoffeeYirgacheffe");
		GameRegistry.registerItem(itemTeaLeaves, "itemTeaLeaves");
			//grains
		itemPlantBarley = new ItemPlant().setUnlocalizedName("itemPlantBarley");
		itemPlantBuckwheat = new ItemPlant().setUnlocalizedName("itemPlantBuckwheat");
		itemPlantCorn = new ItemPlant().setUnlocalizedName("itemPlantCorn");
		itemPlantFonio = new ItemPlant().setUnlocalizedName("itemPlantFonio");
		itemPlantHemp = new ItemPlant().setUnlocalizedName("itemPlantHemp");

		GameRegistry.registerItem(itemPlantBarley, "itemPlantBarley");
		GameRegistry.registerItem(itemPlantBuckwheat, "itemPlantBuckwheat");
		GameRegistry.registerItem(itemPlantCorn, "itemPlantCorn");
		GameRegistry.registerItem(itemPlantFonio, "itemPlantFonio");
		GameRegistry.registerItem(itemPlantHemp, "itemPlantHemp");

		itemPlantHop = new ItemPlant().setUnlocalizedName("itemPlantHop");
		itemPlantMalt = new ItemPlant().setUnlocalizedName("itemPlantMalt");
		itemPlantMillet = new ItemPlant().setUnlocalizedName("itemPlantMillet");
		itemPlantOats = new ItemPlant().setUnlocalizedName("itemPlantOats");
		itemPlantPollen = new ItemPlant().setUnlocalizedName("itemPlantPollen");

		GameRegistry.registerItem(itemPlantHop, "itemPlantHop");
		GameRegistry.registerItem(itemPlantMalt, "itemPlantMalt");
		GameRegistry.registerItem(itemPlantMillet, "itemPlantMillet");
		GameRegistry.registerItem(itemPlantOats, "itemPlantOats");
		GameRegistry.registerItem(itemPlantPollen, "itemPlantPollen");

		itemPlantRice = new ItemPlant().setUnlocalizedName("itemPlantRice");
		itemPlantRye = new ItemPlant().setUnlocalizedName("itemPlantRye");
		itemPlantSesameSeed = new ItemPlant().setUnlocalizedName("itemPlantSesameSeed");
		itemPlantSorghum = new ItemPlant().setUnlocalizedName("itemPlantSorghum");
		itemPlantSpelt = new ItemPlant().setUnlocalizedName("itemPlantSpelt");

		GameRegistry.registerItem(itemPlantRice, "itemPlantRice");
		GameRegistry.registerItem(itemPlantRye, "itemPlantRye");
		GameRegistry.registerItem(itemPlantSesameSeed, "itemPlantSesameSeed");
		GameRegistry.registerItem(itemPlantSorghum, "itemPlantSorghum");
		GameRegistry.registerItem(itemPlantSpelt, "itemPlantSpelt");

		itemPlantSunflowerSeed = new ItemPlant().setUnlocalizedName("itemPlantSunflowerSeed");

		GameRegistry.registerItem(itemPlantSunflowerSeed, "itemPlantSunflowerSeed");
		
		//miscellaneous
		itemMiscBleach = new ItemMiscellaneous().setUnlocalizedName("itemMiscBleach");
		itemMiscBookCocktailGlass = new ItemMiscellaneous().setUnlocalizedName("itemMiscBookCocktailGlass");
		itemMiscBookCocktails = new ItemMiscellaneous().setUnlocalizedName("itemMiscBookCocktails");
		itemMiscBookOldFashioned = new ItemMiscellaneous().setUnlocalizedName("itemMiscBookOldFashioned");
		itemMiscBookShaker = new ItemMiscellaneous().setUnlocalizedName("itemMiscBookShaker");

		GameRegistry.registerItem(itemMiscBleach, "itemMiscBleach");
		GameRegistry.registerItem(itemMiscBookCocktailGlass, "itemMiscBookCocktailGlass");
		GameRegistry.registerItem(itemMiscBookCocktails, "itemMiscBookCocktails");
		GameRegistry.registerItem(itemMiscBookOldFashioned, "itemMiscBookOldFashioned");
		GameRegistry.registerItem(itemMiscBookShaker, "itemMiscBookShaker");

		itemMiscBookTumbler = new ItemMiscellaneous().setUnlocalizedName("itemMiscBookTumbler");
		itemMiscDyeBlack = new ItemMiscellaneous().setUnlocalizedName("itemMiscDyeBlack");
		itemMiscDyeBlue = new ItemMiscellaneous().setUnlocalizedName("itemMiscDyeBlue");
		itemMiscDyeWhite = new ItemMiscellaneous().setUnlocalizedName("itemMiscDyeWhite");
		itemMiscIPad = new ItemMiscellaneous().setUnlocalizedName("itemMiscIPad");

		GameRegistry.registerItem(itemMiscBookTumbler, "itemMiscBookTumbler");
		GameRegistry.registerItem(itemMiscDyeBlack, "itemMiscDyeBlack");
		GameRegistry.registerItem(itemMiscDyeBlue, "itemMiscDyeBlue");
		GameRegistry.registerItem(itemMiscDyeWhite, "itemMiscDyeWhite");
		GameRegistry.registerItem(itemMiscIPad, "itemMiscIPad");

		itemMiscIPhone = new ItemMiscellaneous().setUnlocalizedName("itemMiscIPhone");
		itemMiscInkCartridgeBlack = new ItemMiscellaneous().setUnlocalizedName("itemMiscInkCartridgeBlack");
		itemMiscInkCartridgeCyan = new ItemMiscellaneous().setUnlocalizedName("itemMiscInkCartridgeCyan");
		itemMiscInkCartridgeEmpty = new ItemMiscellaneous().setUnlocalizedName("itemMiscInkCartridgeEmpty");
		itemMiscInkCartridgeMagenta = new ItemMiscellaneous().setUnlocalizedName("itemMiscInkCartridgeMagenta");

		GameRegistry.registerItem(itemMiscIPhone, "itemMiscIPhone");
		GameRegistry.registerItem(itemMiscInkCartridgeBlack, "itemMiscInkCartridgeBlack");
		GameRegistry.registerItem(itemMiscInkCartridgeCyan, "itemMiscInkCartridgeCyan");
		GameRegistry.registerItem(itemMiscInkCartridgeEmpty, "itemMiscInkCartridgeEmpty");
		GameRegistry.registerItem(itemMiscInkCartridgeMagenta, "itemMiscInkCartridgeMagenta");

		itemMiscInkCartridgeYellow = new ItemMiscellaneous().setUnlocalizedName("itemMiscInkCartridgeYellow");
		itemMiscJoint = new ItemMiscellaneous().setUnlocalizedName("itemMiscJoint");
		itemMiscMac = new ItemMiscellaneous().setUnlocalizedName("itemMiscMac");
		itemMiscMinecraftForDummies = new ItemMiscellaneous().setUnlocalizedName("itemMiscMinecraftForDummies");
		itemMiscPieceOfGlass = new ItemMiscellaneous().setUnlocalizedName("itemMiscPieceOfGlass");

		GameRegistry.registerItem(itemMiscInkCartridgeYellow, "itemMiscInkCartridgeYellow");
		GameRegistry.registerItem(itemMiscJoint, "itemMiscJoint");
		GameRegistry.registerItem(itemMiscMac, "itemMiscMac");
		GameRegistry.registerItem(itemMiscMinecraftForDummies, "itemMiscMinecraftForDummies");
		GameRegistry.registerItem(itemMiscPieceOfGlass, "itemMiscPieceOfGlass");

		itemMiscSurprise = new ItemMiscellaneous().setUnlocalizedName("itemMiscSurprise");
		itemMiscSurpriseKinderRed = new ItemMiscellaneous().setUnlocalizedName("itemMiscSurpriseKinderRed");
		itemMiscSurpriseKinderYellow = new ItemMiscellaneous().setUnlocalizedName("itemMiscSurpriseKinderYellow");
		itemMiscWorm = new ItemMiscellaneous().setUnlocalizedName("itemMiscWorm");
			//leather
		itemLeatherCowBel = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowBel");
		itemLeatherCowCharolais = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowCharolais");
		itemLeatherCowGasconne = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowGasconne");
		itemLeatherCowKerry = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowKerry");
		itemLeatherCowMilka = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowMilka");

		GameRegistry.registerItem(itemLeatherCowBel, "itemLeatherCowBel");
		GameRegistry.registerItem(itemLeatherCowCharolais, "itemLeatherCowCharolais");
		GameRegistry.registerItem(itemLeatherCowGasconne, "itemLeatherCowGasconne");
		GameRegistry.registerItem(itemLeatherCowKerry, "itemLeatherCowKerry");
		GameRegistry.registerItem(itemLeatherCowMilka, "itemLeatherCowMilka");

		itemLeatherCowMontbeliarde = new ItemMiscellaneous().setUnlocalizedName("itemLeatherCowMontbeliarde");
		itemLeatherGoat = new ItemMiscellaneous().setUnlocalizedName("itemLeatherGoat");

		GameRegistry.registerItem(itemLeatherCowMontbeliarde, "itemLeatherCowMontbeliarde");
		GameRegistry.registerItem(itemLeatherGoat, "itemLeatherGoat");
			//egg and feather
		itemEggCassowary = new ItemMiscellaneous().setUnlocalizedName("itemEggCassowary");
		itemEggDuck = new ItemMiscellaneous().setUnlocalizedName("itemEggDuck");
		itemEggGouldianFinch = new ItemMiscellaneous().setUnlocalizedName("itemEggGouldianFinch");
		itemEggGull = new ItemMiscellaneous().setUnlocalizedName("itemEggGull");
		itemEggHummingbird = new ItemMiscellaneous().setUnlocalizedName("itemEggHummingbird");

		GameRegistry.registerItem(itemEggCassowary, "itemEggCassowary");
		GameRegistry.registerItem(itemEggDuck, "itemEggDuck");
		GameRegistry.registerItem(itemEggGouldianFinch, "itemEggGouldianFinch");
		GameRegistry.registerItem(itemEggGull, "itemEggGull");
		GameRegistry.registerItem(itemEggHummingbird, "itemEggHummingbird");

		itemEggKingfisher = new ItemMiscellaneous().setUnlocalizedName("itemEggKingfisher");
		itemEggKiwi = new ItemMiscellaneous().setUnlocalizedName("itemEggKiwi");
		itemEggLyrebird = new ItemMiscellaneous().setUnlocalizedName("itemEggLyrebird");
		itemEggMagpie = new ItemMiscellaneous().setUnlocalizedName("itemEggMagpie");
		itemEggOstrich = new ItemMiscellaneous().setUnlocalizedName("itemEggOstrich");

		GameRegistry.registerItem(itemEggKingfisher, "itemEggKingfisher");
		GameRegistry.registerItem(itemEggKiwi, "itemEggKiwi");
		GameRegistry.registerItem(itemEggLyrebird, "itemEggLyrebird");
		GameRegistry.registerItem(itemEggMagpie, "itemEggMagpie");
		GameRegistry.registerItem(itemEggOstrich, "itemEggOstrich");

		itemEggParrot = new ItemMiscellaneous().setUnlocalizedName("itemEggParrot");
		itemEggPelican = new ItemMiscellaneous().setUnlocalizedName("itemEggPelican");
		itemEggPigeon = new ItemMiscellaneous().setUnlocalizedName("itemEggPigeon");
		itemEggRoadrunner = new ItemMiscellaneous().setUnlocalizedName("itemEggRoadrunner");
		itemEggSeagull = new ItemMiscellaneous().setUnlocalizedName("itemEggSeagull");

		GameRegistry.registerItem(itemEggParrot, "itemEggParrot");
		GameRegistry.registerItem(itemEggPelican, "itemEggPelican");
		GameRegistry.registerItem(itemEggPigeon, "itemEggPigeon");
		GameRegistry.registerItem(itemEggRoadrunner, "itemEggRoadrunner");
		GameRegistry.registerItem(itemEggSeagull, "itemEggSeagull");

		itemFeatherCassowary = new ItemMiscellaneous().setUnlocalizedName("itemFeatherCassowary");
		itemFeatherDuckFemale = new ItemMiscellaneous().setUnlocalizedName("itemFeatherDuckFemale");
		itemFeatherDuckMale = new ItemMiscellaneous().setUnlocalizedName("itemFeatherDuckMale");
		itemFeatherGouldianFinch1 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch1");
		itemFeatherGouldianFinch2 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch2");

		GameRegistry.registerItem(itemFeatherCassowary, "itemFeatherCassowary");
		GameRegistry.registerItem(itemFeatherDuckFemale, "itemFeatherDuckFemale");
		GameRegistry.registerItem(itemFeatherDuckMale, "itemFeatherDuckMale");
		GameRegistry.registerItem(itemFeatherGouldianFinch1, "itemFeatherGouldianFinch1");
		GameRegistry.registerItem(itemFeatherGouldianFinch2, "itemFeatherGouldianFinch2");

		itemFeatherGouldianFinch3 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch3");
		itemFeatherGouldianFinch4 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch4");
		itemFeatherGouldianFinch5 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch5");
		itemFeatherGouldianFinch6 = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGouldianFinch6");
		itemFeatherGull = new ItemMiscellaneous().setUnlocalizedName("itemFeatherGull");

		GameRegistry.registerItem(itemFeatherGouldianFinch3, "itemFeatherGouldianFinch3");
		GameRegistry.registerItem(itemFeatherGouldianFinch4, "itemFeatherGouldianFinch4");
		GameRegistry.registerItem(itemFeatherGouldianFinch5, "itemFeatherGouldianFinch5");
		GameRegistry.registerItem(itemFeatherGouldianFinch6, "itemFeatherGouldianFinch6");
		GameRegistry.registerItem(itemFeatherGull, "itemFeatherGull");

		itemFeatherHummingbirdCanvasPrint = new ItemMiscellaneous().setUnlocalizedName("itemFeatherHummingbirdCanvasPrint");
		itemFeatherHummingbirdCrimsonTopaz = new ItemMiscellaneous().setUnlocalizedName("itemFeatherHummingbirdCrimsonTopaz");
		itemFeatherHummingbirdFieryThroatedHummingbird = new ItemMiscellaneous().setUnlocalizedName("itemFeatherHummingbirdFieryThroatedHummingbird");
		itemFeatherHummingbirdFlyingLavenderBlueHummingbird = new ItemMiscellaneous().setUnlocalizedName("itemFeatherHummingbirdFlyingLavenderBlueHummingbird");
		itemFeatherHummingbirdSwordBilledHummingbird = new ItemMiscellaneous().setUnlocalizedName("itemFeatherHummingbirdSwordBilledHummingbird");

		GameRegistry.registerItem(itemFeatherHummingbirdCanvasPrint, "itemFeatherHummingbirdCanvasPrint");
		GameRegistry.registerItem(itemFeatherHummingbirdCrimsonTopaz, "itemFeatherHummingbirdCrimsonTopaz");
		GameRegistry.registerItem(itemFeatherHummingbirdFieryThroatedHummingbird, "itemFeatherHummingbirdFieryThroatedHummingbird");
		GameRegistry.registerItem(itemFeatherHummingbirdFlyingLavenderBlueHummingbird, "itemFeatherHummingbirdFlyingLavenderBlueHummingbird");
		GameRegistry.registerItem(itemFeatherHummingbirdSwordBilledHummingbird, "itemFeatherHummingbirdSwordBilledHummingbird");

		itemFeatherKingfisher = new ItemMiscellaneous().setUnlocalizedName("itemFeatherKingfisher");
		itemFeatherKiwi = new ItemMiscellaneous().setUnlocalizedName("itemFeatherKiwi");
		itemFeatherLyrebird = new ItemMiscellaneous().setUnlocalizedName("itemFeatherLyrebird");
		itemFeatherMagpie = new ItemMiscellaneous().setUnlocalizedName("itemFeatherMagpie");
		itemFeatherOstrich = new ItemMiscellaneous().setUnlocalizedName("itemFeatherOstrich");

		GameRegistry.registerItem(itemFeatherKingfisher, "itemFeatherKingfisher");
		GameRegistry.registerItem(itemFeatherKiwi, "itemFeatherKiwi");
		GameRegistry.registerItem(itemFeatherLyrebird, "itemFeatherLyrebird");
		GameRegistry.registerItem(itemFeatherMagpie, "itemFeatherMagpie");
		GameRegistry.registerItem(itemFeatherOstrich, "itemFeatherOstrich");

		itemFeatherParrotAfricanGreyParrot = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotAfricanGreyParrot");
		itemFeatherParrotBlueAndYellowMacaw = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotBlueAndYellowMacaw");
		itemFeatherParrotCockatoo = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotCockatoo");
		itemFeatherParrotGreatGreenMacaw = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotGreatGreenMacaw");
		itemFeatherParrotHyacinthMacaw = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotHyacinthMacaw");

		GameRegistry.registerItem(itemFeatherParrotAfricanGreyParrot, "itemFeatherParrotAfricanGreyParrot");
		GameRegistry.registerItem(itemFeatherParrotBlueAndYellowMacaw, "itemFeatherParrotBlueAndYellowMacaw");
		GameRegistry.registerItem(itemFeatherParrotCockatoo, "itemFeatherParrotCockatoo");
		GameRegistry.registerItem(itemFeatherParrotGreatGreenMacaw, "itemFeatherParrotGreatGreenMacaw");
		GameRegistry.registerItem(itemFeatherParrotHyacinthMacaw, "itemFeatherParrotHyacinthMacaw");

		itemFeatherParrotRedAndGreenMacaw = new ItemMiscellaneous().setUnlocalizedName("itemFeatherParrotRedAndGreenMacaw");
		itemFeatherPelican = new ItemMiscellaneous().setUnlocalizedName("itemFeatherPelican");
		itemFeatherPigeon = new ItemMiscellaneous().setUnlocalizedName("itemFeatherPigeon");
		itemFeatherRoadrunner = new ItemMiscellaneous().setUnlocalizedName("itemFeatherRoadrunner");
		itemFeatherSeagull = new ItemMiscellaneous().setUnlocalizedName("itemFeatherSeagull");

		GameRegistry.registerItem(itemFeatherParrotRedAndGreenMacaw, "itemFeatherParrotRedAndGreenMacaw");
		GameRegistry.registerItem(itemFeatherPelican, "itemFeatherPelican");
		GameRegistry.registerItem(itemFeatherPigeon, "itemFeatherPigeon");
		GameRegistry.registerItem(itemFeatherRoadrunner, "itemFeatherRoadrunner");
		GameRegistry.registerItem(itemFeatherSeagull, "itemFeatherSeagull");
		
	}

	public static void registerRender(){
		//ore
			//ingot and gem
		ModelLoader.setCustomModelResourceLocation(itemGemAmethyst, 0, new ModelResourceLocation("bandb_mod:itemGemAmethyst", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGemOnyx, 0, new ModelResourceLocation("bandb_mod:itemGemOnyx", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGemRuby, 0, new ModelResourceLocation("bandb_mod:itemGemRuby", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGemSapphire, 0, new ModelResourceLocation("bandb_mod:itemGemSapphire", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGemTopaz, 0, new ModelResourceLocation("bandb_mod:itemGemTopaz", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngotAluminium, 0, new ModelResourceLocation("bandb_mod:itemIngotAluminium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotCopper, 0, new ModelResourceLocation("bandb_mod:itemIngotCopper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotLead, 0, new ModelResourceLocation("bandb_mod:itemIngotLead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotPlatinum, 0, new ModelResourceLocation("bandb_mod:itemIngotPlatinum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotSilver, 0, new ModelResourceLocation("bandb_mod:itemIngotSilver", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemIngotSteel, 0, new ModelResourceLocation("bandb_mod:itemIngotSteel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotTin, 0, new ModelResourceLocation("bandb_mod:itemIngotTin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotTitan, 0, new ModelResourceLocation("bandb_mod:itemIngotTitan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemIngotTungsten, 0, new ModelResourceLocation("bandb_mod:itemIngotTungsten", "inventory"));
			//dust
		ModelLoader.setCustomModelResourceLocation(itemDustAluminium, 0, new ModelResourceLocation("bandb_mod:itemDustAluminium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustAmethyst, 0, new ModelResourceLocation("bandb_mod:itemDustAmethyst", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustCopper, 0, new ModelResourceLocation("bandb_mod:itemDustCopper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustEmerald, 0, new ModelResourceLocation("bandb_mod:itemDustEmerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustLead, 0, new ModelResourceLocation("bandb_mod:itemDustLead", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemDustOnyx, 0, new ModelResourceLocation("bandb_mod:itemDustOnyx", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustPlatinum, 0, new ModelResourceLocation("bandb_mod:itemDustPlatinum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustRuby, 0, new ModelResourceLocation("bandb_mod:itemDustRuby", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustSapphire, 0, new ModelResourceLocation("bandb_mod:itemDustSapphire", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustSilver, 0, new ModelResourceLocation("bandb_mod:itemDustSilver", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemDustSteel, 0, new ModelResourceLocation("bandb_mod:itemDustSteel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustTin, 0, new ModelResourceLocation("bandb_mod:itemDustTin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustTitan, 0, new ModelResourceLocation("bandb_mod:itemDustTitan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustTopaz, 0, new ModelResourceLocation("bandb_mod:itemDustTopaz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDustTungsten, 0, new ModelResourceLocation("bandb_mod:itemDustTungsten", "inventory"));
			//nugget
		ModelLoader.setCustomModelResourceLocation(itemNuggetAluminium, 0, new ModelResourceLocation("bandb_mod:itemNuggetAluminium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetAmethyst, 0, new ModelResourceLocation("bandb_mod:itemNuggetAmethyst", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetCopper, 0, new ModelResourceLocation("bandb_mod:itemNuggetCopper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetEmerald, 0, new ModelResourceLocation("bandb_mod:itemNuggetEmerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetLead, 0, new ModelResourceLocation("bandb_mod:itemNuggetLead", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemNuggetOnyx, 0, new ModelResourceLocation("bandb_mod:itemNuggetOnyx", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetPlatinum, 0, new ModelResourceLocation("bandb_mod:itemNuggetPlatinum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetRuby, 0, new ModelResourceLocation("bandb_mod:itemNuggetRuby", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetSapphire, 0, new ModelResourceLocation("bandb_mod:itemNuggetSapphire", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetSilver, 0, new ModelResourceLocation("bandb_mod:itemNuggetSilver", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemNuggetSteel, 0, new ModelResourceLocation("bandb_mod:itemNuggetSteel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetTin, 0, new ModelResourceLocation("bandb_mod:itemNuggetTin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetTitan, 0, new ModelResourceLocation("bandb_mod:itemNuggetTitan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetTopaz, 0, new ModelResourceLocation("bandb_mod:itemNuggetTopaz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemNuggetTungsten, 0, new ModelResourceLocation("bandb_mod:itemNuggetTungsten", "inventory"));

		//plant
		ModelLoader.setCustomModelResourceLocation(itemPlantAgave, 0, new ModelResourceLocation("bandb_mod:itemPlantAgave", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantAmaryllisPink, 0, new ModelResourceLocation("bandb_mod:itemPlantAmaryllisPink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantAmaryllisRed, 0, new ModelResourceLocation("bandb_mod:itemPlantAmaryllisRed", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantAmaryllisWhite, 0, new ModelResourceLocation("bandb_mod:itemPlantAmaryllisWhite", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantBachelorsButtonBlue, 0, new ModelResourceLocation("bandb_mod:itemPlantBachelorsButtonBlue", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantBelladonna, 0, new ModelResourceLocation("bandb_mod:itemPlantBelladonna", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantBetterCactus, 0, new ModelResourceLocation("bandb_mod:itemPlantBetterCactus", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantBlowball, 0, new ModelResourceLocation("bandb_mod:itemPlantBlowball", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantBluebell, 0, new ModelResourceLocation("bandb_mod:itemPlantBluebell", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantButtercup, 0, new ModelResourceLocation("bandb_mod:itemPlantButtercup", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantCallaBlack, 0, new ModelResourceLocation("bandb_mod:itemPlantCallaBlack", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCallaWhite, 0, new ModelResourceLocation("bandb_mod:itemPlantCallaWhite", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCannabis, 0, new ModelResourceLocation("bandb_mod:itemPlantCannabis", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantChervil, 0, new ModelResourceLocation("bandb_mod:itemPlantChervil", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantChives, 0, new ModelResourceLocation("bandb_mod:itemPlantChives", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantChrysantheme, 0, new ModelResourceLocation("bandb_mod:itemPlantChrysantheme", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCinchona, 0, new ModelResourceLocation("bandb_mod:itemPlantCinchona", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCotton, 0, new ModelResourceLocation("bandb_mod:itemPlantCotton", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCurryLeaf, 0, new ModelResourceLocation("bandb_mod:itemPlantCurryLeaf", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantDaisy, 0, new ModelResourceLocation("bandb_mod:itemPlantDaisy", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantDill, 0, new ModelResourceLocation("bandb_mod:itemPlantDill", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantEnzian, 0, new ModelResourceLocation("bandb_mod:itemPlantEnzian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantFennel, 0, new ModelResourceLocation("bandb_mod:itemPlantFennel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantFoxglove, 0, new ModelResourceLocation("bandb_mod:itemPlantFoxglove", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantGardenia, 0, new ModelResourceLocation("bandb_mod:itemPlantGardenia", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantGentian, 0, new ModelResourceLocation("bandb_mod:itemPlantGentian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantHeather, 0, new ModelResourceLocation("bandb_mod:itemPlantHeather", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantHibiscus, 0, new ModelResourceLocation("bandb_mod:itemPlantHibiscus", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantIrisBlue, 0, new ModelResourceLocation("bandb_mod:itemPlantIrisBlue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantIrisPurple, 0, new ModelResourceLocation("bandb_mod:itemPlantIrisPurple", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantJasmine, 0, new ModelResourceLocation("bandb_mod:itemPlantJasmine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantLavender, 0, new ModelResourceLocation("bandb_mod:itemPlantLavender", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantLeafCoca, 0, new ModelResourceLocation("bandb_mod:itemPlantLeafCoca", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantLemonGrass, 0, new ModelResourceLocation("bandb_mod:itemPlantLemonGrass", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantLicorice, 0, new ModelResourceLocation("bandb_mod:itemPlantLicorice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantLily, 0, new ModelResourceLocation("bandb_mod:itemPlantLily", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMarshMarigold, 0, new ModelResourceLocation("bandb_mod:itemPlantMarshMarigold", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMint, 0, new ModelResourceLocation("bandb_mod:itemPlantMint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMustard, 0, new ModelResourceLocation("bandb_mod:itemPlantMustard", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantNettle, 0, new ModelResourceLocation("bandb_mod:itemPlantNettle", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantOrchid, 0, new ModelResourceLocation("bandb_mod:itemPlantOrchid", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantOregano, 0, new ModelResourceLocation("bandb_mod:itemPlantOregano", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantPansy, 0, new ModelResourceLocation("bandb_mod:itemPlantPansy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantPeony, 0, new ModelResourceLocation("bandb_mod:itemPlantPeony", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantPeyote, 0, new ModelResourceLocation("bandb_mod:itemPlantPeyote", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantRape, 0, new ModelResourceLocation("bandb_mod:itemPlantRape", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantRosmary, 0, new ModelResourceLocation("bandb_mod:itemPlantRosmary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSage, 0, new ModelResourceLocation("bandb_mod:itemPlantSage", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSesame, 0, new ModelResourceLocation("bandb_mod:itemPlantSesame", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSyringa, 0, new ModelResourceLocation("bandb_mod:itemPlantSyringa", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantTarragon, 0, new ModelResourceLocation("bandb_mod:itemPlantTarragon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantThistle, 0, new ModelResourceLocation("bandb_mod:itemPlantThistle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantThyme, 0, new ModelResourceLocation("bandb_mod:itemPlantThyme", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantTobacco, 0, new ModelResourceLocation("bandb_mod:itemPlantTobacco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantViolet, 0, new ModelResourceLocation("bandb_mod:itemPlantViolet", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantWatercress, 0, new ModelResourceLocation("bandb_mod:itemPlantWatercress", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantWormwood, 0, new ModelResourceLocation("bandb_mod:itemPlantWormwood", "inventory"));
			//mushroom
		ModelLoader.setCustomModelResourceLocation(itemPlantHornOfPlenty, 0, new ModelResourceLocation("bandb_mod:itemPlantHornOfPlenty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantAmanitaMuscaria, 0, new ModelResourceLocation("bandb_mod:itemPlantAmanitaMuscaria", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCep, 0, new ModelResourceLocation("bandb_mod:itemPlantCep", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantHydnumRepandum, 0, new ModelResourceLocation("bandb_mod:itemPlantHydnumRepandum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMorel, 0, new ModelResourceLocation("bandb_mod:itemPlantMorel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantTruffle, 0, new ModelResourceLocation("bandb_mod:itemPlantTruffle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantWhiteMushroom, 0, new ModelResourceLocation("bandb_mod:itemPlantWhiteMushroom", "inventory"));
			//coffee
		ModelLoader.setCustomModelResourceLocation(itemCoffeeArabicas, 0, new ModelResourceLocation("bandb_mod:itemCoffeeArabicas", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeBlueMountain, 0, new ModelResourceLocation("bandb_mod:itemCoffeeBlueMountain", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeBourbonPointu, 0, new ModelResourceLocation("bandb_mod:itemCoffeeBourbonPointu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeCattura, 0, new ModelResourceLocation("bandb_mod:itemCoffeeCattura", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeHarrar, 0, new ModelResourceLocation("bandb_mod:itemCoffeeHarrar", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeeHuehuetenango, 0, new ModelResourceLocation("bandb_mod:itemCoffeeHuehuetenango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeJava, 0, new ModelResourceLocation("bandb_mod:itemCoffeeJava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKenyaAA, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKenyaAA", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKona, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKona", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKontirWildForest, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKontirWildForest", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeeKopiLuwak, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKopiLuwak", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKupeAlamid, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKupeAlamid", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMoka, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMoka", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMundoNovo, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMundoNovo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMuragogype, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMuragogype", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeePeaberry, 0, new ModelResourceLocation("bandb_mod:itemCoffeePeaberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeTarrazu, 0, new ModelResourceLocation("bandb_mod:itemCoffeeTarrazu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeTorajaKalossi, 0, new ModelResourceLocation("bandb_mod:itemCoffeeTorajaKalossi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeYirgacheffe, 0, new ModelResourceLocation("bandb_mod:itemCoffeeYirgacheffe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaLeaves, 0, new ModelResourceLocation("bandb_mod:itemTeaLeaves", "inventory"));
			//grains
		ModelLoader.setCustomModelResourceLocation(itemPlantBarley, 0, new ModelResourceLocation("bandb_mod:itemPlantBarley", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantBuckwheat, 0, new ModelResourceLocation("bandb_mod:itemPlantBuckwheat", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantCorn, 0, new ModelResourceLocation("bandb_mod:itemPlantCorn", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantFonio, 0, new ModelResourceLocation("bandb_mod:itemPlantFonio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantHemp, 0, new ModelResourceLocation("bandb_mod:itemPlantHemp", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantHop, 0, new ModelResourceLocation("bandb_mod:itemPlantHop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMalt, 0, new ModelResourceLocation("bandb_mod:itemPlantMalt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantMillet, 0, new ModelResourceLocation("bandb_mod:itemPlantMillet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantOats, 0, new ModelResourceLocation("bandb_mod:itemPlantOats", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantPollen, 0, new ModelResourceLocation("bandb_mod:itemPlantPollen", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantRice, 0, new ModelResourceLocation("bandb_mod:itemPlantRice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantRye, 0, new ModelResourceLocation("bandb_mod:itemPlantRye", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSesameSeed, 0, new ModelResourceLocation("bandb_mod:itemPlantSesameSeed", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSorghum, 0, new ModelResourceLocation("bandb_mod:itemPlantSorghum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPlantSpelt, 0, new ModelResourceLocation("bandb_mod:itemPlantSpelt", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemPlantSunflowerSeed, 0, new ModelResourceLocation("bandb_mod:itemPlantSunflowerSeed", "inventory"));

		//miscellaneous
		ModelLoader.setCustomModelResourceLocation(itemMiscBleach, 0, new ModelResourceLocation("bandb_mod:itemMiscBleach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscBookCocktailGlass, 0, new ModelResourceLocation("bandb_mod:itemMiscBookCocktailGlass", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscBookCocktails, 0, new ModelResourceLocation("bandb_mod:itemMiscBookCocktails", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscBookOldFashioned, 0, new ModelResourceLocation("bandb_mod:itemMiscBookOldFashioned", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscBookShaker, 0, new ModelResourceLocation("bandb_mod:itemMiscBookShaker", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMiscBookTumbler, 0, new ModelResourceLocation("bandb_mod:itemMiscBookTumbler", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscDyeBlack, 0, new ModelResourceLocation("bandb_mod:itemMiscDyeBlack", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscDyeBlue, 0, new ModelResourceLocation("bandb_mod:itemMiscDyeBlue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscDyeWhite, 0, new ModelResourceLocation("bandb_mod:itemMiscDyeWhite", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscIPad, 0, new ModelResourceLocation("bandb_mod:itemMiscIPad", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMiscIPhone, 0, new ModelResourceLocation("bandb_mod:itemMiscIPhone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscInkCartridgeBlack, 0, new ModelResourceLocation("bandb_mod:itemMiscInkCartridgeBlack", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscInkCartridgeCyan, 0, new ModelResourceLocation("bandb_mod:itemMiscInkCartridgeCyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscInkCartridgeEmpty, 0, new ModelResourceLocation("bandb_mod:itemMiscInkCartridgeEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscInkCartridgeMagenta, 0, new ModelResourceLocation("bandb_mod:itemMiscInkCartridgeMagenta", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMiscInkCartridgeYellow, 0, new ModelResourceLocation("bandb_mod:itemMiscInkCartridgeYellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscJoint, 0, new ModelResourceLocation("bandb_mod:itemMiscJoint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscMac, 0, new ModelResourceLocation("bandb_mod:itemMiscMac", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscMinecraftForDummies, 0, new ModelResourceLocation("bandb_mod:itemMiscMinecraftForDummies", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscPieceOfGlass, 0, new ModelResourceLocation("bandb_mod:itemMiscPieceOfGlass", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemMiscSurprise, 0, new ModelResourceLocation("bandb_mod:itemMiscSurprise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscSurpriseKinderRed, 0, new ModelResourceLocation("bandb_mod:itemMiscSurpriseKinderRed", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscSurpriseKinderYellow, 0, new ModelResourceLocation("bandb_mod:itemMiscSurpriseKinderYellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemMiscWorm, 0, new ModelResourceLocation("bandb_mod:itemMiscWorm", "inventory"));
			//leather
		ModelLoader.setCustomModelResourceLocation(itemLeatherCowBel, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowBel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLeatherCowCharolais, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowCharolais", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLeatherCowGasconne, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowGasconne", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLeatherCowKerry, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowKerry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLeatherCowMilka, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowMilka", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLeatherCowMontbeliarde, 0, new ModelResourceLocation("bandb_mod:itemLeatherCowMontbeliarde", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLeatherGoat, 0, new ModelResourceLocation("bandb_mod:itemLeatherGoat", "inventory"));
			//egg and feather
		ModelLoader.setCustomModelResourceLocation(itemEggCassowary, 0, new ModelResourceLocation("bandb_mod:itemEggCassowary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggDuck, 0, new ModelResourceLocation("bandb_mod:itemEggDuck", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggGouldianFinch, 0, new ModelResourceLocation("bandb_mod:itemEggGouldianFinch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggGull, 0, new ModelResourceLocation("bandb_mod:itemEggGull", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggHummingbird, 0, new ModelResourceLocation("bandb_mod:itemEggHummingbird", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemEggKingfisher, 0, new ModelResourceLocation("bandb_mod:itemEggKingfisher", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggKiwi, 0, new ModelResourceLocation("bandb_mod:itemEggKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggLyrebird, 0, new ModelResourceLocation("bandb_mod:itemEggLyrebird", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggMagpie, 0, new ModelResourceLocation("bandb_mod:itemEggMagpie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggOstrich, 0, new ModelResourceLocation("bandb_mod:itemEggOstrich", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemEggParrot, 0, new ModelResourceLocation("bandb_mod:itemEggParrot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggPelican, 0, new ModelResourceLocation("bandb_mod:itemEggPelican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggPigeon, 0, new ModelResourceLocation("bandb_mod:itemEggPigeon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggRoadrunner, 0, new ModelResourceLocation("bandb_mod:itemEggRoadrunner", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemEggSeagull, 0, new ModelResourceLocation("bandb_mod:itemEggSeagull", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherCassowary, 0, new ModelResourceLocation("bandb_mod:itemFeatherCassowary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherDuckFemale, 0, new ModelResourceLocation("bandb_mod:itemFeatherDuckFemale", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherDuckMale, 0, new ModelResourceLocation("bandb_mod:itemFeatherDuckMale", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch1, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch2, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch2", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch3, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch3", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch4, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch4", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch5, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGouldianFinch6, 0, new ModelResourceLocation("bandb_mod:itemFeatherGouldianFinch6", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherGull, 0, new ModelResourceLocation("bandb_mod:itemFeatherGull", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherHummingbirdCanvasPrint, 0, new ModelResourceLocation("bandb_mod:itemFeatherHummingbirdCanvasPrint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherHummingbirdCrimsonTopaz, 0, new ModelResourceLocation("bandb_mod:itemFeatherHummingbirdCrimsonTopaz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherHummingbirdFieryThroatedHummingbird, 0, new ModelResourceLocation("bandb_mod:itemFeatherHummingbirdFieryThroatedHummingbird", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherHummingbirdFlyingLavenderBlueHummingbird, 0, new ModelResourceLocation("bandb_mod:itemFeatherHummingbirdFlyingLavenderBlueHummingbird", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherHummingbirdSwordBilledHummingbird, 0, new ModelResourceLocation("bandb_mod:itemFeatherHummingbirdSwordBilledHummingbird", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherKingfisher, 0, new ModelResourceLocation("bandb_mod:itemFeatherKingfisher", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherKiwi, 0, new ModelResourceLocation("bandb_mod:itemFeatherKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherLyrebird, 0, new ModelResourceLocation("bandb_mod:itemFeatherLyrebird", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherMagpie, 0, new ModelResourceLocation("bandb_mod:itemFeatherMagpie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherOstrich, 0, new ModelResourceLocation("bandb_mod:itemFeatherOstrich", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotAfricanGreyParrot, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotAfricanGreyParrot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotBlueAndYellowMacaw, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotBlueAndYellowMacaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotCockatoo, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotCockatoo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotGreatGreenMacaw, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotGreatGreenMacaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotHyacinthMacaw, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotHyacinthMacaw", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemFeatherParrotRedAndGreenMacaw, 0, new ModelResourceLocation("bandb_mod:itemFeatherParrotRedAndGreenMacaw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherPelican, 0, new ModelResourceLocation("bandb_mod:itemFeatherPelican", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherPigeon, 0, new ModelResourceLocation("bandb_mod:itemFeatherPigeon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherRoadrunner, 0, new ModelResourceLocation("bandb_mod:itemFeatherRoadrunner", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemFeatherSeagull, 0, new ModelResourceLocation("bandb_mod:itemFeatherSeagull", "inventory"));
		
	}

}
