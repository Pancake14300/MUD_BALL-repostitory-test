package pancake.cake.muds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pancakemuds implements ModInitializer {
	
  // an instance of our new item
  public static final Item MUD_BALL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
  
	public static final Logger LOGGER = LogManager.getLogger("pancakemuds");
         @Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("pancakemuds", "mud_ball"), MUD_BALL);
		LOGGER.info("Hello Fabric world!");
	}
}
                          

	

	
	
