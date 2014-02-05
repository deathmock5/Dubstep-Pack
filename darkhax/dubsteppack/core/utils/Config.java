package darkhax.dubsteppack.core.utils;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import darkhax.morerecords.core.util.Reference;

public class Config{
	
	// Categories
	public static String values = "Item Values";
	
	public static int recordEquinoxID;
	public static int recordBangarangID;
	public static int recordKyotoID;
	public static int recordSummitID;
	public static int recordRoughneckID;
	public static int recordScaryID;
	public static int recordKillID;
	public static int recordChaosID;
	public static int recordGetUpID;
	public static int recordNarsasisticID;
	public static int recordFosterTheID;
	public static int recordFallOfID;
	public static int recordGeminiBlueID;
	public static int recordWhenILookID;
	public static int recordLevelsID;

	public static void createConfig(FMLPreInitializationEvent event){
		Reference.logger.info(Reference.NAME + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		recordEquinoxID = config.get(values, "Skrillex Equinox Record ID", 16425).getInt();
		recordBangarangID = config.get(values, "Skrillex Bangarang Record ID", 16426).getInt();
		recordKyotoID = config.get(values, "Skrillex Kyoto Record ID", 16427).getInt();
		recordSummitID = config.get(values, "Skrillex Summit Record ID", 16428).getInt();
		recordRoughneckID = config.get(values, "Skrillex Roughneck Record ID", 16429).getInt();
		recordScaryID = config.get(values, "Skrillex Scarry Record ID", 16430).getInt();
		recordKillID = config.get(values, "Skrillex Kill Record ID", 16431).getInt();
		recordChaosID = config.get(values, "Skrillex Chaos Record ID", 16432).getInt();
		recordGetUpID = config.get(values, "Skrillex GetUp Record ID", 16433).getInt();
		recordNarsasisticID = config.get(values, "Skrillex Narsasistic Record ID", 16434).getInt();
		recordFosterTheID = config.get(values, "Skrillex Foster Record ID", 16435).getInt();
		recordFallOfID = config.get(values, "Skrillex FallOf Record ID", 16436).getInt();
		recordGeminiBlueID = config.get(values, "Skrillex Gemini Record ID", 16437).getInt();
		recordWhenILookID = config.get(values, "Skrillex WhenILook Record ID", 16438).getInt();
		recordLevelsID = config.get(values, "Skrillex Levels Record ID", 16439).getInt();
		
		config.save();
		Reference.logger.info(Reference.NAME + "Config Loaded!");
	}
}
