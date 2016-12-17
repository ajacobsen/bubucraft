package atze.mcmod.bubucraft;

import atze.mcmod.bubucraft.block.BCBlocks;
import atze.mcmod.bubucraft.item.BCItems;
import atze.mcmod.bubucraft.item.crafting.BCRecipes;
import atze.mcmod.bubucraft.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BubuCraft.MODID, name = BubuCraft.MODNAME, version = BubuCraft.VERSION)
public class BubuCraft {
    public static final String MODID = "bubucraft";
    public static final String MODNAME = "BubuCraft";
    public static final String VERSION = "0.2.5";
    public static final String MC = "1.11";

    @Instance
    public static BubuCraft instance = new BubuCraft();

    @SidedProxy(clientSide="atze.mcmod.bubucraft.proxies.ClientProxy", serverSide="atze.mcmod.bubucraft.proxies.ServerProxy")
    public static CommonProxy proxy;

    @SuppressWarnings("static-access")
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	this.proxy.preInit(e);
    }

    @SuppressWarnings("static-access")
	@EventHandler
    public void init(FMLInitializationEvent e) {
    	BCItems.init();
    	BCBlocks.init();
    	BCRecipes.init();
    	this.proxy.init(e);
    }

    @SuppressWarnings("static-access")
	@EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	this.proxy.postInit(e);
    }
}
