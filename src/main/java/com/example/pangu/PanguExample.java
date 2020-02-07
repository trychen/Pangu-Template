package com.example.pangu;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = PanguExample.ID, useMetadata = true, dependencies = "required-after:pangu@[1.13.7,)")
public class PanguExample {
    public static final String ID = "pangu-example";

    @Mod.Instance(ID)
    public static PanguExample INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger("MirrorCore");
    public static Logger getLogger() {
        return LOGGER;
    }
}
