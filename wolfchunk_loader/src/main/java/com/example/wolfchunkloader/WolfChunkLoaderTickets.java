package com.example.wolfchunkloader;

import net.minecraft.server.level.TicketType;
import net.minecraft.world.level.ChunkPos;

public class WolfChunkLoaderTickets {
    public static final TicketType<ChunkPos> ENTITY_TICKING =
            TicketType.create("wolf_entity_ticking", ChunkPos::compareTo);
}
