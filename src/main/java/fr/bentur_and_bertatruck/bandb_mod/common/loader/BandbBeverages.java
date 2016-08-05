package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageAlcohol;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageBrandy;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageFruitJuice;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageGrape;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageSweet;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemCapsule;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemCoffee;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemCoffeeCup;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemLabel;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemSyrup;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BandbBeverages {
	
	//items beverage
		//Alcohol
	public static Item itemBeverage1664, itemBeverageAlsaceRiesling, itemBeverageAmaretto, itemBeverageAngosturaBitter, itemBeverageBaileys;
	public static Item itemBeverageBenedictine, itemBeverageBitter, itemBeverageBlueCuracao, itemBeverageBordeauxChateauLary, itemBeverageBordeauxChateauTourVerite;
	public static Item itemBeverageBourgogneAligote, itemBeverageBritt, itemBeverageBrownRum, itemBeverageCalvados, itemBeverageCampari;
	public static Item itemBeverageCapCorse, itemBeverageChampagneMumm, itemBeverageChartreuseJaune, itemBeverageChartreuseVerte, itemBeverageChouchen;
	public static Item itemBeverageCiderKerne, itemBeverageCognac, itemBeverageCuracaoOrange, itemBeverageCuracaoTripleSec, itemBeverageDesperados;
	public static Item itemBeverageDrambuie, itemBeverageDubonnetRouge, itemBeverageDuvel, itemBeverageEnate, itemBeverageFernetBranca;
	public static Item itemBeverageGet27, itemBeverageGin, itemBeverageGrandMarnier, itemBeverageGrimbergen, itemBeverageGuinness;
	public static Item itemBeverageHeineken, itemBeverageLambig, itemBeverageLeffe, itemBeveragePastis51, itemBeveragePetrus;
	public static Item itemBeveragePisco, itemBeveragePommeau, itemBeveragePontarlier, itemBeverageRedMartini, itemBeverageRedPort;
	public static Item itemBeverageSanMiguel, itemBeverageSkoll, itemBeverageSmirnoff, itemBeverageSouthernComfort, itemBeverageTabasco;
	public static Item itemBeverageTequila, itemBeverageVodka, itemBeverageWhiskey, itemBeverageWhiteMartini, itemBeverageWhitePort;
	public static Item itemBeverageWhiteRum, itemBeverageWorcestershireSauce, itemBeverageXII, itemBeverageXeres;	
		//sweet
	public static Item itemBeverageBenturCola, itemBeverageFleurOranger, itemBeverageLimonade, itemBeveragePerrier, itemBeverageSchweppesAgrum;
	public static Item itemBeverageSchweppesDarkSide, itemBeverageSchweppesGingerAle, itemBeverageSchweppesLemon, itemBeverageSchweppesMango, itemBeverageSchweppesPamplemousse;
	public static Item itemBeverageSchweppesPassion, itemBeverageSchweppesPech, itemBeverageSchweppesPomme, itemBeverageSchweppesRaisin, itemBeverageSchweppesRicqles;
	public static Item itemBeverageSchweppesTonic;		
	
		//Brandy
	public static Item itemBananaBrandy, itemBrandyApple, itemBrandyApricot, itemBrandyBlackberry, itemBrandyBlackcurrant;
	public static Item itemBrandyBlueberry, itemBrandyCherry, itemBrandyClementine, itemBrandyCoconut, itemBrandyCranberry;
	public static Item itemBrandyCurrant, itemBrandyGoyava, itemBrandyGrapefruit, itemBrandyKiwi, itemBrandyLemon;
	public static Item itemBrandyLime, itemBrandyLychee, itemBrandyMango, itemBrandyMirabelle, itemBrandyOrange;
	public static Item itemBrandyPeach, itemBrandyPear, itemBrandyPineapple, itemBrandyPlum, itemBrandyRaspberry;
	public static Item itemBrandyStrawsberry, itemBrandyTangerine;	

		//Liqueur
	public static Item itemLiqueurApple, itemLiqueurApricot, itemLiqueurBanana, itemLiqueurBlackberry, itemLiqueurBlackcurrant;
	public static Item itemLiqueurBlueberry, itemLiqueurCacao, itemLiqueurCherry, itemLiqueurCherryPlum, itemLiqueurClementine;
	public static Item itemLiqueurCoco, itemLiqueurCoffee, itemLiqueurCranberry, itemLiqueurFig, itemLiqueurGrape;
	public static Item itemLiqueurGrapefruit, itemLiqueurGuava, itemLiqueurHoney, itemLiqueurKiwi, itemLiqueurLemon;
	public static Item itemLiqueurLime, itemLiqueurLychee, itemLiqueurMango, itemLiqueurMelon, itemLiqueurMint;
	public static Item itemLiqueurOrange, itemLiqueurPassionFruit, itemLiqueurPeach, itemLiqueurPineapple, itemLiqueurPlantain;
	public static Item itemLiqueurPlum, itemLiqueurPomegranate, itemLiqueurQuince, itemLiqueurRaspberry, itemLiqueurStrawberry;
	public static Item itemLiqueurTangerine, itemLiqueurWhitePeach;	

		//Juice
	public static Item itemJuiceApricot, itemJuiceBanana, itemJuiceBlackCurrant, itemJuiceBlackberry, itemJuiceBloodOrange;
	public static Item itemJuiceBlueberry, itemJuiceCarrot, itemJuiceCherry, itemJuiceCherryPlum, itemJuiceClementine;
	public static Item itemJuiceCocoMilk, itemJuiceCranberry, itemJuiceCucumber, itemJuiceCurrant, itemJuiceFig;
	public static Item itemJuiceGrapefruit, itemJuiceGrapefruitPink, itemJuiceGuava, itemJuiceKiwi;
	public static Item itemJuiceLemon, itemJuiceLime, itemJuiceLychee, itemJuiceMango, itemJuiceMelon;
	public static Item itemJuiceMirabelle, itemJuiceMorelloCherry, itemJuiceMultifruit, itemJuiceOrange, itemJuicePapaya;
	public static Item itemJuicePassionFruit, itemJuicePassionfruit, itemJuicePeach, itemJuicePear, itemJuicePineappleCayenneLisse;
	public static Item itemJuicePineappleVictoria, itemJuicePlantainBanana, itemJuicePlum, itemJuicePomegranate, itemJuicePotato;
	public static Item itemJuicePricklyPear, itemJuiceQuince, itemJuiceRaspberry, itemJuiceRhubarb, itemJuiceStrawberry;
	public static Item itemJuiceTangerine, itemJuiceTomato, itemJuiceWatermelon, itemJuiceWhitePeach, itemJuiceWildStrawberry;
	
		//Apple Juice
	public static Item itemJuiceAppleAntares, itemJuiceAppleAriane, itemJuiceAppleBelchardChancelier, itemJuiceAppleBelleDeBoskoop, itemJuiceAppleBraeburn;
	public static Item itemJuiceAppleDuLimousin, itemJuiceAppleElstar, itemJuiceAppleFuji, itemJuiceAppleGala, itemJuiceAppleGolden;
	public static Item itemJuiceAppleGrannySmith, itemJuiceAppleHoneycrunch, itemJuiceAppleJazz, itemJuiceAppleJonagoldJonagored, itemJuiceAppleLesRouges;
	public static Item itemJuiceApplePinkLady, itemJuiceAppleReineDesReinettes, itemJuiceAppleReinetteGriseDuCanada, itemJuiceAppleTentation;	

		//Grape Juice
	public static Item itemGrapeAbouriouJuice, itemGrapeAleaticuJuice, itemGrapeAligoteJuice, itemGrapeAltesseJuice, itemGrapeAramonJuice;
	public static Item itemGrapeArboisJuice, itemGrapeArrufiacJuice, itemGrapeAubinVertJuice, itemGrapeBarbarossaJuice, itemGrapeBergeronJuice;
	public static Item itemGrapeBianconeJuice, itemGrapeBiancuGentileJuice, itemGrapeBourboulencJuice, itemGrapeBraquetJuice, itemGrapeCabernetFrancJuice;
	public static Item itemGrapeCabernetSauvignonJuice, itemGrapeCamareseJuice, itemGrapeCarcaghjoluBiancuJuice, itemGrapeCarcaghjoluNeruJuice, itemGrapeCarignanJuice;
	public static Item itemGrapeCesarJuice, itemGrapeChardonnayJuice, itemGrapeCheninJuice, itemGrapeCinsaultJuice, itemGrapeClairetteJuice;
	public static Item itemGrapeColombardJuice, itemGrapeCotJuice, itemGrapeCounoiseJuice, itemGrapeCourbuJuice, itemGrapeCudivertaJuice;
	public static Item itemGrapeDurasJuice, itemGrapeFerServadouJuice, itemGrapeFolleBlancheJuice, itemGrapeGamayJuice, itemGrapeGewurztraminerJuice;
	public static Item itemGrapeGrenacheBlancJuice, itemGrapeGrenacheJuice, itemGrapeGrolleauJuice, itemGrapeGrosMensengJuice, itemGrapeJacquereJuice;
	public static Item itemGrapeLenDeLElJuice, itemGrapeListanJuice, itemGrapeMaccabeuJuice, itemGrapeMalbecJuice, itemGrapeMalvoisieJuice;
	public static Item itemGrapeMarsanneJuice, itemGrapeMarselanJuice, itemGrapeMauzacJuice, itemGrapeMelonDeBourgogneJuice, itemGrapeMelonJuice;
	public static Item itemGrapeMerlotJuice, itemGrapeMoletteJuice, itemGrapeMollardJuice, itemGrapeMondeuseBlancheJuice, itemGrapeMondeuseJuice;
	public static Item itemGrapeMourvedreJuice, itemGrapeMuscadelleJuice, itemGrapeMuscardinJuice, itemGrapeMuscatBlancAPetitsGrainsJuice, itemGrapeMuscatDAlexandrieJuice;
	public static Item itemGrapeNegretteJuice, itemGrapeNielluccioJuice, itemGrapePagaDebitiJuice, itemGrapePetitCourbuJuice, itemGrapePetitMensengJuice;
	public static Item itemGrapePetitVerdotJuice, itemGrapePineauDAunisJuice, itemGrapePinotBlancJuice, itemGrapePinotMeunierJuice, itemGrapePinotNoirJuice;
	public static Item itemGrapePiquepoulJuice, itemGrapePoulsardJuice, itemGrapeRieslingJuice, itemGrapeRomorantinJuice, itemGrapeRossulaBiancaJuice;
	public static Item itemGrapeSacyJuice, itemGrapeSauvignonJuice, itemGrapeSavagninJuice, itemGrapeSemillonJuice, itemGrapeSylvanerJuice;
	public static Item itemGrapeSyrahJuice, itemGrapeTannatJuice, itemGrapeTeoulierJuice, itemGrapeTerretNoirJuice, itemGrapeTibourenJuice;
	public static Item itemGrapeTressalierJuice, itemGrapeUgniBlancJuice, itemGrapeVaccareseJuice, itemGrapeVermentinuJuice, itemGrapeViognierJuice;
	
		//Syrup MONIN
	public static Item itemLogoMonin, itemSyrupAlmond, itemSyrupAmaretto, itemSyrupAnise, itemSyrupApple;
	public static Item itemSyrupApplePie, itemSyrupApricot, itemSyrupBasil, itemSyrupBitter, itemSyrupBlackForest;
	public static Item itemSyrupBlackberry, itemSyrupBlackcurrant, itemSyrupBloodOrange, itemSyrupBlueCuracao, itemSyrupBlueberry;
	public static Item itemSyrupBubbleGum, itemSyrupCaipirinha, itemSyrupCandyStrawberry, itemSyrupCaramel, itemSyrupCardamom;
	public static Item itemSyrupChaiTea, itemSyrupCherry, itemSyrupCherryPlum, itemSyrupChestnut, itemSyrupChocolate;
	public static Item itemSyrupChocolateCookie, itemSyrupChocolateMint, itemSyrupCinnamon, itemSyrupCoconut, itemSyrupCoffee;
	public static Item itemSyrupCottonCandy, itemSyrupCranberry, itemSyrupCremeBrulee, itemSyrupCucumber, itemSyrupElderFlower;
	public static Item itemSyrupFig, itemSyrupFrostedMint, itemSyrupGin, itemSyrupGinger, itemSyrupGingerBread;
	public static Item itemSyrupGlascoLemon, itemSyrupGrapefruit, itemSyrupGreenApple, itemSyrupGreenBanana, itemSyrupGreenMint;
	public static Item itemSyrupGrenadine, itemSyrupGuava, itemSyrupGum, itemSyrupHazelnut, itemSyrupHibiscus;
	public static Item itemSyrupHoney, itemSyrupIrish, itemSyrupJasmine, itemSyrupKiwi, itemSyrupLavender;
	public static Item itemSyrupLemonGrass, itemSyrupLemonPie, itemSyrupLemonTea, itemSyrupLime, itemSyrupLimeJuiceCordialMixer;
	public static Item itemSyrupLychee, itemSyrupMacadamiaNut, itemSyrupMacaron, itemSyrupMango, itemSyrupMapleSpice;
	public static Item itemSyrupMatchaGreenTea, itemSyrupMelon, itemSyrupMojitoMint, itemSyrupMorelloCherry, itemSyrupOrange;
	public static Item itemSyrupPassionFruit, itemSyrupPeach, itemSyrupPeachTea, itemSyrupPear, itemSyrupPinacolada;
	public static Item itemSyrupPineapple, itemSyrupPinkGrapefruit, itemSyrupPistachio, itemSyrupPomegranate, itemSyrupPraline;
	public static Item itemSyrupPureCaneSugar, itemSyrupRantchoLemon, itemSyrupRaspberry, itemSyrupRaspberryTea, itemSyrupRoastedHazelnut;
	public static Item itemSyrupRose, itemSyrupRosmary, itemSyrupRumFlavour, itemSyrupSaltedCaramel, itemSyrupSangria;
	public static Item itemSyrupSpeculoos, itemSyrupSpicy, itemSyrupSpicyMango, itemSyrupStrawberry, itemSyrupTangerine;
	public static Item itemSyrupTarragon, itemSyrupTequilaFlavour, itemSyrupTiramisu, itemSyrupToffeeNut, itemSyrupTonkaBean;
	public static Item itemSyrupTripleSecCuracao, itemSyrupVanilla, itemSyrupViolet, itemSyrupWatermelon, itemSyrupWhiteChocolate;
	public static Item itemSyrupWhitePeach, itemSyrupWildStrawberry, itemSyrupYellowBanana;
	//items bottle
		//alcohol
	public static Item itemBottle1664, itemBottleAlsaceRiesling, itemBottleAmaretto, itemBottleAngosturaBitter, itemBottleBaileys;
	public static Item itemBottleBenedictine, itemBottleBitter, itemBottleBlueCaracao, itemBottleBordeauxChateauLary, itemBottleBordeauxChateauTourVerite;
	public static Item itemBottleBourgogneAligote, itemBottleBrandy, itemBottleBritt, itemBottleCalvados, itemBottleCampari;
	public static Item itemBottleCapCorse, itemBottleChampagneMumm, itemBottleChartreuseJaune, itemBottleChartreuseVerte, itemBottleChouchen;
	public static Item itemBottleCiderKerne, itemBottleCognac, itemBottleCuracaoOrange, itemBottleCuracaoTripleSec, itemBottleDesperados;
	public static Item itemBottleDrambuie, itemBottleDubonnetRouge, itemBottleDuvel, itemBottleEnate, itemBottleFernetBranca;
	public static Item itemBottleGet27, itemBottleGin, itemBottleGrandMarnier, itemBottleGrimbergen, itemBottleGuinness;
	public static Item itemBottleHeineken, itemBottleHoney, itemBottleLambig, itemBottleLeffe, itemBottleLiqueur;
	public static Item itemBottlePastis51, itemBottlePetrus, itemBottlePisco, itemBottlePommeau, itemBottlePontarlier;
	public static Item itemBottleRedMartini, itemBottleRedPort, itemBottleRum, itemBottleSanMiguel, itemBottleSkoll;
	public static Item itemBottleSmirnoff, itemBottleSouthernComfort, itemBottleTabasco, itemBottleTequila, itemBottleVinegar;
	public static Item itemBottleVodka, itemBottleWhiskey, itemBottleWhiteMartini, itemBottleWhitePort, itemBottleWorcestershireSauce;
	public static Item itemBottleXII, itemBottleXeres;	
	
		//sweet
	public static Item itemBottleBenturCola, itemBottleFleurOranger, itemBottleKetchup, itemBottleLimonade, itemBottlePerrier;
	public static Item itemBottleSchweppesAgrum, itemBottleSchweppesDarkSide, itemBottleSchweppesGingerAle, itemBottleSchweppesLemon, itemBottleSchweppesMango;
	public static Item itemBottleSchweppesPamplemousse, itemBottleSchweppesPassion, itemBottleSchweppesPech, itemBottleSchweppesPomme, itemBottleSchweppesRaisin;
	public static Item itemBottleSchweppesRicqles, itemBottleSchweppesTonic, itemPint;
	
		//alcohol WO labels
	public static Item itemBottle1664WOLabel, itemBottleAlsaceRieslingWOLabel, itemBottleAmarettoWOLabel, itemBottleAngosturaBitterWOLabel, itemBottleBaileysWOLabel;
	public static Item itemBottleBenedictineWOLabel, itemBottleBitterWOLabel, itemBottleBlueCuracaoWOLabel, itemBottleBordeauxLaryWOLabel, itemBottleBordeauxTourWOLabel;
	public static Item itemBottleBourgogneAligoteWOLabel, itemBottleBrandyWOLabel, itemBottleBrittWOLabel, itemBottleCalvadosWOLabel, itemBottleCampariWOLabel;
	public static Item itemBottleCapCorseWOLabel, itemBottleChampagneMummWOLabel, itemBottleChartreuseJauneWOLabel, itemBottleChartreuseVerteWOLabel, itemBottleChouchenWOLabel;
	public static Item itemBottleCiderKerneWOLabel, itemBottleCognacWOLabel, itemBottleCuracaoOrangeWOLabel, itemBottleCuracaoTripleSecWOLabel, itemBottleDesperadosWOLabel;
	public static Item itemBottleDrambuieWOLabel, itemBottleDubonnetRougeWOLabel, itemBottleDuvelWOLabel, itemBottleEnateWOLabel, itemBottleFernetBrancaWOLabel;
	public static Item itemBottleGet27WOLabel, itemBottleGinWOLabel, itemBottleGrandMarnierWOLabel, itemBottleGrimberWOLabel, itemBottleGuinnessWOLabel;
	public static Item itemBottleHeinekenWOLabel, itemBottleLambigWOLabel, itemBottleLeffeWOLabel, itemBottleLiqueurWOLabel, itemBottlePastis51WOLabel;
	public static Item itemBottlePetrusWOLabel, itemBottlePiscoWOLabel, itemBottlePommeauWOLabel, itemBottlePontarlierWOLabel, itemBottleRedMartiniWOLabel;
	public static Item itemBottleRedPortWOLabel, itemBottleRumWOLabel, itemBottleSanMiguelWOLabel, itemBottleSkollWOLabel, itemBottleSmirnoffWOLabel;
	public static Item itemBottleSouthernComfortWOLabel, itemBottleTabascoWOLabel, itemBottleTequilaWOLabel, itemBottleVodkaWOLabel, itemBottleWhiskeyWOLabel;
	public static Item itemBottleWhiteMartiniWOLabel, itemBottleWhitePortWOLabel, itemBottleWorcestershireSauceWOLabel, itemBottleXIIWOLabel, itemBottleXeresWOLabel;

		//sweet WO labels
	public static Item itemBenturColaWOLabel, itemBottleFleurOrangerWOLabel, itemBottleHoneyWOLabel, itemBottleLimonadeWOLabel, itemBottleSchweppesAgrumWOLabel;
	public static Item itemBottleSchweppesDarkSideWOLabel, itemBottleSchweppesGingerAleWOLabel, itemBottleSchweppesLemonWOLabel, itemBottleSchweppesMangoWOLabel, itemBottleSchweppesPamplemousseWOLabel;
	public static Item itemBottleSchweppesPassionWOLabel, itemBottleSchweppesPechWOLabel, itemBottleSchweppesPommeWOLabel, itemBottleSchweppesRicqlesWOLabel, itemBottleScweppesTonicWOLabel;
	public static Item itemBottleVinegarWOLabel, itemPerrierWOLabel, itemSchweppesRaisinWOLabel, itemSyrupMoninWOLabel;
	
		//labels
	// labels		
	public static Item itemBottle1664Label, itemBottleAlsaceRieslingLabel, itemBottleAmarettoLabel, itemBottleAngosturaBitterLabel, itemBottleBaileysLabel;
	public static Item itemBottleBenedictineLabel, itemBottleBenturColaLabel, itemBottleBitterLabel, itemBottleBlueCuracaoLabel, itemBottleBordeauxLaryLabel;
	public static Item itemBottleBordeauxTourLabel, itemBottleBourgogneAligoteLabel, itemBottleBrandyLabel, itemBottleBrittLabel, itemBottleCalvadosLabel;
	public static Item itemBottleCampariLabel, itemBottleCapCorseLabel, itemBottleChampagneMummLabel, itemBottleChartreuseJauneLabel, itemBottleChartreuseVerteLabel;
	public static Item itemBottleChouchenLabel, itemBottleCiderLabel, itemBottleCognacLabel, itemBottleCuracaoOrangeLabel, itemBottleCuracaoTripleSecLabel;
	public static Item itemBottleDesperadosLabel, itemBottleDrambuieLabel, itemBottleDubonnetRougeLabel, itemBottleDuvelLabel, itemBottleEnateLabel;
	public static Item itemBottleFernetBrancaLabel, itemBottleFleurOrangerLabel, itemBottleGet27Label, itemBottleGinLabel, itemBottleGrandMarnierLabel;
	public static Item itemBottleGrimbergenLabel, itemBottleGuinnessLabel, itemBottleHeinekenLabel, itemBottleHoneyLabel, itemBottleLambigLabel;
	public static Item itemBottleLeffeLabel, itemBottleLimonadeLabel, itemBottleLiquorLabel, itemBottlePastis51Label, itemBottlePerrierLabel;
	public static Item itemBottlePetrusLabel, itemBottlePiscoLabel, itemBottlePommeauLabel, itemBottlePontarlierLabel, itemBottleRedMartiniLabel;
	public static Item itemBottleRedPortLabel, itemBottleRumLabel, itemBottleSanMiguelLabel, itemBottleSchweppesAgrumLabel, itemBottleSchweppesDarkSideLabel;
	public static Item itemBottleSchweppesGingerAleLabel, itemBottleSchweppesLemonLabel, itemBottleSchweppesMangoLabel, itemBottleSchweppesPamplemousseLabel, itemBottleSchweppesPassionLabel;
	public static Item itemBottleSchweppesPechLabel, itemBottleSchweppesPommeLabel, itemBottleSchweppesRaisinLabel, itemBottleSchweppesRicqlesLabel, itemBottleSchweppesTonicLabel;
	public static Item itemBottleSiropMoninLabel, itemBottleSkollLabel, itemBottleSmirnoffLabel, itemBottleSouthernComfortLabel, itemBottleTabascoLabel;
	public static Item itemBottleTequilaLabel, itemBottleVinegarLabel, itemBottleVodkaLabel, itemBottleWhiskeyLabel, itemBottleWhiteMartiniLabel;
	public static Item itemBottleWhitePortLabel, itemBottleWorcestershireSauceLabel, itemBottleXIILabel, itemBottleXeresLabel;
	
	//Coffee and tea
	public static Item itemCoffeeArabicasGround, itemCoffeeBlueMountainGround, itemCoffeeBourbonPointuGround, itemCoffeeCatturaGround, itemCoffeeHarrarGround;
	public static Item itemCoffeeHuehuetenangoGround, itemCoffeeJavaGround, itemCoffeeKenyaAAGround, itemCoffeeKonaGround, itemCoffeeKontirWildForestGround;
	public static Item itemCoffeeKopiLuwakGround, itemCoffeeKupeAlamidGround, itemCoffeeMokaGround, itemCoffeeMundoNovoGround, itemCoffeeMuragogypeGround;
	public static Item itemCoffeePeaberryGround, itemCoffeeTarrazuGround, itemCoffeeTorajaKalossiGround, itemCoffeeYirgacheffeGround, itemDriedTeaLeaves;
	
	public static Item itemCapsuleArpeggio, itemCapsuleArpeggioEmpty, itemCapsuleBukeelaKaEthiopia, itemCapsuleBukeelaKaEthiopiaEmpty, itemCapsuleCapriccio;
	public static Item itemCapsuleCapriccioEmpty, itemCapsuleCosi, itemCapsuleCosiEmpty, itemCapsuleDecaffeinato, itemCapsuleDecaffeinatoEmpty;
	public static Item itemCapsuleDecaffeinatoIntenso, itemCapsuleDecaffeinatoIntensoEmpty, itemCapsuleDecaffeinatoLungo, itemCapsuleDecaffeinatoLungoEmpty, itemCapsuleDharkan;
	public static Item itemCapsuleDharkanEmpty, itemCapsuleDulsaoDoBrasil, itemCapsuleDulsaoDoBrasilEmpty, itemCapsuleFortissioLungo, itemCapsuleFortissioLungoEmpty;
	public static Item itemCapsuleIndriyaFromIndia, itemCapsuleIndriyaFromIndiaEmpty, itemCapsuleKazaar, itemCapsuleKazaarEmpty, itemCapsuleLinizioLungo;
	public static Item itemCapsuleLinizioLungoEmpty, itemCapsuleLivanto, itemCapsuleLivantoEmpty, itemCapsuleRistretto, itemCapsuleRistrettoEmpty;
	public static Item itemCapsuleRoma, itemCapsuleRomaEmpty, itemCapsuleRosabayaDeColombia, itemCapsuleRosabayaDeColombiaEmpty, itemCapsuleVivaltoLungo;
	public static Item itemCapsuleVivaltoLungoEmpty, itemCapsuleVolluto, itemCapsuleVollutoEmpty;
			
	public static Item itemTeaBagCaramel, itemTeaBagChai, itemTeaBagEarlGrey, itemTeaBagEmpty, itemTeaBagLemon;
	public static Item itemTeaBagMatchaGreen, itemTeaBagPeach, itemTeaBagRaspberry, itemTeaBagRedFruit;
		
	public static Item itemCupArpeggio, itemCupBukeelaKaEthiopia, itemCupCapriccio, itemCupCoffeeEmpty, itemCupCosi;
	public static Item itemCupDecaffeinato, itemCupDecaffeinatoIntenso, itemCupDecaffeinatoLungo, itemCupDharkan, itemCupDulsaoDoBrasil;
	public static Item itemCupFortissioLungo, itemCupIndriyaFromIndia, itemCupKazaar, itemCupLinizioLungo, itemCupLivanto;
	public static Item itemCupRistretto, itemCupRoma, itemCupRosabayaDeColombia, itemCupTeaCaramel, itemCupTeaChai;
	public static Item itemCupTeaEarlGrey, itemCupTeaLemon, itemCupTeaMatchaGreen, itemCupTeaPeach, itemCupTeaRaspberry;
	public static Item itemCupTeaRedFruit, itemCupVivaltoLungo, itemCupVolluto, itemTeapot;
	
	public static void register(){
		//items beverage
			//alcohol
		itemBeverage1664 = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverage1664");
		itemBeverageAlsaceRiesling = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageAlsaceRiesling");
		itemBeverageAmaretto = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageAmaretto");
		itemBeverageAngosturaBitter = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageAngosturaBitter");
		itemBeverageBaileys = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBaileys");

		GameRegistry.registerItem(itemBeverage1664, "itemBeverage1664");
		GameRegistry.registerItem(itemBeverageAlsaceRiesling, "itemBeverageAlsaceRiesling");
		GameRegistry.registerItem(itemBeverageAmaretto, "itemBeverageAmaretto");
		GameRegistry.registerItem(itemBeverageAngosturaBitter, "itemBeverageAngosturaBitter");
		GameRegistry.registerItem(itemBeverageBaileys, "itemBeverageBaileys");

		itemBeverageBenedictine = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBenedictine");
		itemBeverageBitter = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBitter");
		itemBeverageBlueCuracao = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBlueCuracao");
		itemBeverageBordeauxChateauLary = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBordeauxChateauLary");
		itemBeverageBordeauxChateauTourVerite = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBordeauxChateauTourVerite");

		GameRegistry.registerItem(itemBeverageBenedictine, "itemBeverageBenedictine");
		GameRegistry.registerItem(itemBeverageBitter, "itemBeverageBitter");
		GameRegistry.registerItem(itemBeverageBlueCuracao, "itemBeverageBlueCuracao");
		GameRegistry.registerItem(itemBeverageBordeauxChateauLary, "itemBeverageBordeauxChateauLary");
		GameRegistry.registerItem(itemBeverageBordeauxChateauTourVerite, "itemBeverageBordeauxChateauTourVerite");

		itemBeverageBourgogneAligote = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBourgogneAligote");
		itemBeverageBritt = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBritt");
		itemBeverageBrownRum = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageBrownRum");
		itemBeverageCalvados = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCalvados");
		itemBeverageCampari = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCampari");

		GameRegistry.registerItem(itemBeverageBourgogneAligote, "itemBeverageBourgogneAligote");
		GameRegistry.registerItem(itemBeverageBritt, "itemBeverageBritt");
		GameRegistry.registerItem(itemBeverageBrownRum, "itemBeverageBrownRum");
		GameRegistry.registerItem(itemBeverageCalvados, "itemBeverageCalvados");
		GameRegistry.registerItem(itemBeverageCampari, "itemBeverageCampari");

		itemBeverageCapCorse = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCapCorse");
		itemBeverageChampagneMumm = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageChampagneMumm");
		itemBeverageChartreuseJaune = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageChartreuseJaune");
		itemBeverageChartreuseVerte = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageChartreuseVerte");
		itemBeverageChouchen = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageChouchen");

		GameRegistry.registerItem(itemBeverageCapCorse, "itemBeverageCapCorse");
		GameRegistry.registerItem(itemBeverageChampagneMumm, "itemBeverageChampagneMumm");
		GameRegistry.registerItem(itemBeverageChartreuseJaune, "itemBeverageChartreuseJaune");
		GameRegistry.registerItem(itemBeverageChartreuseVerte, "itemBeverageChartreuseVerte");
		GameRegistry.registerItem(itemBeverageChouchen, "itemBeverageChouchen");

		itemBeverageCiderKerne = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCiderKerne");
		itemBeverageCognac = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCognac");
		itemBeverageCuracaoOrange = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCuracaoOrange");
		itemBeverageCuracaoTripleSec = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCuracaoTripleSec");
		itemBeverageDesperados = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageDesperados");

		GameRegistry.registerItem(itemBeverageCiderKerne, "itemBeverageCiderKerne");
		GameRegistry.registerItem(itemBeverageCognac, "itemBeverageCognac");
		GameRegistry.registerItem(itemBeverageCuracaoOrange, "itemBeverageCuracaoOrange");
		GameRegistry.registerItem(itemBeverageCuracaoTripleSec, "itemBeverageCuracaoTripleSec");
		GameRegistry.registerItem(itemBeverageDesperados, "itemBeverageDesperados");

		itemBeverageDrambuie = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageDrambuie");
		itemBeverageDubonnetRouge = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageDubonnetRouge");
		itemBeverageDuvel = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageDuvel");
		itemBeverageEnate = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageEnate");
		itemBeverageFernetBranca = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageFernetBranca");

		GameRegistry.registerItem(itemBeverageDrambuie, "itemBeverageDrambuie");
		GameRegistry.registerItem(itemBeverageDubonnetRouge, "itemBeverageDubonnetRouge");
		GameRegistry.registerItem(itemBeverageDuvel, "itemBeverageDuvel");
		GameRegistry.registerItem(itemBeverageEnate, "itemBeverageEnate");
		GameRegistry.registerItem(itemBeverageFernetBranca, "itemBeverageFernetBranca");

		itemBeverageGet27 = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageGet27");
		itemBeverageGin = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageGin");
		itemBeverageGrandMarnier = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageGrandMarnier");
		itemBeverageGrimbergen = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageGrimbergen");
		itemBeverageGuinness = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageGuinness");

		GameRegistry.registerItem(itemBeverageGet27, "itemBeverageGet27");
		GameRegistry.registerItem(itemBeverageGin, "itemBeverageGin");
		GameRegistry.registerItem(itemBeverageGrandMarnier, "itemBeverageGrandMarnier");
		GameRegistry.registerItem(itemBeverageGrimbergen, "itemBeverageGrimbergen");
		GameRegistry.registerItem(itemBeverageGuinness, "itemBeverageGuinness");

		itemBeverageHeineken = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageHeineken");
		itemBeverageLambig = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageLambig");
		itemBeverageLeffe = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageLeffe");
		itemBeveragePastis51 = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeveragePastis51");
		itemBeveragePetrus = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeveragePetrus");

		GameRegistry.registerItem(itemBeverageHeineken, "itemBeverageHeineken");
		GameRegistry.registerItem(itemBeverageLambig, "itemBeverageLambig");
		GameRegistry.registerItem(itemBeverageLeffe, "itemBeverageLeffe");
		GameRegistry.registerItem(itemBeveragePastis51, "itemBeveragePastis51");
		GameRegistry.registerItem(itemBeveragePetrus, "itemBeveragePetrus");

		itemBeveragePisco = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeveragePisco");
		itemBeveragePommeau = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeveragePommeau");
		itemBeveragePontarlier = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeveragePontarlier");
		itemBeverageRedMartini = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageRedMartini");
		itemBeverageRedPort = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageRedPort");

		GameRegistry.registerItem(itemBeveragePisco, "itemBeveragePisco");
		GameRegistry.registerItem(itemBeveragePommeau, "itemBeveragePommeau");
		GameRegistry.registerItem(itemBeveragePontarlier, "itemBeveragePontarlier");
		GameRegistry.registerItem(itemBeverageRedMartini, "itemBeverageRedMartini");
		GameRegistry.registerItem(itemBeverageRedPort, "itemBeverageRedPort");

		itemBeverageSanMiguel = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageSanMiguel");
		itemBeverageSkoll = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageSkoll");
		itemBeverageSmirnoff = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageSmirnoff");
		itemBeverageSouthernComfort = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageSouthernComfort");
		itemBeverageTabasco = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageTabasco");

		GameRegistry.registerItem(itemBeverageSanMiguel, "itemBeverageSanMiguel");
		GameRegistry.registerItem(itemBeverageSkoll, "itemBeverageSkoll");
		GameRegistry.registerItem(itemBeverageSmirnoff, "itemBeverageSmirnoff");
		GameRegistry.registerItem(itemBeverageSouthernComfort, "itemBeverageSouthernComfort");
		GameRegistry.registerItem(itemBeverageTabasco, "itemBeverageTabasco");

		itemBeverageTequila = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageTequila");
		itemBeverageVodka = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageVodka");
		itemBeverageWhiskey = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageWhiskey");
		itemBeverageWhiteMartini = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageWhiteMartini");
		itemBeverageWhitePort = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageWhitePort");

		GameRegistry.registerItem(itemBeverageTequila, "itemBeverageTequila");
		GameRegistry.registerItem(itemBeverageVodka, "itemBeverageVodka");
		GameRegistry.registerItem(itemBeverageWhiskey, "itemBeverageWhiskey");
		GameRegistry.registerItem(itemBeverageWhiteMartini, "itemBeverageWhiteMartini");
		GameRegistry.registerItem(itemBeverageWhitePort, "itemBeverageWhitePort");

		itemBeverageWhiteRum = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageWhiteRum");
		itemBeverageWorcestershireSauce = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageWorcestershireSauce");
		itemBeverageXII = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageXII");
		itemBeverageXeres = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageXeres");

			//sweet
		itemBeverageBenturCola = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageBenturCola");
		itemBeverageFleurOranger = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageFleurOranger");
		itemBeverageLimonade = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageLimonade");
		itemBeveragePerrier = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeveragePerrier");
		itemBeverageSchweppesAgrum = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesAgrum");

		GameRegistry.registerItem(itemBeverageBenturCola, "itemBeverageBenturCola");
		GameRegistry.registerItem(itemBeverageFleurOranger, "itemBeverageFleurOranger");
		GameRegistry.registerItem(itemBeverageLimonade, "itemBeverageLimonade");
		GameRegistry.registerItem(itemBeveragePerrier, "itemBeveragePerrier");
		GameRegistry.registerItem(itemBeverageSchweppesAgrum, "itemBeverageSchweppesAgrum");

		itemBeverageSchweppesDarkSide = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesDarkSide");
		itemBeverageSchweppesGingerAle = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesGingerAle");
		itemBeverageSchweppesLemon = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesLemon");
		itemBeverageSchweppesMango = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesMango");
		itemBeverageSchweppesPamplemousse = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesPamplemousse");

		GameRegistry.registerItem(itemBeverageSchweppesDarkSide, "itemBeverageSchweppesDarkSide");
		GameRegistry.registerItem(itemBeverageSchweppesGingerAle, "itemBeverageSchweppesGingerAle");
		GameRegistry.registerItem(itemBeverageSchweppesLemon, "itemBeverageSchweppesLemon");
		GameRegistry.registerItem(itemBeverageSchweppesMango, "itemBeverageSchweppesMango");
		GameRegistry.registerItem(itemBeverageSchweppesPamplemousse, "itemBeverageSchweppesPamplemousse");

		itemBeverageSchweppesPassion = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesPassion");
		itemBeverageSchweppesPech = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesPech");
		itemBeverageSchweppesPomme = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesPomme");
		itemBeverageSchweppesRaisin = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesRaisin");
		itemBeverageSchweppesRicqles = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesRicqles");

		GameRegistry.registerItem(itemBeverageSchweppesPassion, "itemBeverageSchweppesPassion");
		GameRegistry.registerItem(itemBeverageSchweppesPech, "itemBeverageSchweppesPech");
		GameRegistry.registerItem(itemBeverageSchweppesPomme, "itemBeverageSchweppesPomme");
		GameRegistry.registerItem(itemBeverageSchweppesRaisin, "itemBeverageSchweppesRaisin");
		GameRegistry.registerItem(itemBeverageSchweppesRicqles, "itemBeverageSchweppesRicqles");

		itemBeverageSchweppesTonic = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBeverageSchweppesTonic");

		GameRegistry.registerItem(itemBeverageSchweppesTonic, "itemBeverageSchweppesTonic");

			//brandy
		itemBananaBrandy = new ItemBeverageBrandy().setUnlocalizedName("itemBananaBrandy");
		itemBrandyApple = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyApple");
		itemBrandyApricot = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyApricot");
		itemBrandyBlackberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlackberry");
		itemBrandyBlackcurrant = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlackcurrant");

		GameRegistry.registerItem(itemBananaBrandy, "itemBananaBrandy");
		GameRegistry.registerItem(itemBrandyApple, "itemBrandyApple");
		GameRegistry.registerItem(itemBrandyApricot, "itemBrandyApricot");
		GameRegistry.registerItem(itemBrandyBlackberry, "itemBrandyBlackberry");
		GameRegistry.registerItem(itemBrandyBlackcurrant, "itemBrandyBlackcurrant");

		itemBrandyBlueberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlueberry");
		itemBrandyCherry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCherry");
		itemBrandyClementine = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyClementine");
		itemBrandyCoconut = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCoconut");
		itemBrandyCranberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCranberry");

		GameRegistry.registerItem(itemBrandyBlueberry, "itemBrandyBlueberry");
		GameRegistry.registerItem(itemBrandyCherry, "itemBrandyCherry");
		GameRegistry.registerItem(itemBrandyClementine, "itemBrandyClementine");
		GameRegistry.registerItem(itemBrandyCoconut, "itemBrandyCoconut");
		GameRegistry.registerItem(itemBrandyCranberry, "itemBrandyCranberry");

		itemBrandyCurrant = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCurrant");
		itemBrandyGoyava = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyGoyava");
		itemBrandyGrapefruit = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyGrapefruit");
		itemBrandyKiwi = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyKiwi");
		itemBrandyLemon = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLemon");

		GameRegistry.registerItem(itemBrandyCurrant, "itemBrandyCurrant");
		GameRegistry.registerItem(itemBrandyGoyava, "itemBrandyGoyava");
		GameRegistry.registerItem(itemBrandyGrapefruit, "itemBrandyGrapefruit");
		GameRegistry.registerItem(itemBrandyKiwi, "itemBrandyKiwi");
		GameRegistry.registerItem(itemBrandyLemon, "itemBrandyLemon");

		itemBrandyLime = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLime");
		itemBrandyLychee = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLychee");
		itemBrandyMango = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyMango");
		itemBrandyMirabelle = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyMirabelle");
		itemBrandyOrange = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyOrange");

		GameRegistry.registerItem(itemBrandyLime, "itemBrandyLime");
		GameRegistry.registerItem(itemBrandyLychee, "itemBrandyLychee");
		GameRegistry.registerItem(itemBrandyMango, "itemBrandyMango");
		GameRegistry.registerItem(itemBrandyMirabelle, "itemBrandyMirabelle");
		GameRegistry.registerItem(itemBrandyOrange, "itemBrandyOrange");

		itemBrandyPeach = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPeach");
		itemBrandyPear = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPear");
		itemBrandyPineapple = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPineapple");
		itemBrandyPlum = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPlum");
		itemBrandyRaspberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyRaspberry");

		GameRegistry.registerItem(itemBrandyPeach, "itemBrandyPeach");
		GameRegistry.registerItem(itemBrandyPear, "itemBrandyPear");
		GameRegistry.registerItem(itemBrandyPineapple, "itemBrandyPineapple");
		GameRegistry.registerItem(itemBrandyPlum, "itemBrandyPlum");
		GameRegistry.registerItem(itemBrandyRaspberry, "itemBrandyRaspberry");

		itemBrandyStrawsberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyStrawsberry");
		itemBrandyTangerine = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyTangerine");

		GameRegistry.registerItem(itemBrandyStrawsberry, "itemBrandyStrawsberry");
		GameRegistry.registerItem(itemBrandyTangerine, "itemBrandyTangerine");

			//Liquor
		itemLiqueurApple = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurApple");
		itemLiqueurApricot = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurApricot");
		itemLiqueurBanana = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurBanana");
		itemLiqueurBlackberry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurBlackberry");
		itemLiqueurBlackcurrant = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurBlackcurrant");

		GameRegistry.registerItem(itemLiqueurApple, "itemLiqueurApple");
		GameRegistry.registerItem(itemLiqueurApricot, "itemLiqueurApricot");
		GameRegistry.registerItem(itemLiqueurBanana, "itemLiqueurBanana");
		GameRegistry.registerItem(itemLiqueurBlackberry, "itemLiqueurBlackberry");
		GameRegistry.registerItem(itemLiqueurBlackcurrant, "itemLiqueurBlackcurrant");

		itemLiqueurBlueberry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurBlueberry");
		itemLiqueurCacao = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCacao");
		itemLiqueurCherry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCherry");
		itemLiqueurCherryPlum = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCherryPlum");
		itemLiqueurClementine = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurClementine");

		GameRegistry.registerItem(itemLiqueurBlueberry, "itemLiqueurBlueberry");
		GameRegistry.registerItem(itemLiqueurCacao, "itemLiqueurCacao");
		GameRegistry.registerItem(itemLiqueurCherry, "itemLiqueurCherry");
		GameRegistry.registerItem(itemLiqueurCherryPlum, "itemLiqueurCherryPlum");
		GameRegistry.registerItem(itemLiqueurClementine, "itemLiqueurClementine");

		itemLiqueurCoco = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCoco");
		itemLiqueurCoffee = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCoffee");
		itemLiqueurCranberry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurCranberry");
		itemLiqueurFig = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurFig");
		itemLiqueurGrape = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurGrape");

		GameRegistry.registerItem(itemLiqueurCoco, "itemLiqueurCoco");
		GameRegistry.registerItem(itemLiqueurCoffee, "itemLiqueurCoffee");
		GameRegistry.registerItem(itemLiqueurCranberry, "itemLiqueurCranberry");
		GameRegistry.registerItem(itemLiqueurFig, "itemLiqueurFig");
		GameRegistry.registerItem(itemLiqueurGrape, "itemLiqueurGrape");

		itemLiqueurGrapefruit = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurGrapefruit");
		itemLiqueurGuava = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurGuava");
		itemLiqueurHoney = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurHoney");
		itemLiqueurKiwi = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurKiwi");
		itemLiqueurLemon = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurLemon");

		GameRegistry.registerItem(itemLiqueurGrapefruit, "itemLiqueurGrapefruit");
		GameRegistry.registerItem(itemLiqueurGuava, "itemLiqueurGuava");
		GameRegistry.registerItem(itemLiqueurHoney, "itemLiqueurHoney");
		GameRegistry.registerItem(itemLiqueurKiwi, "itemLiqueurKiwi");
		GameRegistry.registerItem(itemLiqueurLemon, "itemLiqueurLemon");

		itemLiqueurLime = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurLime");
		itemLiqueurLychee = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurLychee");
		itemLiqueurMango = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurMango");
		itemLiqueurMelon = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurMelon");
		itemLiqueurMint = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurMint");

		GameRegistry.registerItem(itemLiqueurLime, "itemLiqueurLime");
		GameRegistry.registerItem(itemLiqueurLychee, "itemLiqueurLychee");
		GameRegistry.registerItem(itemLiqueurMango, "itemLiqueurMango");
		GameRegistry.registerItem(itemLiqueurMelon, "itemLiqueurMelon");
		GameRegistry.registerItem(itemLiqueurMint, "itemLiqueurMint");

		itemLiqueurOrange = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurOrange");
		itemLiqueurPassionFruit = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPassionFruit");
		itemLiqueurPeach = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPeach");
		itemLiqueurPineapple = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPineapple");
		itemLiqueurPlantain = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPlantain");

		GameRegistry.registerItem(itemLiqueurOrange, "itemLiqueurOrange");
		GameRegistry.registerItem(itemLiqueurPassionFruit, "itemLiqueurPassionFruit");
		GameRegistry.registerItem(itemLiqueurPeach, "itemLiqueurPeach");
		GameRegistry.registerItem(itemLiqueurPineapple, "itemLiqueurPineapple");
		GameRegistry.registerItem(itemLiqueurPlantain, "itemLiqueurPlantain");

		itemLiqueurPlum = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPlum");
		itemLiqueurPomegranate = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurPomegranate");
		itemLiqueurQuince = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurQuince");
		itemLiqueurRaspberry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurRaspberry");
		itemLiqueurStrawberry = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurStrawberry");

		GameRegistry.registerItem(itemLiqueurPlum, "itemLiqueurPlum");
		GameRegistry.registerItem(itemLiqueurPomegranate, "itemLiqueurPomegranate");
		GameRegistry.registerItem(itemLiqueurQuince, "itemLiqueurQuince");
		GameRegistry.registerItem(itemLiqueurRaspberry, "itemLiqueurRaspberry");
		GameRegistry.registerItem(itemLiqueurStrawberry, "itemLiqueurStrawberry");

		itemLiqueurTangerine = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurTangerine");
		itemLiqueurWhitePeach = new ItemBeverageBrandy().setUnlocalizedName("itemLiqueurWhitePeach");

		GameRegistry.registerItem(itemLiqueurTangerine, "itemLiqueurTangerine");
		GameRegistry.registerItem(itemLiqueurWhitePeach, "itemLiqueurWhitePeach");

			//juice
		itemJuiceApricot = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceApricot");
		itemJuiceBanana = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBanana");
		itemJuiceBlackCurrant = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlackCurrant");
		itemJuiceBlackberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlackberry");
		itemJuiceBloodOrange = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBloodOrange");

		GameRegistry.registerItem(itemJuiceApricot, "itemJuiceApricot");
		GameRegistry.registerItem(itemJuiceBanana, "itemJuiceBanana");
		GameRegistry.registerItem(itemJuiceBlackCurrant, "itemJuiceBlackCurrant");
		GameRegistry.registerItem(itemJuiceBlackberry, "itemJuiceBlackberry");
		GameRegistry.registerItem(itemJuiceBloodOrange, "itemJuiceBloodOrange");

		itemJuiceBlueberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlueberry");
		itemJuiceCarrot = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCarrot");
		itemJuiceCherry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCherry");
		itemJuiceCherryPlum = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCherryPlum");
		itemJuiceClementine = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceClementine");

		GameRegistry.registerItem(itemJuiceBlueberry, "itemJuiceBlueberry");
		GameRegistry.registerItem(itemJuiceCarrot, "itemJuiceCarrot");
		GameRegistry.registerItem(itemJuiceCherry, "itemJuiceCherry");
		GameRegistry.registerItem(itemJuiceCherryPlum, "itemJuiceCherryPlum");
		GameRegistry.registerItem(itemJuiceClementine, "itemJuiceClementine");

		itemJuiceCocoMilk = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCocoMilk");
		itemJuiceCranberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCranberry");
		itemJuiceCucumber = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCucumber");
		itemJuiceCurrant = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCurrant");
		itemJuiceFig = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceFig");

		GameRegistry.registerItem(itemJuiceCocoMilk, "itemJuiceCocoMilk");
		GameRegistry.registerItem(itemJuiceCranberry, "itemJuiceCranberry");
		GameRegistry.registerItem(itemJuiceCucumber, "itemJuiceCucumber");
		GameRegistry.registerItem(itemJuiceCurrant, "itemJuiceCurrant");
		GameRegistry.registerItem(itemJuiceFig, "itemJuiceFig");

		itemJuiceGrapefruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGrapefruit");
		itemJuiceGrapefruitPink = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGrapefruitPink");
		itemJuiceGuava = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGuava");
		itemJuiceKiwi = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceKiwi");

		GameRegistry.registerItem(itemJuiceGrapefruit, "itemJuiceGrapefruit");
		GameRegistry.registerItem(itemJuiceGrapefruitPink, "itemJuiceGrapefruitPink");
		GameRegistry.registerItem(itemJuiceGuava, "itemJuiceGuava");
		GameRegistry.registerItem(itemJuiceKiwi, "itemJuiceKiwi");

		itemJuiceLemon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLemon");
		itemJuiceLime = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLime");
		itemJuiceLychee = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLychee");
		itemJuiceMango = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMango");
		itemJuiceMelon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMelon");

		GameRegistry.registerItem(itemJuiceLemon, "itemJuiceLemon");
		GameRegistry.registerItem(itemJuiceLime, "itemJuiceLime");
		GameRegistry.registerItem(itemJuiceLychee, "itemJuiceLychee");
		GameRegistry.registerItem(itemJuiceMango, "itemJuiceMango");
		GameRegistry.registerItem(itemJuiceMelon, "itemJuiceMelon");

		itemJuiceMirabelle = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMirabelle");
		itemJuiceMorelloCherry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMorelloCherry");
		itemJuiceMultifruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMultifruit");
		itemJuiceOrange = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceOrange");
		itemJuicePapaya = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePapaya");

		GameRegistry.registerItem(itemJuiceMirabelle, "itemJuiceMirabelle");
		GameRegistry.registerItem(itemJuiceMorelloCherry, "itemJuiceMorelloCherry");
		GameRegistry.registerItem(itemJuiceMultifruit, "itemJuiceMultifruit");
		GameRegistry.registerItem(itemJuiceOrange, "itemJuiceOrange");
		GameRegistry.registerItem(itemJuicePapaya, "itemJuicePapaya");

		itemJuicePassionFruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePassionFruit");
		itemJuicePassionfruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePassionfruit");
		itemJuicePeach = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePeach");
		itemJuicePear = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePear");
		itemJuicePineappleCayenneLisse = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePineappleCayenneLisse");

		GameRegistry.registerItem(itemJuicePassionFruit, "itemJuicePassionFruit");
		GameRegistry.registerItem(itemJuicePassionfruit, "itemJuicePassionfruit");
		GameRegistry.registerItem(itemJuicePeach, "itemJuicePeach");
		GameRegistry.registerItem(itemJuicePear, "itemJuicePear");
		GameRegistry.registerItem(itemJuicePineappleCayenneLisse, "itemJuicePineappleCayenneLisse");

		itemJuicePineappleVictoria = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePineappleVictoria");
		itemJuicePlantainBanana = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePlantainBanana");
		itemJuicePlum = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePlum");
		itemJuicePomegranate = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePomegranate");
		itemJuicePotato = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePotato");

		GameRegistry.registerItem(itemJuicePineappleVictoria, "itemJuicePineappleVictoria");
		GameRegistry.registerItem(itemJuicePlantainBanana, "itemJuicePlantainBanana");
		GameRegistry.registerItem(itemJuicePlum, "itemJuicePlum");
		GameRegistry.registerItem(itemJuicePomegranate, "itemJuicePomegranate");
		GameRegistry.registerItem(itemJuicePotato, "itemJuicePotato");

		itemJuicePricklyPear = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePricklyPear");
		itemJuiceQuince = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceQuince");
		itemJuiceRaspberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceRaspberry");
		itemJuiceRhubarb = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceRhubarb");
		itemJuiceStrawberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceStrawberry");

		GameRegistry.registerItem(itemJuicePricklyPear, "itemJuicePricklyPear");
		GameRegistry.registerItem(itemJuiceQuince, "itemJuiceQuince");
		GameRegistry.registerItem(itemJuiceRaspberry, "itemJuiceRaspberry");
		GameRegistry.registerItem(itemJuiceRhubarb, "itemJuiceRhubarb");
		GameRegistry.registerItem(itemJuiceStrawberry, "itemJuiceStrawberry");

		itemJuiceTangerine = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceTangerine");
		itemJuiceTomato = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceTomato");
		itemJuiceWatermelon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWatermelon");
		itemJuiceWhitePeach = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWhitePeach");
		itemJuiceWildStrawberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWildStrawberry");

		GameRegistry.registerItem(itemJuiceTangerine, "itemJuiceTangerine");
		GameRegistry.registerItem(itemJuiceTomato, "itemJuiceTomato");
		GameRegistry.registerItem(itemJuiceWatermelon, "itemJuiceWatermelon");
		GameRegistry.registerItem(itemJuiceWhitePeach, "itemJuiceWhitePeach");
		GameRegistry.registerItem(itemJuiceWildStrawberry, "itemJuiceWildStrawberry");

			//apple juice
		itemJuiceAppleAntares = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleAntares");
		itemJuiceAppleAriane = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleAriane");
		itemJuiceAppleBelchardChancelier = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBelchardChancelier");
		itemJuiceAppleBelleDeBoskoop = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBelleDeBoskoop");
		itemJuiceAppleBraeburn = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBraeburn");

		GameRegistry.registerItem(itemJuiceAppleAntares, "itemJuiceAppleAntares");
		GameRegistry.registerItem(itemJuiceAppleAriane, "itemJuiceAppleAriane");
		GameRegistry.registerItem(itemJuiceAppleBelchardChancelier, "itemJuiceAppleBelchardChancelier");
		GameRegistry.registerItem(itemJuiceAppleBelleDeBoskoop, "itemJuiceAppleBelleDeBoskoop");
		GameRegistry.registerItem(itemJuiceAppleBraeburn, "itemJuiceAppleBraeburn");

		itemJuiceAppleDuLimousin = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleDuLimousin");
		itemJuiceAppleElstar = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleElstar");
		itemJuiceAppleFuji = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleFuji");
		itemJuiceAppleGala = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGala");
		itemJuiceAppleGolden = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGolden");

		GameRegistry.registerItem(itemJuiceAppleDuLimousin, "itemJuiceAppleDuLimousin");
		GameRegistry.registerItem(itemJuiceAppleElstar, "itemJuiceAppleElstar");
		GameRegistry.registerItem(itemJuiceAppleFuji, "itemJuiceAppleFuji");
		GameRegistry.registerItem(itemJuiceAppleGala, "itemJuiceAppleGala");
		GameRegistry.registerItem(itemJuiceAppleGolden, "itemJuiceAppleGolden");

		itemJuiceAppleGrannySmith = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGrannySmith");
		itemJuiceAppleHoneycrunch = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleHoneycrunch");
		itemJuiceAppleJazz = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleJazz");
		itemJuiceAppleJonagoldJonagored = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleJonagoldJonagored");
		itemJuiceAppleLesRouges = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleLesRouges");

		GameRegistry.registerItem(itemJuiceAppleGrannySmith, "itemJuiceAppleGrannySmith");
		GameRegistry.registerItem(itemJuiceAppleHoneycrunch, "itemJuiceAppleHoneycrunch");
		GameRegistry.registerItem(itemJuiceAppleJazz, "itemJuiceAppleJazz");
		GameRegistry.registerItem(itemJuiceAppleJonagoldJonagored, "itemJuiceAppleJonagoldJonagored");
		GameRegistry.registerItem(itemJuiceAppleLesRouges, "itemJuiceAppleLesRouges");

		itemJuiceApplePinkLady = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceApplePinkLady");
		itemJuiceAppleReineDesReinettes = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleReineDesReinettes");
		itemJuiceAppleReinetteGriseDuCanada = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleReinetteGriseDuCanada");
		itemJuiceAppleTentation = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleTentation");

			//grape juice
		itemGrapeAbouriouJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAbouriouJuice");
		itemGrapeAleaticuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAleaticuJuice");
		itemGrapeAligoteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAligoteJuice");
		itemGrapeAltesseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAltesseJuice");
		itemGrapeAramonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAramonJuice");

		GameRegistry.registerItem(itemGrapeAbouriouJuice, "itemGrapeAbouriouJuice");
		GameRegistry.registerItem(itemGrapeAleaticuJuice, "itemGrapeAleaticuJuice");
		GameRegistry.registerItem(itemGrapeAligoteJuice, "itemGrapeAligoteJuice");
		GameRegistry.registerItem(itemGrapeAltesseJuice, "itemGrapeAltesseJuice");
		GameRegistry.registerItem(itemGrapeAramonJuice, "itemGrapeAramonJuice");

		itemGrapeArboisJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeArboisJuice");
		itemGrapeArrufiacJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeArrufiacJuice");
		itemGrapeAubinVertJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAubinVertJuice");
		itemGrapeBarbarossaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBarbarossaJuice");
		itemGrapeBergeronJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBergeronJuice");

		GameRegistry.registerItem(itemGrapeArboisJuice, "itemGrapeArboisJuice");
		GameRegistry.registerItem(itemGrapeArrufiacJuice, "itemGrapeArrufiacJuice");
		GameRegistry.registerItem(itemGrapeAubinVertJuice, "itemGrapeAubinVertJuice");
		GameRegistry.registerItem(itemGrapeBarbarossaJuice, "itemGrapeBarbarossaJuice");
		GameRegistry.registerItem(itemGrapeBergeronJuice, "itemGrapeBergeronJuice");

		itemGrapeBianconeJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBianconeJuice");
		itemGrapeBiancuGentileJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBiancuGentileJuice");
		itemGrapeBourboulencJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBourboulencJuice");
		itemGrapeBraquetJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBraquetJuice");
		itemGrapeCabernetFrancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCabernetFrancJuice");

		GameRegistry.registerItem(itemGrapeBianconeJuice, "itemGrapeBianconeJuice");
		GameRegistry.registerItem(itemGrapeBiancuGentileJuice, "itemGrapeBiancuGentileJuice");
		GameRegistry.registerItem(itemGrapeBourboulencJuice, "itemGrapeBourboulencJuice");
		GameRegistry.registerItem(itemGrapeBraquetJuice, "itemGrapeBraquetJuice");
		GameRegistry.registerItem(itemGrapeCabernetFrancJuice, "itemGrapeCabernetFrancJuice");

		itemGrapeCabernetSauvignonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCabernetSauvignonJuice");
		itemGrapeCamareseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCamareseJuice");
		itemGrapeCarcaghjoluBiancuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarcaghjoluBiancuJuice");
		itemGrapeCarcaghjoluNeruJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarcaghjoluNeruJuice");
		itemGrapeCarignanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarignanJuice");

		GameRegistry.registerItem(itemGrapeCabernetSauvignonJuice, "itemGrapeCabernetSauvignonJuice");
		GameRegistry.registerItem(itemGrapeCamareseJuice, "itemGrapeCamareseJuice");
		GameRegistry.registerItem(itemGrapeCarcaghjoluBiancuJuice, "itemGrapeCarcaghjoluBiancuJuice");
		GameRegistry.registerItem(itemGrapeCarcaghjoluNeruJuice, "itemGrapeCarcaghjoluNeruJuice");
		GameRegistry.registerItem(itemGrapeCarignanJuice, "itemGrapeCarignanJuice");

		itemGrapeCesarJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCesarJuice");
		itemGrapeChardonnayJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeChardonnayJuice");
		itemGrapeCheninJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCheninJuice");
		itemGrapeCinsaultJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCinsaultJuice");
		itemGrapeClairetteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeClairetteJuice");

		GameRegistry.registerItem(itemGrapeCesarJuice, "itemGrapeCesarJuice");
		GameRegistry.registerItem(itemGrapeChardonnayJuice, "itemGrapeChardonnayJuice");
		GameRegistry.registerItem(itemGrapeCheninJuice, "itemGrapeCheninJuice");
		GameRegistry.registerItem(itemGrapeCinsaultJuice, "itemGrapeCinsaultJuice");
		GameRegistry.registerItem(itemGrapeClairetteJuice, "itemGrapeClairetteJuice");

		itemGrapeColombardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeColombardJuice");
		itemGrapeCotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCotJuice");
		itemGrapeCounoiseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCounoiseJuice");
		itemGrapeCourbuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCourbuJuice");
		itemGrapeCudivertaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCudivertaJuice");

		GameRegistry.registerItem(itemGrapeColombardJuice, "itemGrapeColombardJuice");
		GameRegistry.registerItem(itemGrapeCotJuice, "itemGrapeCotJuice");
		GameRegistry.registerItem(itemGrapeCounoiseJuice, "itemGrapeCounoiseJuice");
		GameRegistry.registerItem(itemGrapeCourbuJuice, "itemGrapeCourbuJuice");
		GameRegistry.registerItem(itemGrapeCudivertaJuice, "itemGrapeCudivertaJuice");

		itemGrapeDurasJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeDurasJuice");
		itemGrapeFerServadouJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeFerServadouJuice");
		itemGrapeFolleBlancheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeFolleBlancheJuice");
		itemGrapeGamayJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGamayJuice");
		itemGrapeGewurztraminerJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGewurztraminerJuice");

		GameRegistry.registerItem(itemGrapeDurasJuice, "itemGrapeDurasJuice");
		GameRegistry.registerItem(itemGrapeFerServadouJuice, "itemGrapeFerServadouJuice");
		GameRegistry.registerItem(itemGrapeFolleBlancheJuice, "itemGrapeFolleBlancheJuice");
		GameRegistry.registerItem(itemGrapeGamayJuice, "itemGrapeGamayJuice");
		GameRegistry.registerItem(itemGrapeGewurztraminerJuice, "itemGrapeGewurztraminerJuice");

		itemGrapeGrenacheBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrenacheBlancJuice");
		itemGrapeGrenacheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrenacheJuice");
		itemGrapeGrolleauJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrolleauJuice");
		itemGrapeGrosMensengJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrosMensengJuice");
		itemGrapeJacquereJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeJacquereJuice");

		GameRegistry.registerItem(itemGrapeGrenacheBlancJuice, "itemGrapeGrenacheBlancJuice");
		GameRegistry.registerItem(itemGrapeGrenacheJuice, "itemGrapeGrenacheJuice");
		GameRegistry.registerItem(itemGrapeGrolleauJuice, "itemGrapeGrolleauJuice");
		GameRegistry.registerItem(itemGrapeGrosMensengJuice, "itemGrapeGrosMensengJuice");
		GameRegistry.registerItem(itemGrapeJacquereJuice, "itemGrapeJacquereJuice");

		itemGrapeLenDeLElJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeLenDeLElJuice");
		itemGrapeListanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeListanJuice");
		itemGrapeMaccabeuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMaccabeuJuice");
		itemGrapeMalbecJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMalbecJuice");
		itemGrapeMalvoisieJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMalvoisieJuice");

		GameRegistry.registerItem(itemGrapeLenDeLElJuice, "itemGrapeLenDeLElJuice");
		GameRegistry.registerItem(itemGrapeListanJuice, "itemGrapeListanJuice");
		GameRegistry.registerItem(itemGrapeMaccabeuJuice, "itemGrapeMaccabeuJuice");
		GameRegistry.registerItem(itemGrapeMalbecJuice, "itemGrapeMalbecJuice");
		GameRegistry.registerItem(itemGrapeMalvoisieJuice, "itemGrapeMalvoisieJuice");

		itemGrapeMarsanneJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMarsanneJuice");
		itemGrapeMarselanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMarselanJuice");
		itemGrapeMauzacJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMauzacJuice");
		itemGrapeMelonDeBourgogneJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMelonDeBourgogneJuice");
		itemGrapeMelonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMelonJuice");

		GameRegistry.registerItem(itemGrapeMarsanneJuice, "itemGrapeMarsanneJuice");
		GameRegistry.registerItem(itemGrapeMarselanJuice, "itemGrapeMarselanJuice");
		GameRegistry.registerItem(itemGrapeMauzacJuice, "itemGrapeMauzacJuice");
		GameRegistry.registerItem(itemGrapeMelonDeBourgogneJuice, "itemGrapeMelonDeBourgogneJuice");
		GameRegistry.registerItem(itemGrapeMelonJuice, "itemGrapeMelonJuice");

		itemGrapeMerlotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMerlotJuice");
		itemGrapeMoletteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMoletteJuice");
		itemGrapeMollardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMollardJuice");
		itemGrapeMondeuseBlancheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMondeuseBlancheJuice");
		itemGrapeMondeuseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMondeuseJuice");

		GameRegistry.registerItem(itemGrapeMerlotJuice, "itemGrapeMerlotJuice");
		GameRegistry.registerItem(itemGrapeMoletteJuice, "itemGrapeMoletteJuice");
		GameRegistry.registerItem(itemGrapeMollardJuice, "itemGrapeMollardJuice");
		GameRegistry.registerItem(itemGrapeMondeuseBlancheJuice, "itemGrapeMondeuseBlancheJuice");
		GameRegistry.registerItem(itemGrapeMondeuseJuice, "itemGrapeMondeuseJuice");

		itemGrapeMourvedreJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMourvedreJuice");
		itemGrapeMuscadelleJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscadelleJuice");
		itemGrapeMuscardinJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscardinJuice");
		itemGrapeMuscatBlancAPetitsGrainsJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscatBlancAPetitsGrainsJuice");
		itemGrapeMuscatDAlexandrieJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscatDAlexandrieJuice");

		GameRegistry.registerItem(itemGrapeMourvedreJuice, "itemGrapeMourvedreJuice");
		GameRegistry.registerItem(itemGrapeMuscadelleJuice, "itemGrapeMuscadelleJuice");
		GameRegistry.registerItem(itemGrapeMuscardinJuice, "itemGrapeMuscardinJuice");
		GameRegistry.registerItem(itemGrapeMuscatBlancAPetitsGrainsJuice, "itemGrapeMuscatBlancAPetitsGrainsJuice");
		GameRegistry.registerItem(itemGrapeMuscatDAlexandrieJuice, "itemGrapeMuscatDAlexandrieJuice");

		itemGrapeNegretteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeNegretteJuice");
		itemGrapeNielluccioJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeNielluccioJuice");
		itemGrapePagaDebitiJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePagaDebitiJuice");
		itemGrapePetitCourbuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitCourbuJuice");
		itemGrapePetitMensengJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitMensengJuice");

		GameRegistry.registerItem(itemGrapeNegretteJuice, "itemGrapeNegretteJuice");
		GameRegistry.registerItem(itemGrapeNielluccioJuice, "itemGrapeNielluccioJuice");
		GameRegistry.registerItem(itemGrapePagaDebitiJuice, "itemGrapePagaDebitiJuice");
		GameRegistry.registerItem(itemGrapePetitCourbuJuice, "itemGrapePetitCourbuJuice");
		GameRegistry.registerItem(itemGrapePetitMensengJuice, "itemGrapePetitMensengJuice");

		itemGrapePetitVerdotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitVerdotJuice");
		itemGrapePineauDAunisJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePineauDAunisJuice");
		itemGrapePinotBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotBlancJuice");
		itemGrapePinotMeunierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotMeunierJuice");
		itemGrapePinotNoirJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotNoirJuice");

		GameRegistry.registerItem(itemGrapePetitVerdotJuice, "itemGrapePetitVerdotJuice");
		GameRegistry.registerItem(itemGrapePineauDAunisJuice, "itemGrapePineauDAunisJuice");
		GameRegistry.registerItem(itemGrapePinotBlancJuice, "itemGrapePinotBlancJuice");
		GameRegistry.registerItem(itemGrapePinotMeunierJuice, "itemGrapePinotMeunierJuice");
		GameRegistry.registerItem(itemGrapePinotNoirJuice, "itemGrapePinotNoirJuice");

		itemGrapePiquepoulJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePiquepoulJuice");
		itemGrapePoulsardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePoulsardJuice");
		itemGrapeRieslingJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRieslingJuice");
		itemGrapeRomorantinJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRomorantinJuice");
		itemGrapeRossulaBiancaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRossulaBiancaJuice");

		GameRegistry.registerItem(itemGrapePiquepoulJuice, "itemGrapePiquepoulJuice");
		GameRegistry.registerItem(itemGrapePoulsardJuice, "itemGrapePoulsardJuice");
		GameRegistry.registerItem(itemGrapeRieslingJuice, "itemGrapeRieslingJuice");
		GameRegistry.registerItem(itemGrapeRomorantinJuice, "itemGrapeRomorantinJuice");
		GameRegistry.registerItem(itemGrapeRossulaBiancaJuice, "itemGrapeRossulaBiancaJuice");

		itemGrapeSacyJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSacyJuice");
		itemGrapeSauvignonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSauvignonJuice");
		itemGrapeSavagninJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSavagninJuice");
		itemGrapeSemillonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSemillonJuice");
		itemGrapeSylvanerJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSylvanerJuice");

		GameRegistry.registerItem(itemGrapeSacyJuice, "itemGrapeSacyJuice");
		GameRegistry.registerItem(itemGrapeSauvignonJuice, "itemGrapeSauvignonJuice");
		GameRegistry.registerItem(itemGrapeSavagninJuice, "itemGrapeSavagninJuice");
		GameRegistry.registerItem(itemGrapeSemillonJuice, "itemGrapeSemillonJuice");
		GameRegistry.registerItem(itemGrapeSylvanerJuice, "itemGrapeSylvanerJuice");

		itemGrapeSyrahJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSyrahJuice");
		itemGrapeTannatJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTannatJuice");
		itemGrapeTeoulierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTeoulierJuice");
		itemGrapeTerretNoirJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTerretNoirJuice");
		itemGrapeTibourenJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTibourenJuice");

		GameRegistry.registerItem(itemGrapeSyrahJuice, "itemGrapeSyrahJuice");
		GameRegistry.registerItem(itemGrapeTannatJuice, "itemGrapeTannatJuice");
		GameRegistry.registerItem(itemGrapeTeoulierJuice, "itemGrapeTeoulierJuice");
		GameRegistry.registerItem(itemGrapeTerretNoirJuice, "itemGrapeTerretNoirJuice");
		GameRegistry.registerItem(itemGrapeTibourenJuice, "itemGrapeTibourenJuice");

		itemGrapeTressalierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTressalierJuice");
		itemGrapeUgniBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeUgniBlancJuice");
		itemGrapeVaccareseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeVaccareseJuice");
		itemGrapeVermentinuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeVermentinuJuice");
		itemGrapeViognierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeViognierJuice");

		GameRegistry.registerItem(itemGrapeTressalierJuice, "itemGrapeTressalierJuice");
		GameRegistry.registerItem(itemGrapeUgniBlancJuice, "itemGrapeUgniBlancJuice");
		GameRegistry.registerItem(itemGrapeVaccareseJuice, "itemGrapeVaccareseJuice");
		GameRegistry.registerItem(itemGrapeVermentinuJuice, "itemGrapeVermentinuJuice");
		GameRegistry.registerItem(itemGrapeViognierJuice, "itemGrapeViognierJuice");

			//syrup Monin
		itemLogoMonin = new ItemSyrup().setUnlocalizedName("itemLogoMonin");
		itemSyrupAlmond = new ItemSyrup().setUnlocalizedName("itemSyrupAlmond");
		itemSyrupAmaretto = new ItemSyrup().setUnlocalizedName("itemSyrupAmaretto");
		itemSyrupAnise = new ItemSyrup().setUnlocalizedName("itemSyrupAnise");
		itemSyrupApple = new ItemSyrup().setUnlocalizedName("itemSyrupApple");

		GameRegistry.registerItem(itemLogoMonin, "itemLogoMonin");
		GameRegistry.registerItem(itemSyrupAlmond, "itemSyrupAlmond");
		GameRegistry.registerItem(itemSyrupAmaretto, "itemSyrupAmaretto");
		GameRegistry.registerItem(itemSyrupAnise, "itemSyrupAnise");
		GameRegistry.registerItem(itemSyrupApple, "itemSyrupApple");

		itemSyrupApplePie = new ItemSyrup().setUnlocalizedName("itemSyrupApplePie");
		itemSyrupApricot = new ItemSyrup().setUnlocalizedName("itemSyrupApricot");
		itemSyrupBasil = new ItemSyrup().setUnlocalizedName("itemSyrupBasil");
		itemSyrupBitter = new ItemSyrup().setUnlocalizedName("itemSyrupBitter");
		itemSyrupBlackForest = new ItemSyrup().setUnlocalizedName("itemSyrupBlackForest");

		GameRegistry.registerItem(itemSyrupApplePie, "itemSyrupApplePie");
		GameRegistry.registerItem(itemSyrupApricot, "itemSyrupApricot");
		GameRegistry.registerItem(itemSyrupBasil, "itemSyrupBasil");
		GameRegistry.registerItem(itemSyrupBitter, "itemSyrupBitter");
		GameRegistry.registerItem(itemSyrupBlackForest, "itemSyrupBlackForest");

		itemSyrupBlackberry = new ItemSyrup().setUnlocalizedName("itemSyrupBlackberry");
		itemSyrupBlackcurrant = new ItemSyrup().setUnlocalizedName("itemSyrupBlackcurrant");
		itemSyrupBloodOrange = new ItemSyrup().setUnlocalizedName("itemSyrupBloodOrange");
		itemSyrupBlueCuracao = new ItemSyrup().setUnlocalizedName("itemSyrupBlueCuracao");
		itemSyrupBlueberry = new ItemSyrup().setUnlocalizedName("itemSyrupBlueberry");

		GameRegistry.registerItem(itemSyrupBlackberry, "itemSyrupBlackberry");
		GameRegistry.registerItem(itemSyrupBlackcurrant, "itemSyrupBlackcurrant");
		GameRegistry.registerItem(itemSyrupBloodOrange, "itemSyrupBloodOrange");
		GameRegistry.registerItem(itemSyrupBlueCuracao, "itemSyrupBlueCuracao");
		GameRegistry.registerItem(itemSyrupBlueberry, "itemSyrupBlueberry");

		itemSyrupBubbleGum = new ItemSyrup().setUnlocalizedName("itemSyrupBubbleGum");
		itemSyrupCaipirinha = new ItemSyrup().setUnlocalizedName("itemSyrupCaipirinha");
		itemSyrupCandyStrawberry = new ItemSyrup().setUnlocalizedName("itemSyrupCandyStrawberry");
		itemSyrupCaramel = new ItemSyrup().setUnlocalizedName("itemSyrupCaramel");
		itemSyrupCardamom = new ItemSyrup().setUnlocalizedName("itemSyrupCardamom");

		GameRegistry.registerItem(itemSyrupBubbleGum, "itemSyrupBubbleGum");
		GameRegistry.registerItem(itemSyrupCaipirinha, "itemSyrupCaipirinha");
		GameRegistry.registerItem(itemSyrupCandyStrawberry, "itemSyrupCandyStrawberry");
		GameRegistry.registerItem(itemSyrupCaramel, "itemSyrupCaramel");
		GameRegistry.registerItem(itemSyrupCardamom, "itemSyrupCardamom");

		itemSyrupChaiTea = new ItemSyrup().setUnlocalizedName("itemSyrupChaiTea");
		itemSyrupCherry = new ItemSyrup().setUnlocalizedName("itemSyrupCherry");
		itemSyrupCherryPlum = new ItemSyrup().setUnlocalizedName("itemSyrupCherryPlum");
		itemSyrupChestnut = new ItemSyrup().setUnlocalizedName("itemSyrupChestnut");
		itemSyrupChocolate = new ItemSyrup().setUnlocalizedName("itemSyrupChocolate");

		GameRegistry.registerItem(itemSyrupChaiTea, "itemSyrupChaiTea");
		GameRegistry.registerItem(itemSyrupCherry, "itemSyrupCherry");
		GameRegistry.registerItem(itemSyrupCherryPlum, "itemSyrupCherryPlum");
		GameRegistry.registerItem(itemSyrupChestnut, "itemSyrupChestnut");
		GameRegistry.registerItem(itemSyrupChocolate, "itemSyrupChocolate");

		itemSyrupChocolateCookie = new ItemSyrup().setUnlocalizedName("itemSyrupChocolateCookie");
		itemSyrupChocolateMint = new ItemSyrup().setUnlocalizedName("itemSyrupChocolateMint");
		itemSyrupCinnamon = new ItemSyrup().setUnlocalizedName("itemSyrupCinnamon");
		itemSyrupCoconut = new ItemSyrup().setUnlocalizedName("itemSyrupCoconut");
		itemSyrupCoffee = new ItemSyrup().setUnlocalizedName("itemSyrupCoffee");

		GameRegistry.registerItem(itemSyrupChocolateCookie, "itemSyrupChocolateCookie");
		GameRegistry.registerItem(itemSyrupChocolateMint, "itemSyrupChocolateMint");
		GameRegistry.registerItem(itemSyrupCinnamon, "itemSyrupCinnamon");
		GameRegistry.registerItem(itemSyrupCoconut, "itemSyrupCoconut");
		GameRegistry.registerItem(itemSyrupCoffee, "itemSyrupCoffee");

		itemSyrupCottonCandy = new ItemSyrup().setUnlocalizedName("itemSyrupCottonCandy");
		itemSyrupCranberry = new ItemSyrup().setUnlocalizedName("itemSyrupCranberry");
		itemSyrupCremeBrulee = new ItemSyrup().setUnlocalizedName("itemSyrupCremeBrulee");
		itemSyrupCucumber = new ItemSyrup().setUnlocalizedName("itemSyrupCucumber");
		itemSyrupElderFlower = new ItemSyrup().setUnlocalizedName("itemSyrupElderFlower");

		GameRegistry.registerItem(itemSyrupCottonCandy, "itemSyrupCottonCandy");
		GameRegistry.registerItem(itemSyrupCranberry, "itemSyrupCranberry");
		GameRegistry.registerItem(itemSyrupCremeBrulee, "itemSyrupCremeBrulee");
		GameRegistry.registerItem(itemSyrupCucumber, "itemSyrupCucumber");
		GameRegistry.registerItem(itemSyrupElderFlower, "itemSyrupElderFlower");

		itemSyrupFig = new ItemSyrup().setUnlocalizedName("itemSyrupFig");
		itemSyrupFrostedMint = new ItemSyrup().setUnlocalizedName("itemSyrupFrostedMint");
		itemSyrupGin = new ItemSyrup().setUnlocalizedName("itemSyrupGin");
		itemSyrupGinger = new ItemSyrup().setUnlocalizedName("itemSyrupGinger");
		itemSyrupGingerBread = new ItemSyrup().setUnlocalizedName("itemSyrupGingerBread");

		GameRegistry.registerItem(itemSyrupFig, "itemSyrupFig");
		GameRegistry.registerItem(itemSyrupFrostedMint, "itemSyrupFrostedMint");
		GameRegistry.registerItem(itemSyrupGin, "itemSyrupGin");
		GameRegistry.registerItem(itemSyrupGinger, "itemSyrupGinger");
		GameRegistry.registerItem(itemSyrupGingerBread, "itemSyrupGingerBread");

		itemSyrupGlascoLemon = new ItemSyrup().setUnlocalizedName("itemSyrupGlascoLemon");
		itemSyrupGrapefruit = new ItemSyrup().setUnlocalizedName("itemSyrupGrapefruit");
		itemSyrupGreenApple = new ItemSyrup().setUnlocalizedName("itemSyrupGreenApple");
		itemSyrupGreenBanana = new ItemSyrup().setUnlocalizedName("itemSyrupGreenBanana");
		itemSyrupGreenMint = new ItemSyrup().setUnlocalizedName("itemSyrupGreenMint");

		GameRegistry.registerItem(itemSyrupGlascoLemon, "itemSyrupGlascoLemon");
		GameRegistry.registerItem(itemSyrupGrapefruit, "itemSyrupGrapefruit");
		GameRegistry.registerItem(itemSyrupGreenApple, "itemSyrupGreenApple");
		GameRegistry.registerItem(itemSyrupGreenBanana, "itemSyrupGreenBanana");
		GameRegistry.registerItem(itemSyrupGreenMint, "itemSyrupGreenMint");

		itemSyrupGrenadine = new ItemSyrup().setUnlocalizedName("itemSyrupGrenadine");
		itemSyrupGuava = new ItemSyrup().setUnlocalizedName("itemSyrupGuava");
		itemSyrupGum = new ItemSyrup().setUnlocalizedName("itemSyrupGum");
		itemSyrupHazelnut = new ItemSyrup().setUnlocalizedName("itemSyrupHazelnut");
		itemSyrupHibiscus = new ItemSyrup().setUnlocalizedName("itemSyrupHibiscus");

		GameRegistry.registerItem(itemSyrupGrenadine, "itemSyrupGrenadine");
		GameRegistry.registerItem(itemSyrupGuava, "itemSyrupGuava");
		GameRegistry.registerItem(itemSyrupGum, "itemSyrupGum");
		GameRegistry.registerItem(itemSyrupHazelnut, "itemSyrupHazelnut");
		GameRegistry.registerItem(itemSyrupHibiscus, "itemSyrupHibiscus");

		itemSyrupHoney = new ItemSyrup().setUnlocalizedName("itemSyrupHoney");
		itemSyrupIrish = new ItemSyrup().setUnlocalizedName("itemSyrupIrish");
		itemSyrupJasmine = new ItemSyrup().setUnlocalizedName("itemSyrupJasmine");
		itemSyrupKiwi = new ItemSyrup().setUnlocalizedName("itemSyrupKiwi");
		itemSyrupLavender = new ItemSyrup().setUnlocalizedName("itemSyrupLavender");

		GameRegistry.registerItem(itemSyrupHoney, "itemSyrupHoney");
		GameRegistry.registerItem(itemSyrupIrish, "itemSyrupIrish");
		GameRegistry.registerItem(itemSyrupJasmine, "itemSyrupJasmine");
		GameRegistry.registerItem(itemSyrupKiwi, "itemSyrupKiwi");
		GameRegistry.registerItem(itemSyrupLavender, "itemSyrupLavender");

		itemSyrupLemonGrass = new ItemSyrup().setUnlocalizedName("itemSyrupLemonGrass");
		itemSyrupLemonPie = new ItemSyrup().setUnlocalizedName("itemSyrupLemonPie");
		itemSyrupLemonTea = new ItemSyrup().setUnlocalizedName("itemSyrupLemonTea");
		itemSyrupLime = new ItemSyrup().setUnlocalizedName("itemSyrupLime");
		itemSyrupLimeJuiceCordialMixer = new ItemSyrup().setUnlocalizedName("itemSyrupLimeJuiceCordialMixer");

		GameRegistry.registerItem(itemSyrupLemonGrass, "itemSyrupLemonGrass");
		GameRegistry.registerItem(itemSyrupLemonPie, "itemSyrupLemonPie");
		GameRegistry.registerItem(itemSyrupLemonTea, "itemSyrupLemonTea");
		GameRegistry.registerItem(itemSyrupLime, "itemSyrupLime");
		GameRegistry.registerItem(itemSyrupLimeJuiceCordialMixer, "itemSyrupLimeJuiceCordialMixer");

		itemSyrupLychee = new ItemSyrup().setUnlocalizedName("itemSyrupLychee");
		itemSyrupMacadamiaNut = new ItemSyrup().setUnlocalizedName("itemSyrupMacadamiaNut");
		itemSyrupMacaron = new ItemSyrup().setUnlocalizedName("itemSyrupMacaron");
		itemSyrupMango = new ItemSyrup().setUnlocalizedName("itemSyrupMango");
		itemSyrupMapleSpice = new ItemSyrup().setUnlocalizedName("itemSyrupMapleSpice");

		GameRegistry.registerItem(itemSyrupLychee, "itemSyrupLychee");
		GameRegistry.registerItem(itemSyrupMacadamiaNut, "itemSyrupMacadamiaNut");
		GameRegistry.registerItem(itemSyrupMacaron, "itemSyrupMacaron");
		GameRegistry.registerItem(itemSyrupMango, "itemSyrupMango");
		GameRegistry.registerItem(itemSyrupMapleSpice, "itemSyrupMapleSpice");

		itemSyrupMatchaGreenTea = new ItemSyrup().setUnlocalizedName("itemSyrupMatchaGreenTea");
		itemSyrupMelon = new ItemSyrup().setUnlocalizedName("itemSyrupMelon");
		itemSyrupMojitoMint = new ItemSyrup().setUnlocalizedName("itemSyrupMojitoMint");
		itemSyrupMorelloCherry = new ItemSyrup().setUnlocalizedName("itemSyrupMorelloCherry");
		itemSyrupOrange = new ItemSyrup().setUnlocalizedName("itemSyrupOrange");

		GameRegistry.registerItem(itemSyrupMatchaGreenTea, "itemSyrupMatchaGreenTea");
		GameRegistry.registerItem(itemSyrupMelon, "itemSyrupMelon");
		GameRegistry.registerItem(itemSyrupMojitoMint, "itemSyrupMojitoMint");
		GameRegistry.registerItem(itemSyrupMorelloCherry, "itemSyrupMorelloCherry");
		GameRegistry.registerItem(itemSyrupOrange, "itemSyrupOrange");

		itemSyrupPassionFruit = new ItemSyrup().setUnlocalizedName("itemSyrupPassionFruit");
		itemSyrupPeach = new ItemSyrup().setUnlocalizedName("itemSyrupPeach");
		itemSyrupPeachTea = new ItemSyrup().setUnlocalizedName("itemSyrupPeachTea");
		itemSyrupPear = new ItemSyrup().setUnlocalizedName("itemSyrupPear");
		itemSyrupPinacolada = new ItemSyrup().setUnlocalizedName("itemSyrupPinacolada");

		GameRegistry.registerItem(itemSyrupPassionFruit, "itemSyrupPassionFruit");
		GameRegistry.registerItem(itemSyrupPeach, "itemSyrupPeach");
		GameRegistry.registerItem(itemSyrupPeachTea, "itemSyrupPeachTea");
		GameRegistry.registerItem(itemSyrupPear, "itemSyrupPear");
		GameRegistry.registerItem(itemSyrupPinacolada, "itemSyrupPinacolada");

		itemSyrupPineapple = new ItemSyrup().setUnlocalizedName("itemSyrupPineapple");
		itemSyrupPinkGrapefruit = new ItemSyrup().setUnlocalizedName("itemSyrupPinkGrapefruit");
		itemSyrupPistachio = new ItemSyrup().setUnlocalizedName("itemSyrupPistachio");
		itemSyrupPomegranate = new ItemSyrup().setUnlocalizedName("itemSyrupPomegranate");
		itemSyrupPraline = new ItemSyrup().setUnlocalizedName("itemSyrupPraline");

		GameRegistry.registerItem(itemSyrupPineapple, "itemSyrupPineapple");
		GameRegistry.registerItem(itemSyrupPinkGrapefruit, "itemSyrupPinkGrapefruit");
		GameRegistry.registerItem(itemSyrupPistachio, "itemSyrupPistachio");
		GameRegistry.registerItem(itemSyrupPomegranate, "itemSyrupPomegranate");
		GameRegistry.registerItem(itemSyrupPraline, "itemSyrupPraline");

		itemSyrupPureCaneSugar = new ItemSyrup().setUnlocalizedName("itemSyrupPureCaneSugar");
		itemSyrupRantchoLemon = new ItemSyrup().setUnlocalizedName("itemSyrupRantchoLemon");
		itemSyrupRaspberry = new ItemSyrup().setUnlocalizedName("itemSyrupRaspberry");
		itemSyrupRaspberryTea = new ItemSyrup().setUnlocalizedName("itemSyrupRaspberryTea");
		itemSyrupRoastedHazelnut = new ItemSyrup().setUnlocalizedName("itemSyrupRoastedHazelnut");

		GameRegistry.registerItem(itemSyrupPureCaneSugar, "itemSyrupPureCaneSugar");
		GameRegistry.registerItem(itemSyrupRantchoLemon, "itemSyrupRantchoLemon");
		GameRegistry.registerItem(itemSyrupRaspberry, "itemSyrupRaspberry");
		GameRegistry.registerItem(itemSyrupRaspberryTea, "itemSyrupRaspberryTea");
		GameRegistry.registerItem(itemSyrupRoastedHazelnut, "itemSyrupRoastedHazelnut");

		itemSyrupRose = new ItemSyrup().setUnlocalizedName("itemSyrupRose");
		itemSyrupRosmary = new ItemSyrup().setUnlocalizedName("itemSyrupRosmary");
		itemSyrupRumFlavour = new ItemSyrup().setUnlocalizedName("itemSyrupRumFlavour");
		itemSyrupSaltedCaramel = new ItemSyrup().setUnlocalizedName("itemSyrupSaltedCaramel");
		itemSyrupSangria = new ItemSyrup().setUnlocalizedName("itemSyrupSangria");

		GameRegistry.registerItem(itemSyrupRose, "itemSyrupRose");
		GameRegistry.registerItem(itemSyrupRosmary, "itemSyrupRosmary");
		GameRegistry.registerItem(itemSyrupRumFlavour, "itemSyrupRumFlavour");
		GameRegistry.registerItem(itemSyrupSaltedCaramel, "itemSyrupSaltedCaramel");
		GameRegistry.registerItem(itemSyrupSangria, "itemSyrupSangria");

		itemSyrupSpeculoos = new ItemSyrup().setUnlocalizedName("itemSyrupSpeculoos");
		itemSyrupSpicy = new ItemSyrup().setUnlocalizedName("itemSyrupSpicy");
		itemSyrupSpicyMango = new ItemSyrup().setUnlocalizedName("itemSyrupSpicyMango");
		itemSyrupStrawberry = new ItemSyrup().setUnlocalizedName("itemSyrupStrawberry");
		itemSyrupTangerine = new ItemSyrup().setUnlocalizedName("itemSyrupTangerine");

		GameRegistry.registerItem(itemSyrupSpeculoos, "itemSyrupSpeculoos");
		GameRegistry.registerItem(itemSyrupSpicy, "itemSyrupSpicy");
		GameRegistry.registerItem(itemSyrupSpicyMango, "itemSyrupSpicyMango");
		GameRegistry.registerItem(itemSyrupStrawberry, "itemSyrupStrawberry");
		GameRegistry.registerItem(itemSyrupTangerine, "itemSyrupTangerine");

		itemSyrupTarragon = new ItemSyrup().setUnlocalizedName("itemSyrupTarragon");
		itemSyrupTequilaFlavour = new ItemSyrup().setUnlocalizedName("itemSyrupTequilaFlavour");
		itemSyrupTiramisu = new ItemSyrup().setUnlocalizedName("itemSyrupTiramisu");
		itemSyrupToffeeNut = new ItemSyrup().setUnlocalizedName("itemSyrupToffeeNut");
		itemSyrupTonkaBean = new ItemSyrup().setUnlocalizedName("itemSyrupTonkaBean");

		GameRegistry.registerItem(itemSyrupTarragon, "itemSyrupTarragon");
		GameRegistry.registerItem(itemSyrupTequilaFlavour, "itemSyrupTequilaFlavour");
		GameRegistry.registerItem(itemSyrupTiramisu, "itemSyrupTiramisu");
		GameRegistry.registerItem(itemSyrupToffeeNut, "itemSyrupToffeeNut");
		GameRegistry.registerItem(itemSyrupTonkaBean, "itemSyrupTonkaBean");

		itemSyrupTripleSecCuracao = new ItemSyrup().setUnlocalizedName("itemSyrupTripleSecCuracao");
		itemSyrupVanilla = new ItemSyrup().setUnlocalizedName("itemSyrupVanilla");
		itemSyrupViolet = new ItemSyrup().setUnlocalizedName("itemSyrupViolet");
		itemSyrupWatermelon = new ItemSyrup().setUnlocalizedName("itemSyrupWatermelon");
		itemSyrupWhiteChocolate = new ItemSyrup().setUnlocalizedName("itemSyrupWhiteChocolate");

		GameRegistry.registerItem(itemSyrupTripleSecCuracao, "itemSyrupTripleSecCuracao");
		GameRegistry.registerItem(itemSyrupVanilla, "itemSyrupVanilla");
		GameRegistry.registerItem(itemSyrupViolet, "itemSyrupViolet");
		GameRegistry.registerItem(itemSyrupWatermelon, "itemSyrupWatermelon");
		GameRegistry.registerItem(itemSyrupWhiteChocolate, "itemSyrupWhiteChocolate");

		itemSyrupWhitePeach = new ItemSyrup().setUnlocalizedName("itemSyrupWhitePeach");
		itemSyrupWildStrawberry = new ItemSyrup().setUnlocalizedName("itemSyrupWildStrawberry");
		itemSyrupYellowBanana = new ItemSyrup().setUnlocalizedName("itemSyrupYellowBanana");

		GameRegistry.registerItem(itemSyrupWhitePeach, "itemSyrupWhitePeach");
		GameRegistry.registerItem(itemSyrupWildStrawberry, "itemSyrupWildStrawberry");
		GameRegistry.registerItem(itemSyrupYellowBanana, "itemSyrupYellowBanana");

		
		//items bottle
			//alcohol
		itemBottle1664 = new ItemBottle().setUnlocalizedName("itemBottle1664");
		itemBottleAlsaceRiesling = new ItemBottle().setUnlocalizedName("itemBottleAlsaceRiesling");
		itemBottleAmaretto = new ItemBottle().setUnlocalizedName("itemBottleAmaretto");
		itemBottleAngosturaBitter = new ItemBottle().setUnlocalizedName("itemBottleAngosturaBitter");
		itemBottleBaileys = new ItemBottle().setUnlocalizedName("itemBottleBaileys");

		GameRegistry.registerItem(itemBottle1664, "itemBottle1664");
		GameRegistry.registerItem(itemBottleAlsaceRiesling, "itemBottleAlsaceRiesling");
		GameRegistry.registerItem(itemBottleAmaretto, "itemBottleAmaretto");
		GameRegistry.registerItem(itemBottleAngosturaBitter, "itemBottleAngosturaBitter");
		GameRegistry.registerItem(itemBottleBaileys, "itemBottleBaileys");

		itemBottleBenedictine = new ItemBottle().setUnlocalizedName("itemBottleBenedictine");
		itemBottleBitter = new ItemBottle().setUnlocalizedName("itemBottleBitter");
		itemBottleBlueCaracao = new ItemBottle().setUnlocalizedName("itemBottleBlueCaracao");
		itemBottleBordeauxChateauLary = new ItemBottle().setUnlocalizedName("itemBottleBordeauxChateauLary");
		itemBottleBordeauxChateauTourVerite = new ItemBottle().setUnlocalizedName("itemBottleBordeauxChateauTourVerite");

		GameRegistry.registerItem(itemBottleBenedictine, "itemBottleBenedictine");
		GameRegistry.registerItem(itemBottleBitter, "itemBottleBitter");
		GameRegistry.registerItem(itemBottleBlueCaracao, "itemBottleBlueCaracao");
		GameRegistry.registerItem(itemBottleBordeauxChateauLary, "itemBottleBordeauxChateauLary");
		GameRegistry.registerItem(itemBottleBordeauxChateauTourVerite, "itemBottleBordeauxChateauTourVerite");

		itemBottleBourgogneAligote = new ItemBottle().setUnlocalizedName("itemBottleBourgogneAligote");
		itemBottleBrandy = new ItemBottle().setUnlocalizedName("itemBottleBrandy");
		itemBottleBritt = new ItemBottle().setUnlocalizedName("itemBottleBritt");
		itemBottleCalvados = new ItemBottle().setUnlocalizedName("itemBottleCalvados");
		itemBottleCampari = new ItemBottle().setUnlocalizedName("itemBottleCampari");

		GameRegistry.registerItem(itemBottleBourgogneAligote, "itemBottleBourgogneAligote");
		GameRegistry.registerItem(itemBottleBrandy, "itemBottleBrandy");
		GameRegistry.registerItem(itemBottleBritt, "itemBottleBritt");
		GameRegistry.registerItem(itemBottleCalvados, "itemBottleCalvados");
		GameRegistry.registerItem(itemBottleCampari, "itemBottleCampari");

		itemBottleCapCorse = new ItemBottle().setUnlocalizedName("itemBottleCapCorse");
		itemBottleChampagneMumm = new ItemBottle().setUnlocalizedName("itemBottleChampagneMumm");
		itemBottleChartreuseJaune = new ItemBottle().setUnlocalizedName("itemBottleChartreuseJaune");
		itemBottleChartreuseVerte = new ItemBottle().setUnlocalizedName("itemBottleChartreuseVerte");
		itemBottleChouchen = new ItemBottle().setUnlocalizedName("itemBottleChouchen");

		GameRegistry.registerItem(itemBottleCapCorse, "itemBottleCapCorse");
		GameRegistry.registerItem(itemBottleChampagneMumm, "itemBottleChampagneMumm");
		GameRegistry.registerItem(itemBottleChartreuseJaune, "itemBottleChartreuseJaune");
		GameRegistry.registerItem(itemBottleChartreuseVerte, "itemBottleChartreuseVerte");
		GameRegistry.registerItem(itemBottleChouchen, "itemBottleChouchen");

		itemBottleCiderKerne = new ItemBottle().setUnlocalizedName("itemBottleCiderKerne");
		itemBottleCognac = new ItemBottle().setUnlocalizedName("itemBottleCognac");
		itemBottleCuracaoOrange = new ItemBottle().setUnlocalizedName("itemBottleCuracaoOrange");
		itemBottleCuracaoTripleSec = new ItemBottle().setUnlocalizedName("itemBottleCuracaoTripleSec");
		itemBottleDesperados = new ItemBottle().setUnlocalizedName("itemBottleDesperados");

		GameRegistry.registerItem(itemBottleCiderKerne, "itemBottleCiderKerne");
		GameRegistry.registerItem(itemBottleCognac, "itemBottleCognac");
		GameRegistry.registerItem(itemBottleCuracaoOrange, "itemBottleCuracaoOrange");
		GameRegistry.registerItem(itemBottleCuracaoTripleSec, "itemBottleCuracaoTripleSec");
		GameRegistry.registerItem(itemBottleDesperados, "itemBottleDesperados");

		itemBottleDrambuie = new ItemBottle().setUnlocalizedName("itemBottleDrambuie");
		itemBottleDubonnetRouge = new ItemBottle().setUnlocalizedName("itemBottleDubonnetRouge");
		itemBottleDuvel = new ItemBottle().setUnlocalizedName("itemBottleDuvel");
		itemBottleEnate = new ItemBottle().setUnlocalizedName("itemBottleEnate");
		itemBottleFernetBranca = new ItemBottle().setUnlocalizedName("itemBottleFernetBranca");

		GameRegistry.registerItem(itemBottleDrambuie, "itemBottleDrambuie");
		GameRegistry.registerItem(itemBottleDubonnetRouge, "itemBottleDubonnetRouge");
		GameRegistry.registerItem(itemBottleDuvel, "itemBottleDuvel");
		GameRegistry.registerItem(itemBottleEnate, "itemBottleEnate");
		GameRegistry.registerItem(itemBottleFernetBranca, "itemBottleFernetBranca");

		itemBottleGet27 = new ItemBottle().setUnlocalizedName("itemBottleGet27");
		itemBottleGin = new ItemBottle().setUnlocalizedName("itemBottleGin");
		itemBottleGrandMarnier = new ItemBottle().setUnlocalizedName("itemBottleGrandMarnier");
		itemBottleGrimbergen = new ItemBottle().setUnlocalizedName("itemBottleGrimbergen");
		itemBottleGuinness = new ItemBottle().setUnlocalizedName("itemBottleGuinness");

		GameRegistry.registerItem(itemBottleGet27, "itemBottleGet27");
		GameRegistry.registerItem(itemBottleGin, "itemBottleGin");
		GameRegistry.registerItem(itemBottleGrandMarnier, "itemBottleGrandMarnier");
		GameRegistry.registerItem(itemBottleGrimbergen, "itemBottleGrimbergen");
		GameRegistry.registerItem(itemBottleGuinness, "itemBottleGuinness");

		itemBottleHeineken = new ItemBottle().setUnlocalizedName("itemBottleHeineken");
		itemBottleHoney = new ItemBottle().setUnlocalizedName("itemBottleHoney");
		itemBottleLambig = new ItemBottle().setUnlocalizedName("itemBottleLambig");
		itemBottleLeffe = new ItemBottle().setUnlocalizedName("itemBottleLeffe");
		itemBottleLiqueur = new ItemBottle().setUnlocalizedName("itemBottleLiqueur");

		GameRegistry.registerItem(itemBottleHeineken, "itemBottleHeineken");
		GameRegistry.registerItem(itemBottleHoney, "itemBottleHoney");
		GameRegistry.registerItem(itemBottleLambig, "itemBottleLambig");
		GameRegistry.registerItem(itemBottleLeffe, "itemBottleLeffe");
		GameRegistry.registerItem(itemBottleLiqueur, "itemBottleLiqueur");

		itemBottlePastis51 = new ItemBottle().setUnlocalizedName("itemBottlePastis51");
		itemBottlePetrus = new ItemBottle().setUnlocalizedName("itemBottlePetrus");
		itemBottlePisco = new ItemBottle().setUnlocalizedName("itemBottlePisco");
		itemBottlePommeau = new ItemBottle().setUnlocalizedName("itemBottlePommeau");
		itemBottlePontarlier = new ItemBottle().setUnlocalizedName("itemBottlePontarlier");

		GameRegistry.registerItem(itemBottlePastis51, "itemBottlePastis51");
		GameRegistry.registerItem(itemBottlePetrus, "itemBottlePetrus");
		GameRegistry.registerItem(itemBottlePisco, "itemBottlePisco");
		GameRegistry.registerItem(itemBottlePommeau, "itemBottlePommeau");
		GameRegistry.registerItem(itemBottlePontarlier, "itemBottlePontarlier");

		itemBottleRedMartini = new ItemBottle().setUnlocalizedName("itemBottleRedMartini");
		itemBottleRedPort = new ItemBottle().setUnlocalizedName("itemBottleRedPort");
		itemBottleRum = new ItemBottle().setUnlocalizedName("itemBottleRum");
		itemBottleSanMiguel = new ItemBottle().setUnlocalizedName("itemBottleSanMiguel");
		itemBottleSkoll = new ItemBottle().setUnlocalizedName("itemBottleSkoll");

		GameRegistry.registerItem(itemBottleRedMartini, "itemBottleRedMartini");
		GameRegistry.registerItem(itemBottleRedPort, "itemBottleRedPort");
		GameRegistry.registerItem(itemBottleRum, "itemBottleRum");
		GameRegistry.registerItem(itemBottleSanMiguel, "itemBottleSanMiguel");
		GameRegistry.registerItem(itemBottleSkoll, "itemBottleSkoll");

		itemBottleSmirnoff = new ItemBottle().setUnlocalizedName("itemBottleSmirnoff");
		itemBottleSouthernComfort = new ItemBottle().setUnlocalizedName("itemBottleSouthernComfort");
		itemBottleTabasco = new ItemBottle().setUnlocalizedName("itemBottleTabasco");
		itemBottleTequila = new ItemBottle().setUnlocalizedName("itemBottleTequila");
		itemBottleVinegar = new ItemBottle().setUnlocalizedName("itemBottleVinegar");

		GameRegistry.registerItem(itemBottleSmirnoff, "itemBottleSmirnoff");
		GameRegistry.registerItem(itemBottleSouthernComfort, "itemBottleSouthernComfort");
		GameRegistry.registerItem(itemBottleTabasco, "itemBottleTabasco");
		GameRegistry.registerItem(itemBottleTequila, "itemBottleTequila");
		GameRegistry.registerItem(itemBottleVinegar, "itemBottleVinegar");

		itemBottleVodka = new ItemBottle().setUnlocalizedName("itemBottleVodka");
		itemBottleWhiskey = new ItemBottle().setUnlocalizedName("itemBottleWhiskey");
		itemBottleWhiteMartini = new ItemBottle().setUnlocalizedName("itemBottleWhiteMartini");
		itemBottleWhitePort = new ItemBottle().setUnlocalizedName("itemBottleWhitePort");
		itemBottleWorcestershireSauce = new ItemBottle().setUnlocalizedName("itemBottleWorcestershireSauce");

		GameRegistry.registerItem(itemBottleVodka, "itemBottleVodka");
		GameRegistry.registerItem(itemBottleWhiskey, "itemBottleWhiskey");
		GameRegistry.registerItem(itemBottleWhiteMartini, "itemBottleWhiteMartini");
		GameRegistry.registerItem(itemBottleWhitePort, "itemBottleWhitePort");
		GameRegistry.registerItem(itemBottleWorcestershireSauce, "itemBottleWorcestershireSauce");

		itemBottleXII = new ItemBottle().setUnlocalizedName("itemBottleXII");
		itemBottleXeres = new ItemBottle().setUnlocalizedName("itemBottleXeres");

		GameRegistry.registerItem(itemBottleXII, "itemBottleXII");
		GameRegistry.registerItem(itemBottleXeres, "itemBottleXeres");

			//sweet
		itemBottleBenturCola = new ItemBottle().setUnlocalizedName("itemBottleBenturCola");
		itemBottleFleurOranger = new ItemBottle().setUnlocalizedName("itemBottleFleurOranger");
		itemBottleKetchup = new ItemBottle().setUnlocalizedName("itemBottleKetchup");
		itemBottleLimonade = new ItemBottle().setUnlocalizedName("itemBottleLimonade");
		itemBottlePerrier = new ItemBottle().setUnlocalizedName("itemBottlePerrier");

		GameRegistry.registerItem(itemBottleBenturCola, "itemBottleBenturCola");
		GameRegistry.registerItem(itemBottleFleurOranger, "itemBottleFleurOranger");
		GameRegistry.registerItem(itemBottleKetchup, "itemBottleKetchup");
		GameRegistry.registerItem(itemBottleLimonade, "itemBottleLimonade");
		GameRegistry.registerItem(itemBottlePerrier, "itemBottlePerrier");

		itemBottleSchweppesAgrum = new ItemBottle().setUnlocalizedName("itemBottleSchweppesAgrum");
		itemBottleSchweppesDarkSide = new ItemBottle().setUnlocalizedName("itemBottleSchweppesDarkSide");
		itemBottleSchweppesGingerAle = new ItemBottle().setUnlocalizedName("itemBottleSchweppesGingerAle");
		itemBottleSchweppesLemon = new ItemBottle().setUnlocalizedName("itemBottleSchweppesLemon");
		itemBottleSchweppesMango = new ItemBottle().setUnlocalizedName("itemBottleSchweppesMango");

		GameRegistry.registerItem(itemBottleSchweppesAgrum, "itemBottleSchweppesAgrum");
		GameRegistry.registerItem(itemBottleSchweppesDarkSide, "itemBottleSchweppesDarkSide");
		GameRegistry.registerItem(itemBottleSchweppesGingerAle, "itemBottleSchweppesGingerAle");
		GameRegistry.registerItem(itemBottleSchweppesLemon, "itemBottleSchweppesLemon");
		GameRegistry.registerItem(itemBottleSchweppesMango, "itemBottleSchweppesMango");

		itemBottleSchweppesPamplemousse = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPamplemousse");
		itemBottleSchweppesPassion = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPassion");
		itemBottleSchweppesPech = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPech");
		itemBottleSchweppesPomme = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPomme");
		itemBottleSchweppesRaisin = new ItemBottle().setUnlocalizedName("itemBottleSchweppesRaisin");

		GameRegistry.registerItem(itemBottleSchweppesPamplemousse, "itemBottleSchweppesPamplemousse");
		GameRegistry.registerItem(itemBottleSchweppesPassion, "itemBottleSchweppesPassion");
		GameRegistry.registerItem(itemBottleSchweppesPech, "itemBottleSchweppesPech");
		GameRegistry.registerItem(itemBottleSchweppesPomme, "itemBottleSchweppesPomme");
		GameRegistry.registerItem(itemBottleSchweppesRaisin, "itemBottleSchweppesRaisin");

		itemBottleSchweppesRicqles = new ItemBottle().setUnlocalizedName("itemBottleSchweppesRicqles");
		itemBottleSchweppesTonic = new ItemBottle().setUnlocalizedName("itemBottleSchweppesTonic");
		itemPint = new ItemBottle().setUnlocalizedName("itemPint");

		GameRegistry.registerItem(itemBottleSchweppesRicqles, "itemBottleSchweppesRicqles");
		GameRegistry.registerItem(itemBottleSchweppesTonic, "itemBottleSchweppesTonic");
		GameRegistry.registerItem(itemPint, "itemPint");

			//alcohol without label
		itemBottle1664WOLabel = new ItemBottle().setUnlocalizedName("itemBottle1664WOLabel");
		itemBottleAlsaceRieslingWOLabel = new ItemBottle().setUnlocalizedName("itemBottleAlsaceRieslingWOLabel");
		itemBottleAmarettoWOLabel = new ItemBottle().setUnlocalizedName("itemBottleAmarettoWOLabel");
		itemBottleAngosturaBitterWOLabel = new ItemBottle().setUnlocalizedName("itemBottleAngosturaBitterWOLabel");
		itemBottleBaileysWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBaileysWOLabel");

		GameRegistry.registerItem(itemBottle1664WOLabel, "itemBottle1664WOLabel");
		GameRegistry.registerItem(itemBottleAlsaceRieslingWOLabel, "itemBottleAlsaceRieslingWOLabel");
		GameRegistry.registerItem(itemBottleAmarettoWOLabel, "itemBottleAmarettoWOLabel");
		GameRegistry.registerItem(itemBottleAngosturaBitterWOLabel, "itemBottleAngosturaBitterWOLabel");
		GameRegistry.registerItem(itemBottleBaileysWOLabel, "itemBottleBaileysWOLabel");

		itemBottleBenedictineWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBenedictineWOLabel");
		itemBottleBitterWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBitterWOLabel");
		itemBottleBlueCuracaoWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBlueCuracaoWOLabel");
		itemBottleBordeauxLaryWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBordeauxLaryWOLabel");
		itemBottleBordeauxTourWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBordeauxTourWOLabel");

		GameRegistry.registerItem(itemBottleBenedictineWOLabel, "itemBottleBenedictineWOLabel");
		GameRegistry.registerItem(itemBottleBitterWOLabel, "itemBottleBitterWOLabel");
		GameRegistry.registerItem(itemBottleBlueCuracaoWOLabel, "itemBottleBlueCuracaoWOLabel");
		GameRegistry.registerItem(itemBottleBordeauxLaryWOLabel, "itemBottleBordeauxLaryWOLabel");
		GameRegistry.registerItem(itemBottleBordeauxTourWOLabel, "itemBottleBordeauxTourWOLabel");

		itemBottleBourgogneAligoteWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBourgogneAligoteWOLabel");
		itemBottleBrandyWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBrandyWOLabel");
		itemBottleBrittWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBrittWOLabel");
		itemBottleCalvadosWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCalvadosWOLabel");
		itemBottleCampariWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCampariWOLabel");

		GameRegistry.registerItem(itemBottleBourgogneAligoteWOLabel, "itemBottleBourgogneAligoteWOLabel");
		GameRegistry.registerItem(itemBottleBrandyWOLabel, "itemBottleBrandyWOLabel");
		GameRegistry.registerItem(itemBottleBrittWOLabel, "itemBottleBrittWOLabel");
		GameRegistry.registerItem(itemBottleCalvadosWOLabel, "itemBottleCalvadosWOLabel");
		GameRegistry.registerItem(itemBottleCampariWOLabel, "itemBottleCampariWOLabel");

		itemBottleCapCorseWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCapCorseWOLabel");
		itemBottleChampagneMummWOLabel = new ItemBottle().setUnlocalizedName("itemBottleChampagneMummWOLabel");
		itemBottleChartreuseJauneWOLabel = new ItemBottle().setUnlocalizedName("itemBottleChartreuseJauneWOLabel");
		itemBottleChartreuseVerteWOLabel = new ItemBottle().setUnlocalizedName("itemBottleChartreuseVerteWOLabel");
		itemBottleChouchenWOLabel = new ItemBottle().setUnlocalizedName("itemBottleChouchenWOLabel");

		GameRegistry.registerItem(itemBottleCapCorseWOLabel, "itemBottleCapCorseWOLabel");
		GameRegistry.registerItem(itemBottleChampagneMummWOLabel, "itemBottleChampagneMummWOLabel");
		GameRegistry.registerItem(itemBottleChartreuseJauneWOLabel, "itemBottleChartreuseJauneWOLabel");
		GameRegistry.registerItem(itemBottleChartreuseVerteWOLabel, "itemBottleChartreuseVerteWOLabel");
		GameRegistry.registerItem(itemBottleChouchenWOLabel, "itemBottleChouchenWOLabel");

		itemBottleCiderKerneWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCiderKerneWOLabel");
		itemBottleCognacWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCognacWOLabel");
		itemBottleCuracaoOrangeWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCuracaoOrangeWOLabel");
		itemBottleCuracaoTripleSecWOLabel = new ItemBottle().setUnlocalizedName("itemBottleCuracaoTripleSecWOLabel");
		itemBottleDesperadosWOLabel = new ItemBottle().setUnlocalizedName("itemBottleDesperadosWOLabel");

		GameRegistry.registerItem(itemBottleCiderKerneWOLabel, "itemBottleCiderKerneWOLabel");
		GameRegistry.registerItem(itemBottleCognacWOLabel, "itemBottleCognacWOLabel");
		GameRegistry.registerItem(itemBottleCuracaoOrangeWOLabel, "itemBottleCuracaoOrangeWOLabel");
		GameRegistry.registerItem(itemBottleCuracaoTripleSecWOLabel, "itemBottleCuracaoTripleSecWOLabel");
		GameRegistry.registerItem(itemBottleDesperadosWOLabel, "itemBottleDesperadosWOLabel");

		itemBottleDrambuieWOLabel = new ItemBottle().setUnlocalizedName("itemBottleDrambuieWOLabel");
		itemBottleDubonnetRougeWOLabel = new ItemBottle().setUnlocalizedName("itemBottleDubonnetRougeWOLabel");
		itemBottleDuvelWOLabel = new ItemBottle().setUnlocalizedName("itemBottleDuvelWOLabel");
		itemBottleEnateWOLabel = new ItemBottle().setUnlocalizedName("itemBottleEnateWOLabel");
		itemBottleFernetBrancaWOLabel = new ItemBottle().setUnlocalizedName("itemBottleFernetBrancaWOLabel");

		GameRegistry.registerItem(itemBottleDrambuieWOLabel, "itemBottleDrambuieWOLabel");
		GameRegistry.registerItem(itemBottleDubonnetRougeWOLabel, "itemBottleDubonnetRougeWOLabel");
		GameRegistry.registerItem(itemBottleDuvelWOLabel, "itemBottleDuvelWOLabel");
		GameRegistry.registerItem(itemBottleEnateWOLabel, "itemBottleEnateWOLabel");
		GameRegistry.registerItem(itemBottleFernetBrancaWOLabel, "itemBottleFernetBrancaWOLabel");

		itemBottleGet27WOLabel = new ItemBottle().setUnlocalizedName("itemBottleGet27WOLabel");
		itemBottleGinWOLabel = new ItemBottle().setUnlocalizedName("itemBottleGinWOLabel");
		itemBottleGrandMarnierWOLabel = new ItemBottle().setUnlocalizedName("itemBottleGrandMarnierWOLabel");
		itemBottleGrimberWOLabel = new ItemBottle().setUnlocalizedName("itemBottleGrimberWOLabel");
		itemBottleGuinnessWOLabel = new ItemBottle().setUnlocalizedName("itemBottleGuinnessWOLabel");

		GameRegistry.registerItem(itemBottleGet27WOLabel, "itemBottleGet27WOLabel");
		GameRegistry.registerItem(itemBottleGinWOLabel, "itemBottleGinWOLabel");
		GameRegistry.registerItem(itemBottleGrandMarnierWOLabel, "itemBottleGrandMarnierWOLabel");
		GameRegistry.registerItem(itemBottleGrimberWOLabel, "itemBottleGrimberWOLabel");
		GameRegistry.registerItem(itemBottleGuinnessWOLabel, "itemBottleGuinnessWOLabel");

		itemBottleHeinekenWOLabel = new ItemBottle().setUnlocalizedName("itemBottleHeinekenWOLabel");
		itemBottleLambigWOLabel = new ItemBottle().setUnlocalizedName("itemBottleLambigWOLabel");
		itemBottleLeffeWOLabel = new ItemBottle().setUnlocalizedName("itemBottleLeffeWOLabel");
		itemBottleLiqueurWOLabel = new ItemBottle().setUnlocalizedName("itemBottleLiqueurWOLabel");
		itemBottlePastis51WOLabel = new ItemBottle().setUnlocalizedName("itemBottlePastis51WOLabel");

		GameRegistry.registerItem(itemBottleHeinekenWOLabel, "itemBottleHeinekenWOLabel");
		GameRegistry.registerItem(itemBottleLambigWOLabel, "itemBottleLambigWOLabel");
		GameRegistry.registerItem(itemBottleLeffeWOLabel, "itemBottleLeffeWOLabel");
		GameRegistry.registerItem(itemBottleLiqueurWOLabel, "itemBottleLiqueurWOLabel");
		GameRegistry.registerItem(itemBottlePastis51WOLabel, "itemBottlePastis51WOLabel");

		itemBottlePetrusWOLabel = new ItemBottle().setUnlocalizedName("itemBottlePetrusWOLabel");
		itemBottlePiscoWOLabel = new ItemBottle().setUnlocalizedName("itemBottlePiscoWOLabel");
		itemBottlePommeauWOLabel = new ItemBottle().setUnlocalizedName("itemBottlePommeauWOLabel");
		itemBottlePontarlierWOLabel = new ItemBottle().setUnlocalizedName("itemBottlePontarlierWOLabel");
		itemBottleRedMartiniWOLabel = new ItemBottle().setUnlocalizedName("itemBottleRedMartiniWOLabel");

		GameRegistry.registerItem(itemBottlePetrusWOLabel, "itemBottlePetrusWOLabel");
		GameRegistry.registerItem(itemBottlePiscoWOLabel, "itemBottlePiscoWOLabel");
		GameRegistry.registerItem(itemBottlePommeauWOLabel, "itemBottlePommeauWOLabel");
		GameRegistry.registerItem(itemBottlePontarlierWOLabel, "itemBottlePontarlierWOLabel");
		GameRegistry.registerItem(itemBottleRedMartiniWOLabel, "itemBottleRedMartiniWOLabel");

		itemBottleRedPortWOLabel = new ItemBottle().setUnlocalizedName("itemBottleRedPortWOLabel");
		itemBottleRumWOLabel = new ItemBottle().setUnlocalizedName("itemBottleRumWOLabel");
		itemBottleSanMiguelWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSanMiguelWOLabel");
		itemBottleSkollWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSkollWOLabel");
		itemBottleSmirnoffWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSmirnoffWOLabel");

		GameRegistry.registerItem(itemBottleRedPortWOLabel, "itemBottleRedPortWOLabel");
		GameRegistry.registerItem(itemBottleRumWOLabel, "itemBottleRumWOLabel");
		GameRegistry.registerItem(itemBottleSanMiguelWOLabel, "itemBottleSanMiguelWOLabel");
		GameRegistry.registerItem(itemBottleSkollWOLabel, "itemBottleSkollWOLabel");
		GameRegistry.registerItem(itemBottleSmirnoffWOLabel, "itemBottleSmirnoffWOLabel");

		itemBottleSouthernComfortWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSouthernComfortWOLabel");
		itemBottleTabascoWOLabel = new ItemBottle().setUnlocalizedName("itemBottleTabascoWOLabel");
		itemBottleTequilaWOLabel = new ItemBottle().setUnlocalizedName("itemBottleTequilaWOLabel");
		itemBottleVodkaWOLabel = new ItemBottle().setUnlocalizedName("itemBottleVodkaWOLabel");
		itemBottleWhiskeyWOLabel = new ItemBottle().setUnlocalizedName("itemBottleWhiskeyWOLabel");

		GameRegistry.registerItem(itemBottleSouthernComfortWOLabel, "itemBottleSouthernComfortWOLabel");
		GameRegistry.registerItem(itemBottleTabascoWOLabel, "itemBottleTabascoWOLabel");
		GameRegistry.registerItem(itemBottleTequilaWOLabel, "itemBottleTequilaWOLabel");
		GameRegistry.registerItem(itemBottleVodkaWOLabel, "itemBottleVodkaWOLabel");
		GameRegistry.registerItem(itemBottleWhiskeyWOLabel, "itemBottleWhiskeyWOLabel");

		itemBottleWhiteMartiniWOLabel = new ItemBottle().setUnlocalizedName("itemBottleWhiteMartiniWOLabel");
		itemBottleWhitePortWOLabel = new ItemBottle().setUnlocalizedName("itemBottleWhitePortWOLabel");
		itemBottleWorcestershireSauceWOLabel = new ItemBottle().setUnlocalizedName("itemBottleWorcestershireSauceWOLabel");
		itemBottleXIIWOLabel = new ItemBottle().setUnlocalizedName("itemBottleXIIWOLabel");
		itemBottleXeresWOLabel = new ItemBottle().setUnlocalizedName("itemBottleXeresWOLabel");

		GameRegistry.registerItem(itemBottleWhiteMartiniWOLabel, "itemBottleWhiteMartiniWOLabel");
		GameRegistry.registerItem(itemBottleWhitePortWOLabel, "itemBottleWhitePortWOLabel");
		GameRegistry.registerItem(itemBottleWorcestershireSauceWOLabel, "itemBottleWorcestershireSauceWOLabel");
		GameRegistry.registerItem(itemBottleXIIWOLabel, "itemBottleXIIWOLabel");
		GameRegistry.registerItem(itemBottleXeresWOLabel, "itemBottleXeresWOLabel");

			//sweet without label
		itemBenturColaWOLabel = new ItemBottle().setUnlocalizedName("itemBenturColaWOLabel");
		itemBottleFleurOrangerWOLabel = new ItemBottle().setUnlocalizedName("itemBottleFleurOrangerWOLabel");
		itemBottleHoneyWOLabel = new ItemBottle().setUnlocalizedName("itemBottleHoneyWOLabel");
		itemBottleLimonadeWOLabel = new ItemBottle().setUnlocalizedName("itemBottleLimonadeWOLabel");
		itemBottleSchweppesAgrumWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesAgrumWOLabel");

		GameRegistry.registerItem(itemBenturColaWOLabel, "itemBenturColaWOLabel");
		GameRegistry.registerItem(itemBottleFleurOrangerWOLabel, "itemBottleFleurOrangerWOLabel");
		GameRegistry.registerItem(itemBottleHoneyWOLabel, "itemBottleHoneyWOLabel");
		GameRegistry.registerItem(itemBottleLimonadeWOLabel, "itemBottleLimonadeWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesAgrumWOLabel, "itemBottleSchweppesAgrumWOLabel");

		itemBottleSchweppesDarkSideWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesDarkSideWOLabel");
		itemBottleSchweppesGingerAleWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesGingerAleWOLabel");
		itemBottleSchweppesLemonWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesLemonWOLabel");
		itemBottleSchweppesMangoWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesMangoWOLabel");
		itemBottleSchweppesPamplemousseWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPamplemousseWOLabel");

		GameRegistry.registerItem(itemBottleSchweppesDarkSideWOLabel, "itemBottleSchweppesDarkSideWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesGingerAleWOLabel, "itemBottleSchweppesGingerAleWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesLemonWOLabel, "itemBottleSchweppesLemonWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesMangoWOLabel, "itemBottleSchweppesMangoWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesPamplemousseWOLabel, "itemBottleSchweppesPamplemousseWOLabel");

		itemBottleSchweppesPassionWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPassionWOLabel");
		itemBottleSchweppesPechWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPechWOLabel");
		itemBottleSchweppesPommeWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPommeWOLabel");
		itemBottleSchweppesRicqlesWOLabel = new ItemBottle().setUnlocalizedName("itemBottleSchweppesRicqlesWOLabel");
		itemBottleScweppesTonicWOLabel = new ItemBottle().setUnlocalizedName("itemBottleScweppesTonicWOLabel");

		GameRegistry.registerItem(itemBottleSchweppesPassionWOLabel, "itemBottleSchweppesPassionWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesPechWOLabel, "itemBottleSchweppesPechWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesPommeWOLabel, "itemBottleSchweppesPommeWOLabel");
		GameRegistry.registerItem(itemBottleSchweppesRicqlesWOLabel, "itemBottleSchweppesRicqlesWOLabel");
		GameRegistry.registerItem(itemBottleScweppesTonicWOLabel, "itemBottleScweppesTonicWOLabel");

		itemBottleVinegarWOLabel = new ItemBottle().setUnlocalizedName("itemBottleVinegarWOLabel");
		itemPerrierWOLabel = new ItemBottle().setUnlocalizedName("itemPerrierWOLabel");
		itemSchweppesRaisinWOLabel = new ItemBottle().setUnlocalizedName("itemSchweppesRaisinWOLabel");
		itemSyrupMoninWOLabel = new ItemBottle().setUnlocalizedName("itemSyrupMoninWOLabel");

		//labels
		itemBottle1664Label = new ItemLabel().setUnlocalizedName("itemBottle1664Label");
		itemBottleAlsaceRieslingLabel = new ItemLabel().setUnlocalizedName("itemBottleAlsaceRieslingLabel");
		itemBottleAmarettoLabel = new ItemLabel().setUnlocalizedName("itemBottleAmarettoLabel");
		itemBottleAngosturaBitterLabel = new ItemLabel().setUnlocalizedName("itemBottleAngosturaBitterLabel");
		itemBottleBaileysLabel = new ItemLabel().setUnlocalizedName("itemBottleBaileysLabel");

		GameRegistry.registerItem(itemBottle1664Label, "itemBottle1664Label");
		GameRegistry.registerItem(itemBottleAlsaceRieslingLabel, "itemBottleAlsaceRieslingLabel");
		GameRegistry.registerItem(itemBottleAmarettoLabel, "itemBottleAmarettoLabel");
		GameRegistry.registerItem(itemBottleAngosturaBitterLabel, "itemBottleAngosturaBitterLabel");
		GameRegistry.registerItem(itemBottleBaileysLabel, "itemBottleBaileysLabel");

		itemBottleBenedictineLabel = new ItemLabel().setUnlocalizedName("itemBottleBenedictineLabel");
		itemBottleBenturColaLabel = new ItemLabel().setUnlocalizedName("itemBottleBenturColaLabel");
		itemBottleBitterLabel = new ItemLabel().setUnlocalizedName("itemBottleBitterLabel");
		itemBottleBlueCuracaoLabel = new ItemLabel().setUnlocalizedName("itemBottleBlueCuracaoLabel");
		itemBottleBordeauxLaryLabel = new ItemLabel().setUnlocalizedName("itemBottleBordeauxLaryLabel");

		GameRegistry.registerItem(itemBottleBenedictineLabel, "itemBottleBenedictineLabel");
		GameRegistry.registerItem(itemBottleBenturColaLabel, "itemBottleBenturColaLabel");
		GameRegistry.registerItem(itemBottleBitterLabel, "itemBottleBitterLabel");
		GameRegistry.registerItem(itemBottleBlueCuracaoLabel, "itemBottleBlueCuracaoLabel");
		GameRegistry.registerItem(itemBottleBordeauxLaryLabel, "itemBottleBordeauxLaryLabel");

		itemBottleBordeauxTourLabel = new ItemLabel().setUnlocalizedName("itemBottleBordeauxTourLabel");
		itemBottleBourgogneAligoteLabel = new ItemLabel().setUnlocalizedName("itemBottleBourgogneAligoteLabel");
		itemBottleBrandyLabel = new ItemLabel().setUnlocalizedName("itemBottleBrandyLabel");
		itemBottleBrittLabel = new ItemLabel().setUnlocalizedName("itemBottleBrittLabel");
		itemBottleCalvadosLabel = new ItemLabel().setUnlocalizedName("itemBottleCalvadosLabel");

		GameRegistry.registerItem(itemBottleBordeauxTourLabel, "itemBottleBordeauxTourLabel");
		GameRegistry.registerItem(itemBottleBourgogneAligoteLabel, "itemBottleBourgogneAligoteLabel");
		GameRegistry.registerItem(itemBottleBrandyLabel, "itemBottleBrandyLabel");
		GameRegistry.registerItem(itemBottleBrittLabel, "itemBottleBrittLabel");
		GameRegistry.registerItem(itemBottleCalvadosLabel, "itemBottleCalvadosLabel");

		itemBottleCampariLabel = new ItemLabel().setUnlocalizedName("itemBottleCampariLabel");
		itemBottleCapCorseLabel = new ItemLabel().setUnlocalizedName("itemBottleCapCorseLabel");
		itemBottleChampagneMummLabel = new ItemLabel().setUnlocalizedName("itemBottleChampagneMummLabel");
		itemBottleChartreuseJauneLabel = new ItemLabel().setUnlocalizedName("itemBottleChartreuseJauneLabel");
		itemBottleChartreuseVerteLabel = new ItemLabel().setUnlocalizedName("itemBottleChartreuseVerteLabel");

		GameRegistry.registerItem(itemBottleCampariLabel, "itemBottleCampariLabel");
		GameRegistry.registerItem(itemBottleCapCorseLabel, "itemBottleCapCorseLabel");
		GameRegistry.registerItem(itemBottleChampagneMummLabel, "itemBottleChampagneMummLabel");
		GameRegistry.registerItem(itemBottleChartreuseJauneLabel, "itemBottleChartreuseJauneLabel");
		GameRegistry.registerItem(itemBottleChartreuseVerteLabel, "itemBottleChartreuseVerteLabel");

		itemBottleChouchenLabel = new ItemLabel().setUnlocalizedName("itemBottleChouchenLabel");
		itemBottleCiderLabel = new ItemLabel().setUnlocalizedName("itemBottleCiderLabel");
		itemBottleCognacLabel = new ItemLabel().setUnlocalizedName("itemBottleCognacLabel");
		itemBottleCuracaoOrangeLabel = new ItemLabel().setUnlocalizedName("itemBottleCuracaoOrangeLabel");
		itemBottleCuracaoTripleSecLabel = new ItemLabel().setUnlocalizedName("itemBottleCuracaoTripleSecLabel");

		GameRegistry.registerItem(itemBottleChouchenLabel, "itemBottleChouchenLabel");
		GameRegistry.registerItem(itemBottleCiderLabel, "itemBottleCiderLabel");
		GameRegistry.registerItem(itemBottleCognacLabel, "itemBottleCognacLabel");
		GameRegistry.registerItem(itemBottleCuracaoOrangeLabel, "itemBottleCuracaoOrangeLabel");
		GameRegistry.registerItem(itemBottleCuracaoTripleSecLabel, "itemBottleCuracaoTripleSecLabel");

		itemBottleDesperadosLabel = new ItemLabel().setUnlocalizedName("itemBottleDesperadosLabel");
		itemBottleDrambuieLabel = new ItemLabel().setUnlocalizedName("itemBottleDrambuieLabel");
		itemBottleDubonnetRougeLabel = new ItemLabel().setUnlocalizedName("itemBottleDubonnetRougeLabel");
		itemBottleDuvelLabel = new ItemLabel().setUnlocalizedName("itemBottleDuvelLabel");
		itemBottleEnateLabel = new ItemLabel().setUnlocalizedName("itemBottleEnateLabel");

		GameRegistry.registerItem(itemBottleDesperadosLabel, "itemBottleDesperadosLabel");
		GameRegistry.registerItem(itemBottleDrambuieLabel, "itemBottleDrambuieLabel");
		GameRegistry.registerItem(itemBottleDubonnetRougeLabel, "itemBottleDubonnetRougeLabel");
		GameRegistry.registerItem(itemBottleDuvelLabel, "itemBottleDuvelLabel");
		GameRegistry.registerItem(itemBottleEnateLabel, "itemBottleEnateLabel");

		itemBottleFernetBrancaLabel = new ItemLabel().setUnlocalizedName("itemBottleFernetBrancaLabel");
		itemBottleFleurOrangerLabel = new ItemLabel().setUnlocalizedName("itemBottleFleurOrangerLabel");
		itemBottleGet27Label = new ItemLabel().setUnlocalizedName("itemBottleGet27Label");
		itemBottleGinLabel = new ItemLabel().setUnlocalizedName("itemBottleGinLabel");
		itemBottleGrandMarnierLabel = new ItemLabel().setUnlocalizedName("itemBottleGrandMarnierLabel");

		GameRegistry.registerItem(itemBottleFernetBrancaLabel, "itemBottleFernetBrancaLabel");
		GameRegistry.registerItem(itemBottleFleurOrangerLabel, "itemBottleFleurOrangerLabel");
		GameRegistry.registerItem(itemBottleGet27Label, "itemBottleGet27Label");
		GameRegistry.registerItem(itemBottleGinLabel, "itemBottleGinLabel");
		GameRegistry.registerItem(itemBottleGrandMarnierLabel, "itemBottleGrandMarnierLabel");

		itemBottleGrimbergenLabel = new ItemLabel().setUnlocalizedName("itemBottleGrimbergenLabel");
		itemBottleGuinnessLabel = new ItemLabel().setUnlocalizedName("itemBottleGuinnessLabel");
		itemBottleHeinekenLabel = new ItemLabel().setUnlocalizedName("itemBottleHeinekenLabel");
		itemBottleHoneyLabel = new ItemLabel().setUnlocalizedName("itemBottleHoneyLabel");
		itemBottleLambigLabel = new ItemLabel().setUnlocalizedName("itemBottleLambigLabel");

		GameRegistry.registerItem(itemBottleGrimbergenLabel, "itemBottleGrimbergenLabel");
		GameRegistry.registerItem(itemBottleGuinnessLabel, "itemBottleGuinnessLabel");
		GameRegistry.registerItem(itemBottleHeinekenLabel, "itemBottleHeinekenLabel");
		GameRegistry.registerItem(itemBottleHoneyLabel, "itemBottleHoneyLabel");
		GameRegistry.registerItem(itemBottleLambigLabel, "itemBottleLambigLabel");

		itemBottleLeffeLabel = new ItemLabel().setUnlocalizedName("itemBottleLeffeLabel");
		itemBottleLimonadeLabel = new ItemLabel().setUnlocalizedName("itemBottleLimonadeLabel");
		itemBottleLiquorLabel = new ItemLabel().setUnlocalizedName("itemBottleLiquorLabel");
		itemBottlePastis51Label = new ItemLabel().setUnlocalizedName("itemBottlePastis51Label");
		itemBottlePerrierLabel = new ItemLabel().setUnlocalizedName("itemBottlePerrierLabel");

		GameRegistry.registerItem(itemBottleLeffeLabel, "itemBottleLeffeLabel");
		GameRegistry.registerItem(itemBottleLimonadeLabel, "itemBottleLimonadeLabel");
		GameRegistry.registerItem(itemBottleLiquorLabel, "itemBottleLiquorLabel");
		GameRegistry.registerItem(itemBottlePastis51Label, "itemBottlePastis51Label");
		GameRegistry.registerItem(itemBottlePerrierLabel, "itemBottlePerrierLabel");

		itemBottlePetrusLabel = new ItemLabel().setUnlocalizedName("itemBottlePetrusLabel");
		itemBottlePiscoLabel = new ItemLabel().setUnlocalizedName("itemBottlePiscoLabel");
		itemBottlePommeauLabel = new ItemLabel().setUnlocalizedName("itemBottlePommeauLabel");
		itemBottlePontarlierLabel = new ItemLabel().setUnlocalizedName("itemBottlePontarlierLabel");
		itemBottleRedMartiniLabel = new ItemLabel().setUnlocalizedName("itemBottleRedMartiniLabel");

		GameRegistry.registerItem(itemBottlePetrusLabel, "itemBottlePetrusLabel");
		GameRegistry.registerItem(itemBottlePiscoLabel, "itemBottlePiscoLabel");
		GameRegistry.registerItem(itemBottlePommeauLabel, "itemBottlePommeauLabel");
		GameRegistry.registerItem(itemBottlePontarlierLabel, "itemBottlePontarlierLabel");
		GameRegistry.registerItem(itemBottleRedMartiniLabel, "itemBottleRedMartiniLabel");

		itemBottleRedPortLabel = new ItemLabel().setUnlocalizedName("itemBottleRedPortLabel");
		itemBottleRumLabel = new ItemLabel().setUnlocalizedName("itemBottleRumLabel");
		itemBottleSanMiguelLabel = new ItemLabel().setUnlocalizedName("itemBottleSanMiguelLabel");
		itemBottleSchweppesAgrumLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesAgrumLabel");
		itemBottleSchweppesDarkSideLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesDarkSideLabel");

		GameRegistry.registerItem(itemBottleRedPortLabel, "itemBottleRedPortLabel");
		GameRegistry.registerItem(itemBottleRumLabel, "itemBottleRumLabel");
		GameRegistry.registerItem(itemBottleSanMiguelLabel, "itemBottleSanMiguelLabel");
		GameRegistry.registerItem(itemBottleSchweppesAgrumLabel, "itemBottleSchweppesAgrumLabel");
		GameRegistry.registerItem(itemBottleSchweppesDarkSideLabel, "itemBottleSchweppesDarkSideLabel");

		itemBottleSchweppesGingerAleLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesGingerAleLabel");
		itemBottleSchweppesLemonLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesLemonLabel");
		itemBottleSchweppesMangoLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesMangoLabel");
		itemBottleSchweppesPamplemousseLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesPamplemousseLabel");
		itemBottleSchweppesPassionLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesPassionLabel");

		GameRegistry.registerItem(itemBottleSchweppesGingerAleLabel, "itemBottleSchweppesGingerAleLabel");
		GameRegistry.registerItem(itemBottleSchweppesLemonLabel, "itemBottleSchweppesLemonLabel");
		GameRegistry.registerItem(itemBottleSchweppesMangoLabel, "itemBottleSchweppesMangoLabel");
		GameRegistry.registerItem(itemBottleSchweppesPamplemousseLabel, "itemBottleSchweppesPamplemousseLabel");
		GameRegistry.registerItem(itemBottleSchweppesPassionLabel, "itemBottleSchweppesPassionLabel");

		itemBottleSchweppesPechLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesPechLabel");
		itemBottleSchweppesPommeLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesPommeLabel");
		itemBottleSchweppesRaisinLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesRaisinLabel");
		itemBottleSchweppesRicqlesLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesRicqlesLabel");
		itemBottleSchweppesTonicLabel = new ItemLabel().setUnlocalizedName("itemBottleSchweppesTonicLabel");

		GameRegistry.registerItem(itemBottleSchweppesPechLabel, "itemBottleSchweppesPechLabel");
		GameRegistry.registerItem(itemBottleSchweppesPommeLabel, "itemBottleSchweppesPommeLabel");
		GameRegistry.registerItem(itemBottleSchweppesRaisinLabel, "itemBottleSchweppesRaisinLabel");
		GameRegistry.registerItem(itemBottleSchweppesRicqlesLabel, "itemBottleSchweppesRicqlesLabel");
		GameRegistry.registerItem(itemBottleSchweppesTonicLabel, "itemBottleSchweppesTonicLabel");

		itemBottleSiropMoninLabel = new ItemLabel().setUnlocalizedName("itemBottleSiropMoninLabel");
		itemBottleSkollLabel = new ItemLabel().setUnlocalizedName("itemBottleSkollLabel");
		itemBottleSmirnoffLabel = new ItemLabel().setUnlocalizedName("itemBottleSmirnoffLabel");
		itemBottleSouthernComfortLabel = new ItemLabel().setUnlocalizedName("itemBottleSouthernComfortLabel");
		itemBottleTabascoLabel = new ItemLabel().setUnlocalizedName("itemBottleTabascoLabel");

		GameRegistry.registerItem(itemBottleSiropMoninLabel, "itemBottleSiropMoninLabel");
		GameRegistry.registerItem(itemBottleSkollLabel, "itemBottleSkollLabel");
		GameRegistry.registerItem(itemBottleSmirnoffLabel, "itemBottleSmirnoffLabel");
		GameRegistry.registerItem(itemBottleSouthernComfortLabel, "itemBottleSouthernComfortLabel");
		GameRegistry.registerItem(itemBottleTabascoLabel, "itemBottleTabascoLabel");

		itemBottleTequilaLabel = new ItemLabel().setUnlocalizedName("itemBottleTequilaLabel");
		itemBottleVinegarLabel = new ItemLabel().setUnlocalizedName("itemBottleVinegarLabel");
		itemBottleVodkaLabel = new ItemLabel().setUnlocalizedName("itemBottleVodkaLabel");
		itemBottleWhiskeyLabel = new ItemLabel().setUnlocalizedName("itemBottleWhiskeyLabel");
		itemBottleWhiteMartiniLabel = new ItemLabel().setUnlocalizedName("itemBottleWhiteMartiniLabel");

		GameRegistry.registerItem(itemBottleTequilaLabel, "itemBottleTequilaLabel");
		GameRegistry.registerItem(itemBottleVinegarLabel, "itemBottleVinegarLabel");
		GameRegistry.registerItem(itemBottleVodkaLabel, "itemBottleVodkaLabel");
		GameRegistry.registerItem(itemBottleWhiskeyLabel, "itemBottleWhiskeyLabel");
		GameRegistry.registerItem(itemBottleWhiteMartiniLabel, "itemBottleWhiteMartiniLabel");

		itemBottleWhitePortLabel = new ItemLabel().setUnlocalizedName("itemBottleWhitePortLabel");
		itemBottleWorcestershireSauceLabel = new ItemLabel().setUnlocalizedName("itemBottleWorcestershireSauceLabel");
		itemBottleXIILabel = new ItemLabel().setUnlocalizedName("itemBottleXIILabel");
		itemBottleXeresLabel = new ItemLabel().setUnlocalizedName("itemBottleXeresLabel");
		
		itemCoffeeArabicasGround = new ItemCoffee().setUnlocalizedName("itemCoffeeArabicasGround");
		itemCoffeeBlueMountainGround = new ItemCoffee().setUnlocalizedName("itemCoffeeBlueMountainGround");
		itemCoffeeBourbonPointuGround = new ItemCoffee().setUnlocalizedName("itemCoffeeBourbonPointuGround");
		itemCoffeeCatturaGround = new ItemCoffee().setUnlocalizedName("itemCoffeeCatturaGround");
		itemCoffeeHarrarGround = new ItemCoffee().setUnlocalizedName("itemCoffeeHarrarGround");

		GameRegistry.registerItem(itemCoffeeArabicasGround, "itemCoffeeArabicasGround");
		GameRegistry.registerItem(itemCoffeeBlueMountainGround, "itemCoffeeBlueMountainGround");
		GameRegistry.registerItem(itemCoffeeBourbonPointuGround, "itemCoffeeBourbonPointuGround");
		GameRegistry.registerItem(itemCoffeeCatturaGround, "itemCoffeeCatturaGround");
		GameRegistry.registerItem(itemCoffeeHarrarGround, "itemCoffeeHarrarGround");

		itemCoffeeHuehuetenangoGround = new ItemCoffee().setUnlocalizedName("itemCoffeeHuehuetenangoGround");
		itemCoffeeJavaGround = new ItemCoffee().setUnlocalizedName("itemCoffeeJavaGround");
		itemCoffeeKenyaAAGround = new ItemCoffee().setUnlocalizedName("itemCoffeeKenyaAAGround");
		itemCoffeeKonaGround = new ItemCoffee().setUnlocalizedName("itemCoffeeKonaGround");
		itemCoffeeKontirWildForestGround = new ItemCoffee().setUnlocalizedName("itemCoffeeKontirWildForestGround");

		GameRegistry.registerItem(itemCoffeeHuehuetenangoGround, "itemCoffeeHuehuetenangoGround");
		GameRegistry.registerItem(itemCoffeeJavaGround, "itemCoffeeJavaGround");
		GameRegistry.registerItem(itemCoffeeKenyaAAGround, "itemCoffeeKenyaAAGround");
		GameRegistry.registerItem(itemCoffeeKonaGround, "itemCoffeeKonaGround");
		GameRegistry.registerItem(itemCoffeeKontirWildForestGround, "itemCoffeeKontirWildForestGround");

		itemCoffeeKopiLuwakGround = new ItemCoffee().setUnlocalizedName("itemCoffeeKopiLuwakGround");
		itemCoffeeKupeAlamidGround = new ItemCoffee().setUnlocalizedName("itemCoffeeKupeAlamidGround");
		itemCoffeeMokaGround = new ItemCoffee().setUnlocalizedName("itemCoffeeMokaGround");
		itemCoffeeMundoNovoGround = new ItemCoffee().setUnlocalizedName("itemCoffeeMundoNovoGround");
		itemCoffeeMuragogypeGround = new ItemCoffee().setUnlocalizedName("itemCoffeeMuragogypeGround");

		GameRegistry.registerItem(itemCoffeeKopiLuwakGround, "itemCoffeeKopiLuwakGround");
		GameRegistry.registerItem(itemCoffeeKupeAlamidGround, "itemCoffeeKupeAlamidGround");
		GameRegistry.registerItem(itemCoffeeMokaGround, "itemCoffeeMokaGround");
		GameRegistry.registerItem(itemCoffeeMundoNovoGround, "itemCoffeeMundoNovoGround");
		GameRegistry.registerItem(itemCoffeeMuragogypeGround, "itemCoffeeMuragogypeGround");

		itemCoffeePeaberryGround = new ItemCoffee().setUnlocalizedName("itemCoffeePeaberryGround");
		itemCoffeeTarrazuGround = new ItemCoffee().setUnlocalizedName("itemCoffeeTarrazuGround");
		itemCoffeeTorajaKalossiGround = new ItemCoffee().setUnlocalizedName("itemCoffeeTorajaKalossiGround");
		itemCoffeeYirgacheffeGround = new ItemCoffee().setUnlocalizedName("itemCoffeeYirgacheffeGround");
		itemDriedTeaLeaves = new ItemCoffee().setUnlocalizedName("itemDriedTeaLeaves");

		GameRegistry.registerItem(itemCoffeePeaberryGround, "itemCoffeePeaberryGround");
		GameRegistry.registerItem(itemCoffeeTarrazuGround, "itemCoffeeTarrazuGround");
		GameRegistry.registerItem(itemCoffeeTorajaKalossiGround, "itemCoffeeTorajaKalossiGround");
		GameRegistry.registerItem(itemCoffeeYirgacheffeGround, "itemCoffeeYirgacheffeGround");
		GameRegistry.registerItem(itemDriedTeaLeaves, "itemDriedTeaLeaves");
		
		itemCapsuleArpeggio = new ItemCapsule().setUnlocalizedName("itemCapsuleArpeggio");
		itemCapsuleArpeggioEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleArpeggioEmpty");
		itemCapsuleBukeelaKaEthiopia = new ItemCapsule().setUnlocalizedName("itemCapsuleBukeelaKaEthiopia");
		itemCapsuleBukeelaKaEthiopiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleBukeelaKaEthiopiaEmpty");
		itemCapsuleCapriccio = new ItemCapsule().setUnlocalizedName("itemCapsuleCapriccio");

		GameRegistry.registerItem(itemCapsuleArpeggio, "itemCapsuleArpeggio");
		GameRegistry.registerItem(itemCapsuleArpeggioEmpty, "itemCapsuleArpeggioEmpty");
		GameRegistry.registerItem(itemCapsuleBukeelaKaEthiopia, "itemCapsuleBukeelaKaEthiopia");
		GameRegistry.registerItem(itemCapsuleBukeelaKaEthiopiaEmpty, "itemCapsuleBukeelaKaEthiopiaEmpty");
		GameRegistry.registerItem(itemCapsuleCapriccio, "itemCapsuleCapriccio");

		itemCapsuleCapriccioEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleCapriccioEmpty");
		itemCapsuleCosi = new ItemCapsule().setUnlocalizedName("itemCapsuleCosi");
		itemCapsuleCosiEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleCosiEmpty");
		itemCapsuleDecaffeinato = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinato");
		itemCapsuleDecaffeinatoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoEmpty");

		GameRegistry.registerItem(itemCapsuleCapriccioEmpty, "itemCapsuleCapriccioEmpty");
		GameRegistry.registerItem(itemCapsuleCosi, "itemCapsuleCosi");
		GameRegistry.registerItem(itemCapsuleCosiEmpty, "itemCapsuleCosiEmpty");
		GameRegistry.registerItem(itemCapsuleDecaffeinato, "itemCapsuleDecaffeinato");
		GameRegistry.registerItem(itemCapsuleDecaffeinatoEmpty, "itemCapsuleDecaffeinatoEmpty");

		itemCapsuleDecaffeinatoIntenso = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoIntenso");
		itemCapsuleDecaffeinatoIntensoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoIntensoEmpty");
		itemCapsuleDecaffeinatoLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoLungo");
		itemCapsuleDecaffeinatoLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoLungoEmpty");
		itemCapsuleDharkan = new ItemCapsule().setUnlocalizedName("itemCapsuleDharkan");

		GameRegistry.registerItem(itemCapsuleDecaffeinatoIntenso, "itemCapsuleDecaffeinatoIntenso");
		GameRegistry.registerItem(itemCapsuleDecaffeinatoIntensoEmpty, "itemCapsuleDecaffeinatoIntensoEmpty");
		GameRegistry.registerItem(itemCapsuleDecaffeinatoLungo, "itemCapsuleDecaffeinatoLungo");
		GameRegistry.registerItem(itemCapsuleDecaffeinatoLungoEmpty, "itemCapsuleDecaffeinatoLungoEmpty");
		GameRegistry.registerItem(itemCapsuleDharkan, "itemCapsuleDharkan");

		itemCapsuleDharkanEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDharkanEmpty");
		itemCapsuleDulsaoDoBrasil = new ItemCapsule().setUnlocalizedName("itemCapsuleDulsaoDoBrasil");
		itemCapsuleDulsaoDoBrasilEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDulsaoDoBrasilEmpty");
		itemCapsuleFortissioLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleFortissioLungo");
		itemCapsuleFortissioLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleFortissioLungoEmpty");

		GameRegistry.registerItem(itemCapsuleDharkanEmpty, "itemCapsuleDharkanEmpty");
		GameRegistry.registerItem(itemCapsuleDulsaoDoBrasil, "itemCapsuleDulsaoDoBrasil");
		GameRegistry.registerItem(itemCapsuleDulsaoDoBrasilEmpty, "itemCapsuleDulsaoDoBrasilEmpty");
		GameRegistry.registerItem(itemCapsuleFortissioLungo, "itemCapsuleFortissioLungo");
		GameRegistry.registerItem(itemCapsuleFortissioLungoEmpty, "itemCapsuleFortissioLungoEmpty");

		itemCapsuleIndriyaFromIndia = new ItemCapsule().setUnlocalizedName("itemCapsuleIndriyaFromIndia");
		itemCapsuleIndriyaFromIndiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleIndriyaFromIndiaEmpty");
		itemCapsuleKazaar = new ItemCapsule().setUnlocalizedName("itemCapsuleKazaar");
		itemCapsuleKazaarEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleKazaarEmpty");
		itemCapsuleLinizioLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleLinizioLungo");

		GameRegistry.registerItem(itemCapsuleIndriyaFromIndia, "itemCapsuleIndriyaFromIndia");
		GameRegistry.registerItem(itemCapsuleIndriyaFromIndiaEmpty, "itemCapsuleIndriyaFromIndiaEmpty");
		GameRegistry.registerItem(itemCapsuleKazaar, "itemCapsuleKazaar");
		GameRegistry.registerItem(itemCapsuleKazaarEmpty, "itemCapsuleKazaarEmpty");
		GameRegistry.registerItem(itemCapsuleLinizioLungo, "itemCapsuleLinizioLungo");

		itemCapsuleLinizioLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleLinizioLungoEmpty");
		itemCapsuleLivanto = new ItemCapsule().setUnlocalizedName("itemCapsuleLivanto");
		itemCapsuleLivantoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleLivantoEmpty");
		itemCapsuleRistretto = new ItemCapsule().setUnlocalizedName("itemCapsuleRistretto");
		itemCapsuleRistrettoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRistrettoEmpty");

		GameRegistry.registerItem(itemCapsuleLinizioLungoEmpty, "itemCapsuleLinizioLungoEmpty");
		GameRegistry.registerItem(itemCapsuleLivanto, "itemCapsuleLivanto");
		GameRegistry.registerItem(itemCapsuleLivantoEmpty, "itemCapsuleLivantoEmpty");
		GameRegistry.registerItem(itemCapsuleRistretto, "itemCapsuleRistretto");
		GameRegistry.registerItem(itemCapsuleRistrettoEmpty, "itemCapsuleRistrettoEmpty");

		itemCapsuleRoma = new ItemCapsule().setUnlocalizedName("itemCapsuleRoma");
		itemCapsuleRomaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRomaEmpty");
		itemCapsuleRosabayaDeColombia = new ItemCapsule().setUnlocalizedName("itemCapsuleRosabayaDeColombia");
		itemCapsuleRosabayaDeColombiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRosabayaDeColombiaEmpty");
		itemCapsuleVivaltoLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleVivaltoLungo");

		GameRegistry.registerItem(itemCapsuleRoma, "itemCapsuleRoma");
		GameRegistry.registerItem(itemCapsuleRomaEmpty, "itemCapsuleRomaEmpty");
		GameRegistry.registerItem(itemCapsuleRosabayaDeColombia, "itemCapsuleRosabayaDeColombia");
		GameRegistry.registerItem(itemCapsuleRosabayaDeColombiaEmpty, "itemCapsuleRosabayaDeColombiaEmpty");
		GameRegistry.registerItem(itemCapsuleVivaltoLungo, "itemCapsuleVivaltoLungo");

		itemCapsuleVivaltoLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleVivaltoLungoEmpty");
		itemCapsuleVolluto = new ItemCapsule().setUnlocalizedName("itemCapsuleVolluto");
		itemCapsuleVollutoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleVollutoEmpty");

		GameRegistry.registerItem(itemCapsuleVivaltoLungoEmpty, "itemCapsuleVivaltoLungoEmpty");
		GameRegistry.registerItem(itemCapsuleVolluto, "itemCapsuleVolluto");
		GameRegistry.registerItem(itemCapsuleVollutoEmpty, "itemCapsuleVollutoEmpty");
		
		itemTeaBagCaramel = new ItemCoffee().setUnlocalizedName("itemTeaBagCaramel");
		itemTeaBagChai = new ItemCoffee().setUnlocalizedName("itemTeaBagChai");
		itemTeaBagEarlGrey = new ItemCoffee().setUnlocalizedName("itemTeaBagEarlGrey");
		itemTeaBagEmpty = new ItemCoffee().setUnlocalizedName("itemTeaBagEmpty");
		itemTeaBagLemon = new ItemCoffee().setUnlocalizedName("itemTeaBagLemon");

		GameRegistry.registerItem(itemTeaBagCaramel, "itemTeaBagCaramel");
		GameRegistry.registerItem(itemTeaBagChai, "itemTeaBagChai");
		GameRegistry.registerItem(itemTeaBagEarlGrey, "itemTeaBagEarlGrey");
		GameRegistry.registerItem(itemTeaBagEmpty, "itemTeaBagEmpty");
		GameRegistry.registerItem(itemTeaBagLemon, "itemTeaBagLemon");

		itemTeaBagMatchaGreen = new ItemCoffee().setUnlocalizedName("itemTeaBagMatchaGreen");
		itemTeaBagPeach = new ItemCoffee().setUnlocalizedName("itemTeaBagPeach");
		itemTeaBagRaspberry = new ItemCoffee().setUnlocalizedName("itemTeaBagRaspberry");
		itemTeaBagRedFruit = new ItemCoffee().setUnlocalizedName("itemTeaBagRedFruit");

		itemCupArpeggio = new ItemCoffeeCup().setUnlocalizedName("itemCupArpeggio");
		itemCupBukeelaKaEthiopia = new ItemCoffeeCup().setUnlocalizedName("itemCupBukeelaKaEthiopia");
		itemCupCapriccio = new ItemCoffeeCup().setUnlocalizedName("itemCupCapriccio");
		itemCupCoffeeEmpty = new ItemCoffeeCup().setUnlocalizedName("itemCupCoffeeEmpty");
		itemCupCosi = new ItemCoffeeCup().setUnlocalizedName("itemCupCosi");

		GameRegistry.registerItem(itemCupArpeggio, "itemCupArpeggio");
		GameRegistry.registerItem(itemCupBukeelaKaEthiopia, "itemCupBukeelaKaEthiopia");
		GameRegistry.registerItem(itemCupCapriccio, "itemCupCapriccio");
		GameRegistry.registerItem(itemCupCoffeeEmpty, "itemCupCoffeeEmpty");
		GameRegistry.registerItem(itemCupCosi, "itemCupCosi");

		itemCupDecaffeinato = new ItemCoffeeCup().setUnlocalizedName("itemCupDecaffeinato");
		itemCupDecaffeinatoIntenso = new ItemCoffeeCup().setUnlocalizedName("itemCupDecaffeinatoIntenso");
		itemCupDecaffeinatoLungo = new ItemCoffeeCup().setUnlocalizedName("itemCupDecaffeinatoLungo");
		itemCupDharkan = new ItemCoffeeCup().setUnlocalizedName("itemCupDharkan");
		itemCupDulsaoDoBrasil = new ItemCoffeeCup().setUnlocalizedName("itemCupDulsaoDoBrasil");

		GameRegistry.registerItem(itemCupDecaffeinato, "itemCupDecaffeinato");
		GameRegistry.registerItem(itemCupDecaffeinatoIntenso, "itemCupDecaffeinatoIntenso");
		GameRegistry.registerItem(itemCupDecaffeinatoLungo, "itemCupDecaffeinatoLungo");
		GameRegistry.registerItem(itemCupDharkan, "itemCupDharkan");
		GameRegistry.registerItem(itemCupDulsaoDoBrasil, "itemCupDulsaoDoBrasil");

		itemCupFortissioLungo = new ItemCoffeeCup().setUnlocalizedName("itemCupFortissioLungo");
		itemCupIndriyaFromIndia = new ItemCoffeeCup().setUnlocalizedName("itemCupIndriyaFromIndia");
		itemCupKazaar = new ItemCoffeeCup().setUnlocalizedName("itemCupKazaar");
		itemCupLinizioLungo = new ItemCoffeeCup().setUnlocalizedName("itemCupLinizioLungo");
		itemCupLivanto = new ItemCoffeeCup().setUnlocalizedName("itemCupLivanto");

		GameRegistry.registerItem(itemCupFortissioLungo, "itemCupFortissioLungo");
		GameRegistry.registerItem(itemCupIndriyaFromIndia, "itemCupIndriyaFromIndia");
		GameRegistry.registerItem(itemCupKazaar, "itemCupKazaar");
		GameRegistry.registerItem(itemCupLinizioLungo, "itemCupLinizioLungo");
		GameRegistry.registerItem(itemCupLivanto, "itemCupLivanto");

		itemCupRistretto = new ItemCoffeeCup().setUnlocalizedName("itemCupRistretto");
		itemCupRoma = new ItemCoffeeCup().setUnlocalizedName("itemCupRoma");
		itemCupRosabayaDeColombia = new ItemCoffeeCup().setUnlocalizedName("itemCupRosabayaDeColombia");
		itemCupTeaCaramel = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaCaramel");
		itemCupTeaChai = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaChai");

		GameRegistry.registerItem(itemCupRistretto, "itemCupRistretto");
		GameRegistry.registerItem(itemCupRoma, "itemCupRoma");
		GameRegistry.registerItem(itemCupRosabayaDeColombia, "itemCupRosabayaDeColombia");
		GameRegistry.registerItem(itemCupTeaCaramel, "itemCupTeaCaramel");
		GameRegistry.registerItem(itemCupTeaChai, "itemCupTeaChai");

		itemCupTeaEarlGrey = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaEarlGrey");
		itemCupTeaLemon = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaLemon");
		itemCupTeaMatchaGreen = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaMatchaGreen");
		itemCupTeaPeach = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaPeach");
		itemCupTeaRaspberry = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaRaspberry");

		GameRegistry.registerItem(itemCupTeaEarlGrey, "itemCupTeaEarlGrey");
		GameRegistry.registerItem(itemCupTeaLemon, "itemCupTeaLemon");
		GameRegistry.registerItem(itemCupTeaMatchaGreen, "itemCupTeaMatchaGreen");
		GameRegistry.registerItem(itemCupTeaPeach, "itemCupTeaPeach");
		GameRegistry.registerItem(itemCupTeaRaspberry, "itemCupTeaRaspberry");

		itemCupTeaRedFruit = new ItemCoffeeCup().setUnlocalizedName("itemCupTeaRedFruit");
		itemCupVivaltoLungo = new ItemCoffeeCup().setUnlocalizedName("itemCupVivaltoLungo");
		itemCupVolluto = new ItemCoffeeCup().setUnlocalizedName("itemCupVolluto");
		itemTeapot = new ItemCoffeeCup().setUnlocalizedName("itemTeapot");

	}

	public static void registerRender(){
		//items beverage
			//alcohol 
		ModelLoader.setCustomModelResourceLocation(itemBeverage1664, 0, new ModelResourceLocation("bandb_mod:itemBeverage1664", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageAlsaceRiesling, 0, new ModelResourceLocation("bandb_mod:itemBeverageAlsaceRiesling", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageAmaretto, 0, new ModelResourceLocation("bandb_mod:itemBeverageAmaretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageAngosturaBitter, 0, new ModelResourceLocation("bandb_mod:itemBeverageAngosturaBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBaileys, 0, new ModelResourceLocation("bandb_mod:itemBeverageBaileys", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageBenedictine, 0, new ModelResourceLocation("bandb_mod:itemBeverageBenedictine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBitter, 0, new ModelResourceLocation("bandb_mod:itemBeverageBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBlueCuracao, 0, new ModelResourceLocation("bandb_mod:itemBeverageBlueCuracao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBordeauxChateauLary, 0, new ModelResourceLocation("bandb_mod:itemBeverageBordeauxChateauLary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBordeauxChateauTourVerite, 0, new ModelResourceLocation("bandb_mod:itemBeverageBordeauxChateauTourVerite", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageBourgogneAligote, 0, new ModelResourceLocation("bandb_mod:itemBeverageBourgogneAligote", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBritt, 0, new ModelResourceLocation("bandb_mod:itemBeverageBritt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageBrownRum, 0, new ModelResourceLocation("bandb_mod:itemBeverageBrownRum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageCalvados, 0, new ModelResourceLocation("bandb_mod:itemBeverageCalvados", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageCampari, 0, new ModelResourceLocation("bandb_mod:itemBeverageCampari", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageCapCorse, 0, new ModelResourceLocation("bandb_mod:itemBeverageCapCorse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageChampagneMumm, 0, new ModelResourceLocation("bandb_mod:itemBeverageChampagneMumm", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageChartreuseJaune, 0, new ModelResourceLocation("bandb_mod:itemBeverageChartreuseJaune", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageChartreuseVerte, 0, new ModelResourceLocation("bandb_mod:itemBeverageChartreuseVerte", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageChouchen, 0, new ModelResourceLocation("bandb_mod:itemBeverageChouchen", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageCiderKerne, 0, new ModelResourceLocation("bandb_mod:itemBeverageCiderKerne", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageCognac, 0, new ModelResourceLocation("bandb_mod:itemBeverageCognac", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageCuracaoOrange, 0, new ModelResourceLocation("bandb_mod:itemBeverageCuracaoOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageCuracaoTripleSec, 0, new ModelResourceLocation("bandb_mod:itemBeverageCuracaoTripleSec", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageDesperados, 0, new ModelResourceLocation("bandb_mod:itemBeverageDesperados", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageDrambuie, 0, new ModelResourceLocation("bandb_mod:itemBeverageDrambuie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageDubonnetRouge, 0, new ModelResourceLocation("bandb_mod:itemBeverageDubonnetRouge", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageDuvel, 0, new ModelResourceLocation("bandb_mod:itemBeverageDuvel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageEnate, 0, new ModelResourceLocation("bandb_mod:itemBeverageEnate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageFernetBranca, 0, new ModelResourceLocation("bandb_mod:itemBeverageFernetBranca", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageGet27, 0, new ModelResourceLocation("bandb_mod:itemBeverageGet27", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageGin, 0, new ModelResourceLocation("bandb_mod:itemBeverageGin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageGrandMarnier, 0, new ModelResourceLocation("bandb_mod:itemBeverageGrandMarnier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageGrimbergen, 0, new ModelResourceLocation("bandb_mod:itemBeverageGrimbergen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageGuinness, 0, new ModelResourceLocation("bandb_mod:itemBeverageGuinness", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageHeineken, 0, new ModelResourceLocation("bandb_mod:itemBeverageHeineken", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageLambig, 0, new ModelResourceLocation("bandb_mod:itemBeverageLambig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageLeffe, 0, new ModelResourceLocation("bandb_mod:itemBeverageLeffe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeveragePastis51, 0, new ModelResourceLocation("bandb_mod:itemBeveragePastis51", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeveragePetrus, 0, new ModelResourceLocation("bandb_mod:itemBeveragePetrus", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeveragePisco, 0, new ModelResourceLocation("bandb_mod:itemBeveragePisco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeveragePommeau, 0, new ModelResourceLocation("bandb_mod:itemBeveragePommeau", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeveragePontarlier, 0, new ModelResourceLocation("bandb_mod:itemBeveragePontarlier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageRedMartini, 0, new ModelResourceLocation("bandb_mod:itemBeverageRedMartini", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageRedPort, 0, new ModelResourceLocation("bandb_mod:itemBeverageRedPort", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageSanMiguel, 0, new ModelResourceLocation("bandb_mod:itemBeverageSanMiguel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSkoll, 0, new ModelResourceLocation("bandb_mod:itemBeverageSkoll", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSmirnoff, 0, new ModelResourceLocation("bandb_mod:itemBeverageSmirnoff", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSouthernComfort, 0, new ModelResourceLocation("bandb_mod:itemBeverageSouthernComfort", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageTabasco, 0, new ModelResourceLocation("bandb_mod:itemBeverageTabasco", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageTequila, 0, new ModelResourceLocation("bandb_mod:itemBeverageTequila", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageVodka, 0, new ModelResourceLocation("bandb_mod:itemBeverageVodka", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageWhiskey, 0, new ModelResourceLocation("bandb_mod:itemBeverageWhiskey", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageWhiteMartini, 0, new ModelResourceLocation("bandb_mod:itemBeverageWhiteMartini", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageWhitePort, 0, new ModelResourceLocation("bandb_mod:itemBeverageWhitePort", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageWhiteRum, 0, new ModelResourceLocation("bandb_mod:itemBeverageWhiteRum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageWorcestershireSauce, 0, new ModelResourceLocation("bandb_mod:itemBeverageWorcestershireSauce", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageXII, 0, new ModelResourceLocation("bandb_mod:itemBeverageXII", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageXeres, 0, new ModelResourceLocation("bandb_mod:itemBeverageXeres", "inventory"));

			//sweet
		ModelLoader.setCustomModelResourceLocation(itemBeverageBenturCola, 0, new ModelResourceLocation("bandb_mod:itemBeverageBenturCola", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageFleurOranger, 0, new ModelResourceLocation("bandb_mod:itemBeverageFleurOranger", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageLimonade, 0, new ModelResourceLocation("bandb_mod:itemBeverageLimonade", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeveragePerrier, 0, new ModelResourceLocation("bandb_mod:itemBeveragePerrier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesAgrum, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesAgrum", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesDarkSide, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesDarkSide", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesGingerAle, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesGingerAle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesLemon, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesMango, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesPamplemousse, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesPamplemousse", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesPassion, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesPassion", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesPech, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesPech", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesPomme, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesPomme", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesRaisin, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesRaisin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesRicqles, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesRicqles", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBeverageSchweppesTonic, 0, new ModelResourceLocation("bandb_mod:itemBeverageSchweppesTonic", "inventory"));

			//brandy
		ModelLoader.setCustomModelResourceLocation(itemBananaBrandy, 0, new ModelResourceLocation("bandb_mod:itemBananaBrandy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyApple, 0, new ModelResourceLocation("bandb_mod:itemBrandyApple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyApricot, 0, new ModelResourceLocation("bandb_mod:itemBrandyApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyBlackberry, 0, new ModelResourceLocation("bandb_mod:itemBrandyBlackberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyBlackcurrant, 0, new ModelResourceLocation("bandb_mod:itemBrandyBlackcurrant", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBrandyBlueberry, 0, new ModelResourceLocation("bandb_mod:itemBrandyBlueberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyCherry, 0, new ModelResourceLocation("bandb_mod:itemBrandyCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyClementine, 0, new ModelResourceLocation("bandb_mod:itemBrandyClementine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyCoconut, 0, new ModelResourceLocation("bandb_mod:itemBrandyCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyCranberry, 0, new ModelResourceLocation("bandb_mod:itemBrandyCranberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBrandyCurrant, 0, new ModelResourceLocation("bandb_mod:itemBrandyCurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyGoyava, 0, new ModelResourceLocation("bandb_mod:itemBrandyGoyava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemBrandyGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyKiwi, 0, new ModelResourceLocation("bandb_mod:itemBrandyKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyLemon, 0, new ModelResourceLocation("bandb_mod:itemBrandyLemon", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBrandyLime, 0, new ModelResourceLocation("bandb_mod:itemBrandyLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyLychee, 0, new ModelResourceLocation("bandb_mod:itemBrandyLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyMango, 0, new ModelResourceLocation("bandb_mod:itemBrandyMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyMirabelle, 0, new ModelResourceLocation("bandb_mod:itemBrandyMirabelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyOrange, 0, new ModelResourceLocation("bandb_mod:itemBrandyOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBrandyPeach, 0, new ModelResourceLocation("bandb_mod:itemBrandyPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyPear, 0, new ModelResourceLocation("bandb_mod:itemBrandyPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyPineapple, 0, new ModelResourceLocation("bandb_mod:itemBrandyPineapple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyPlum, 0, new ModelResourceLocation("bandb_mod:itemBrandyPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyRaspberry, 0, new ModelResourceLocation("bandb_mod:itemBrandyRaspberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBrandyStrawsberry, 0, new ModelResourceLocation("bandb_mod:itemBrandyStrawsberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBrandyTangerine, 0, new ModelResourceLocation("bandb_mod:itemBrandyTangerine", "inventory"));
		
			//Liquor
		ModelLoader.setCustomModelResourceLocation(itemLiqueurApple, 0, new ModelResourceLocation("bandb_mod:itemLiqueurApple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurApricot, 0, new ModelResourceLocation("bandb_mod:itemLiqueurApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurBanana, 0, new ModelResourceLocation("bandb_mod:itemLiqueurBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurBlackberry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurBlackberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurBlackcurrant, 0, new ModelResourceLocation("bandb_mod:itemLiqueurBlackcurrant", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurBlueberry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurBlueberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurCacao, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCacao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurCherry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurCherryPlum, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCherryPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurClementine, 0, new ModelResourceLocation("bandb_mod:itemLiqueurClementine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurCoco, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCoco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurCoffee, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCoffee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurCranberry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurCranberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurFig, 0, new ModelResourceLocation("bandb_mod:itemLiqueurFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurGrape, 0, new ModelResourceLocation("bandb_mod:itemLiqueurGrape", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemLiqueurGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurGuava, 0, new ModelResourceLocation("bandb_mod:itemLiqueurGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurHoney, 0, new ModelResourceLocation("bandb_mod:itemLiqueurHoney", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurKiwi, 0, new ModelResourceLocation("bandb_mod:itemLiqueurKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurLemon, 0, new ModelResourceLocation("bandb_mod:itemLiqueurLemon", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurLime, 0, new ModelResourceLocation("bandb_mod:itemLiqueurLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurLychee, 0, new ModelResourceLocation("bandb_mod:itemLiqueurLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurMango, 0, new ModelResourceLocation("bandb_mod:itemLiqueurMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurMelon, 0, new ModelResourceLocation("bandb_mod:itemLiqueurMelon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurMint, 0, new ModelResourceLocation("bandb_mod:itemLiqueurMint", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurOrange, 0, new ModelResourceLocation("bandb_mod:itemLiqueurOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurPassionFruit, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPassionFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurPeach, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurPineapple, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPineapple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurPlantain, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPlantain", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurPlum, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurPomegranate, 0, new ModelResourceLocation("bandb_mod:itemLiqueurPomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurQuince, 0, new ModelResourceLocation("bandb_mod:itemLiqueurQuince", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurRaspberry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurRaspberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurStrawberry, 0, new ModelResourceLocation("bandb_mod:itemLiqueurStrawberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemLiqueurTangerine, 0, new ModelResourceLocation("bandb_mod:itemLiqueurTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemLiqueurWhitePeach, 0, new ModelResourceLocation("bandb_mod:itemLiqueurWhitePeach", "inventory"));

			//juice
		ModelLoader.setCustomModelResourceLocation(itemJuiceApricot, 0, new ModelResourceLocation("bandb_mod:itemJuiceApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceBanana, 0, new ModelResourceLocation("bandb_mod:itemJuiceBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceBlackCurrant, 0, new ModelResourceLocation("bandb_mod:itemJuiceBlackCurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceBlackberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceBlackberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceBloodOrange, 0, new ModelResourceLocation("bandb_mod:itemJuiceBloodOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceBlueberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceBlueberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCarrot, 0, new ModelResourceLocation("bandb_mod:itemJuiceCarrot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCherry, 0, new ModelResourceLocation("bandb_mod:itemJuiceCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCherryPlum, 0, new ModelResourceLocation("bandb_mod:itemJuiceCherryPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceClementine, 0, new ModelResourceLocation("bandb_mod:itemJuiceClementine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceCocoMilk, 0, new ModelResourceLocation("bandb_mod:itemJuiceCocoMilk", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCranberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceCranberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCucumber, 0, new ModelResourceLocation("bandb_mod:itemJuiceCucumber", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceCurrant, 0, new ModelResourceLocation("bandb_mod:itemJuiceCurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceFig, 0, new ModelResourceLocation("bandb_mod:itemJuiceFig", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemJuiceGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceGrapefruitPink, 0, new ModelResourceLocation("bandb_mod:itemJuiceGrapefruitPink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceGuava, 0, new ModelResourceLocation("bandb_mod:itemJuiceGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceKiwi, 0, new ModelResourceLocation("bandb_mod:itemJuiceKiwi", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceLemon, 0, new ModelResourceLocation("bandb_mod:itemJuiceLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceLime, 0, new ModelResourceLocation("bandb_mod:itemJuiceLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceLychee, 0, new ModelResourceLocation("bandb_mod:itemJuiceLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceMango, 0, new ModelResourceLocation("bandb_mod:itemJuiceMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceMelon, 0, new ModelResourceLocation("bandb_mod:itemJuiceMelon", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceMirabelle, 0, new ModelResourceLocation("bandb_mod:itemJuiceMirabelle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceMorelloCherry, 0, new ModelResourceLocation("bandb_mod:itemJuiceMorelloCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceMultifruit, 0, new ModelResourceLocation("bandb_mod:itemJuiceMultifruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceOrange, 0, new ModelResourceLocation("bandb_mod:itemJuiceOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePapaya, 0, new ModelResourceLocation("bandb_mod:itemJuicePapaya", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuicePassionFruit, 0, new ModelResourceLocation("bandb_mod:itemJuicePassionFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePassionfruit, 0, new ModelResourceLocation("bandb_mod:itemJuicePassionfruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePeach, 0, new ModelResourceLocation("bandb_mod:itemJuicePeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePear, 0, new ModelResourceLocation("bandb_mod:itemJuicePear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePineappleCayenneLisse, 0, new ModelResourceLocation("bandb_mod:itemJuicePineappleCayenneLisse", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuicePineappleVictoria, 0, new ModelResourceLocation("bandb_mod:itemJuicePineappleVictoria", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePlantainBanana, 0, new ModelResourceLocation("bandb_mod:itemJuicePlantainBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePlum, 0, new ModelResourceLocation("bandb_mod:itemJuicePlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePomegranate, 0, new ModelResourceLocation("bandb_mod:itemJuicePomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuicePotato, 0, new ModelResourceLocation("bandb_mod:itemJuicePotato", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuicePricklyPear, 0, new ModelResourceLocation("bandb_mod:itemJuicePricklyPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceQuince, 0, new ModelResourceLocation("bandb_mod:itemJuiceQuince", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceRaspberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceRaspberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceRhubarb, 0, new ModelResourceLocation("bandb_mod:itemJuiceRhubarb", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceStrawberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceStrawberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceTangerine, 0, new ModelResourceLocation("bandb_mod:itemJuiceTangerine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceTomato, 0, new ModelResourceLocation("bandb_mod:itemJuiceTomato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceWatermelon, 0, new ModelResourceLocation("bandb_mod:itemJuiceWatermelon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceWhitePeach, 0, new ModelResourceLocation("bandb_mod:itemJuiceWhitePeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceWildStrawberry, 0, new ModelResourceLocation("bandb_mod:itemJuiceWildStrawberry", "inventory"));

			//apple juice
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleAntares, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleAntares", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleAriane, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleAriane", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleBelchardChancelier, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleBelchardChancelier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleBelleDeBoskoop, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleBelleDeBoskoop", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleBraeburn, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleBraeburn", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleDuLimousin, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleDuLimousin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleElstar, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleElstar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleFuji, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleFuji", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleGala, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleGala", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleGolden, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleGolden", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleGrannySmith, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleGrannySmith", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleHoneycrunch, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleHoneycrunch", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleJazz, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleJazz", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleJonagoldJonagored, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleJonagoldJonagored", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleLesRouges, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleLesRouges", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemJuiceApplePinkLady, 0, new ModelResourceLocation("bandb_mod:itemJuiceApplePinkLady", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleReineDesReinettes, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleReineDesReinettes", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleReinetteGriseDuCanada, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleReinetteGriseDuCanada", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemJuiceAppleTentation, 0, new ModelResourceLocation("bandb_mod:itemJuiceAppleTentation", "inventory"));

			//grape juice
		ModelLoader.setCustomModelResourceLocation(itemGrapeAbouriouJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAbouriouJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAleaticuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAleaticuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAligoteJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAligoteJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAltesseJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAltesseJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAramonJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAramonJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeArboisJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeArboisJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeArrufiacJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeArrufiacJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeAubinVertJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeAubinVertJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBarbarossaJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBarbarossaJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBergeronJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBergeronJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeBianconeJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBianconeJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBiancuGentileJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBiancuGentileJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBourboulencJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBourboulencJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeBraquetJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeBraquetJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCabernetFrancJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCabernetFrancJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeCabernetSauvignonJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCabernetSauvignonJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCamareseJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCamareseJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarcaghjoluBiancuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarcaghjoluBiancuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarcaghjoluNeruJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarcaghjoluNeruJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCarignanJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCarignanJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeCesarJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCesarJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeChardonnayJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeChardonnayJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCheninJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCheninJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCinsaultJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCinsaultJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeClairetteJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeClairetteJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeColombardJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeColombardJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCotJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCotJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCounoiseJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCounoiseJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCourbuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCourbuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeCudivertaJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeCudivertaJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeDurasJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeDurasJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeFerServadouJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeFerServadouJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeFolleBlancheJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeFolleBlancheJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGamayJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGamayJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGewurztraminerJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGewurztraminerJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeGrenacheBlancJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrenacheBlancJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrenacheJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrenacheJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrolleauJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrolleauJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeGrosMensengJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeGrosMensengJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeJacquereJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeJacquereJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeLenDeLElJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeLenDeLElJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeListanJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeListanJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMaccabeuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMaccabeuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMalbecJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMalbecJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMalvoisieJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMalvoisieJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMarsanneJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMarsanneJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMarselanJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMarselanJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMauzacJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMauzacJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMelonDeBourgogneJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMelonDeBourgogneJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMelonJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMelonJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMerlotJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMerlotJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMoletteJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMoletteJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMollardJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMollardJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMondeuseBlancheJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMondeuseBlancheJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMondeuseJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMondeuseJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeMourvedreJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMourvedreJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscadelleJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscadelleJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscardinJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscardinJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscatBlancAPetitsGrainsJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscatBlancAPetitsGrainsJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeMuscatDAlexandrieJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeMuscatDAlexandrieJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeNegretteJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeNegretteJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeNielluccioJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeNielluccioJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePagaDebitiJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePagaDebitiJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePetitCourbuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitCourbuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePetitMensengJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitMensengJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapePetitVerdotJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePetitVerdotJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePineauDAunisJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePineauDAunisJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotBlancJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotBlancJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotMeunierJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotMeunierJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePinotNoirJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePinotNoirJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapePiquepoulJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePiquepoulJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapePoulsardJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapePoulsardJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRieslingJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeRieslingJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRomorantinJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeRomorantinJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeRossulaBiancaJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeRossulaBiancaJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeSacyJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSacyJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSauvignonJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSauvignonJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSavagninJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSavagninJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSemillonJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSemillonJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeSylvanerJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSylvanerJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeSyrahJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeSyrahJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTannatJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeTannatJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTeoulierJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeTeoulierJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTerretNoirJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeTerretNoirJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeTibourenJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeTibourenJuice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemGrapeTressalierJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeTressalierJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeUgniBlancJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeUgniBlancJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeVaccareseJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeVaccareseJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeVermentinuJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeVermentinuJuice", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemGrapeViognierJuice, 0, new ModelResourceLocation("bandb_mod:itemGrapeViognierJuice", "inventory"));

			//syrup Monin
		ModelLoader.setCustomModelResourceLocation(itemLogoMonin, 0, new ModelResourceLocation("bandb_mod:itemLogoMonin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupAlmond, 0, new ModelResourceLocation("bandb_mod:itemSyrupAlmond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupAmaretto, 0, new ModelResourceLocation("bandb_mod:itemSyrupAmaretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupAnise, 0, new ModelResourceLocation("bandb_mod:itemSyrupAnise", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupApple, 0, new ModelResourceLocation("bandb_mod:itemSyrupApple", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupApplePie, 0, new ModelResourceLocation("bandb_mod:itemSyrupApplePie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupApricot, 0, new ModelResourceLocation("bandb_mod:itemSyrupApricot", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBasil, 0, new ModelResourceLocation("bandb_mod:itemSyrupBasil", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBitter, 0, new ModelResourceLocation("bandb_mod:itemSyrupBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBlackForest, 0, new ModelResourceLocation("bandb_mod:itemSyrupBlackForest", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupBlackberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupBlackberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBlackcurrant, 0, new ModelResourceLocation("bandb_mod:itemSyrupBlackcurrant", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBloodOrange, 0, new ModelResourceLocation("bandb_mod:itemSyrupBloodOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBlueCuracao, 0, new ModelResourceLocation("bandb_mod:itemSyrupBlueCuracao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupBlueberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupBlueberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupBubbleGum, 0, new ModelResourceLocation("bandb_mod:itemSyrupBubbleGum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCaipirinha, 0, new ModelResourceLocation("bandb_mod:itemSyrupCaipirinha", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCandyStrawberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupCandyStrawberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCaramel, 0, new ModelResourceLocation("bandb_mod:itemSyrupCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCardamom, 0, new ModelResourceLocation("bandb_mod:itemSyrupCardamom", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupChaiTea, 0, new ModelResourceLocation("bandb_mod:itemSyrupChaiTea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCherry, 0, new ModelResourceLocation("bandb_mod:itemSyrupCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCherryPlum, 0, new ModelResourceLocation("bandb_mod:itemSyrupCherryPlum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupChestnut, 0, new ModelResourceLocation("bandb_mod:itemSyrupChestnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupChocolate, 0, new ModelResourceLocation("bandb_mod:itemSyrupChocolate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupChocolateCookie, 0, new ModelResourceLocation("bandb_mod:itemSyrupChocolateCookie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupChocolateMint, 0, new ModelResourceLocation("bandb_mod:itemSyrupChocolateMint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCinnamon, 0, new ModelResourceLocation("bandb_mod:itemSyrupCinnamon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCoconut, 0, new ModelResourceLocation("bandb_mod:itemSyrupCoconut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCoffee, 0, new ModelResourceLocation("bandb_mod:itemSyrupCoffee", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupCottonCandy, 0, new ModelResourceLocation("bandb_mod:itemSyrupCottonCandy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCranberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupCranberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCremeBrulee, 0, new ModelResourceLocation("bandb_mod:itemSyrupCremeBrulee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupCucumber, 0, new ModelResourceLocation("bandb_mod:itemSyrupCucumber", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupElderFlower, 0, new ModelResourceLocation("bandb_mod:itemSyrupElderFlower", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupFig, 0, new ModelResourceLocation("bandb_mod:itemSyrupFig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupFrostedMint, 0, new ModelResourceLocation("bandb_mod:itemSyrupFrostedMint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGin, 0, new ModelResourceLocation("bandb_mod:itemSyrupGin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGinger, 0, new ModelResourceLocation("bandb_mod:itemSyrupGinger", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGingerBread, 0, new ModelResourceLocation("bandb_mod:itemSyrupGingerBread", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupGlascoLemon, 0, new ModelResourceLocation("bandb_mod:itemSyrupGlascoLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemSyrupGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGreenApple, 0, new ModelResourceLocation("bandb_mod:itemSyrupGreenApple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGreenBanana, 0, new ModelResourceLocation("bandb_mod:itemSyrupGreenBanana", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGreenMint, 0, new ModelResourceLocation("bandb_mod:itemSyrupGreenMint", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupGrenadine, 0, new ModelResourceLocation("bandb_mod:itemSyrupGrenadine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGuava, 0, new ModelResourceLocation("bandb_mod:itemSyrupGuava", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupGum, 0, new ModelResourceLocation("bandb_mod:itemSyrupGum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupHazelnut, 0, new ModelResourceLocation("bandb_mod:itemSyrupHazelnut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupHibiscus, 0, new ModelResourceLocation("bandb_mod:itemSyrupHibiscus", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupHoney, 0, new ModelResourceLocation("bandb_mod:itemSyrupHoney", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupIrish, 0, new ModelResourceLocation("bandb_mod:itemSyrupIrish", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupJasmine, 0, new ModelResourceLocation("bandb_mod:itemSyrupJasmine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupKiwi, 0, new ModelResourceLocation("bandb_mod:itemSyrupKiwi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupLavender, 0, new ModelResourceLocation("bandb_mod:itemSyrupLavender", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupLemonGrass, 0, new ModelResourceLocation("bandb_mod:itemSyrupLemonGrass", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupLemonPie, 0, new ModelResourceLocation("bandb_mod:itemSyrupLemonPie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupLemonTea, 0, new ModelResourceLocation("bandb_mod:itemSyrupLemonTea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupLime, 0, new ModelResourceLocation("bandb_mod:itemSyrupLime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupLimeJuiceCordialMixer, 0, new ModelResourceLocation("bandb_mod:itemSyrupLimeJuiceCordialMixer", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupLychee, 0, new ModelResourceLocation("bandb_mod:itemSyrupLychee", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMacadamiaNut, 0, new ModelResourceLocation("bandb_mod:itemSyrupMacadamiaNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMacaron, 0, new ModelResourceLocation("bandb_mod:itemSyrupMacaron", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMango, 0, new ModelResourceLocation("bandb_mod:itemSyrupMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMapleSpice, 0, new ModelResourceLocation("bandb_mod:itemSyrupMapleSpice", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupMatchaGreenTea, 0, new ModelResourceLocation("bandb_mod:itemSyrupMatchaGreenTea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMelon, 0, new ModelResourceLocation("bandb_mod:itemSyrupMelon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMojitoMint, 0, new ModelResourceLocation("bandb_mod:itemSyrupMojitoMint", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMorelloCherry, 0, new ModelResourceLocation("bandb_mod:itemSyrupMorelloCherry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupOrange, 0, new ModelResourceLocation("bandb_mod:itemSyrupOrange", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupPassionFruit, 0, new ModelResourceLocation("bandb_mod:itemSyrupPassionFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPeach, 0, new ModelResourceLocation("bandb_mod:itemSyrupPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPeachTea, 0, new ModelResourceLocation("bandb_mod:itemSyrupPeachTea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPear, 0, new ModelResourceLocation("bandb_mod:itemSyrupPear", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPinacolada, 0, new ModelResourceLocation("bandb_mod:itemSyrupPinacolada", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupPineapple, 0, new ModelResourceLocation("bandb_mod:itemSyrupPineapple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPinkGrapefruit, 0, new ModelResourceLocation("bandb_mod:itemSyrupPinkGrapefruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPistachio, 0, new ModelResourceLocation("bandb_mod:itemSyrupPistachio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPomegranate, 0, new ModelResourceLocation("bandb_mod:itemSyrupPomegranate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupPraline, 0, new ModelResourceLocation("bandb_mod:itemSyrupPraline", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupPureCaneSugar, 0, new ModelResourceLocation("bandb_mod:itemSyrupPureCaneSugar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRantchoLemon, 0, new ModelResourceLocation("bandb_mod:itemSyrupRantchoLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRaspberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupRaspberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRaspberryTea, 0, new ModelResourceLocation("bandb_mod:itemSyrupRaspberryTea", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRoastedHazelnut, 0, new ModelResourceLocation("bandb_mod:itemSyrupRoastedHazelnut", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupRose, 0, new ModelResourceLocation("bandb_mod:itemSyrupRose", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRosmary, 0, new ModelResourceLocation("bandb_mod:itemSyrupRosmary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupRumFlavour, 0, new ModelResourceLocation("bandb_mod:itemSyrupRumFlavour", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupSaltedCaramel, 0, new ModelResourceLocation("bandb_mod:itemSyrupSaltedCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupSangria, 0, new ModelResourceLocation("bandb_mod:itemSyrupSangria", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupSpeculoos, 0, new ModelResourceLocation("bandb_mod:itemSyrupSpeculoos", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupSpicy, 0, new ModelResourceLocation("bandb_mod:itemSyrupSpicy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupSpicyMango, 0, new ModelResourceLocation("bandb_mod:itemSyrupSpicyMango", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupStrawberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupStrawberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupTangerine, 0, new ModelResourceLocation("bandb_mod:itemSyrupTangerine", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupTarragon, 0, new ModelResourceLocation("bandb_mod:itemSyrupTarragon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupTequilaFlavour, 0, new ModelResourceLocation("bandb_mod:itemSyrupTequilaFlavour", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupTiramisu, 0, new ModelResourceLocation("bandb_mod:itemSyrupTiramisu", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupToffeeNut, 0, new ModelResourceLocation("bandb_mod:itemSyrupToffeeNut", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupTonkaBean, 0, new ModelResourceLocation("bandb_mod:itemSyrupTonkaBean", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupTripleSecCuracao, 0, new ModelResourceLocation("bandb_mod:itemSyrupTripleSecCuracao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupVanilla, 0, new ModelResourceLocation("bandb_mod:itemSyrupVanilla", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupViolet, 0, new ModelResourceLocation("bandb_mod:itemSyrupViolet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupWatermelon, 0, new ModelResourceLocation("bandb_mod:itemSyrupWatermelon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupWhiteChocolate, 0, new ModelResourceLocation("bandb_mod:itemSyrupWhiteChocolate", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemSyrupWhitePeach, 0, new ModelResourceLocation("bandb_mod:itemSyrupWhitePeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupWildStrawberry, 0, new ModelResourceLocation("bandb_mod:itemSyrupWildStrawberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupYellowBanana, 0, new ModelResourceLocation("bandb_mod:itemSyrupYellowBanana", "inventory"));

		//items bottle
			//alcohol
		ModelLoader.setCustomModelResourceLocation(itemBottle1664, 0, new ModelResourceLocation("bandb_mod:itemBottle1664", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAlsaceRiesling, 0, new ModelResourceLocation("bandb_mod:itemBottleAlsaceRiesling", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAmaretto, 0, new ModelResourceLocation("bandb_mod:itemBottleAmaretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAngosturaBitter, 0, new ModelResourceLocation("bandb_mod:itemBottleAngosturaBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBaileys, 0, new ModelResourceLocation("bandb_mod:itemBottleBaileys", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBenedictine, 0, new ModelResourceLocation("bandb_mod:itemBottleBenedictine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBitter, 0, new ModelResourceLocation("bandb_mod:itemBottleBitter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBlueCaracao, 0, new ModelResourceLocation("bandb_mod:itemBottleBlueCaracao", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxChateauLary, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxChateauLary", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxChateauTourVerite, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxChateauTourVerite", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBourgogneAligote, 0, new ModelResourceLocation("bandb_mod:itemBottleBourgogneAligote", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBrandy, 0, new ModelResourceLocation("bandb_mod:itemBottleBrandy", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBritt, 0, new ModelResourceLocation("bandb_mod:itemBottleBritt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCalvados, 0, new ModelResourceLocation("bandb_mod:itemBottleCalvados", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCampari, 0, new ModelResourceLocation("bandb_mod:itemBottleCampari", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleCapCorse, 0, new ModelResourceLocation("bandb_mod:itemBottleCapCorse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChampagneMumm, 0, new ModelResourceLocation("bandb_mod:itemBottleChampagneMumm", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseJaune, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseJaune", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseVerte, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseVerte", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChouchen, 0, new ModelResourceLocation("bandb_mod:itemBottleChouchen", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleCiderKerne, 0, new ModelResourceLocation("bandb_mod:itemBottleCiderKerne", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCognac, 0, new ModelResourceLocation("bandb_mod:itemBottleCognac", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoOrange, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoOrange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoTripleSec, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoTripleSec", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDesperados, 0, new ModelResourceLocation("bandb_mod:itemBottleDesperados", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleDrambuie, 0, new ModelResourceLocation("bandb_mod:itemBottleDrambuie", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDubonnetRouge, 0, new ModelResourceLocation("bandb_mod:itemBottleDubonnetRouge", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDuvel, 0, new ModelResourceLocation("bandb_mod:itemBottleDuvel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleEnate, 0, new ModelResourceLocation("bandb_mod:itemBottleEnate", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleFernetBranca, 0, new ModelResourceLocation("bandb_mod:itemBottleFernetBranca", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleGet27, 0, new ModelResourceLocation("bandb_mod:itemBottleGet27", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGin, 0, new ModelResourceLocation("bandb_mod:itemBottleGin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGrandMarnier, 0, new ModelResourceLocation("bandb_mod:itemBottleGrandMarnier", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGrimbergen, 0, new ModelResourceLocation("bandb_mod:itemBottleGrimbergen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGuinness, 0, new ModelResourceLocation("bandb_mod:itemBottleGuinness", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleHeineken, 0, new ModelResourceLocation("bandb_mod:itemBottleHeineken", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleHoney, 0, new ModelResourceLocation("bandb_mod:itemBottleHoney", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLambig, 0, new ModelResourceLocation("bandb_mod:itemBottleLambig", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLeffe, 0, new ModelResourceLocation("bandb_mod:itemBottleLeffe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLiqueur, 0, new ModelResourceLocation("bandb_mod:itemBottleLiqueur", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottlePastis51, 0, new ModelResourceLocation("bandb_mod:itemBottlePastis51", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePetrus, 0, new ModelResourceLocation("bandb_mod:itemBottlePetrus", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePisco, 0, new ModelResourceLocation("bandb_mod:itemBottlePisco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePommeau, 0, new ModelResourceLocation("bandb_mod:itemBottlePommeau", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePontarlier, 0, new ModelResourceLocation("bandb_mod:itemBottlePontarlier", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleRedMartini, 0, new ModelResourceLocation("bandb_mod:itemBottleRedMartini", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRedPort, 0, new ModelResourceLocation("bandb_mod:itemBottleRedPort", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRum, 0, new ModelResourceLocation("bandb_mod:itemBottleRum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSanMiguel, 0, new ModelResourceLocation("bandb_mod:itemBottleSanMiguel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSkoll, 0, new ModelResourceLocation("bandb_mod:itemBottleSkoll", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSmirnoff, 0, new ModelResourceLocation("bandb_mod:itemBottleSmirnoff", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSouthernComfort, 0, new ModelResourceLocation("bandb_mod:itemBottleSouthernComfort", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleTabasco, 0, new ModelResourceLocation("bandb_mod:itemBottleTabasco", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleTequila, 0, new ModelResourceLocation("bandb_mod:itemBottleTequila", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleVinegar, 0, new ModelResourceLocation("bandb_mod:itemBottleVinegar", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleVodka, 0, new ModelResourceLocation("bandb_mod:itemBottleVodka", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhiskey, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiskey", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhiteMartini, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiteMartini", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhitePort, 0, new ModelResourceLocation("bandb_mod:itemBottleWhitePort", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWorcestershireSauce, 0, new ModelResourceLocation("bandb_mod:itemBottleWorcestershireSauce", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleXII, 0, new ModelResourceLocation("bandb_mod:itemBottleXII", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleXeres, 0, new ModelResourceLocation("bandb_mod:itemBottleXeres", "inventory"));
			//sweet
		ModelLoader.setCustomModelResourceLocation(itemBottleBenturCola, 0, new ModelResourceLocation("bandb_mod:itemBottleBenturCola", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleFleurOranger, 0, new ModelResourceLocation("bandb_mod:itemBottleFleurOranger", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleKetchup, 0, new ModelResourceLocation("bandb_mod:itemBottleKetchup", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLimonade, 0, new ModelResourceLocation("bandb_mod:itemBottleLimonade", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePerrier, 0, new ModelResourceLocation("bandb_mod:itemBottlePerrier", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesAgrum, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesAgrum", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesDarkSide, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesDarkSide", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesGingerAle, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesGingerAle", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesLemon, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesMango, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesMango", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPamplemousse, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPamplemousse", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPassion, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPassion", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPech, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPech", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPomme, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPomme", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesRaisin, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesRaisin", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesRicqles, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesRicqles", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesTonic, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesTonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPint, 0, new ModelResourceLocation("bandb_mod:itemPint", "inventory"));

			//alcohol without label
		ModelLoader.setCustomModelResourceLocation(itemBottle1664WOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottle1664WOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAlsaceRieslingWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAlsaceRieslingWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAmarettoWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAmarettoWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAngosturaBitterWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAngosturaBitterWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBaileysWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBaileysWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBenedictineWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBenedictineWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBitterWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBitterWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBlueCuracaoWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBlueCuracaoWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxLaryWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxLaryWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxTourWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxTourWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBourgogneAligoteWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBourgogneAligoteWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBrandyWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBrandyWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBrittWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBrittWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCalvadosWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCalvadosWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCampariWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCampariWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleCapCorseWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCapCorseWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChampagneMummWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChampagneMummWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseJauneWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseJauneWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseVerteWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseVerteWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChouchenWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChouchenWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleCiderKerneWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCiderKerneWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCognacWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCognacWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoOrangeWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoOrangeWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoTripleSecWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoTripleSecWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDesperadosWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDesperadosWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleDrambuieWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDrambuieWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDubonnetRougeWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDubonnetRougeWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDuvelWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDuvelWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleEnateWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleEnateWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleFernetBrancaWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleFernetBrancaWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleGet27WOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGet27WOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGinWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGinWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGrandMarnierWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGrandMarnierWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGrimberWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGrimberWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGuinnessWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGuinnessWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleHeinekenWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleHeinekenWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLambigWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLambigWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLeffeWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLeffeWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLiqueurWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLiqueurWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePastis51WOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePastis51WOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottlePetrusWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePetrusWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePiscoWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePiscoWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePommeauWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePommeauWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePontarlierWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePontarlierWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRedMartiniWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRedMartiniWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleRedPortWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRedPortWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRumWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRumWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSanMiguelWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSanMiguelWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSkollWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSkollWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSmirnoffWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSmirnoffWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSouthernComfortWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSouthernComfortWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleTabascoWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleTabascoWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleTequilaWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleTequilaWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleVodkaWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleVodkaWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhiskeyWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiskeyWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleWhiteMartiniWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiteMartiniWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhitePortWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhitePortWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWorcestershireSauceWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWorcestershireSauceWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleXIIWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleXIIWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleXeresWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleXeresWOLabel", "inventory"));

			//sweet without label
		ModelLoader.setCustomModelResourceLocation(itemBenturColaWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBenturColaWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleFleurOrangerWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleFleurOrangerWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleHoneyWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleHoneyWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLimonadeWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLimonadeWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesAgrumWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesAgrumWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesDarkSideWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesDarkSideWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesGingerAleWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesGingerAleWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesLemonWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesLemonWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesMangoWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesMangoWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPamplemousseWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPamplemousseWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPassionWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPassionWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPechWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPechWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPommeWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPommeWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesRicqlesWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesRicqlesWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleScweppesTonicWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleScweppesTonicWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleVinegarWOLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleVinegarWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemPerrierWOLabel, 0, new ModelResourceLocation("bandb_mod:itemPerrierWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSchweppesRaisinWOLabel, 0, new ModelResourceLocation("bandb_mod:itemSchweppesRaisinWOLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemSyrupMoninWOLabel, 0, new ModelResourceLocation("bandb_mod:itemSyrupMoninWOLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottle1664Label, 0, new ModelResourceLocation("bandb_mod:itemBottle1664Label", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAlsaceRieslingLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAlsaceRieslingLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAmarettoLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAmarettoLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleAngosturaBitterLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleAngosturaBitterLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBaileysLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBaileysLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBenedictineLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBenedictineLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBenturColaLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBenturColaLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBitterLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBitterLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBlueCuracaoLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBlueCuracaoLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxLaryLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxLaryLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleBordeauxTourLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBordeauxTourLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBourgogneAligoteLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBourgogneAligoteLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBrandyLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBrandyLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleBrittLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleBrittLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCalvadosLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCalvadosLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleCampariLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCampariLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCapCorseLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCapCorseLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChampagneMummLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChampagneMummLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseJauneLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseJauneLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleChartreuseVerteLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChartreuseVerteLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleChouchenLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleChouchenLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCiderLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCiderLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCognacLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCognacLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoOrangeLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoOrangeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleCuracaoTripleSecLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleCuracaoTripleSecLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleDesperadosLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDesperadosLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDrambuieLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDrambuieLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDubonnetRougeLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDubonnetRougeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleDuvelLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleDuvelLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleEnateLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleEnateLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleFernetBrancaLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleFernetBrancaLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleFleurOrangerLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleFleurOrangerLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGet27Label, 0, new ModelResourceLocation("bandb_mod:itemBottleGet27Label", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGinLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGinLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGrandMarnierLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGrandMarnierLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleGrimbergenLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGrimbergenLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleGuinnessLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleGuinnessLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleHeinekenLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleHeinekenLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleHoneyLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleHoneyLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLambigLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLambigLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleLeffeLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLeffeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLimonadeLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLimonadeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleLiquorLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleLiquorLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePastis51Label, 0, new ModelResourceLocation("bandb_mod:itemBottlePastis51Label", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePerrierLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePerrierLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottlePetrusLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePetrusLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePiscoLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePiscoLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePommeauLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePommeauLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottlePontarlierLabel, 0, new ModelResourceLocation("bandb_mod:itemBottlePontarlierLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRedMartiniLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRedMartiniLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleRedPortLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRedPortLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleRumLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleRumLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSanMiguelLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSanMiguelLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesAgrumLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesAgrumLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesDarkSideLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesDarkSideLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesGingerAleLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesGingerAleLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesLemonLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesLemonLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesMangoLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesMangoLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPamplemousseLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPamplemousseLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPassionLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPassionLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPechLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPechLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesPommeLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesPommeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesRaisinLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesRaisinLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesRicqlesLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesRicqlesLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSchweppesTonicLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSchweppesTonicLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleSiropMoninLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSiropMoninOrangeLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSkollLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSkollLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSmirnoffLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSmirnoffLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleSouthernComfortLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleSouthernComfortLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleTabascoLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleTabascoLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleTequilaLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleTequilaLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleVinegarLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleVinegarLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleVodkaLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleVodkaLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhiskeyLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiskeyLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWhiteMartiniLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhiteMartiniLabel", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemBottleWhitePortLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWhitePortLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleWorcestershireSauceLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleWorcestershireSauceLabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleXIILabel, 0, new ModelResourceLocation("bandb_mod:itemBottleXIILabel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemBottleXeresLabel, 0, new ModelResourceLocation("bandb_mod:itemBottleXeresLabel", "inventory"));
		
		//coffee and tea
		ModelLoader.setCustomModelResourceLocation(itemCoffeeArabicasGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeArabicasGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeBlueMountainGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeBlueMountainGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeBourbonPointuGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeBourbonPointuGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeCatturaGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeCatturaGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeHarrarGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeHarrarGround", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeeHuehuetenangoGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeHuehuetenangoGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeJavaGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeJavaGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKenyaAAGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKenyaAAGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKonaGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKonaGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKontirWildForestGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKontirWildForestGround", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeeKopiLuwakGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKopiLuwakGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeKupeAlamidGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeKupeAlamidGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMokaGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMokaGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMundoNovoGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMundoNovoGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeMuragogypeGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeMuragogypeGround", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCoffeePeaberryGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeePeaberryGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeTarrazuGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeTarrazuGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeTorajaKalossiGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeTorajaKalossiGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCoffeeYirgacheffeGround, 0, new ModelResourceLocation("bandb_mod:itemCoffeeYirgacheffeGround", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemDriedTeaLeaves, 0, new ModelResourceLocation("bandb_mod:itemDriedTeaLeaves", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleArpeggio, 0, new ModelResourceLocation("bandb_mod:itemCapsuleArpeggio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleArpeggioEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleArpeggioEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleBukeelaKaEthiopia, 0, new ModelResourceLocation("bandb_mod:itemCapsuleBukeelaKaEthiopia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleBukeelaKaEthiopiaEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleBukeelaKaEthiopiaEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleCapriccio, 0, new ModelResourceLocation("bandb_mod:itemCapsuleCapriccio", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleCapriccioEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleCapriccioEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleCosi, 0, new ModelResourceLocation("bandb_mod:itemCapsuleCosi", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleCosiEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleCosiEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinato, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinatoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinatoEmpty", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinatoIntenso, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinatoIntenso", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinatoIntensoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinatoIntensoEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinatoLungo, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinatoLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDecaffeinatoLungoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDecaffeinatoLungoEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDharkan, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDharkan", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleDharkanEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDharkanEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDulsaoDoBrasil, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDulsaoDoBrasil", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleDulsaoDoBrasilEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleDulsaoDoBrasilEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleFortissioLungo, 0, new ModelResourceLocation("bandb_mod:itemCapsuleFortissioLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleFortissioLungoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleFortissioLungoEmpty", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleIndriyaFromIndia, 0, new ModelResourceLocation("bandb_mod:itemCapsuleIndriyaFromIndia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleIndriyaFromIndiaEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleIndriyaFromIndiaEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleKazaar, 0, new ModelResourceLocation("bandb_mod:itemCapsuleKazaar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleKazaarEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleKazaarEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleLinizioLungo, 0, new ModelResourceLocation("bandb_mod:itemCapsuleLinizioLungo", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleLinizioLungoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleLinizioLungoEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleLivanto, 0, new ModelResourceLocation("bandb_mod:itemCapsuleLivanto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleLivantoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleLivantoEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleRistretto, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRistretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleRistrettoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRistrettoEmpty", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleRoma, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRoma", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleRomaEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRomaEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleRosabayaDeColombia, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRosabayaDeColombia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleRosabayaDeColombiaEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleRosabayaDeColombiaEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleVivaltoLungo, 0, new ModelResourceLocation("bandb_mod:itemCapsuleVivaltoLungo", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCapsuleVivaltoLungoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleVivaltoLungoEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleVolluto, 0, new ModelResourceLocation("bandb_mod:itemCapsuleVolluto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCapsuleVollutoEmpty, 0, new ModelResourceLocation("bandb_mod:itemCapsuleVollutoEmpty", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemTeaBagCaramel, 0, new ModelResourceLocation("bandb_mod:itemTeaBagCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagChai, 0, new ModelResourceLocation("bandb_mod:itemTeaBagChai", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagEarlGrey, 0, new ModelResourceLocation("bandb_mod:itemTeaBagEarlGrey", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagEmpty, 0, new ModelResourceLocation("bandb_mod:itemTeaBagEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagLemon, 0, new ModelResourceLocation("bandb_mod:itemTeaBagLemon", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemTeaBagMatchaGreen, 0, new ModelResourceLocation("bandb_mod:itemTeaBagMatchaGreen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagPeach, 0, new ModelResourceLocation("bandb_mod:itemTeaBagPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagRaspberry, 0, new ModelResourceLocation("bandb_mod:itemTeaBagRaspberry", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeaBagRedFruit, 0, new ModelResourceLocation("bandb_mod:itemTeaBagRedFruit", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupArpeggio, 0, new ModelResourceLocation("bandb_mod:itemCupArpeggio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupBukeelaKaEthiopia, 0, new ModelResourceLocation("bandb_mod:itemCupBukeelaKaEthiopia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupCapriccio, 0, new ModelResourceLocation("bandb_mod:itemCupCapriccio", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupCoffeeEmpty, 0, new ModelResourceLocation("bandb_mod:itemCupCoffeeEmpty", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupCosi, 0, new ModelResourceLocation("bandb_mod:itemCupCosi", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupDecaffeinato, 0, new ModelResourceLocation("bandb_mod:itemCupDecaffeinato", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupDecaffeinatoIntenso, 0, new ModelResourceLocation("bandb_mod:itemCupDecaffeinatoIntenso", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupDecaffeinatoLungo, 0, new ModelResourceLocation("bandb_mod:itemCupDecaffeinatoLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupDharkan, 0, new ModelResourceLocation("bandb_mod:itemCupDharkan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupDulsaoDoBrasil, 0, new ModelResourceLocation("bandb_mod:itemCupDulsaoDoBrasil", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupFortissioLungo, 0, new ModelResourceLocation("bandb_mod:itemCupFortissioLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupIndriyaFromIndia, 0, new ModelResourceLocation("bandb_mod:itemCupIndriyaFromIndia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupKazaar, 0, new ModelResourceLocation("bandb_mod:itemCupKazaar", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupLinizioLungo, 0, new ModelResourceLocation("bandb_mod:itemCupLinizioLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupLivanto, 0, new ModelResourceLocation("bandb_mod:itemCupLivanto", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupRistretto, 0, new ModelResourceLocation("bandb_mod:itemCupRistretto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupRoma, 0, new ModelResourceLocation("bandb_mod:itemCupRoma", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupRosabayaDeColombia, 0, new ModelResourceLocation("bandb_mod:itemCupRosabayaDeColombia", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaCaramel, 0, new ModelResourceLocation("bandb_mod:itemCupTeaCaramel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaChai, 0, new ModelResourceLocation("bandb_mod:itemCupTeaChai", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupTeaEarlGrey, 0, new ModelResourceLocation("bandb_mod:itemCupTeaEarlGrey", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaLemon, 0, new ModelResourceLocation("bandb_mod:itemCupTeaLemon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaMatchaGreen, 0, new ModelResourceLocation("bandb_mod:itemCupTeaMatchaGreen", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaPeach, 0, new ModelResourceLocation("bandb_mod:itemCupTeaPeach", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupTeaRaspberry, 0, new ModelResourceLocation("bandb_mod:itemCupTeaRaspberry", "inventory"));

		ModelLoader.setCustomModelResourceLocation(itemCupTeaRedFruit, 0, new ModelResourceLocation("bandb_mod:itemCupTeaRedFruit", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupVivaltoLungo, 0, new ModelResourceLocation("bandb_mod:itemCupVivaltoLungo", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemCupVolluto, 0, new ModelResourceLocation("bandb_mod:itemCupVolluto", "inventory"));
		ModelLoader.setCustomModelResourceLocation(itemTeapot, 0, new ModelResourceLocation("bandb_mod:itemTeapot", "inventory"));

	}
}
