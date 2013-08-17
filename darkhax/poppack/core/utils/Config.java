package darkhax.poppack.core.utils;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import darkhax.morerecords.core.util.Reference;

public class Config{
	
	// Categories
	public static String values = "Item Values";
	
	public static int smallThingsID;
	public static int blueID;
	public static int callMeID;
	public static int lightsID;
	public static int whistleID;
	public static int movesID;

	public static void createConfig(FMLPreInitializationEvent event){
		Reference.logger.info(Reference.NAME + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		smallThingsID = config.get(values, "Blink182 All The Small Things Record ID", 16400).getInt();
		blueID = config.get(values, "Eiffel95 Blue Record ID", 16401).getInt();
		callMeID = config.get(values, "Carly Rae Jepson Call Me Maybe", 16402).getInt();
		lightsID = config.get(values, "Ellie Goulding Lights Record ID", 16403).getInt();
		whistleID = config.get(values, "Flo Rida Whistle Record ID", 16404).getInt();
		movesID = config.get(values, "Maroon5 Moves Like Jagger Record ID", 16405).getInt();
		
		config.save();
		Reference.logger.info(Reference.NAME + "Config Loaded!");
	}
}
