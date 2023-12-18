package github.kasuminova.novaeng.common.hypernet.proc.server.module;

import github.kasuminova.novaeng.common.hypernet.proc.server.Extension;
import github.kasuminova.novaeng.common.hypernet.proc.server.HardwareBandwidthConsumer;
import github.kasuminova.novaeng.common.hypernet.proc.server.ModularServer;
import github.kasuminova.novaeng.common.hypernet.proc.server.module.base.ServerModuleBase;

public abstract class ModuleExtensionCard extends ServerModule implements HardwareBandwidthConsumer, Extension {

    protected int hardwareBandwidth;

    public ModuleExtensionCard(final ModularServer server,final ServerModuleBase<?> moduleBase) {
        super(server, moduleBase);
    }

    @Override
    public int getHardwareBandwidth() {
        return hardwareBandwidth;
    }

    public void setHardwareBandwidth(final int hardwareBandwidth) {
        this.hardwareBandwidth = hardwareBandwidth;
    }

}
