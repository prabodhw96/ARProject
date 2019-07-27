package com.mac.airspy;

public interface ApplicationComponent {
    public String getIdentifier();

    public ComponentState getState();

    public void setStateListener(StateChangedListener stateListener);

    public static interface StateChangedListener {
        public void onStateChanged(ApplicationComponent component, ComponentState newState);
    }
}
