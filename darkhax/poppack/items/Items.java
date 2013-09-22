package darkhax.poppack.items;

import darkhax.morerecords.core.util.RecordRegistry;
import darkhax.morerecords.item.ItemCoreRecord;
import darkhax.poppack.core.utils.Config;
import net.minecraft.item.Item;

public class Items {

	public static Item recordSmallThings;
	public static Item recordBlue;
	public static Item recordCallMe;
	public static Item recordLights;
	public static Item recordMoves;
	public static Item recordWhistle;
	
	public static void init() {
		
		addItems();
		addNames();
		addItemsToDrops();
		addItemToLoot();
		addItemToOreDic();
	}
	
	private static void addItems() {
		
		recordSmallThings = new ItemCoreRecord(Config.smallThingsID, "poppack:All The Small Things", "Blink-182", "All The Small Things", "Pop").setUnlocalizedName("smallThings").setTextureName("poppack:record_smallThings");
		recordBlue = new ItemCoreRecord(Config.blueID, "poppack:Blue", "Eiffel95", "Blue", "Pop").setUnlocalizedName("blue").setTextureName("poppack:record_blue");
		recordCallMe = new ItemCoreRecord(Config.callMeID, "poppack:Call Me Maybe", "Carly Rae Jepson", "Call Me Maybe", "Pop").setUnlocalizedName("callMe").setTextureName("poppack:record_callMe");
		recordLights = new ItemCoreRecord(Config.lightsID, "poppack:Lights", "Ellie Goulding", "Lights", "Pop").setUnlocalizedName("lights").setTextureName("poppack:record_lights");
		recordMoves = new ItemCoreRecord(Config.movesID, "poppack:Moves Like Jagger", "Maroon5", "Moves Like Jagger", "Pop").setUnlocalizedName("moves").setTextureName("poppack:record_moves");
		recordWhistle = new ItemCoreRecord(Config.movesID, "poppack:Whistle", "Flo Rida", "Whistle", "Pop").setUnlocalizedName("whistle").setTextureName("poppack:record_whistle");
	}
	
	private static void addNames() {
		
		RecordRegistry.addItemName(recordSmallThings, "Music Disc");
		RecordRegistry.addItemName(recordBlue, "Music Disc");
		RecordRegistry.addItemName(recordCallMe, "Music Disc");
		RecordRegistry.addItemName(recordLights, "Music Disc");
		RecordRegistry.addItemName(recordMoves, "Music Disc");
		RecordRegistry.addItemName(recordWhistle, "Music Disc");
	}
	
	private static void addItemsToDrops() {
		
		RecordRegistry.addRecordToDrops("SmallThings", Items.recordSmallThings.itemID);
		RecordRegistry.addRecordToDrops("Blue", Items.recordBlue.itemID);
		RecordRegistry.addRecordToDrops("CallMe", Items.recordCallMe.itemID);
		RecordRegistry.addRecordToDrops("Lights", Items.recordLights.itemID);
		RecordRegistry.addRecordToDrops("Moves", Items.recordMoves.itemID);
		RecordRegistry.addRecordToDrops("Whistle", Items.recordWhistle.itemID);
	}
	
	private static void addItemToLoot() {
		
		RecordRegistry.addItemToLoot(recordSmallThings);
		RecordRegistry.addItemToLoot(recordBlue);
		RecordRegistry.addItemToLoot(recordCallMe);
		RecordRegistry.addItemToLoot(recordLights);
		RecordRegistry.addItemToLoot(recordMoves);
		RecordRegistry.addItemToLoot(recordWhistle);
	}
	
	private static void addItemToOreDic() {
		
		RecordRegistry.addItemToOreDic(recordSmallThings);
		RecordRegistry.addItemToOreDic(recordBlue);
		RecordRegistry.addItemToOreDic(recordCallMe);
		RecordRegistry.addItemToOreDic(recordLights);
		RecordRegistry.addItemToOreDic(recordMoves);
		RecordRegistry.addItemToOreDic(recordWhistle);
	}
}
