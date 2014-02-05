package darkhax.dubsteppack.core.proxy;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.dubsteppack.core.event.SoundManager;

public class ClientProxy extends CommonProxy{
	
	@SideOnly(Side.CLIENT)
	public static void soundHandler() {
		
		MinecraftForge.EVENT_BUS.register(new SoundManager());
	}
}
