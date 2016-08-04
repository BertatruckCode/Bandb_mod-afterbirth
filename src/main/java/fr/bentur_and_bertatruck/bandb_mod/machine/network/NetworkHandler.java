package fr.bentur_and_bertatruck.bandb_mod.machine.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {
	public static SimpleNetworkWrapper networkWrapper;
	private int registerID = -1;
	
	public NetworkHandler() {
		networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel("bandbmod");
		
		registerPacket(PacketPrinter.class, PacketPrinter.Handler.class, Side.SERVER);
		registerPacket(PacketBottleCaster.class, PacketBottleCaster.Handler.class, Side.SERVER);
		registerPacket(PacketKebabStand.class, PacketKebabStand.Handler.class, Side.SERVER);

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void registerPacket(Class<? extends IMessage> c1, Class c2, Side side) {
		registerID++;
		networkWrapper.registerMessage(c2, c1, registerID, side);
	}
}
