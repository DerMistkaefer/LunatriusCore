package com.github.lunatrius.core.reference;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
    public static final String MODID = "lunatriuscore";
    public static final String NAME = "LunatriusCore";
    public static final String VERSION = "1.2.0.git";
    public static final String FORGE = "14.23.5.2854";
    public static final String MINECRAFT = "1.12.2";
    public static final String PROXY_SERVER = "com.github.lunatrius.core.proxy.ServerProxy";
    public static final String PROXY_CLIENT = "com.github.lunatrius.core.proxy.ClientProxy";

    public static Logger logger = LogManager.getLogger(Reference.MODID);
}
