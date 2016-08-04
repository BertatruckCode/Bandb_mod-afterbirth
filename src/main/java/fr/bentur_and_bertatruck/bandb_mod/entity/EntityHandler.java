package fr.bentur_and_bertatruck.bandb_mod.entity;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler {
	
	public static void RegisterEntities(Class entityClass, String name, int mainColor, int subColor){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random();
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Bandb_mod.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
		
	}

}
