part of '../maplibre_gl_web.dart';

class MapLibreMapPlugin {
  /// Registers this class as the default instance of [MapLibreGlPlatform].
  static void registerWith(Registrar registrar) {
    MapLibreGlPlatform.createInstance = () => MaplibreMapController();
  }
}
