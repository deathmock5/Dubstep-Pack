package darkhax.classicpack.core.proxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkhax.classicpack.core.event.SoundManager;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
	
	@SideOnly(Side.CLIENT)
	public static void soundHandler() {
		
		MinecraftForge.EVENT_BUS.register(new SoundManager());
	}
}
