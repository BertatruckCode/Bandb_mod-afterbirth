package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BandbCreativeTabs {

	public static CreativeTabs CreativeTabsFruit = new CreativeTabs("CreativeTabsFruit") {
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbFood.itemFruitCherry;
		}
	};
	public static CreativeTabs CreativeTabsVegetable = new CreativeTabs("CreativeTabsVegetable") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbFood.itemVegetableCarrotTouchon;
		}

	};
	public static CreativeTabs CreativeTabsSeed = new CreativeTabs("CreativeTabsSeed") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.wheat_seeds;
		}

	};

	public static CreativeTabs CreativeTabsPlant = new CreativeTabs("CreativeTabsPlant") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabsOre = new CreativeTabs("CreativeTabsOre") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};

	public static CreativeTabs CreativeTabsLeaf = new CreativeTabs("CreativeTabsLeaf") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabsWood = new CreativeTabs("CreativeTabsWood") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabSapling = new CreativeTabs("CreativeTabsSapling") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabsButterfly = new CreativeTabs("CreativeTabsButterfly") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
	}
		
	};
	public static CreativeTabs CreativeTabsMobs = new CreativeTabs("CreativeTabsMobs") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
	}
		
	};
	
	

	public static CreativeTabs CreativeTabsBeverage = new CreativeTabs("CreativeTabsBeverage") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBeverageCuracaoOrange;
		}

	};
	public static CreativeTabs CreativeTabsBottle = new CreativeTabs("CreativeTabsBottle") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleCuracaoOrange;
		}

	};

	public static CreativeTabs CreativeTabsLabel = new CreativeTabs("CreativeTabsLabel") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleCuracaoOrangeLabel;
		}

	};

	public static CreativeTabs CreativeTabsCoktail = new CreativeTabs("CreativeTabsCocktail") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabsCoffeeAndTea = new CreativeTabs("CreativeTabsCoffeeAndTea") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemCupArpeggio;
		}

	};
	
	public static CreativeTabs CreativeTabsMonin = new CreativeTabs("CreativeTabsMonin") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemLogoMonin;
		}

	};

	public static CreativeTabs CreativeTabsIngredient = new CreativeTabs("CreativeTabsIngredient") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbFood.itemIngredientChocolate;
		}
	};
	public static CreativeTabs CreativeTabsMeat = new CreativeTabs("CreativeTabsMeat") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbFood.itemMeatMuttonShoulderRaw;
		}
	};
	public static CreativeTabs CreativeTabsProcessedFood = new CreativeTabs("CreativeTabsProcessedFood") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbFood.itemFoodMars;
		}
	};	
	public static CreativeTabs CreativeTabsJunkFood = new CreativeTabs("CreativeTabsJunkFood") {

			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return BandbBeverages.itemBottleBordeauxChateauLary;				
		}
	};
	public static CreativeTabs CreativeTabsKitchenTools = new CreativeTabs("CreativeTabsKitchenTools") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};	
	public static CreativeTabs CreativeTabsMiscellaneous = new CreativeTabs("CreativeTabsMiscellaneous") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;

		}

	};
	public static CreativeTabs CreativeTabsFluid = new CreativeTabs("CreativeTabsFluid") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
			
		}
	};

}
