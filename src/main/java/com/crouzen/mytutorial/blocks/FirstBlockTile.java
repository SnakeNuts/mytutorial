package com.crouzen.mytutorial.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import static com.crouzen.mytutorial.blocks.ModBlocks.FIRSTBLOCK_TILE;

public class FirstBlockTile extends TileEntity {
    public FirstBlockTile() {
        super(FIRSTBLOCK_TILE);
    }
}
