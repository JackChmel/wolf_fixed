package com.example.wolfchunkloader;

import net.minecraft.server.level.TicketType;
import net.minecraft.world.level.ChunkPos;

import java.util.Comparator;

public class WolfChunkLoaderTickets {

    public static final TicketType<ChunkPos> ENTITY_TICKING =
            TicketType.create(
                    "wolf_entity_ticking",
                    Comparator.comparingInt((ChunkPos pos) -> pos.x)
                              .thenComparingInt(pos -> pos.z)
            );
}
