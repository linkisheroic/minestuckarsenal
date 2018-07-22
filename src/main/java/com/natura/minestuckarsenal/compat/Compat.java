package com.natura.minestuckarsenal.compat;
/*
import com.natura.minestuckarsenal.compat.tcon.TConstruct;

import net.minecraftforge.fml.common.Loader;

public enum Compat {
	
	TCONSTRUCT("Tinkers' Construct") {
        @Override
        protected boolean preInit() {
            TConstruct.preInit();
            return true;
        }

        @Override
        protected void init() {
            TConstruct.init();
        }

        @Override
        protected void postInit() {
            TConstruct.postInit();
        }
    };
	
	protected boolean preInit() { return true; }
    protected void init() {}
    protected void postInit() {}

    final private String modName;

    private boolean isActivated = false;

    public boolean isActivated() {
        return isActivated;
    }

    Compat(String modName) {
        this.modName = modName;
    }
    
    public static void preInitCompat() {
        for (Compat compat : Compat.values()) {
            if (Loader.isModLoaded(compat.name().toLowerCase())) {
                try {
                    compat.isActivated = compat.preInit();

                    if (compat.isActivated()) {
                    } else {
                    }
                } catch (Exception e) {
                    compat.isActivated = false;
                }
            } else {
                compat.isActivated = false;
            }
        }
    }

    public static void initCompat() {
        for (Compat compat : Compat.values()) {
            if (compat.isActivated) {
                try {
                    compat.init();
                } catch (Exception e) {
                    compat.isActivated = false;
                    
                }
            }
        }
    }

    public static void postInitCompat() {
        for (Compat compat : Compat.values()) {
            if (compat.isActivated) {
                try {
                    compat.postInit();
                } catch (Exception e) {
                    compat.isActivated = false;
                    
                }
            }
        }
    }
	
	*/

