package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockTreeWood extends BlockLog{
	
	public BlockTreeWood(){   
        super();
        this.setDefaultState(this.blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
        this.setCreativeTab(BandbCreativeTabs.CreativeTabsWood);
	}
	
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta){
        IBlockState iblockstate = this.getDefaultState();

        switch (meta & 12){
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state){
    	
        switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS)){
            case X: return 0b0100;
            case Y: return 0b0000;
            case Z: return 0b1000;
            case NONE: return 0b1100;
        }
        return 12;
    }

    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] {LOG_AXIS});
    }
}

