package darkhax.classicpack.core.utils;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import darkhax.morerecords.core.util.Reference;

public class Config{
	
	// Categories
	public static String values = "Item Values";
	
	public static int smallThingsID;
	public static int blueID;
	public static int ID;
	public static int smallThingsID;
	public static int smallThingsID;

	public static void createConfig(FMLPreInitializationEvent event){
		Reference.logger.info(Reference.NAME + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		smallThingsID = config.get(values, "Killers Somebody Told Me Record ID", 16303).getInt();
		
		config.save();
		Reference.logger.info(Reference.NAME + "Config Loaded!");
	}
}
