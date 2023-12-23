package net.ddraig.suprememiningdimension.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ddraig.suprememiningdimension.world.inventory.AugmentStationGUIMenu;
import net.ddraig.suprememiningdimension.network.AugmentStationGUIButtonMessage;
import net.ddraig.suprememiningdimension.SupremeMiningDimensionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AugmentStationGUIScreen extends AbstractContainerScreen<AugmentStationGUIMenu> {
	private final static HashMap<String, Object> guistate = AugmentStationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_augment;
	ImageButton imagebutton_augmentimage;
	ImageButton imagebutton_armorgui;
	ImageButton imagebutton_armorguiaug;
	ImageButton imagebutton_guiarrow;
	ImageButton imagebutton_guiplus;

	public AugmentStationGUIScreen(AugmentStationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 173;
	}

	private static final ResourceLocation texture = new ResourceLocation("supreme_mining_dimension:textures/screens/augment_station_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_augment = Button.builder(Component.translatable("gui.supreme_mining_dimension.augment_station_gui.button_augment"), e -> {
			if (true) {
				SupremeMiningDimensionMod.PACKET_HANDLER.sendToServer(new AugmentStationGUIButtonMessage(0, x, y, z));
				AugmentStationGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 63, 61, 20).build();
		guistate.put("button:button_augment", button_augment);
		this.addRenderableWidget(button_augment);
		imagebutton_augmentimage = new ImageButton(this.leftPos + 69, this.topPos + 10, 16, 16, 0, 0, 16, new ResourceLocation("supreme_mining_dimension:textures/screens/atlas/imagebutton_augmentimage.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_augmentimage", imagebutton_augmentimage);
		this.addRenderableWidget(imagebutton_augmentimage);
		imagebutton_armorgui = new ImageButton(this.leftPos + 15, this.topPos + 10, 32, 16, 0, 0, 16, new ResourceLocation("supreme_mining_dimension:textures/screens/atlas/imagebutton_armorgui.png"), 32, 32, e -> {
		});
		guistate.put("button:imagebutton_armorgui", imagebutton_armorgui);
		this.addRenderableWidget(imagebutton_armorgui);
		imagebutton_armorguiaug = new ImageButton(this.leftPos + 114, this.topPos + 10, 16, 16, 0, 0, 16, new ResourceLocation("supreme_mining_dimension:textures/screens/atlas/imagebutton_armorguiaug.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_armorguiaug", imagebutton_armorguiaug);
		this.addRenderableWidget(imagebutton_armorguiaug);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 87, this.topPos + 10, 16, 16, 0, 0, 16, new ResourceLocation("supreme_mining_dimension:textures/screens/atlas/imagebutton_guiarrow.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
		imagebutton_guiplus = new ImageButton(this.leftPos + 51, this.topPos + 10, 16, 16, 0, 0, 16, new ResourceLocation("supreme_mining_dimension:textures/screens/atlas/imagebutton_guiplus.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_guiplus", imagebutton_guiplus);
		this.addRenderableWidget(imagebutton_guiplus);
	}
}
