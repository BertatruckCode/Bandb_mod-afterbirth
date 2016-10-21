package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidMoltenGlass extends Fluid
{
    public FluidMoltenGlass()
    {
        super("FluidMoltenGlass", new ResourceLocation(Bandb_mod.MODID + ":fluid/still/moltenGlass_still"), new ResourceLocation(Bandb_mod.MODID + ":fluid/still/moltenGlass_flow"));
        setDensity(10); // How tick the fluid is, affects movement inside the liquid.
        setViscosity(1000); // How fast the fluid flows.
        setUnlocalizedName("FluidMoltenGlass"); //setting the name
        FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
        }
}
