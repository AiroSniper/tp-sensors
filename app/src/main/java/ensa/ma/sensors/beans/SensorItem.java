package ensa.ma.sensors.beans;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.core.content.ContextCompat;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class  SensorItem {
        public final String id;
        public final String name;
        public final String type;
        public final String vendor;
        public final String version;
        public final String resolution;
        public final String energie;
        public final String maxRange;
        public final String maxData;
        public final String intType;

    public SensorItem(String id, String name, String type, String vendor, String version, String resolution, String energie, String maxRange, String maxData, String intType) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.vendor = vendor;
        this.version = version;
        this.resolution = resolution;
        this.energie = energie;
        this.maxRange = maxRange;
        this.maxData = maxData;
        this.intType = intType;
    }

    @Override
        public String toString() {
            return name;
        }

}
