package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListApple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListAppleJuice;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListCoffeeCup;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGrape;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListPineapple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListPineapplejuice;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListTeaCup;

public class BandbLists {
	
	public static void init(){
		ListApple.add(BandbFood.itemFruitAppleAntares);
		ListApple.add(BandbFood.itemFruitAppleAriane);
		ListApple.add(BandbFood.itemFruitAppleBelchardChancelier);
		ListApple.add(BandbFood.itemFruitAppleBelleDeBoskoop);
		ListApple.add(BandbFood.itemFruitAppleBraeburn);
		ListApple.add(BandbFood.itemFruitAppleElstar);
		ListApple.add(BandbFood.itemFruitAppleFuji);
		ListApple.add(BandbFood.itemFruitAppleGala);
		ListApple.add(BandbFood.itemFruitAppleGolden);
		ListApple.add(BandbFood.itemFruitAppleGrannySmith);
		ListApple.add(BandbFood.itemFruitAppleHoneycrunch);
		ListApple.add(BandbFood.itemFruitAppleJazz);
		ListApple.add(BandbFood.itemFruitAppleJonagoldJonagored);
		ListApple.add(BandbFood.itemFruitAppleLesRouges);
		ListApple.add(BandbFood.itemFruitApplePinkLady);
		ListApple.add(BandbFood.itemFruitApplePommeDuLimousin);
		ListApple.add(BandbFood.itemFruitAppleReineDesReinettes);
		ListApple.add(BandbFood.itemFruitAppleReinetteGriseDuCanada);
		ListApple.add(BandbFood.itemFruitAppleTentation);

		ListAppleJuice.add(BandbBeverages.itemJuiceAppleAntares);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleAriane);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBelchardChancelier);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBelleDeBoskoop);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBraeburn);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleElstar);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleFuji);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGala);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGolden);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGrannySmith);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleHoneycrunch);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleJazz);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleJonagoldJonagored);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleLesRouges);
		ListAppleJuice.add(BandbBeverages.itemJuiceApplePinkLady);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleDuLimousin);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleReineDesReinettes);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleReinetteGriseDuCanada);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleTentation);
/*
		ListBottle.add(BandbBeverages.itemBottle1664WOLabel);
		ListBottle.add(BandbBeverages.itemBottleAlsaceRieslingWOLabel);
		ListBottle.add(BandbBeverages.itemBottleAmarettoWOLabel);
		ListBottle.add(BandbBeverages.itemBottleAngosturaBitterWOLabel);
		ListBottle.add(BandbBeverages.itemBottleBaileysWOLabel);
		ListBottle.add(BandbBeverages.itemBottleBenedictineWOLabel);
		ListBottle.add(BandbBeverages.itemBenturColaWOLabel);
		ListBottle.add(BandbBeverages.itemBottleBitterWOLabel);
		ListBottle.add(BandbBeverages.itemBottleBlueCuracaoWOLabel);
		ListBottle.add(BandbBeverages.itemBottleChouchenWOLabel);
		ListBottle.add(BandbBeverages.itemBottlePastis51WOLabel);
		ListBottle.add(BandbBeverages.itemBottleLiqueurWOLabel);
		ListBottle.add(BandbBeverages.itemBottleWhiskeyWOLabel);
		ListBottle.add(BandbBeverages.itemBourgogneAligoteWOLabel);
		ListBottle.add(BandbBeverages.itemBrandyWOLabel);
		ListBottle.add(BandbBeverages.itemBrittWOLabel);
		ListBottle.add(BandbBeverages.itemCalvadosWOLabel);
		ListBottle.add(BandbBeverages.itemCampariWOLabel);
		ListBottle.add(BandbBeverages.itemCapCorseWOLabel);
		ListBottle.add(BandbBeverages.itemChampagneMummWOLabel);
		ListBottle.add(BandbBeverages.itemChartreuseJauneWOLabel);
		ListBottle.add(BandbBeverages.itemChartreuseVerteWOLabel);
		ListBottle.add(BandbBeverages.itemCiderKerneWOLabel);
		ListBottle.add(BandbBeverages.itemCognacWOLabel);
		ListBottle.add(BandbBeverages.itemCuracaoOrangeWOLabel);
		ListBottle.add(BandbBeverages.itemCuracaoTripleSecWOLabel);
		ListBottle.add(BandbBeverages.itemDesperadosWOLabel);
		ListBottle.add(BandbBeverages.itemDrambuieWOLabel);
		ListBottle.add(BandbBeverages.itemDubonnetRougeWOLabel);
		ListBottle.add(BandbBeverages.itemDuvelWOLabel);
		ListBottle.add(BandbBeverages.itemEnateWOLabel);
		ListBottle.add(BandbBeverages.itemFernetBrancaWOLabel);
		ListBottle.add(BandbBeverages.itemFleurOrangerWOLabel);
		ListBottle.add(BandbBeverages.itemGet27WOLabel);
		ListBottle.add(BandbBeverages.itemGinWOLabel);
		ListBottle.add(BandbBeverages.itemGrandMarnierWOLabel);
		ListBottle.add(BandbBeverages.itemGrimberWOLabel);
		ListBottle.add(BandbBeverages.itemGuinnessWOLabel);
		ListBottle.add(BandbBeverages.itemHeinekenWOLabel);
		ListBottle.add(BandbBeverages.itemHoneyWOLabel);
		ListBottle.add(BandbBeverages.itemLambigWOLabel);
		ListBottle.add(BandbBeverages.itemLeffeWOLabel);
		ListBottle.add(BandbBeverages.itemLimonadeWOLabel);
		ListBottle.add(BandbBeverages.itemPerrierWOLabel);
		ListBottle.add(BandbBeverages.itemPetrusWOLabel);
		ListBottle.add(BandbBeverages.itemPint);
		ListBottle.add(BandbBeverages.itemPiscoWOLabel);
		ListBottle.add(BandbBeverages.itemPommeauWOLabel);
		ListBottle.add(BandbBeverages.itemPontarlierWOLabel);
		ListBottle.add(BandbBeverages.itemRedMartiniWOLabel);
		ListBottle.add(BandbBeverages.itemRedPortWOLabel);
		ListBottle.add(BandbBeverages.itemRumWOLabel);
		ListBottle.add(BandbBeverages.itemSanMiguelWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesAgrumWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesDarkSideWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesGingerAleWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesLemonWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesMangoWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPamplemousseWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPassionWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPechWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPommeWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesRaisinWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesRicqlesWOLabel);
		ListBottle.add(BandbBeverages.itemScweppesTonicWOLabel);
		ListBottle.add(BandbBeverages.itemSkollWOLabel);
		ListBottle.add(BandbBeverages.itemSmirnoffWOLabel);
		ListBottle.add(BandbBeverages.itemSouthernComfortWOLabel);
		ListBottle.add(BandbBeverages.itemSyrupMoninWOLabel);
		ListBottle.add(BandbBeverages.itemTabascoWOLabel);
		ListBottle.add(BandbBeverages.itemTequilaWOLabel);
		ListBottle.add(BandbBeverages.itemVinegarWOLabel);
		ListBottle.add(BandbBeverages.itemVodkaWOLabel);
		ListBottle.add(BandbBeverages.itemWhiteMartiniWOLabel);
		ListBottle.add(BandbBeverages.itemWhitePortWOLabel);
		ListBottle.add(BandbBeverages.itemWorcestershireSauceWOLabel);
		ListBottle.add(BandbBeverages.itemXeresWOLabel);
		ListBottle.add(BandbBeverages.itemXIIWOLabel);
*/
		ListCoffeeCup.add(BandbBeverages.itemCupArpeggio);
		ListCoffeeCup.add(BandbBeverages.itemCupBukeelaKaEthiopia);
		ListCoffeeCup.add(BandbBeverages.itemCupCapriccio);
		ListCoffeeCup.add(BandbBeverages.itemCupCosi);
		ListCoffeeCup.add(BandbBeverages.itemCupDecaffeinato);
		ListCoffeeCup.add(BandbBeverages.itemCupDecaffeinatoIntenso);
		ListCoffeeCup.add(BandbBeverages.itemCupDecaffeinatoLungo);
		ListCoffeeCup.add(BandbBeverages.itemCupDharkan);
		ListCoffeeCup.add(BandbBeverages.itemCupDulsaoDoBrasil);
		ListCoffeeCup.add(BandbBeverages.itemCupFortissioLungo);
		ListCoffeeCup.add(BandbBeverages.itemCupIndriyaFromIndia);
		ListCoffeeCup.add(BandbBeverages.itemCupKazaar);
		ListCoffeeCup.add(BandbBeverages.itemCupLinizioLungo);
		ListCoffeeCup.add(BandbBeverages.itemCupLivanto);
		ListCoffeeCup.add(BandbBeverages.itemCupRistretto);
		ListCoffeeCup.add(BandbBeverages.itemCupRoma);
		ListCoffeeCup.add(BandbBeverages.itemCupRosabayaDeColombia);
		ListCoffeeCup.add(BandbBeverages.itemCupVivaltoLungo);

		ListGrape.add(BandbFood.itemGrapeAbouriou);
		ListGrape.add(BandbFood.itemGrapeAleaticu);
		ListGrape.add(BandbFood.itemGrapeAligote);
		ListGrape.add(BandbFood.itemGrapeAltesse);
		ListGrape.add(BandbFood.itemGrapeAramon);
		ListGrape.add(BandbFood.itemGrapeArbois);
		ListGrape.add(BandbFood.itemGrapeArrufiac);
		ListGrape.add(BandbFood.itemGrapeAubinVert);
		ListGrape.add(BandbFood.itemGrapeBarbarossa);
		ListGrape.add(BandbFood.itemGrapeBergeron);
		ListGrape.add(BandbFood.itemGrapeBiancone);
		ListGrape.add(BandbFood.itemGrapeBiancuGentile);
		ListGrape.add(BandbFood.itemGrapeBourboulenc);
		ListGrape.add(BandbFood.itemGrapeBraquet);
		ListGrape.add(BandbFood.itemGrapeCabernetFranc);
		ListGrape.add(BandbFood.itemGrapeCabernetSauvignon);
		ListGrape.add(BandbFood.itemGrapeCamarese);
		ListGrape.add(BandbFood.itemGrapeCarcaghjoluBiancu);
		ListGrape.add(BandbFood.itemGrapeCarcaghjoluNeru);
		ListGrape.add(BandbFood.itemGrapeCarignan);
		ListGrape.add(BandbFood.itemGrapeCesar);
		ListGrape.add(BandbFood.itemGrapeChardonnay);
		ListGrape.add(BandbFood.itemGrapeChenin);
		ListGrape.add(BandbFood.itemGrapeCinsault);
		ListGrape.add(BandbFood.itemGrapeClairette);
		ListGrape.add(BandbFood.itemGrapeColombard);
		ListGrape.add(BandbFood.itemGrapeCot);
		ListGrape.add(BandbFood.itemGrapeCounoise);
		ListGrape.add(BandbFood.itemGrapeCourbu);
		ListGrape.add(BandbFood.itemGrapeCudiverta);
		ListGrape.add(BandbFood.itemGrapeDuras);
		ListGrape.add(BandbFood.itemGrapeFerServadou);
		ListGrape.add(BandbFood.itemGrapeFolleBlanche);
		ListGrape.add(BandbFood.itemGrapeGamay);
		ListGrape.add(BandbFood.itemGrapeGewurztraminer);
		ListGrape.add(BandbFood.itemGrapeGrenache);
		ListGrape.add(BandbFood.itemGrapeGrenacheBlanc);
		ListGrape.add(BandbFood.itemGrapeGrolleau);
		ListGrape.add(BandbFood.itemGrapeGrosMenseng);
		ListGrape.add(BandbFood.itemGrapeJacquere);
		ListGrape.add(BandbFood.itemGrapeLenDeLEl);
		ListGrape.add(BandbFood.itemGrapeListan);
		ListGrape.add(BandbFood.itemGrapeMaccabeu);
		ListGrape.add(BandbFood.itemGrapeMalbec);
		ListGrape.add(BandbFood.itemGrapeMalvoisie);
		ListGrape.add(BandbFood.itemGrapeMarsanne);
		ListGrape.add(BandbFood.itemGrapeMarselan);
		ListGrape.add(BandbFood.itemGrapeMauzac);
		ListGrape.add(BandbFood.itemGrapeMelon);
		ListGrape.add(BandbFood.itemGrapeMelonDeBourgogne);
		ListGrape.add(BandbFood.itemGrapeMerlot);
		ListGrape.add(BandbFood.itemGrapeMolette);
		ListGrape.add(BandbFood.itemGrapeMollard);
		ListGrape.add(BandbFood.itemGrapeMondeuse);
		ListGrape.add(BandbFood.itemGrapeMondeuseBlanche);
		ListGrape.add(BandbFood.itemGrapeMourvedre);
		ListGrape.add(BandbFood.itemGrapeMuscadelle);
		ListGrape.add(BandbFood.itemGrapeMuscardin);
		ListGrape.add(BandbFood.itemGrapeMuscatBlancAPetitsGrains);
		ListGrape.add(BandbFood.itemGrapeMuscatDAlexandrie);
		ListGrape.add(BandbFood.itemGrapeNegrette);
		ListGrape.add(BandbFood.itemGrapeNielluccio);
		ListGrape.add(BandbFood.itemGrapePagaDebiti);
		ListGrape.add(BandbFood.itemGrapePetitCourbu);
		ListGrape.add(BandbFood.itemGrapePetitMenseng);
		ListGrape.add(BandbFood.itemGrapePetitVerdot);
		ListGrape.add(BandbFood.itemGrapePineauDAunis);
		ListGrape.add(BandbFood.itemGrapePinotBlanc);
		ListGrape.add(BandbFood.itemGrapePinotMeunier);
		ListGrape.add(BandbFood.itemGrapePinotNoir);
		ListGrape.add(BandbFood.itemGrapePiquepoul);
		ListGrape.add(BandbFood.itemGrapePoulsard);
		ListGrape.add(BandbFood.itemGrapeRiesling);
		ListGrape.add(BandbFood.itemGrapeRomorantin);
		ListGrape.add(BandbFood.itemGrapeRossulaBianca);
		ListGrape.add(BandbFood.itemGrapeSacy);
		ListGrape.add(BandbFood.itemGrapeSauvignon);
		ListGrape.add(BandbFood.itemGrapeSavagnin);
		ListGrape.add(BandbFood.itemGrapeSemillon);
		ListGrape.add(BandbFood.itemGrapeSylvaner);
		ListGrape.add(BandbFood.itemGrapeSyrah);
		ListGrape.add(BandbFood.itemGrapeTannat);
		ListGrape.add(BandbFood.itemGrapeTeoulier);
		ListGrape.add(BandbFood.itemGrapeTerretNoir);
		ListGrape.add(BandbFood.itemGrapeTibouren);
		ListGrape.add(BandbFood.itemGrapeTressalier);
		ListGrape.add(BandbFood.itemGrapeUgniBlanc);
		ListGrape.add(BandbFood.itemGrapeVaccarese);
		ListGrape.add(BandbFood.itemGrapeViognier);
		ListGrape.add(BandbFood.itemGrapeVermentinu);
		
	/*	
		ListLabels.add(BandbItems.itemBottleAlsaceRieslingLabel);
		ListLabels.add(BandbItems.itemAmarettoLabel);
		ListLabels.add(BandbItems.itemAngosturaBitterLabel);
		ListLabels.add(BandbItems.itemBaileysLabel);
		ListLabels.add(BandbItems.itemBenedictineLabel);
		ListLabels.add(BandbItems.itemBenturColaLabel);
		ListLabels.add(BandbItems.itemBitterLabel);
		ListLabels.add(BandbItems.itemBlueCuracaoLabel);
		ListLabels.add(BandbItems.itemBordeauxLaryLabel);
		ListLabels.add(BandbItems.itemBordeauxTourLabel);
		ListLabels.add(BandbItems.itemBourgogneAligoteLabel);
		ListLabels.add(BandbItems.itemBrandyLabel);
		ListLabels.add(BandbItems.itemCalvadosLabel);
		ListLabels.add(BandbItems.itemCampariLabel);
		ListLabels.add(BandbItems.itemCapCorseLabel);
		ListLabels.add(BandbItems.itemChampagneMummLabel);
		ListLabels.add(BandbItems.itemChartreuseJauneLabel);
		ListLabels.add(BandbItems.itemChartreuseVerteLabel);
		ListLabels.add(BandbItems.itemChouchenLabel);
		ListLabels.add(BandbItems.itemCiderLabel);
		ListLabels.add(BandbItems.itemCognacLabel);
		ListLabels.add(BandbItems.itemCuracaoTripleSecLabel);
		ListLabels.add(BandbItems.itemCuracaoOrangeLabel);
		ListLabels.add(BandbItems.itemDrambuieLabel);
		ListLabels.add(BandbItems.itemDubonnetRougeLabel);
		ListLabels.add(BandbItems.itemEnateLabel);
		ListLabels.add(BandbItems.itemFernetBrancaLabel);
		ListLabels.add(BandbItems.itemFleurOrangerLabel);
		ListLabels.add(BandbItems.itemGinLabel);
		ListLabels.add(BandbItems.itemGrandMarnierLabel);
		ListLabels.add(BandbItems.itemGuinnessLabel);
		ListLabels.add(BandbItems.itemHeinekenLabel);
		ListLabels.add(BandbItems.itemLabelBritt);
		ListLabels.add(BandbItems.itemLabel1664);
		ListLabels.add(BandbItems.itemLabelDesperados);
		ListLabels.add(BandbItems.itemLabelDuvel);
		ListLabels.add(BandbItems.itemLabelGet27);
		ListLabels.add(BandbItems.itemLabelGrimbergen);
		ListLabels.add(BandbItems.itemLabelHoney);
		ListLabels.add(BandbItems.itemLabelLeffe);
		ListLabels.add(BandbItems.itemLabelSanMiguel);
		ListLabels.add(BandbItems.itemLabelSchweppesAgrum);
		ListLabels.add(BandbItems.itemLabelSchweppesDarkSide);
		ListLabels.add(BandbItems.itemLabelSchweppesLemon);
		ListLabels.add(BandbItems.itemLabelSchweppesMango);
		ListLabels.add(BandbItems.itemLabelSchweppesPamplemousse);
		ListLabels.add(BandbItems.itemLabelSchweppesPassion);
		ListLabels.add(BandbItems.itemLabelSchweppesPech);
		ListLabels.add(BandbItems.itemLabelSchweppesPomme);
		ListLabels.add(BandbItems.itemLabelSchweppesRaisin);
		ListLabels.add(BandbItems.itemLabelSchweppesRicqles);
		ListLabels.add(BandbItems.itemLabelSkoll);
		ListLabels.add(BandbItems.itemLabelSmirnoff);
		ListLabels.add(BandbItems.itemLabelXII);
		ListLabels.add(BandbItems.itemLambigLabel);
		ListLabels.add(BandbItems.itemLimonadeLabel);
		ListLabels.add(BandbItems.itemLiquorLabel);
		ListLabels.add(BandbItems.itemPastis51Label);
		ListLabels.add(BandbItems.itemPerrierLabel);
		ListLabels.add(BandbItems.itemPetrusLabel);
		ListLabels.add(BandbItems.itemPiscoLabel);
		ListLabels.add(BandbItems.itemPommeauLabel);
		ListLabels.add(BandbItems.itemPontarlierLabel);
		ListLabels.add(BandbItems.itemRedMartiniLabel);
		ListLabels.add(BandbItems.itemRedPortLabel);
		ListLabels.add(BandbItems.itemSchweppesGingerAleLabel);
		ListLabels.add(BandbItems.itemRumLabel);
		ListLabels.add(BandbItems.itemSchweppesTonicLabel);
		ListLabels.add(BandbItems.itemSiropMoninOrangeLabel);
		ListLabels.add(BandbItems.itemSouthernComfortLabel);
		ListLabels.add(BandbItems.itemTabascoLabel);
		ListLabels.add(BandbItems.itemTequilaLabel);
		ListLabels.add(BandbItems.itemVinegarLabel);
		ListLabels.add(BandbItems.itemVodkaLabel);
		ListLabels.add(BandbItems.itemWhiskeyLabel);
		ListLabels.add(BandbItems.itemWhiteMartiniLabel);
		ListLabels.add(BandbItems.itemWhitePortLabel);
		ListLabels.add(BandbItems.itemWorcestershireSauceLabel);
		ListLabels.add(BandbItems.itemXeresLabel);
		*/	
		 
		
		ListPineapple.add(BandbFood.itemFruitPineappleVictoria);
		ListPineapple.add(BandbFood.itemFruitPineappleCayenne);
		
		ListPineapplejuice.add(BandbBeverages.itemJuicePineappleVictoria);
		ListPineapplejuice.add(BandbBeverages.itemJuicePineappleCayenneLisse);

		ListTeaCup.add(BandbBeverages.itemCupTeaLemon);
		ListTeaCup.add(BandbBeverages.itemCupTeaMatchaGreen);
		ListTeaCup.add(BandbBeverages.itemCupTeaPeach);
		ListTeaCup.add(BandbBeverages.itemCupTeaRaspberry);
		ListTeaCup.add(BandbBeverages.itemCupTeaCaramel);
		ListTeaCup.add(BandbBeverages.itemCupTeaRedFruit);
		ListTeaCup.add(BandbBeverages.itemCupTeaEarlGrey);
		ListTeaCup.add(BandbBeverages.itemCupTeaChai);


	}

}
