package com.mac.airspy;

public interface MovingARObject extends ARObject {
    public double getSpeedKmh();

    public double getTrack();

    public long getLastUpdateTime();
}
