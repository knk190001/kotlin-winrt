package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapTileDataSourceFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapTileDataSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTileDataSource;{c03d9f5e-be1f-4c69-9969-79467a513c38})")
@WinRTByReference(brClass = MapTileDataSource.ByReference::class)
public open class MapTileDataSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapTileDataSource.WithDefault, IWinRTObject {
  private val __858830594_Interface: IMapTileDataSource.WithDefault by lazy {
    as_858830594()
  }


  public override val __858830594_Ptr: JNAPointer? by lazy {
    __858830594_Interface.__858830594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__858830594_Interface)

  public constructor() : this(ABI.activate())

  private fun as_858830594(): IMapTileDataSource.WithDefault {
    if(pointer == NULL) {
      return(IMapTileDataSource.ABI.makeIMapTileDataSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileDataSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileDataSource.ABI.makeIMapTileDataSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapTileDataSource> {
    public override fun getValue() = MapTileDataSource(pointer.getPointer(0))

    public fun setValue(value: MapTileDataSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTileDataSource, MemoryAddress> {
    public val IMapTileDataSourceFactory_Instance: IMapTileDataSourceFactory by lazy {
      createIMapTileDataSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapTileDataSourceFactory(): IMapTileDataSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileDataSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapTileDataSourceFactory.ABI.makeIMapTileDataSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapTileDataSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapTileDataSource {
      val address = segment.toRawLongValue()
      return MapTileDataSource(Pointer(address))
    }

    public override fun toNative(obj: MapTileDataSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
