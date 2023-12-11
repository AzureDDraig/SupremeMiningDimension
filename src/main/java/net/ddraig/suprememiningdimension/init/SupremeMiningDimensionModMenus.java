
package net.ddraig.suprememiningdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ddraig.suprememiningdimension.world.inventory.SifterGUIMenu;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

public class SupremeMiningDimensionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SupremeMiningDimensionMod.MODID);
	public static final RegistryObject<MenuType<SifterGUIMenu>> SIFTER_GUI = REGISTRY.register("sifter_gui", () -> IForgeMenuType.create(SifterGUIMenu::new));
}
