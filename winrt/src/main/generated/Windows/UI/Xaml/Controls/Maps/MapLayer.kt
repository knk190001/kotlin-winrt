package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapLayerFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapLayer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapLayer;{6d0ff9c1-a14d-4f97-8f57-46715b57683a})")
@WinRTByReference(brClass = MapLayer.ByReference::class)
public open class MapLayer(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapLayer.WithDefault, IWinRTObject {
  private val __1347377754_Interface: IMapLayer.WithDefault by lazy {
    as_1347377754()
  }


  public override val __1347377754_Ptr: JNAPointer? by lazy {
    __1347377754_Interface.__1347377754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1347377754_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1347377754(): IMapLayer.WithDefault {
    if(pointer == NULL) {
      return(IMapLayer.ABI.makeIMapLayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapLayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapLayer.ABI.makeIMapLayer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapLayer> {
    public override fun getValue() = MapLayer(pointer.getPointer(0))

    public fun setValue(value: MapLayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapLayer, MemoryAddress> {
    public val IMapLayerStatics_Instance: IMapLayerStatics by lazy {
      createIMapLayerStatics()
    }


    public val IMapLayerFactory_Instance: IMapLayerFactory by lazy {
      createIMapLayerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapLayerStatics(): IMapLayerStatics {
      val refiid = Guid.REFIID(IMapLayerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapLayer".toHandle(),refiid,interfacePtr)
      val result = IMapLayerStatics.ABI.makeIMapLayerStatics(interfacePtr.value)
      return result
    }

    public fun createIMapLayerFactory(): IMapLayerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapLayer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapLayerFactory.ABI.makeIMapLayerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapLayerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapLayer {
      val address = segment.toRawLongValue()
      return MapLayer(Pointer(address))
    }

    public override fun toNative(obj: MapLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MapTabIndexProperty() = ABI.IMapLayerStatics_Instance.get_MapTabIndexProperty()

    public fun get_VisibleProperty() = ABI.IMapLayerStatics_Instance.get_VisibleProperty()

    public fun get_ZIndexProperty() = ABI.IMapLayerStatics_Instance.get_ZIndexProperty()
  }
}
