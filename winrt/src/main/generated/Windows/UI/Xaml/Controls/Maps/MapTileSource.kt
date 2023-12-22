package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.UI.Xaml.Controls.Maps.IMapTileSourceFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapTileSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTileSource;{88a76e4e-2fdf-4567-9255-1100519c8d62})")
@WinRTByReference(brClass = MapTileSource.ByReference::class)
public open class MapTileSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapTileSource.WithDefault, IMapTileSource2.WithDefault, IWinRTObject {
  private val __413108532_Interface: IMapTileSource.WithDefault by lazy {
    as_413108532()
  }


  private val __78537346_Interface: IMapTileSource2.WithDefault by lazy {
    as_78537346()
  }


  public override val __413108532_Ptr: JNAPointer? by lazy {
    __413108532_Interface.__413108532_Ptr
  }


  public override val __78537346_Ptr: JNAPointer? by lazy {
    __78537346_Interface.__78537346_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__413108532_Interface, __78537346_Interface)

  public constructor() : this(ABI.activate())

  public constructor(dataSource: MapTileDataSource) : this(ABI.activate(dataSource))

  public constructor(dataSource: MapTileDataSource, zoomLevelRange: MapZoomLevelRange) :
      this(ABI.activate(dataSource, zoomLevelRange))

  public constructor(
    dataSource: MapTileDataSource,
    zoomLevelRange: MapZoomLevelRange,
    bounds: GeoboundingBox
  ) : this(ABI.activate(dataSource, zoomLevelRange, bounds))

  public constructor(
    dataSource: MapTileDataSource,
    zoomLevelRange: MapZoomLevelRange,
    bounds: GeoboundingBox,
    tileSizeInPixels: Int
  ) : this(ABI.activate(dataSource, zoomLevelRange, bounds, tileSizeInPixels))

  private fun as_413108532(): IMapTileSource.WithDefault {
    if(pointer == NULL) {
      return(IMapTileSource.ABI.makeIMapTileSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileSource.ABI.makeIMapTileSource(ref.value))
  }

  private fun as_78537346(): IMapTileSource2.WithDefault {
    if(pointer == NULL) {
      return(IMapTileSource2.ABI.makeIMapTileSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileSource2.ABI.makeIMapTileSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapTileSource>
      {
    public override fun getValue() = MapTileSource(pointer.getPointer(0))

    public fun setValue(value: MapTileSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTileSource, MemoryAddress> {
    public val IMapTileSourceStatics_Instance: IMapTileSourceStatics by lazy {
      createIMapTileSourceStatics()
    }


    public val IMapTileSourceStatics2_Instance: IMapTileSourceStatics2 by lazy {
      createIMapTileSourceStatics2()
    }


    public val IMapTileSourceFactory_Instance: IMapTileSourceFactory by lazy {
      createIMapTileSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapTileSourceStatics(): IMapTileSourceStatics {
      val refiid = Guid.REFIID(IMapTileSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileSource".toHandle(),refiid,interfacePtr)
      val result = IMapTileSourceStatics.ABI.makeIMapTileSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIMapTileSourceStatics2(): IMapTileSourceStatics2 {
      val refiid = Guid.REFIID(IMapTileSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileSource".toHandle(),refiid,interfacePtr)
      val result = IMapTileSourceStatics2.ABI.makeIMapTileSourceStatics2(interfacePtr.value)
      return result
    }

    public fun createIMapTileSourceFactory(): IMapTileSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapTileSourceFactory.ABI.makeIMapTileSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapTileSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public fun activate(dataSource: MapTileDataSource): JNAPointer? =
        IMapTileSourceFactory_Instance.CreateInstanceWithDataSource(dataSource, null, null)?.pointer

    public fun activate(dataSource: MapTileDataSource, zoomLevelRange: MapZoomLevelRange):
        JNAPointer? =
        IMapTileSourceFactory_Instance.CreateInstanceWithDataSourceAndZoomRange(dataSource,
        zoomLevelRange, null, null)?.pointer

    public fun activate(
      dataSource: MapTileDataSource,
      zoomLevelRange: MapZoomLevelRange,
      bounds: GeoboundingBox
    ): JNAPointer? =
        IMapTileSourceFactory_Instance.CreateInstanceWithDataSourceZoomRangeAndBounds(dataSource,
        zoomLevelRange, bounds, null, null)?.pointer

    public fun activate(
      dataSource: MapTileDataSource,
      zoomLevelRange: MapZoomLevelRange,
      bounds: GeoboundingBox,
      tileSizeInPixels: Int
    ): JNAPointer? =
        IMapTileSourceFactory_Instance.CreateInstanceWithDataSourceZoomRangeBoundsAndTileSize(dataSource,
        zoomLevelRange, bounds, tileSizeInPixels, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapTileSource {
      val address = segment.toRawLongValue()
      return MapTileSource(Pointer(address))
    }

    public override fun toNative(obj: MapTileSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataSourceProperty() =
        ABI.IMapTileSourceStatics_Instance.get_DataSourceProperty()

    public fun get_LayerProperty() = ABI.IMapTileSourceStatics_Instance.get_LayerProperty()

    public fun get_ZoomLevelRangeProperty() =
        ABI.IMapTileSourceStatics_Instance.get_ZoomLevelRangeProperty()

    public fun get_BoundsProperty() = ABI.IMapTileSourceStatics_Instance.get_BoundsProperty()

    public fun get_AllowOverstretchProperty() =
        ABI.IMapTileSourceStatics_Instance.get_AllowOverstretchProperty()

    public fun get_IsFadingEnabledProperty() =
        ABI.IMapTileSourceStatics_Instance.get_IsFadingEnabledProperty()

    public fun get_IsTransparencyEnabledProperty() =
        ABI.IMapTileSourceStatics_Instance.get_IsTransparencyEnabledProperty()

    public fun get_IsRetryEnabledProperty() =
        ABI.IMapTileSourceStatics_Instance.get_IsRetryEnabledProperty()

    public fun get_ZIndexProperty() = ABI.IMapTileSourceStatics_Instance.get_ZIndexProperty()

    public fun get_TilePixelSizeProperty() =
        ABI.IMapTileSourceStatics_Instance.get_TilePixelSizeProperty()

    public fun get_VisibleProperty() = ABI.IMapTileSourceStatics_Instance.get_VisibleProperty()

    public fun get_AnimationStateProperty() =
        ABI.IMapTileSourceStatics2_Instance.get_AnimationStateProperty()

    public fun get_AutoPlayProperty() = ABI.IMapTileSourceStatics2_Instance.get_AutoPlayProperty()

    public fun get_FrameCountProperty() =
        ABI.IMapTileSourceStatics2_Instance.get_FrameCountProperty()

    public fun get_FrameDurationProperty() =
        ABI.IMapTileSourceStatics2_Instance.get_FrameDurationProperty()
  }
}
