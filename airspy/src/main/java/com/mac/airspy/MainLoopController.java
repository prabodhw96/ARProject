package com.mac.airspy;

import roboguice.RoboGuice;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class MainLoopController extends BaseApplicationComponent {

    private MainLoop mainLoop;

    public void start() {
        setState(ComponentState.STARTING);

        mainLoop = new MainLoop();
        RoboGuice.getInjector(ctx).injectMembers(mainLoop);
        new Thread(mainLoop).start();

        setState(ComponentState.READY);
    }

    public void stop() {
        if (mainLoop != null) {
            mainLoop.stop();
            mainLoop = null;
        }

        setState(ComponentState.STOPPED);
    }
}
