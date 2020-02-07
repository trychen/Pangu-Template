package com.example.pangu;

import cn.mccraft.pangu.core.client.input.BindKeyPress;
import cn.mccraft.pangu.core.loader.Load;
import cn.mccraft.pangu.core.network.Bridge;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nullable;

public interface ExampleMessage {
    @Load
    static void init() {
        PanguExample.getLogger().info("PANGU EXAMPLE IS LOADING!");
    }

    @BindKeyPress(value = Keyboard.KEY_O, devOnly = true)
    static void keyDown() {
        say(null, "I'm Chen");
    }

    @Bridge
    static void say(EntityPlayer player, String message) {
        PanguExample.getLogger().info("Message From " + player.getName() + ": " + message);
    }
}
