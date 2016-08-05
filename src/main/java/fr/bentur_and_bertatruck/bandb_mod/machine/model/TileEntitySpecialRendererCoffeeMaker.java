package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntitySpecialRendererCoffeeMaker  extends TileEntitySpecialRenderer{
	
	public static ModelCoffeeMaker model = new ModelCoffeeMaker();
    public static ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/models/block/textureCoffeeMaker.png");
    
    public TileEntitySpecialRendererCoffeeMaker()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.renderTileEntityCoffeeMakerAt((TileEntityCoffeeMaker)tile, x, y, z, partialRenderTick);
	}

	private void renderTileEntityCoffeeMakerAt(TileEntityCoffeeMaker tile, double x, double y, double z, float partialRenderTick) // ma propre fonction
    {
		GL11.glPushMatrix(); // ouvre une matrix
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D); // déplace le bloc sur les coordonnés et le centre
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F); // met droit le bloc (par défaut il est à l'envers)
        GL11.glRotatef(180 + 90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
        this.bindTexture(texture); // affiche la texture
        model.renderAll(); // rend le modèle
        GL11.glPopMatrix(); // ferme la matrix
    }

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
		// TODO Auto-generated method stub
		
	}
}
