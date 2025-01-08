package org.maplibre.maplibregl;

import android.content.Context;
import com.mapbox.mapboxsdk.Mapbox;

abstract class MapLibreUtils {
  private static final String TAG = "MapLibreMapController";

  static Mapbox getMapLibre(Context context) {
    return Mapbox.getInstance(context);
  }
}
