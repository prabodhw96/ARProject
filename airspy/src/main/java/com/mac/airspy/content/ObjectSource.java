package com.mac.airspy.content;

import com.mac.airspy.ARObject;

import java.io.IOException;
import java.util.List;

public interface ObjectSource {
    public List<? extends ARObject> getObjects() throws IOException;

    public ObjectViewProvider getInfoViewProvider();

    public ObjectViewProvider getDetailsViewProvider();
}
