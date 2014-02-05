package darkhax.dubsteppack.core.event;

import darkhax.morerecords.core.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundManager {
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		try {
			event.manager.soundPoolStreaming.addSound("dubsteppack:Equinox.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Bangarang.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Kyoto.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Summit.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Roughneck.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Scary.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Kill.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Chaos.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:GetUp.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Narsasistic.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:FosterThe.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:FallOf.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:geminiblue.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:WhenILook.ogg");
			event.manager.soundPoolStreaming.addSound("dubsteppack:Levels.ogg");
			
			Reference.logger.info("Loaded Sounds.");
		}
		
		catch (Exception e) {
			Reference.logger.warning("Looks like there was a problem loading the sounds with the More Records Core");
		}
	}
}
