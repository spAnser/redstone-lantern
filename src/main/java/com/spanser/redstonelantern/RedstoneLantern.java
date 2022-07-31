package com.spanser.redstonelantern;

import com.spanser.redstonelantern.block.RedstoneLanternBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RedstoneLantern implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static Block REDSTONE_LANTERN_BLOCK = new RedstoneLanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 7).nonOpaque());

    @Override
    public void onInitialize() {
        LOGGER.info("RedstoneLantern Initializing.");

        Registry.register(Registry.BLOCK, new Identifier("redstonelantern", "redstone_lantern"), REDSTONE_LANTERN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("redstonelantern", "redstone_lantern"), new BlockItem(REDSTONE_LANTERN_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        LOGGER.info("RedstoneLantern Initialized.");
    }
}

