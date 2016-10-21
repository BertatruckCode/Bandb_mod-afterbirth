package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockFluidMoltenGlass extends BlockFluidClassic {


      public static BlockFluidMoltenGlass create(Fluid fluid, Material material) {
    	  BlockFluidMoltenGlass res = new BlockFluidMoltenGlass(fluid, material);
        res.init();
        fluid.setBlock(res);
        return res;
      }

      protected Fluid fluid;

      public BlockFluidMoltenGlass(Fluid fluid, Material material) {
        super(fluid, material);
        this.fluid = fluid;
        setLightLevel(1.0f);
        setCreativeTab(CreativeTabs.tabBlock);
      }

      protected void init() {
        GameRegistry.registerBlock(this, "blockMoltenGlass");
      }

      /**
      @Override
      @SideOnly(Side.CLIENT)
      public void registerBlockIcons(IIconRegister iconRegister) {
        icons = new IIcon[] { iconRegister.registerIcon(Bandb_mod.MODID + ":fluid/still/moltenGlass_still"),
            iconRegister.registerIcon(Bandb_mod.MODID + ":fluid/flowing/moltenGlass_flow") };

        fluid.setIcons(icons[0], icons[1]);
      }
      **/

      public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if(world.getBlockState(new BlockPos(x, y, z)).getBlock().getMaterial().isLiquid()) {
          return false;
        }
        return super.canDisplace(world, new BlockPos(x, y, z));
      }


      public boolean displaceIfPossible(World world, int x, int y, int z) {
        if(world.getBlockState(new BlockPos(x, y, z)).getBlock().getMaterial().isLiquid()) {
          return false;
        }
        return super.displaceIfPossible(world, new BlockPos(x, y, z));
      }

}