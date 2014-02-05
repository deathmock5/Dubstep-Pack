package darkhax.dubsteppack.items;

import darkhax.morerecords.core.util.RecordRegistry;
import darkhax.morerecords.item.ItemCoreRecord;
import darkhax.dubsteppack.core.utils.Config;
import net.minecraft.item.Item;

public class Items {
	/*
	skrillix - equinox
	skrillex - Bangarang
	skrillex - kyoto
	skrillex - summit
	skrillex - roughneck
	skrillex - scarry monsters and nice sprites
	skrillex - kill everybody
	korn (feat. skrillex) - chaos lives in everyhting
	korn (feat. skrillex) - Get up
	korn (feat. skrillex) - narsasistic canabal
	Butch clancy - pumped up kicks
	arkasia - fall of the republic
	gemini - blue
	emalkay - when i look at you
	avicii - levels
	*/
	public static Item recordEquinox;
	public static Item recordBangarang;
	public static Item recordKyoto;
	public static Item recordSummit;
	public static Item recordRoughneck;
	public static Item recordScary;
	public static Item recordKill;
	public static Item recordChaos;
	public static Item recordGetUp;
	public static Item recordNarsasistic;
	public static Item recordFosterThe;
	public static Item recordFallOf;
	public static Item recordGeminiBlue;
	public static Item recordWhenILook;
	public static Item recordLevels;
	
	public static void init() {
		
		addItems();
		addNames();
		addItemsToDrops();
		addItemToLoot();
		addItemToOreDic();
	}
	
	private static void addItems() {
		
		recordEquinox = new ItemCoreRecord(Config.recordEquinoxID, "dubsteppack:Equinox", "Skrillex", "First of the year(Equinox)", "Dubstep").setUnlocalizedName("equinox").setTextureName("dubsteppack:record_equinox");
		recordBangarang = new ItemCoreRecord(Config.recordBangarangID, "dubsteppack:Bangarang", "Skrillex", "Bangarang (Feat Siara)", "Dubstep").setUnlocalizedName("bangarang").setTextureName("dubsteppack:record_bangarang");
		recordKyoto = new ItemCoreRecord(Config.recordKyotoID, "dubsteppack:Kyoto", "Skrillex", "Kyoto (Feat Siara)", "Dubstep").setUnlocalizedName("kyoto").setTextureName("dubsteppack:record_kyoto");
		recordSummit = new ItemCoreRecord(Config.recordSummitID, "dubsteppack:Summit", "Skrillex", "Summit", "Dubstep").setUnlocalizedName("summit").setTextureName("dubsteppack:record_summit");
		recordRoughneck = new ItemCoreRecord(Config.recordRoughneckID, "dubsteppack:Roughneck", "Skrillex", "Roughneck Bass (Full FLEX)", "Dubstep").setUnlocalizedName("roughneck").setTextureName("dubsteppack:record_roughneck");
		recordScary = new ItemCoreRecord(Config.recordScaryID, "dubsteppack:Scary", "Skrillex", "Scary monsters and nice sprites", "Dubstep").setUnlocalizedName("scary").setTextureName("dubsteppack:record_scary");
		recordKill = new ItemCoreRecord(Config.recordKillID, "dubsteppack:Kill", "Skrillex", "Kill everybody", "Dubstep").setUnlocalizedName("kill").setTextureName("dubsteppack:record_kill");
		recordChaos = new ItemCoreRecord(Config.recordChaosID, "dubsteppack:Chaos", "Korn", "Chaos lives in everybody (Feat Skrillex)", "Dubstep").setUnlocalizedName("chaos").setTextureName("dubsteppack:record_chaos");
		recordGetUp = new ItemCoreRecord(Config.recordGetUpID, "dubsteppack:GetUp", "Korn", "Get Up! (Feat skrillex)", "Dubstep").setUnlocalizedName("getUp").setTextureName("dubsteppack:record_getup");
		recordNarsasistic = new ItemCoreRecord(Config.recordNarsasisticID, "dubsteppack:Narsasistic", "Korn", "Narsasistic canabal(Feat Skrillex)", "Dubstep").setUnlocalizedName("narsasistic").setTextureName("dubsteppack:record_narsasistic");
		recordFosterThe = new ItemCoreRecord(Config.recordFosterTheID, "dubsteppack:FosterThe", "Foster The People", "Pumped up kicks (Butch clancey mix)", "Dubstep").setUnlocalizedName("FosterThe").setTextureName("dubsteppack:record_fosterthe");
		recordFallOf = new ItemCoreRecord(Config.recordFallOfID, "dubsteppack:FallOf", "Arkasia", "Fall Of the Republic", "Dubstep").setUnlocalizedName("fallof").setTextureName("dubsteppack:record_fallof");
		recordGeminiBlue = new ItemCoreRecord(Config.recordGeminiBlueID, "dubsteppack:geminiblue", "Gemini", "Blue", "Dubstep").setUnlocalizedName("geminiblue").setTextureName("dubsteppack:record_geminiblue");
		recordWhenILook = new ItemCoreRecord(Config.recordWhenILookID, "dubsteppack:WhenILook", "Emklay", "When I look at you", "Dubstep").setUnlocalizedName("wheni").setTextureName("dubsteppack:record_wheni");
		recordLevels = new ItemCoreRecord(Config.recordLevelsID, "dubsteppack:Levels", "Avicii", "Levels (Feat skrillex)", "Dubstep").setUnlocalizedName("levels").setTextureName("dubsteppack:record_levels");

	}
	
	private static void addNames() {
		
		RecordRegistry.addItemName(recordEquinox, "Music Disc");
 		RecordRegistry.addItemName(recordBangarang, "Music Disc");
		RecordRegistry.addItemName(recordKyoto, "Music Disc");
		RecordRegistry.addItemName(recordSummit, "Music Disc");
		RecordRegistry.addItemName(recordRoughneck, "Music Disc");
		RecordRegistry.addItemName(recordScary, "Music Disc");
		RecordRegistry.addItemName(recordKill, "Music Disc");
		RecordRegistry.addItemName(recordChaos, "Music Disc");
		RecordRegistry.addItemName(recordGetUp, "Music Disc");
		RecordRegistry.addItemName(recordNarsasistic, "Music Disc");
		RecordRegistry.addItemName(recordFosterThe, "Music Disc");
		RecordRegistry.addItemName(recordFallOf, "Music Disc");
		RecordRegistry.addItemName(recordGeminiBlue, "Music Disc");
		RecordRegistry.addItemName(recordWhenILook, "Music Disc");
		RecordRegistry.addItemName(recordLevels, "Music Disc");
	}
	
	private static void addItemsToDrops() {
		
		RecordRegistry.addRecordToDrops("Equinox",Items.recordEquinox.itemID);
		RecordRegistry.addRecordToDrops("Bangarang",Items.recordBangarang.itemID);
		RecordRegistry.addRecordToDrops("Kyoto",Items.recordKyoto.itemID);
		RecordRegistry.addRecordToDrops("Summit",Items.recordSummit.itemID);
		RecordRegistry.addRecordToDrops("Roughneck",Items.recordRoughneck.itemID);
		RecordRegistry.addRecordToDrops("Scary",Items.recordScary.itemID);
		RecordRegistry.addRecordToDrops("Kill",Items.recordKill.itemID);
		RecordRegistry.addRecordToDrops("Chaos",Items.recordChaos.itemID);
		RecordRegistry.addRecordToDrops("GetUp",Items.recordGetUp.itemID);
		RecordRegistry.addRecordToDrops("Narsasistic",Items.recordNarsasistic.itemID);
		RecordRegistry.addRecordToDrops("FosterThe",Items.recordFosterThe.itemID);
		RecordRegistry.addRecordToDrops("FallOf",Items.recordFallOf.itemID);
		RecordRegistry.addRecordToDrops("GeminiBlue",Items.recordGeminiBlue.itemID);
		RecordRegistry.addRecordToDrops("WhenILook",Items.recordWhenILook.itemID);
		RecordRegistry.addRecordToDrops("Levels",Items.recordLevels.itemID);
	}
	
	private static void addItemToLoot() {
		RecordRegistry.addItemToLoot( recordEquinox);
		RecordRegistry.addItemToLoot( recordBangarang);
		RecordRegistry.addItemToLoot( recordKyoto);
		RecordRegistry.addItemToLoot( recordSummit);
		RecordRegistry.addItemToLoot( recordRoughneck);
		RecordRegistry.addItemToLoot( recordScary);
		RecordRegistry.addItemToLoot( recordKill);
		RecordRegistry.addItemToLoot( recordChaos);
		RecordRegistry.addItemToLoot( recordGetUp);
		RecordRegistry.addItemToLoot( recordNarsasistic);
		RecordRegistry.addItemToLoot( recordFosterThe);
		RecordRegistry.addItemToLoot( recordFallOf);
		RecordRegistry.addItemToLoot( recordGeminiBlue);
		RecordRegistry.addItemToLoot( recordWhenILook);
		RecordRegistry.addItemToLoot( recordLevels);
	}
	
	private static void addItemToOreDic() {
		
		RecordRegistry.addItemToOreDic( recordEquinox);
		RecordRegistry.addItemToOreDic( recordBangarang);
		RecordRegistry.addItemToOreDic( recordKyoto);
		RecordRegistry.addItemToOreDic( recordSummit);
		RecordRegistry.addItemToOreDic( recordRoughneck);
		RecordRegistry.addItemToOreDic( recordScary);
		RecordRegistry.addItemToOreDic( recordKill);
		RecordRegistry.addItemToOreDic( recordChaos);
		RecordRegistry.addItemToOreDic( recordGetUp);
		RecordRegistry.addItemToOreDic( recordNarsasistic);
		RecordRegistry.addItemToOreDic( recordFosterThe);
		RecordRegistry.addItemToOreDic( recordFallOf);
		RecordRegistry.addItemToOreDic( recordGeminiBlue);
		RecordRegistry.addItemToOreDic( recordWhenILook);
		RecordRegistry.addItemToOreDic( recordLevels);
	}
}
