package com.example.wolfchunkloader.mixin;

import net.minecraft.server.level.ChunkMap;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.server.level.TicketType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ChunkMap.class)
public interface ChunkMapAccessor {

    @Invoker("addRegionTicket")
    void callAddRegionTicket(TicketType<ChunkPos> type, ChunkPos pos, int level, ChunkPos argument);
}
